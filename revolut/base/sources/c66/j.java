package c66;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.jetbrains.annotations.NotNull;
import zhm.p;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21686a = {-2147483604, -2147483147, Integer.MIN_VALUE, Integer.MIN_VALUE};

    public static final class a {
        private a() {
        }
    }

    public static byte[] a(byte[] seed) throws Throwable {
        Intrinsics.checkNotNullParameter(seed, "seed");
        byte[] bytes = "ed25519 seed".getBytes(Charsets.d);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrK = edl.a.k(bytes, seed);
        try {
            int[] iArr = f21686a;
            int i = 0;
            while (i < 4) {
                int i2 = iArr[i];
                byte[] bArrM = p.m(bArrK, 0, 32);
                byte[] bArrM2 = p.m(bArrK, 32, 64);
                byte[] bArr = {(byte) (i2 >>> 24), (byte) (i2 >>> 16), (byte) (i2 >>> 8), (byte) i2};
                byte[] bArrE = ebm.a.e(new byte[]{0}, bArrM, bArr);
                try {
                    byte[] bArrK2 = edl.a.k(bArrM2, bArrE);
                    p.r(bArrM);
                    p.r(bArrM2);
                    p.r(bArr);
                    p.r(bArrE);
                    p.r(bArrK);
                    i++;
                    bArrK = bArrK2;
                } catch (Throwable th10) {
                    p.r(bArrM);
                    p.r(bArrM2);
                    p.r(bArr);
                    p.r(bArrE);
                    throw th10;
                }
            }
            byte[] bArr2 = new byte[32];
            Ed25519.generatePublicKey(bArrK, 0, bArr2, 0);
            p.r(bArrK);
            return bArr2;
        } catch (Throwable th11) {
            p.r(bArrK);
            throw th11;
        }
    }
}
