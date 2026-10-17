package org.bouncycastle.pqc.crypto.hqc;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.youTransactor.uCube.rpc.Constants;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.KEMParameters;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes14.dex */
public class HQCParameters implements KEMParameters {
    static final int GF_MUL_ORDER = 255;
    static final int PARAM_M = 8;
    public static final HQCParameters hqc128 = new HQCParameters("hqc-128", 17669, 46, 384, 16, 15, 66, 75, 4, 243079, 2241, 2321, new int[]{89, 69, 153, 116, SyslogConstants.LOG_LOCAL6, LDSFile.EF_DG2_TAG, LDSFile.EF_DG15_TAG, 75, 73, Constants.TAG_USB_CAPABILITY, 242, Constants.TAG_USB_CAPABILITY, 65, Constants.TAG_SVPP_CHECKSUM, 21, 139, 103, 173, 67, LDSFile.EF_DG4_TAG, 105, Constants.TAG_SVPP_CHECKSUM, 174, LDSFile.EF_DG14_TAG, 74, 69, Constants.TAG_E4_CUSTOMER_DATA, 82, 255, 181, 1});
    public static final HQCParameters hqc192 = new HQCParameters("hqc-192", 35851, 56, 640, 24, 16, 100, 114, 5, 119800, 4514, 4602, new int[]{45, Constants.TAG_EMV_L2_CHECKSUM, 239, 24, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION, 104, 27, 40, 107, 50, Constants.TAG_ACE_LAYER_VERSION, Constants.TAG_SVPP_CHECKSUM, Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS, ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, BERTags.FLAGS, ISO781611.SMT_DO_DS, LDSFile.EF_SOD_TAG, 13, ISO781611.SMT_DO_DS, 1, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, Constants.TAG_GPI_VERSION, 82, 43, 15, 232, 246, 142, 50, 189, 29, 232, 1});
    public static final HQCParameters hqc256 = new HQCParameters("hqc-256", 57637, 90, 640, 32, 29, ISO781611.CREATION_DATE_AND_TIME_TAG, 149, 5, 74517, 7237, 7333, new int[]{49, 167, 49, 39, 200, 121, 124, 91, 240, 63, 148, 71, 150, 123, 87, 101, 32, Constants.TAG_EMV_L2_VERSION, 159, 71, 201, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, 97, Constants.TAG_SVPP_CHECKSUM, 186, 183, ModuleDescriptor.MODULE_VERSION, Constants.TAG_BOOT_LOADER_VERSION, 123, 12, 31, Constants.TAG_F3_BUILD_CONFIGURATION, 180, Constants.TAG_KSL_ID, SyslogConstants.LOG_LOCAL3, 239, 99, ModuleDescriptor.MODULE_VERSION, 4, 246, 191, SyslogConstants.LOG_LOCAL2, 8, 232, 47, 27, ModuleDescriptor.MODULE_VERSION, 178, 130, 64, 124, 47, 39, 188, Constants.TAG_EMV_L2_CHECKSUM, 48, 199, 187, 1});
    private final HQCEngine engine;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f228811n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private final int f228812n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private final int f228813n2;
    private final String name;
    private final int publicKeyBytes;
    private final int secretKeyBytes;

    private HQCParameters(String str, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, int i59, int[] iArr) {
        this.name = str;
        this.f228811n = i;
        this.f228812n1 = i2;
        this.f228813n2 = i3;
        this.publicKeyBytes = i43;
        this.secretKeyBytes = i59;
        this.engine = new HQCEngine(i, i2, i3, i5, i6, i21, i22, i32, i33, i43, iArr);
    }

    public int getEncapsulationLength() {
        return this.engine.getCipherTextBytes();
    }

    public HQCEngine getEngine() {
        return this.engine;
    }

    public int getN1N2_BYTES() {
        return ((this.f228812n1 * this.f228813n2) + 7) / 8;
    }

    public int getN_BYTES() {
        return (this.f228811n + 7) / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getSALT_SIZE_BYTES() {
        return 16;
    }

    public int getSHA512_BYTES() {
        return 64;
    }

    public int getSecretKeyBytes() {
        return this.secretKeyBytes;
    }

    public int getSessionKeySize() {
        return 256;
    }
}
