package gcm;

import com.google.common.base.Charsets;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f142676a = Logger.getLogger(h6.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f142677b = "-bin".getBytes(Charsets.US_ASCII);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
