package androidx.profileinstaller;

import com.youTransactor.uCube.rpc.Constants;
import java.util.Arrays;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes15.dex */
public abstract class ProfileVersion {
    static final byte[] V015_S = {ISO7816.INS_DECREASE, Constants.INQUIRY, 53, 0};
    static final byte[] V010_P = {ISO7816.INS_DECREASE, Constants.INQUIRY, ISO7816.INS_DECREASE, 0};
    static final byte[] V009_O_MR1 = {ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 57, 0};
    static final byte[] V005_O = {ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 53, 0};
    static final byte[] V001_N = {ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, Constants.INQUIRY, 0};
    static final byte[] METADATA_V001_N = {ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, Constants.INQUIRY, 0};
    static final byte[] METADATA_V002 = {ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, ISO7816.INS_INCREASE, 0};

    public static String dexKeySeparator(byte[] bArr) {
        return (Arrays.equals(bArr, V001_N) || Arrays.equals(bArr, V005_O)) ? ":" : "!";
    }
}
