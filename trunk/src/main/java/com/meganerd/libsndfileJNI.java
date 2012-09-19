/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.meganerd;

public class libsndfileJNI {
  public final static native long new_CArrayFloat(int jarg1);
  public final static native void delete_CArrayFloat(long jarg1);
  public final static native float CArrayFloat_getitem(long jarg1, CArrayFloat jarg1_, int jarg2);
  public final static native void CArrayFloat_setitem(long jarg1, CArrayFloat jarg1_, int jarg2, float jarg3);
  public final static native long CArrayFloat_cast(long jarg1, CArrayFloat jarg1_);
  public final static native long CArrayFloat_frompointer(long jarg1);
  public final static native long new_CArrayDouble(int jarg1);
  public final static native void delete_CArrayDouble(long jarg1);
  public final static native double CArrayDouble_getitem(long jarg1, CArrayDouble jarg1_, int jarg2);
  public final static native void CArrayDouble_setitem(long jarg1, CArrayDouble jarg1_, int jarg2, double jarg3);
  public final static native long CArrayDouble_cast(long jarg1, CArrayDouble jarg1_);
  public final static native long CArrayDouble_frompointer(long jarg1);
  public final static native long new_CArrayInt(int jarg1);
  public final static native void delete_CArrayInt(long jarg1);
  public final static native int CArrayInt_getitem(long jarg1, CArrayInt jarg1_, int jarg2);
  public final static native void CArrayInt_setitem(long jarg1, CArrayInt jarg1_, int jarg2, int jarg3);
  public final static native long CArrayInt_cast(long jarg1, CArrayInt jarg1_);
  public final static native long CArrayInt_frompointer(long jarg1);
  public final static native long new_CArrayShort(int jarg1);
  public final static native void delete_CArrayShort(long jarg1);
  public final static native short CArrayShort_getitem(long jarg1, CArrayShort jarg1_, int jarg2);
  public final static native void CArrayShort_setitem(long jarg1, CArrayShort jarg1_, int jarg2, short jarg3);
  public final static native long CArrayShort_cast(long jarg1, CArrayShort jarg1_);
  public final static native long CArrayShort_frompointer(long jarg1);
  public final static native int SF_FORMAT_WAV_get();
  public final static native int SF_FORMAT_AIFF_get();
  public final static native int SF_FORMAT_AU_get();
  public final static native int SF_FORMAT_RAW_get();
  public final static native int SF_FORMAT_PAF_get();
  public final static native int SF_FORMAT_SVX_get();
  public final static native int SF_FORMAT_NIST_get();
  public final static native int SF_FORMAT_VOC_get();
  public final static native int SF_FORMAT_IRCAM_get();
  public final static native int SF_FORMAT_W64_get();
  public final static native int SF_FORMAT_MAT4_get();
  public final static native int SF_FORMAT_MAT5_get();
  public final static native int SF_FORMAT_PVF_get();
  public final static native int SF_FORMAT_XI_get();
  public final static native int SF_FORMAT_HTK_get();
  public final static native int SF_FORMAT_SDS_get();
  public final static native int SF_FORMAT_AVR_get();
  public final static native int SF_FORMAT_WAVEX_get();
  public final static native int SF_FORMAT_SD2_get();
  public final static native int SF_FORMAT_FLAC_get();
  public final static native int SF_FORMAT_CAF_get();
  public final static native int SF_FORMAT_WVE_get();
  public final static native int SF_FORMAT_OGG_get();
  public final static native int SF_FORMAT_MPC2K_get();
  public final static native int SF_FORMAT_RF64_get();
  public final static native int SF_FORMAT_PCM_S8_get();
  public final static native int SF_FORMAT_PCM_16_get();
  public final static native int SF_FORMAT_PCM_24_get();
  public final static native int SF_FORMAT_PCM_32_get();
  public final static native int SF_FORMAT_PCM_U8_get();
  public final static native int SF_FORMAT_FLOAT_get();
  public final static native int SF_FORMAT_DOUBLE_get();
  public final static native int SF_FORMAT_ULAW_get();
  public final static native int SF_FORMAT_ALAW_get();
  public final static native int SF_FORMAT_IMA_ADPCM_get();
  public final static native int SF_FORMAT_MS_ADPCM_get();
  public final static native int SF_FORMAT_GSM610_get();
  public final static native int SF_FORMAT_VOX_ADPCM_get();
  public final static native int SF_FORMAT_G721_32_get();
  public final static native int SF_FORMAT_G723_24_get();
  public final static native int SF_FORMAT_G723_40_get();
  public final static native int SF_FORMAT_DWVW_12_get();
  public final static native int SF_FORMAT_DWVW_16_get();
  public final static native int SF_FORMAT_DWVW_24_get();
  public final static native int SF_FORMAT_DWVW_N_get();
  public final static native int SF_FORMAT_DPCM_8_get();
  public final static native int SF_FORMAT_DPCM_16_get();
  public final static native int SF_FORMAT_VORBIS_get();
  public final static native int SF_ENDIAN_FILE_get();
  public final static native int SF_ENDIAN_LITTLE_get();
  public final static native int SF_ENDIAN_BIG_get();
  public final static native int SF_ENDIAN_CPU_get();
  public final static native int SF_FORMAT_SUBMASK_get();
  public final static native int SF_FORMAT_TYPEMASK_get();
  public final static native int SF_FORMAT_ENDMASK_get();
  public final static native int SFC_GET_LIB_VERSION_get();
  public final static native int SFC_GET_LOG_INFO_get();
  public final static native int SFC_GET_CURRENT_SF_INFO_get();
  public final static native int SFC_GET_NORM_DOUBLE_get();
  public final static native int SFC_GET_NORM_FLOAT_get();
  public final static native int SFC_SET_NORM_DOUBLE_get();
  public final static native int SFC_SET_NORM_FLOAT_get();
  public final static native int SFC_SET_SCALE_FLOAT_INT_READ_get();
  public final static native int SFC_SET_SCALE_INT_FLOAT_WRITE_get();
  public final static native int SFC_GET_SIMPLE_FORMAT_COUNT_get();
  public final static native int SFC_GET_SIMPLE_FORMAT_get();
  public final static native int SFC_GET_FORMAT_INFO_get();
  public final static native int SFC_GET_FORMAT_MAJOR_COUNT_get();
  public final static native int SFC_GET_FORMAT_MAJOR_get();
  public final static native int SFC_GET_FORMAT_SUBTYPE_COUNT_get();
  public final static native int SFC_GET_FORMAT_SUBTYPE_get();
  public final static native int SFC_CALC_SIGNAL_MAX_get();
  public final static native int SFC_CALC_NORM_SIGNAL_MAX_get();
  public final static native int SFC_CALC_MAX_ALL_CHANNELS_get();
  public final static native int SFC_CALC_NORM_MAX_ALL_CHANNELS_get();
  public final static native int SFC_GET_SIGNAL_MAX_get();
  public final static native int SFC_GET_MAX_ALL_CHANNELS_get();
  public final static native int SFC_SET_ADD_PEAK_CHUNK_get();
  public final static native int SFC_SET_ADD_HEADER_PAD_CHUNK_get();
  public final static native int SFC_UPDATE_HEADER_NOW_get();
  public final static native int SFC_SET_UPDATE_HEADER_AUTO_get();
  public final static native int SFC_FILE_TRUNCATE_get();
  public final static native int SFC_SET_RAW_START_OFFSET_get();
  public final static native int SFC_SET_DITHER_ON_WRITE_get();
  public final static native int SFC_SET_DITHER_ON_READ_get();
  public final static native int SFC_GET_DITHER_INFO_COUNT_get();
  public final static native int SFC_GET_DITHER_INFO_get();
  public final static native int SFC_GET_EMBED_FILE_INFO_get();
  public final static native int SFC_SET_CLIPPING_get();
  public final static native int SFC_GET_CLIPPING_get();
  public final static native int SFC_GET_INSTRUMENT_get();
  public final static native int SFC_SET_INSTRUMENT_get();
  public final static native int SFC_GET_LOOP_INFO_get();
  public final static native int SFC_GET_BROADCAST_INFO_get();
  public final static native int SFC_SET_BROADCAST_INFO_get();
  public final static native int SFC_GET_CHANNEL_MAP_INFO_get();
  public final static native int SFC_SET_CHANNEL_MAP_INFO_get();
  public final static native int SFC_RAW_DATA_NEEDS_ENDSWAP_get();
  public final static native int SFC_WAVEX_SET_AMBISONIC_get();
  public final static native int SFC_WAVEX_GET_AMBISONIC_get();
  public final static native int SFC_SET_VBR_ENCODING_QUALITY_get();
  public final static native int SFC_TEST_IEEE_FLOAT_REPLACE_get();
  public final static native int SFC_SET_ADD_DITHER_ON_WRITE_get();
  public final static native int SFC_SET_ADD_DITHER_ON_READ_get();
  public final static native int SF_STR_TITLE_get();
  public final static native int SF_STR_COPYRIGHT_get();
  public final static native int SF_STR_SOFTWARE_get();
  public final static native int SF_STR_ARTIST_get();
  public final static native int SF_STR_COMMENT_get();
  public final static native int SF_STR_DATE_get();
  public final static native int SF_STR_ALBUM_get();
  public final static native int SF_STR_LICENSE_get();
  public final static native int SF_STR_TRACKNUMBER_get();
  public final static native int SF_STR_GENRE_get();
  public final static native int SF_FALSE_get();
  public final static native int SF_TRUE_get();
  public final static native int SFM_READ_get();
  public final static native int SFM_WRITE_get();
  public final static native int SFM_RDWR_get();
  public final static native int SF_AMBISONIC_NONE_get();
  public final static native int SF_AMBISONIC_B_FORMAT_get();
  public final static native int SF_ERR_NO_ERROR_get();
  public final static native int SF_ERR_UNRECOGNISED_FORMAT_get();
  public final static native int SF_ERR_SYSTEM_get();
  public final static native int SF_ERR_MALFORMED_FILE_get();
  public final static native int SF_ERR_UNSUPPORTED_ENCODING_get();
  public final static native int SF_CHANNEL_MAP_INVALID_get();
  public final static native int SF_CHANNEL_MAP_MONO_get();
  public final static native int SF_CHANNEL_MAP_LEFT_get();
  public final static native int SF_CHANNEL_MAP_RIGHT_get();
  public final static native int SF_CHANNEL_MAP_CENTER_get();
  public final static native int SF_CHANNEL_MAP_FRONT_LEFT_get();
  public final static native int SF_CHANNEL_MAP_FRONT_RIGHT_get();
  public final static native int SF_CHANNEL_MAP_FRONT_CENTER_get();
  public final static native int SF_CHANNEL_MAP_REAR_CENTER_get();
  public final static native int SF_CHANNEL_MAP_REAR_LEFT_get();
  public final static native int SF_CHANNEL_MAP_REAR_RIGHT_get();
  public final static native int SF_CHANNEL_MAP_LFE_get();
  public final static native int SF_CHANNEL_MAP_FRONT_LEFT_OF_CENTER_get();
  public final static native int SF_CHANNEL_MAP_FRONT_RIGHT_OF_CENTER_get();
  public final static native int SF_CHANNEL_MAP_SIDE_LEFT_get();
  public final static native int SF_CHANNEL_MAP_SIDE_RIGHT_get();
  public final static native int SF_CHANNEL_MAP_TOP_CENTER_get();
  public final static native int SF_CHANNEL_MAP_TOP_FRONT_LEFT_get();
  public final static native int SF_CHANNEL_MAP_TOP_FRONT_RIGHT_get();
  public final static native int SF_CHANNEL_MAP_TOP_FRONT_CENTER_get();
  public final static native int SF_CHANNEL_MAP_TOP_REAR_LEFT_get();
  public final static native int SF_CHANNEL_MAP_TOP_REAR_RIGHT_get();
  public final static native int SF_CHANNEL_MAP_TOP_REAR_CENTER_get();
  public final static native int SF_CHANNEL_MAP_AMBISONIC_B_W_get();
  public final static native int SF_CHANNEL_MAP_AMBISONIC_B_X_get();
  public final static native int SF_CHANNEL_MAP_AMBISONIC_B_Y_get();
  public final static native int SF_CHANNEL_MAP_AMBISONIC_B_Z_get();
  public final static native int SF_CHANNEL_MAP_MAX_get();
  public final static native long SF_COUNT_MAX_get();
  public final static native void SF_INFO_frames_set(long jarg1, SF_INFO jarg1_, long jarg2);
  public final static native long SF_INFO_frames_get(long jarg1, SF_INFO jarg1_);
  public final static native void SF_INFO_samplerate_set(long jarg1, SF_INFO jarg1_, int jarg2);
  public final static native int SF_INFO_samplerate_get(long jarg1, SF_INFO jarg1_);
  public final static native void SF_INFO_channels_set(long jarg1, SF_INFO jarg1_, int jarg2);
  public final static native int SF_INFO_channels_get(long jarg1, SF_INFO jarg1_);
  public final static native void SF_INFO_format_set(long jarg1, SF_INFO jarg1_, int jarg2);
  public final static native int SF_INFO_format_get(long jarg1, SF_INFO jarg1_);
  public final static native void SF_INFO_sections_set(long jarg1, SF_INFO jarg1_, int jarg2);
  public final static native int SF_INFO_sections_get(long jarg1, SF_INFO jarg1_);
  public final static native void SF_INFO_seekable_set(long jarg1, SF_INFO jarg1_, int jarg2);
  public final static native int SF_INFO_seekable_get(long jarg1, SF_INFO jarg1_);
  public final static native long new_SF_INFO();
  public final static native void delete_SF_INFO(long jarg1);
  public final static native void SF_FORMAT_INFO_format_set(long jarg1, SF_FORMAT_INFO jarg1_, int jarg2);
  public final static native int SF_FORMAT_INFO_format_get(long jarg1, SF_FORMAT_INFO jarg1_);
  public final static native void SF_FORMAT_INFO_name_set(long jarg1, SF_FORMAT_INFO jarg1_, String jarg2);
  public final static native String SF_FORMAT_INFO_name_get(long jarg1, SF_FORMAT_INFO jarg1_);
  public final static native void SF_FORMAT_INFO_extension_set(long jarg1, SF_FORMAT_INFO jarg1_, String jarg2);
  public final static native String SF_FORMAT_INFO_extension_get(long jarg1, SF_FORMAT_INFO jarg1_);
  public final static native long new_SF_FORMAT_INFO();
  public final static native void delete_SF_FORMAT_INFO(long jarg1);
  public final static native int SFD_DEFAULT_LEVEL_get();
  public final static native int SFD_CUSTOM_LEVEL_get();
  public final static native int SFD_NO_DITHER_get();
  public final static native int SFD_WHITE_get();
  public final static native int SFD_TRIANGULAR_PDF_get();
  public final static native void SF_DITHER_INFO_type_set(long jarg1, SF_DITHER_INFO jarg1_, int jarg2);
  public final static native int SF_DITHER_INFO_type_get(long jarg1, SF_DITHER_INFO jarg1_);
  public final static native void SF_DITHER_INFO_level_set(long jarg1, SF_DITHER_INFO jarg1_, double jarg2);
  public final static native double SF_DITHER_INFO_level_get(long jarg1, SF_DITHER_INFO jarg1_);
  public final static native void SF_DITHER_INFO_name_set(long jarg1, SF_DITHER_INFO jarg1_, String jarg2);
  public final static native String SF_DITHER_INFO_name_get(long jarg1, SF_DITHER_INFO jarg1_);
  public final static native long new_SF_DITHER_INFO();
  public final static native void delete_SF_DITHER_INFO(long jarg1);
  public final static native void SF_EMBED_FILE_INFO_offset_set(long jarg1, SF_EMBED_FILE_INFO jarg1_, long jarg2);
  public final static native long SF_EMBED_FILE_INFO_offset_get(long jarg1, SF_EMBED_FILE_INFO jarg1_);
  public final static native void SF_EMBED_FILE_INFO_length_set(long jarg1, SF_EMBED_FILE_INFO jarg1_, long jarg2);
  public final static native long SF_EMBED_FILE_INFO_length_get(long jarg1, SF_EMBED_FILE_INFO jarg1_);
  public final static native long new_SF_EMBED_FILE_INFO();
  public final static native void delete_SF_EMBED_FILE_INFO(long jarg1);
  public final static native int SF_LOOP_NONE_get();
  public final static native int SF_LOOP_FORWARD_get();
  public final static native int SF_LOOP_BACKWARD_get();
  public final static native int SF_LOOP_ALTERNATING_get();
  public final static native void SF_INSTRUMENT_gain_set(long jarg1, SF_INSTRUMENT jarg1_, int jarg2);
  public final static native int SF_INSTRUMENT_gain_get(long jarg1, SF_INSTRUMENT jarg1_);
  public final static native void SF_INSTRUMENT_basenote_set(long jarg1, SF_INSTRUMENT jarg1_, char jarg2);
  public final static native char SF_INSTRUMENT_basenote_get(long jarg1, SF_INSTRUMENT jarg1_);
  public final static native void SF_INSTRUMENT_detune_set(long jarg1, SF_INSTRUMENT jarg1_, char jarg2);
  public final static native char SF_INSTRUMENT_detune_get(long jarg1, SF_INSTRUMENT jarg1_);
  public final static native void SF_INSTRUMENT_velocity_lo_set(long jarg1, SF_INSTRUMENT jarg1_, char jarg2);
  public final static native char SF_INSTRUMENT_velocity_lo_get(long jarg1, SF_INSTRUMENT jarg1_);
  public final static native void SF_INSTRUMENT_velocity_hi_set(long jarg1, SF_INSTRUMENT jarg1_, char jarg2);
  public final static native char SF_INSTRUMENT_velocity_hi_get(long jarg1, SF_INSTRUMENT jarg1_);
  public final static native void SF_INSTRUMENT_key_lo_set(long jarg1, SF_INSTRUMENT jarg1_, char jarg2);
  public final static native char SF_INSTRUMENT_key_lo_get(long jarg1, SF_INSTRUMENT jarg1_);
  public final static native void SF_INSTRUMENT_key_hi_set(long jarg1, SF_INSTRUMENT jarg1_, char jarg2);
  public final static native char SF_INSTRUMENT_key_hi_get(long jarg1, SF_INSTRUMENT jarg1_);
  public final static native void SF_INSTRUMENT_loop_count_set(long jarg1, SF_INSTRUMENT jarg1_, int jarg2);
  public final static native int SF_INSTRUMENT_loop_count_get(long jarg1, SF_INSTRUMENT jarg1_);
  public final static native long SF_INSTRUMENT_loops_get(long jarg1, SF_INSTRUMENT jarg1_);
  public final static native long new_SF_INSTRUMENT();
  public final static native void delete_SF_INSTRUMENT(long jarg1);
  public final static native void SF_INSTRUMENT_loops_mode_set(long jarg1, SF_INSTRUMENT_loops jarg1_, int jarg2);
  public final static native int SF_INSTRUMENT_loops_mode_get(long jarg1, SF_INSTRUMENT_loops jarg1_);
  public final static native void SF_INSTRUMENT_loops_start_set(long jarg1, SF_INSTRUMENT_loops jarg1_, long jarg2);
  public final static native long SF_INSTRUMENT_loops_start_get(long jarg1, SF_INSTRUMENT_loops jarg1_);
  public final static native void SF_INSTRUMENT_loops_end_set(long jarg1, SF_INSTRUMENT_loops jarg1_, long jarg2);
  public final static native long SF_INSTRUMENT_loops_end_get(long jarg1, SF_INSTRUMENT_loops jarg1_);
  public final static native void SF_INSTRUMENT_loops_count_set(long jarg1, SF_INSTRUMENT_loops jarg1_, long jarg2);
  public final static native long SF_INSTRUMENT_loops_count_get(long jarg1, SF_INSTRUMENT_loops jarg1_);
  public final static native long new_SF_INSTRUMENT_loops();
  public final static native void delete_SF_INSTRUMENT_loops(long jarg1);
  public final static native void SF_LOOP_INFO_time_sig_num_set(long jarg1, SF_LOOP_INFO jarg1_, short jarg2);
  public final static native short SF_LOOP_INFO_time_sig_num_get(long jarg1, SF_LOOP_INFO jarg1_);
  public final static native void SF_LOOP_INFO_time_sig_den_set(long jarg1, SF_LOOP_INFO jarg1_, short jarg2);
  public final static native short SF_LOOP_INFO_time_sig_den_get(long jarg1, SF_LOOP_INFO jarg1_);
  public final static native void SF_LOOP_INFO_loop_mode_set(long jarg1, SF_LOOP_INFO jarg1_, int jarg2);
  public final static native int SF_LOOP_INFO_loop_mode_get(long jarg1, SF_LOOP_INFO jarg1_);
  public final static native void SF_LOOP_INFO_num_beats_set(long jarg1, SF_LOOP_INFO jarg1_, int jarg2);
  public final static native int SF_LOOP_INFO_num_beats_get(long jarg1, SF_LOOP_INFO jarg1_);
  public final static native void SF_LOOP_INFO_bpm_set(long jarg1, SF_LOOP_INFO jarg1_, float jarg2);
  public final static native float SF_LOOP_INFO_bpm_get(long jarg1, SF_LOOP_INFO jarg1_);
  public final static native void SF_LOOP_INFO_root_key_set(long jarg1, SF_LOOP_INFO jarg1_, int jarg2);
  public final static native int SF_LOOP_INFO_root_key_get(long jarg1, SF_LOOP_INFO jarg1_);
  public final static native void SF_LOOP_INFO_future_set(long jarg1, SF_LOOP_INFO jarg1_, long jarg2);
  public final static native long SF_LOOP_INFO_future_get(long jarg1, SF_LOOP_INFO jarg1_);
  public final static native long new_SF_LOOP_INFO();
  public final static native void delete_SF_LOOP_INFO(long jarg1);
  public final static native void SF_BROADCAST_INFO_description_set(long jarg1, SF_BROADCAST_INFO jarg1_, String jarg2);
  public final static native String SF_BROADCAST_INFO_description_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native void SF_BROADCAST_INFO_originator_set(long jarg1, SF_BROADCAST_INFO jarg1_, String jarg2);
  public final static native String SF_BROADCAST_INFO_originator_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native void SF_BROADCAST_INFO_originator_reference_set(long jarg1, SF_BROADCAST_INFO jarg1_, String jarg2);
  public final static native String SF_BROADCAST_INFO_originator_reference_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native void SF_BROADCAST_INFO_origination_date_set(long jarg1, SF_BROADCAST_INFO jarg1_, String jarg2);
  public final static native String SF_BROADCAST_INFO_origination_date_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native void SF_BROADCAST_INFO_origination_time_set(long jarg1, SF_BROADCAST_INFO jarg1_, String jarg2);
  public final static native String SF_BROADCAST_INFO_origination_time_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native void SF_BROADCAST_INFO_time_reference_low_set(long jarg1, SF_BROADCAST_INFO jarg1_, long jarg2);
  public final static native long SF_BROADCAST_INFO_time_reference_low_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native void SF_BROADCAST_INFO_time_reference_high_set(long jarg1, SF_BROADCAST_INFO jarg1_, long jarg2);
  public final static native long SF_BROADCAST_INFO_time_reference_high_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native void SF_BROADCAST_INFO_version_set(long jarg1, SF_BROADCAST_INFO jarg1_, short jarg2);
  public final static native short SF_BROADCAST_INFO_version_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native void SF_BROADCAST_INFO_umid_set(long jarg1, SF_BROADCAST_INFO jarg1_, String jarg2);
  public final static native String SF_BROADCAST_INFO_umid_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native void SF_BROADCAST_INFO_reserved_set(long jarg1, SF_BROADCAST_INFO jarg1_, String jarg2);
  public final static native String SF_BROADCAST_INFO_reserved_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native void SF_BROADCAST_INFO_coding_history_size_set(long jarg1, SF_BROADCAST_INFO jarg1_, long jarg2);
  public final static native long SF_BROADCAST_INFO_coding_history_size_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native void SF_BROADCAST_INFO_coding_history_set(long jarg1, SF_BROADCAST_INFO jarg1_, String jarg2);
  public final static native String SF_BROADCAST_INFO_coding_history_get(long jarg1, SF_BROADCAST_INFO jarg1_);
  public final static native long new_SF_BROADCAST_INFO();
  public final static native void delete_SF_BROADCAST_INFO(long jarg1);
  public final static native void SF_VIRTUAL_IO_get_filelen_set(long jarg1, SF_VIRTUAL_IO jarg1_, long jarg2);
  public final static native long SF_VIRTUAL_IO_get_filelen_get(long jarg1, SF_VIRTUAL_IO jarg1_);
  public final static native void SF_VIRTUAL_IO_seek_set(long jarg1, SF_VIRTUAL_IO jarg1_, long jarg2);
  public final static native long SF_VIRTUAL_IO_seek_get(long jarg1, SF_VIRTUAL_IO jarg1_);
  public final static native void SF_VIRTUAL_IO_read_set(long jarg1, SF_VIRTUAL_IO jarg1_, long jarg2);
  public final static native long SF_VIRTUAL_IO_read_get(long jarg1, SF_VIRTUAL_IO jarg1_);
  public final static native void SF_VIRTUAL_IO_write_set(long jarg1, SF_VIRTUAL_IO jarg1_, long jarg2);
  public final static native long SF_VIRTUAL_IO_write_get(long jarg1, SF_VIRTUAL_IO jarg1_);
  public final static native void SF_VIRTUAL_IO_tell_set(long jarg1, SF_VIRTUAL_IO jarg1_, long jarg2);
  public final static native long SF_VIRTUAL_IO_tell_get(long jarg1, SF_VIRTUAL_IO jarg1_);
  public final static native long new_SF_VIRTUAL_IO();
  public final static native void delete_SF_VIRTUAL_IO(long jarg1);
  public final static native long sf_open(String jarg1, int jarg2, long jarg3, SF_INFO jarg3_);
  public final static native long sf_open_fd(int jarg1, int jarg2, long jarg3, SF_INFO jarg3_, int jarg4);
  public final static native long sf_open_virtual(long jarg1, SF_VIRTUAL_IO jarg1_, int jarg2, long jarg3, SF_INFO jarg3_, long jarg4);
  public final static native int sf_error(long jarg1);
  public final static native String sf_strerror(long jarg1);
  public final static native String sf_error_number(int jarg1);
  public final static native int sf_perror(long jarg1);
  public final static native int sf_error_str(long jarg1, String jarg2, long jarg3);
  public final static native int sf_command(long jarg1, int jarg2, long jarg3, int jarg4);
  public final static native int sf_format_check(long jarg1, SF_INFO jarg1_);
  public final static native long sf_seek(long jarg1, long jarg2, int jarg3);
  public final static native int sf_set_string(long jarg1, int jarg2, String jarg3);
  public final static native String sf_get_string(long jarg1, int jarg2);
  public final static native String sf_version_string();
  public final static native long sf_read_raw(long jarg1, long jarg2, long jarg3);
  public final static native long sf_write_raw(long jarg1, long jarg2, long jarg3);
  public final static native long sf_readf_short(long jarg1, long jarg2, long jarg3);
  public final static native long sf_writef_short(long jarg1, long jarg2, long jarg3);
  public final static native long sf_readf_int(long jarg1, long jarg2, long jarg3);
  public final static native long sf_writef_int(long jarg1, long jarg2, long jarg3);
  public final static native long sf_readf_float(long jarg1, long jarg2, long jarg3);
  public final static native long sf_writef_float(long jarg1, long jarg2, long jarg3);
  public final static native long sf_readf_double(long jarg1, long jarg2, long jarg3);
  public final static native long sf_writef_double(long jarg1, long jarg2, long jarg3);
  public final static native long sf_read_short(long jarg1, long jarg2, long jarg3);
  public final static native long sf_write_short(long jarg1, long jarg2, long jarg3);
  public final static native long sf_read_int(long jarg1, long jarg2, long jarg3);
  public final static native long sf_write_int(long jarg1, long jarg2, long jarg3);
  public final static native long sf_read_float(long jarg1, long jarg2, long jarg3);
  public final static native long sf_write_float(long jarg1, long jarg2, long jarg3);
  public final static native long sf_read_double(long jarg1, long jarg2, long jarg3);
  public final static native long sf_write_double(long jarg1, long jarg2, long jarg3);
  public final static native int sf_close(long jarg1);
  public final static native void sf_write_sync(long jarg1);
}
