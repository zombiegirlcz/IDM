package mmm;

import ch.qos.logback.core.CoreConstants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class p0 extends m {
    public final transient byte[][] e;
    public final transient int[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(byte[][] segments, int[] directory) {
        super(m.d.f207285a);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.e = segments;
        this.f = directory;
    }

    @Override // mmm.m
    public final String a() {
        throw null;
    }

    @Override // mmm.m
    public final m c(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i5 = iArr[i];
            messageDigest.update(bArr[i], i3, i5 - i2);
            i++;
            i2 = i5;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.h(bArrDigest);
        return new m(bArrDigest);
    }

    @Override // mmm.m
    public final int d() {
        return this.f[this.e.length - 1];
    }

    @Override // mmm.m
    public final String e() {
        return x().e();
    }

    @Override // mmm.m
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof m) {
            m mVar = (m) obj2;
            if (mVar.d() == d() && o(0, mVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // mmm.m
    public final int f(int i, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return x().f(i, other);
    }

    @Override // mmm.m
    public final int hashCode() {
        int i = this.f207286b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i5 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i6 = iArr[length + i2];
            int i21 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i22 = (i21 - i5) + i6;
            while (i6 < i22) {
                i3 = (i3 * 31) + bArr2[i6];
                i6++;
            }
            i2++;
            i5 = i21;
        }
        this.f207286b = i3;
        return i3;
    }

    @Override // mmm.m
    public final byte[] i() {
        return u();
    }

    @Override // mmm.m
    public final byte k(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        b.b(iArr[length], i, 1L);
        int i2 = nmm.o.i(this, i);
        return bArr[i2][(i - (i2 == 0 ? 0 : iArr[i2 - 1])) + iArr[bArr.length + i2]];
    }

    @Override // mmm.m
    public final int l(byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return x().l(other);
    }

    @Override // mmm.m
    public final boolean n(int i, int i2, int i3, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int i6 = nmm.o.i(this, i);
        while (i < i5) {
            int[] iArr = this.f;
            int i21 = i6 == 0 ? 0 : iArr[i6 - 1];
            int i22 = iArr[i6] - i21;
            byte[][] bArr = this.e;
            int i32 = iArr[bArr.length + i6];
            int iMin = Math.min(i5, i22 + i21) - i;
            if (!b.a((i - i21) + i32, bArr[i6], i2, other, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            i6++;
        }
        return true;
    }

    @Override // mmm.m
    public final boolean o(int i, m other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int i5 = nmm.o.i(this, i);
            int i6 = 0;
            while (i < i3) {
                int[] iArr = this.f;
                int i21 = i5 == 0 ? 0 : iArr[i5 - 1];
                int i22 = iArr[i5] - i21;
                byte[][] bArr = this.e;
                int i32 = iArr[bArr.length + i5];
                int iMin = Math.min(i3, i22 + i21) - i;
                if (other.n(i6, (i - i21) + i32, iMin, bArr[i5])) {
                    i6 += iMin;
                    i += iMin;
                    i5++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // mmm.m
    public final String q(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return x().q(charset);
    }

    @Override // mmm.m
    public final m r(int i, int i2) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i < 0) {
            throw new IllegalArgumentException(j6.a.l(i, "beginIndex=", " < 0").toString());
        }
        if (i2 > d()) {
            StringBuilder sbW = a0.d.w(i2, "endIndex=", " > length(");
            sbW.append(d());
            sbW.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(a0.d.g(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == d()) {
            return this;
        }
        if (i == i2) {
            return m.d;
        }
        int i5 = nmm.o.i(this, i);
        int i6 = nmm.o.i(this, i2 - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) zhm.p.n(i5, i6 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (i5 <= i6) {
            int i21 = i5;
            int i22 = 0;
            while (true) {
                iArr[i22] = Math.min(iArr2[i21] - i, i3);
                int i32 = i22 + 1;
                iArr[i22 + bArr2.length] = iArr2[bArr.length + i21];
                if (i21 == i6) {
                    break;
                }
                i21++;
                i22 = i32;
            }
        }
        int i33 = i5 != 0 ? iArr2[i5 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i33) + iArr[length];
        return new p0(bArr2, iArr);
    }

    @Override // mmm.m
    public final m t() {
        return x().t();
    }

    @Override // mmm.m
    public final String toString() {
        return x().toString();
    }

    @Override // mmm.m
    public final byte[] u() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i];
            int i6 = iArr[i];
            int i21 = i6 - i2;
            zhm.p.e(i3, bArr2[i], i5, bArr, i5 + i21);
            i3 += i21;
            i++;
            i2 = i6;
        }
        return bArr;
    }

    @Override // mmm.m
    public final void w(h buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i2 = nmm.o.i(this, 0);
        int i3 = 0;
        while (i3 < i) {
            int[] iArr = this.f;
            int i5 = i2 == 0 ? 0 : iArr[i2 - 1];
            int i6 = iArr[i2] - i5;
            byte[][] bArr = this.e;
            int i21 = iArr[bArr.length + i2];
            int iMin = Math.min(i, i6 + i5) - i3;
            int i22 = (i3 - i5) + i21;
            n0 n0Var = new n0(bArr[i2], i22, i22 + iMin, true, false);
            n0 n0Var2 = buffer.f207265a;
            if (n0Var2 == null) {
                n0Var.f207294g = n0Var;
                n0Var.f = n0Var;
                buffer.f207265a = n0Var;
            } else {
                n0 n0Var3 = n0Var2.f207294g;
                Intrinsics.h(n0Var3);
                n0Var3.b(n0Var);
            }
            i3 += iMin;
            i2++;
        }
        buffer.f207266b += (long) i;
    }

    public final m x() {
        return new m(u());
    }
}
