package nd;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes17.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cd.b f214276a = new cd.b(5);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f214276a.get()).nextBytes(bArr);
        return bArr;
    }
}
