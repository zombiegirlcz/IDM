package com.youTransactor.uCube.rpc;

/* JADX INFO: loaded from: classes17.dex */
public final class Constants {
    public static final short ACTION_CANCELLED = -28;
    public static final short APPROVED = 7;
    public static final int BAD_SEQ_NUM = -219;
    public static final int BAD_TERMINAL_STATE = -287;
    public static final short BANK_PARAMETERS_DOWNLOADS = 21761;
    public static final short BANK_PARAMETERS_GET = 21763;
    public static final short BUILD_CANDIDATE_LIST = 21776;
    public static final short CANCELLED_STATUS = -32;
    public static final short CANCEL_COMMAND = 514;
    public static final short CARD_WAIT_INSERTION_COMMAND = 20512;
    public static final short CARD_WAIT_REMOVAL_COMMAND = 20513;
    public static final byte CASH = 1;
    public static final short COMPLETE_NFC_TRANSACTION = 21809;
    public static final int DATA_NOT_FOUND = -94;
    public static final short DECLINED = 8;
    public static final short DISPLAY_LISTBOX_WITHOUT_KI_COMMAND = 20546;
    public static final short DISPLAY_QR_CODE_COMMAND = 20551;
    public static final short DISPLAY_WITHOUT_KI_COMMAND = 20544;
    public static final byte DYNAMIC_ENCRIPTION_METHOD = 1;
    public static final short ECHO = 20986;
    public static final short ECMDABORTED = -114;
    public static final int EMV_APPLICATION_CANDIDATE_BLOCK_SIZE = 64;
    public static final short EMV_NOT_ACCEPT = -301;
    public static final short EMV_NOT_SUPPORT = -300;
    public static final short ENTER_SECURED_SESSION = 20737;
    public static byte ERASE_ALL_PIN_INPUT_CORRECTION_KEY_MODE = 2;
    public static byte ERASE_LAST_DIGIT_PIN_INPUT_CORRECTION_KEY_MODE = 1;
    public static final byte ETX = 3;
    public static final short EVENT_COMMAND = 24578;
    public static final short EXIT_SECURED_SESSION = 20738;
    public static final int E_BAD_SEQ_NB = -219;
    public static final int E_ERR_SRED_CRYPTO = -229;
    public static final int E_FW_NOT_FULLY_LOADED = -734;
    public static final int E_MAX_CMD_LEN = -400;
    public static final short GET_INFO_COMMAND = 20481;
    public static final short GET_PLAIN_TAG_VALUE_COMMAND = 20518;
    public static final short GET_SECURED_TAG_VALUE_COMMAND = 20517;
    public static final short GET_STATUS_COMMAND = 817;
    public static final byte ICC_POS_ENTRY_MODE = 9;
    public static final byte ICC_READER = 17;
    public static final byte INQUIRY = 49;
    public static final short INSTALL_FOR_LOAD_COMMAND = 20832;
    public static final short INSTALL_FOR_LOAD_KEY_COMMAND = 20784;
    public static final int KSN_LENGTH = 10;
    public static final short LOAD_COMMAND = 20833;
    public static final short MALFORMED_MESSAGE = Short.MIN_VALUE;
    public static final byte MANUAL_CASH = 18;
    public static final int MAX_RPC_PACKET_SIZE = 2069;
    public static final byte NFC_READER = 33;
    public static final int NOT_ALLOWED_STATE = -179;
    public static final int NO_CARD = -35;
    public static final int OFFLINE_PIN_EVENT = 0;
    public static final int ONLINE_PIN_EVENT = 1;
    public static final byte PIN_BLOCK_ISO9564_FORMAT_0 = 0;
    public static final byte PIN_BLOCK_ISO9564_FORMAT_1 = 1;
    public static final byte PIN_BLOCK_ISO9564_FORMAT_3 = 3;
    public static final int PIN_BLOCK_LENGTH = 8;
    public static final int PIN_EVENT = 10;
    public static final byte PLAIN_DATA_ENCRIPTION_METHOD = 2;
    public static final short POWER_OFF = 20576;
    public static final byte PROTOCOL_BYTES_SIZE = 4;
    public static final byte PURCHASE = 0;
    public static final byte PURCHASE_CASHBACK = 9;
    public static final int QUICK_MODE = 1;
    public static final byte REFUND = 32;
    public static final short REPEAT_LAST_MESSAGE_COMMAND = 816;
    public static final byte RPC_HEADER_LEN = 5;
    public static final byte RPC_SECURED_HEADER_CRYPTO_RND_LEN = 1;
    public static final byte RPC_SRED_MAC_SIZE = 4;
    public static final byte RPC_STATUS_SIZE = 2;
    public static final short RTC_GET = 769;
    public static final short RTC_SET = 770;
    public static final short SET_INFO_FIELD_COMMAND = 20483;
    public static final int SE_BAD_MAC_METHOD = -16402;
    public static final int SE_MAC_NOT_MATCH = -16405;
    public static final int SHUTTING_DOWN = -401;
    public static final short SIMPLIFIED_ONLINE_PIN = 20849;
    public static final int SLOW_MODE = 0;
    public static final byte SRED_ENCRIPTION_METHOD = 0;
    public static final short START_NFC_TRANSACTION = 21808;
    public static final byte STX = 2;
    public static final short SUCCESS_STATUS = 0;
    public static final int TAG_AAC = 0;
    public static final int TAG_ACE_LAYER_VERSION = 163;
    public static final int TAG_AGNOS_LIB_VERSION = 162;

    @Deprecated
    public static final int TAG_APPLICATION_ID = 132;
    public static final int TAG_APP_AID = 132;
    public static final int TAG_APP_FCI_ISSUER_DISCRETIONARY_DATA = 48908;
    public static final int TAG_APP_ISSUER_CODE_INDEX = 40721;
    public static final int TAG_APP_LABEL = 80;
    public static final int TAG_APP_LANGUAGE = 24365;
    public static final int TAG_APP_PREFERRED_NAME = 40722;
    public static final int TAG_APP_PRIORITY_INDEX = 135;
    public static final int TAG_APP_SELECT_OPT = 57122;
    public static final int TAG_APP_SRPD = 40714;
    public static final int TAG_APP_STATUS = 57092;
    public static final int TAG_ARQC = 128;
    public static final int TAG_ATMEL_SERIAL = 193;
    public static final int TAG_BATTERY_STATE = 197;
    public static final int TAG_BLE_FIRMWARE_VERSION = 247;
    public static final int TAG_BOOT_LOADER_CHECKSUM = 218;
    public static final int TAG_BOOT_LOADER_VERSION = 217;
    public static final int TAG_CF_ENHANCED_SRED_CONFIGURATION = 207;
    public static final int TAG_CHECK_TRANSACTION_INIT_STATUS = 57154;
    public static final int TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE = 225;

    @Deprecated
    public static final int TAG_CRYPTOGRAM_INFO_DATA = 40743;
    public static final int TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION = 226;
    public static final int TAG_E3_BLUETOOTH_SPECIFIC_DATAS = 227;
    public static final int TAG_E4_CUSTOMER_DATA = 228;
    public static final int TAG_E5_FUNCTION_LOG_CONFIGURATION = 229;
    public static final int TAG_E7_NFC_CARD_DETECT_CONFIGURATION = 231;
    public static final int TAG_E8_NFC_CAPABILITY = 232;
    public static final int TAG_EE_SUPPORTED_RPC_ID_LIST = 238;
    public static final int TAG_EMVL1_CLESS_LIB_VERSION = 160;
    public static final int TAG_EMVL3_VERSION = 165;

    @Deprecated
    public static final int TAG_EMV_APPLICATION_LABEL = 80;

    @Deprecated
    public static final int TAG_EMV_APPLICATION_PREFERRED_NAME = 40722;

    @Deprecated
    public static final int TAG_EMV_AUTH_CODE = 138;

    @Deprecated
    public static final int TAG_EMV_CVM_RESULT = 40756;

    @Deprecated
    public static final int TAG_EMV_IAD = 145;
    public static final int TAG_EMV_ICC_CONFIG_VERSION = 234;

    @Deprecated
    public static final int TAG_EMV_ISSUER_SCRIPT_1 = 113;

    @Deprecated
    public static final int TAG_EMV_ISSUER_SCRIPT_2 = 114;
    public static final int TAG_EMV_L1_CHECKSUM = 214;
    public static final int TAG_EMV_L1_NFC_VERSION = 160;
    public static final int TAG_EMV_L1_VERSION = 213;
    public static final int TAG_EMV_L2_CHECKSUM = 216;
    public static final int TAG_EMV_L2_NFC_VERSION = 162;
    public static final int TAG_EMV_L2_VERSION = 215;
    public static final int TAG_EMV_NFC_CONFIG_VERSION = 235;

    @Deprecated
    public static final int TAG_EMV_POS_ENTRY_MODE = 40761;
    public static final int TAG_F3_BUILD_CONFIGURATION = 243;
    public static final int TAG_F4 = 244;
    public static final int TAG_F5 = 245;
    public static final int TAG_FB_CHARGING_STATUS = 251;
    public static final int TAG_FC_SPEED_MODE = 252;
    public static final int TAG_FD_NON_SECURE_FIRMWARE_VERSION = 253;
    public static final int TAG_FE_NON_SECURE_FW_CHECKSUM = 254;
    public static final int TAG_FIRMWARE_VERSION = 209;
    public static final int TAG_FULL_SVPP_IDENTIFICATION = 248;
    public static final int TAG_FULL_TLV_OUTPUT = 1;
    public static final int TAG_GPI_VERSION = 164;
    public static final int TAG_HOST_RESPONSE_DATA = 57206;
    public static final int TAG_KSL_ID = 219;
    public static final int TAG_KSN_FORMATS = 205;
    public static final int TAG_LEGACY_OUTPUT = 0;
    public static final int TAG_MPOS_MODULE_STATE = 237;
    public static final int TAG_NB_APP = 195;
    public static final int TAG_NFC_FIRMWARE_STATE = 196;

    @Deprecated
    public static final int TAG_NFC_FORM_FORMAT = 40814;
    public static final int TAG_NFC_INFOS = 232;
    public static final int TAG_NFC_OUTCOME = 57202;
    public static final int TAG_OS_VERSION = 236;
    public static final int TAG_OUTPUT_FORMAT = 194;
    public static final int TAG_PAYMENT_APP_CLESS_VERSION = 166;
    public static final int TAG_PCI_PED_CHECKSUM = 212;
    public static final int TAG_PCI_PED_VERSION = 211;
    public static final int TAG_PIN_BLOCK = 57151;
    public static final int TAG_PIN_KSN = 57150;
    public static final int TAG_POWER_OFF_TIMEOUT = 198;
    public static final int TAG_RESOURCE_FILE_VERSION = 249;
    public static final int TAG_SUPPORTED_LOCALE_LIST = 250;
    public static final int TAG_SVPP_CHECKSUM = 210;
    public static final int TAG_SYSTEM_FAILURE_LOG_RECORD_1 = 203;
    public static final int TAG_SYSTEM_FAILURE_LOG_RECORD_2 = 204;
    public static final int TAG_TC = 64;
    public static final int TAG_TERMINAL_PN = 194;
    public static final int TAG_TERMINAL_SN = 195;
    public static final int TAG_TERMINAL_STATE = 196;
    public static final int TAG_TRACK2_EQU_DATA = 87;
    public static final int TAG_TRANSACTION_CONFIG = 240;
    public static final int TAG_TRANSACTION_DATA = 241;
    public static final int TAG_TSI = 155;
    public static final int TAG_TST_LOOPBACK_VERSION = 161;
    public static final int TAG_TVR = 149;
    public static final int TAG_USB_CAPABILITY = 233;
    public static final int TIMEOUT_MESSAGES = 1000;
    public static final short TIMEOUT_STATUS = -2;
    public static final short TRANSACTION_FINAL = 21779;
    public static final short TRANSACTION_INIT = 21777;
    public static final short TRANSACTION_PROCESS = 21778;
    public static final short UNKNOWN_COMMAND = 0;
    public static final int UPDATE_WITH_SAME_VERSION = -4106;
    public static final int WAITING_CARD_EVENT = 2;

    public static final class EMVTag {
        public static final int TAG_4F_APPLICATION_IDENTIFIER = 79;
        public static final int TAG_50_APPLICATION_LABEL = 80;
        public static final int TAG_5F25_APPLICATION_EFFECTIVE_DATE = 24357;
        public static final int TAG_5F2A_TRANSACTION_CURRENCY_CODE = 24362;
        public static final int TAG_5F34_APPLICATION_PRIMARY_ACCOUNT_NUMBER_SEQUENCE_NUMBER = 24372;
        public static final int TAG_5F34_PAN_SEQUENCE_NUMBER = 24372;
        public static final int TAG_71_ISSUER_SCRIPT_TEMPLATE1 = 113;
        public static final int TAG_72_ISSUER_SCRIPT_TEMPLATE2 = 114;
        public static final int TAG_81_AMOUNT_AUTHORISED = 129;
        public static final int TAG_82_APPLICATION_INTERCHANGE_PROFILE = 130;
        public static final int TAG_84_APPLICATION_ID = 132;
        public static final int TAG_8A_AUTHORIZATION_RESPONSE_CODE = 138;
        public static final int TAG_8E_CARDHOLDER_VERIFICATION_METHOD_LIST = 142;
        public static final int TAG_91_ISSUER_AUTHENTICATION_DATA = 145;
        public static final int TAG_95_TERMINAL_VERIFICATION_RESULTS = 149;
        public static final int TAG_99_TRANSACTION_PERSONAL_IDENTIFICATION_NUMBER_DATA = 153;
        public static final int TAG_9A_TRANSACTION_DATE = 154;
        public static final int TAG_9B_TRANSACTION_STATUS_INFORMATION = 155;
        public static final int TAG_9C_TRANSACTION_TYPE = 156;
        public static final int TAG_9F02_AMOUNT_AUTHORISED = 40706;
        public static final int TAG_9F06_APPLICATION_IDENTIFIER__TERMINAL = 40710;
        public static final int TAG_9F07_APPLICATION_USAGE_CONTROL = 40711;
        public static final int TAG_9F08_APPLICATION_VERSION_NUMBER = 40712;
        public static final int TAG_9F10_ISSUER_APPLICATION_DATA = 40720;
        public static final int TAG_9F12_APPLICATION_PREFERRED_NAME = 40722;
        public static final int TAG_9F1A_TERMINAL_COUNTRY_CODE = 40730;
        public static final int TAG_9F26_APPLICATION_CRYPTOGRAM = 40742;
        public static final int TAG_9F27_CRYPTOGRAM_INFORMATION_DATA = 40743;
        public static final int TAG_9F33_TERMINAL_CAPABILITIES = 40755;
        public static final int TAG_9F34_CARDHOLDER_VERIFICATION_METHOD_RESULTS = 40756;
        public static final int TAG_9F36_APPLICATION_TRANSACTION_COUNTER = 40758;
        public static final int TAG_9F37_UNPREDICTABLE_NUMBER = 40759;
        public static final int TAG_9F39_POINT_OF_SERVICE_ENTRY_MODE = 40761;
        public static final int TAG_9F6E_NFC_FORM_FORMAT = 40814;
        public static final int TAG_DF02_PEK_VERSION_NUMBER = 57090;
        public static final int TAG_DF37_SELECTED_CARDHOLDER_LANGUAGE = 57143;
        public static final int TAG_SECURE_56_TRACK_1_DATA = 86;
        public static final int TAG_SECURE_57_TRACK_2_EQUIVALENT_DATA = 87;
        public static final int TAG_SECURE_5A_APPLICATION_PRIMARY_ACCOUNT_NUMBER = 90;
        public static final int TAG_SECURE_5F20_CARDHOLDER_NAME = 24352;
        public static final int TAG_SECURE_5F24_APPLICATION_EXPIRATION_DATE = 24356;
        public static final int TAG_SECURE_5F30_SERVICE_CODE = 24368;
        public static final int TAG_SECURE_9F0B_CARDHOLDER_NAME_EXTENDED = 40715;
        public static final int TAG_SECURE_9F6B_TRACK_2_DATA = 40811;
    }
}
