package od;

import hx7.l;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f224252a;

    public a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f224252a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            return Arrays.equals(((a) obj2).f224252a, this.f224252a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f224252a);
    }

    public final String toString() {
        return "Bytes(" + l.g(this.f224252a) + ")";
    }
}
