package sn5;

import jli.g;
import kn5.c;
import kn5.e;
import kn5.f;
import kn5.h;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.f0;
import org.bouncycastle.jcajce.provider.digest.SHA512;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements rn5.a {

    @NotNull
    public static final C1477a Companion = new C1477a();

    /* JADX INFO: renamed from: sn5.a$a, reason: collision with other inner class name */
    public static final class C1477a {
        private C1477a() {
        }
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        char c2;
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.f185996a;
        if (str.length() == 0) {
            return new e(h.f186003a);
        }
        if (str.length() != 58) {
            return new e(null);
        }
        char c3 = 5;
        int length = (str.length() * 5) / 8;
        byte[] bArr = new byte[length];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = 0;
        }
        int length2 = str.length() / 8;
        if (length2 >= 0) {
            int i2 = 0;
            while (true) {
                for (int i3 = 0; i3 < 8; i3++) {
                    int i5 = (i2 * 8) + i3;
                    if (i5 < str.length()) {
                        iArr[i3] = d0.S("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", str.charAt(i5), 0, 6);
                    }
                }
                int i6 = i2 * 5;
                if (i6 < length) {
                    bArr[i6] = (byte) ((iArr[0] << 3) | (iArr[1] >> 2));
                }
                int i21 = i6 + 1;
                if (i21 < length) {
                    c2 = c3;
                    bArr[i21] = (byte) (((iArr[1] & 3) << 6) | (iArr[2] << 1) | (iArr[3] >> 4));
                } else {
                    c2 = c3;
                }
                int i22 = i6 + 2;
                if (i22 < length) {
                    bArr[i22] = (byte) (((iArr[3] & 15) << 4) | (iArr[4] >> 1));
                }
                int i32 = i6 + 3;
                if (i32 < length) {
                    bArr[i32] = (byte) (((iArr[4] & 1) << 7) | (iArr[c2] << 2) | (iArr[6] >> 3));
                }
                int i33 = i6 + 4;
                if (i33 < length) {
                    bArr[i33] = (byte) (((iArr[6] & 7) << 5) | iArr[7]);
                }
                if (i2 == length2) {
                    break;
                }
                i2++;
                c3 = c2;
            }
        }
        int i43 = length - 4;
        byte[] bArrL0 = d.l0(bArr, kotlin.ranges.f.o(0, i43));
        String strI = g.i(d.l0(bArr, kotlin.ranges.f.o(i43, length)));
        byte[] bArrDigest = new SHA512.DigestT256().digest(bArrL0);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return f0.V0(8, g.i(bArrDigest)).contentEquals(strI) ? c.f186000a : new e(null);
    }
}
