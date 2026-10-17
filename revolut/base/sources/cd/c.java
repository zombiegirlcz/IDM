package cd;

import android.os.Build;
import hd.w;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import nd.x;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ed.c f23129c = ed.c.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public static final b d = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f23130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23131b;

    public c(byte[] bArr) throws GeneralSecurityException {
        if (!f23129c.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        x.a(bArr.length);
        this.f23130a = new SecretKeySpec(bArr, "AES");
        this.f23131b = true;
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i = w.f151375a;
            Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
            if ((numValueOf != null ? numValueOf.intValue() : -1) <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
