package bi;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.youTransactor.uCube.rpc.Constants;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes17.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f15344a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f15345b = {new int[]{Constants.TAG_E4_CUSTOMER_DATA, 48, 15, LDSFile.EF_DG15_TAG, 62}, new int[]{23, 68, SyslogConstants.LOG_LOCAL2, ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, 240, 92, 254}, new int[]{28, 24, 185, Constants.TAG_PAYMENT_APP_CLESS_VERSION, PassportService.DEFAULT_MAX_BLOCKSIZE, Constants.TAG_FULL_SVPP_IDENTIFICATION, 116, 255, LDSFile.EF_DG14_TAG, 61}, new int[]{175, 138, Constants.TAG_KSN_FORMATS, 12, 194, 168, 39, Constants.TAG_F5, 60, 97, SyslogConstants.LOG_CLOCK}, new int[]{41, 153, ISO781611.SMT_DO_DS, 91, 61, 42, 142, Constants.TAG_EMV_L1_VERSION, 97, 178, 100, 242}, new int[]{Constants.EMVTag.TAG_9C_TRANSACTION_TYPE, 97, 192, Constants.TAG_FC_SPEED_MODE, 95, 9, 157, LDSFile.EF_SOD_TAG, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, Constants.TAG_TRANSACTION_DATA, Constants.TAG_EMV_L1_VERSION, LDSFile.EF_DG13_TAG, 129, 94, 254, Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE, 48, 90, 188}, new int[]{15, 195, Constants.TAG_F4, 9, Constants.TAG_USB_CAPABILITY, 71, 168, 2, 188, 160, 153, 145, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION, 79, LDSFile.EF_DG12_TAG, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, Constants.TAG_KSN_FORMATS, LDSFile.EF_DG13_TAG, 39, SyslogConstants.LOG_LOCAL6, 21, 155, Constants.TAG_BATTERY_STATE, Constants.TAG_FB_CHARGING_STATUS, PassportService.DEFAULT_MAX_BLOCKSIZE, 155, 21, 5, 172, 254, 124, 12, 181, SyslogConstants.LOG_LOCAL7, 96, 50, Constants.TAG_ATMEL_SERIAL}, new int[]{211, Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION, 43, 97, 71, 96, 103, 174, 37, ISO7816.TAG_SM_EXPECTED_LENGTH, 170, 53, 75, 34, Constants.TAG_RESOURCE_FILE_VERSION, 121, 17, 138, LDSFile.EF_DG14_TAG, Constants.TAG_EMV_L1_VERSION, ModuleDescriptor.MODULE_VERSION, 136, SyslogConstants.LOG_CLOCK, ISO7816.TAG_SM_EXPECTED_LENGTH, Constants.TAG_USB_CAPABILITY, 168, 93, 255}, new int[]{Constants.TAG_F5, CertificateBody.profileType, 242, Constants.TAG_BOOT_LOADER_CHECKSUM, 130, Constants.TAG_SUPPORTED_LOCALE_LIST, 162, 181, 102, SyslogConstants.LOG_CLOCK, 84, 179, 220, Constants.TAG_FB_CHARGING_STATUS, 80, 182, Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION, 18, 2, 4, 68, 33, 101, 137, 95, LDSFile.EF_SOD_TAG, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, 44, 175, SyslogConstants.LOG_LOCAL7, 59, 25, Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE, 98, 81, 112}, new int[]{77, Constants.TAG_ATMEL_SERIAL, 137, 31, 19, 38, 22, 153, Constants.TAG_BLE_FIRMWARE_VERSION, 105, 122, 2, Constants.TAG_F5, 133, 242, 8, 175, 95, 100, 9, 167, 105, Constants.TAG_EMV_L1_CHECKSUM, LDSFile.EF_DG15_TAG, 57, 121, 21, 1, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION, 57, 54, 101, Constants.TAG_FULL_SVPP_IDENTIFICATION, 202, 69, 50, 150, 177, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION, 5, 9, 5}, new int[]{Constants.TAG_F5, 132, 172, PassportService.DEFAULT_MAX_BLOCKSIZE, 96, 32, LDSFile.EF_DG2_TAG, 22, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, 133, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION, Constants.TAG_KSN_FORMATS, 188, Constants.TAG_MPOS_MODULE_STATE, 87, 191, 106, 16, 147, LDSFile.EF_DG4_TAG, 23, 37, 90, 170, Constants.TAG_KSN_FORMATS, ISO781611.CREATION_DATE_AND_TIME_TAG, 88, SyslogConstants.LOG_CLOCK, 100, 66, 138, 186, 240, 82, 44, SyslogConstants.LOG_LOCAL6, 87, 187, 147, 160, 175, 69, Constants.TAG_EMV_L1_VERSION, 92, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION, Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE, 19}, new int[]{175, 9, PassportService.DEFAULT_MAX_BLOCKSIZE, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, Constants.TAG_EMV_L2_VERSION, Constants.TAG_EMV_NFC_CONFIG_VERSION, 150, 159, 36, PassportService.DEFAULT_MAX_BLOCKSIZE, 38, 200, 132, 54, Constants.TAG_E4_CUSTOMER_DATA, 146, Constants.TAG_BOOT_LOADER_CHECKSUM, Constants.TAG_EMV_ICC_CONFIG_VERSION, LDSFile.EF_DG2_TAG, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1, 29, 232, SyslogConstants.LOG_LOCAL2, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, 22, 150, 201, LDSFile.EF_DG2_TAG, 62, Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION, Constants.TAG_GPI_VERSION, 13, 137, Constants.TAG_F5, CertificateBody.profileType, 67, Constants.TAG_BLE_FIRMWARE_VERSION, 28, 155, 43, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1, 107, Constants.TAG_USB_CAPABILITY, 53, 143, 46}, new int[]{242, 93, 169, 50, SyslogConstants.LOG_LOCAL2, Constants.TAG_SVPP_CHECKSUM, 39, LDSFile.EF_DG4_TAG, 202, 188, 201, 189, 143, LDSFile.EF_DG12_TAG, 196, 37, 185, 112, ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, 230, Constants.TAG_F5, 63, Constants.TAG_BATTERY_STATE, 190, Constants.TAG_SUPPORTED_LOCALE_LIST, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, Constants.TAG_BOOT_LOADER_CHECKSUM, 51, 63, 87, 10, 40, 130, 188, 17, Constants.TAG_ACE_LAYER_VERSION, 31, SyslogConstants.LOG_LOCAL6, 170, 4, 107, 232, 7, 94, Constants.TAG_PAYMENT_APP_CLESS_VERSION, BERTags.FLAGS, 124, 86, 47, 11, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2}, new int[]{220, Constants.TAG_E4_CUSTOMER_DATA, 173, 89, Constants.TAG_FB_CHARGING_STATUS, 149, 159, 56, 89, 33, 147, Constants.TAG_F4, Constants.EMVTag.TAG_9A_TRANSACTION_DATE, 36, 73, CertificateBody.profileType, Constants.TAG_EMV_L1_VERSION, 136, Constants.TAG_FULL_SVPP_IDENTIFICATION, 180, Constants.TAG_EMV_ICC_CONFIG_VERSION, Constants.TAG_BATTERY_STATE, ISO781611.SMT_DO_DS, 177, 68, 122, 93, Constants.TAG_EMV_L1_VERSION, 15, 160, Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS, Constants.TAG_OS_VERSION, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, Constants.TAG_SVPP_CHECKSUM, Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION, 136, PassportService.DEFAULT_MAX_BLOCKSIZE, 239, 181, Constants.TAG_TRANSACTION_DATA, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, LDSFile.EF_DG12_TAG, 153, 132, 63, 96, 103, 82, 186}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f15346c = new int[256];
    public static final int[] d = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            d[i2] = i;
            f15346c[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    public static String a(int i, String str) {
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int length = str.length();
        int i5 = 0;
        while (true) {
            if (i5 >= 16) {
                i5 = -1;
                break;
            }
            if (f15344a[i5] == i) {
                break;
            }
            i5++;
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i)));
        }
        int[] iArr3 = f15345b[i5];
        char[] cArr = new char[i];
        for (int i6 = 0; i6 < i; i6++) {
            cArr[i6] = 0;
        }
        for (int i21 = 0; i21 < length; i21++) {
            int i22 = i - 1;
            int iCharAt = cArr[i22] ^ str.charAt(i21);
            while (true) {
                iArr = f15346c;
                iArr2 = d;
                if (i22 <= 0) {
                    break;
                }
                if (iCharAt == 0 || (i3 = iArr3[i22]) == 0) {
                    cArr[i22] = cArr[i22 - 1];
                } else {
                    cArr[i22] = (char) (iArr2[(iArr[iCharAt] + iArr[i3]) % 255] ^ cArr[i22 - 1]);
                }
                i22--;
            }
            if (iCharAt == 0 || (i2 = iArr3[0]) == 0) {
                cArr[0] = 0;
            } else {
                cArr[0] = (char) iArr2[(iArr[iCharAt] + iArr[i2]) % 255];
            }
        }
        char[] cArr2 = new char[i];
        for (int i32 = 0; i32 < i; i32++) {
            cArr2[i32] = cArr[(i - i32) - 1];
        }
        return String.valueOf(cArr2);
    }
}
