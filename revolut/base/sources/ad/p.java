package ad;

import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public final class p implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3208a;

    public p(byte[] bArr) {
        this.f3208a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        p pVar = (p) obj2;
        byte[] bArr = this.f3208a;
        int length = bArr.length;
        byte[] bArr2 = pVar.f3208a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b4 = bArr[i];
            byte b5 = pVar.f3208a[i];
            if (b4 != b5) {
                return b4 - b5;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof p) {
            return Arrays.equals(this.f3208a, ((p) obj2).f3208a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3208a);
    }

    public final String toString() {
        return hx7.l.g(this.f3208a);
    }
}
