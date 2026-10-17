package yh;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import zsc.p;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f313678b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f313677a = new int[1];

    public final void a(boolean z) {
        c(this.f313678b + 1);
        if (z) {
            int[] iArr = this.f313677a;
            int i = this.f313678b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f313678b++;
    }

    public final void b(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        c(this.f313678b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public final void c(int i) {
        int[] iArr = this.f313677a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f313677a = iArr2;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f313677a.clone();
        int i = this.f313678b;
        a aVar = new a();
        aVar.f313677a = iArr;
        aVar.f313678b = i;
        return aVar;
    }

    public final boolean e(int i) {
        return ((1 << (i & 31)) & this.f313677a[i / 32]) != 0;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f313678b == aVar.f313678b && Arrays.equals(this.f313677a, aVar.f313677a);
    }

    public final int f() {
        return (this.f313678b + 7) / 8;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f313677a) + (this.f313678b * 31);
    }

    public final String toString() {
        int i = this.f313678b;
        StringBuilder sb6 = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f313678b; i2++) {
            if ((i2 & 7) == 0) {
                sb6.append(p.SPACE_CHAR);
            }
            sb6.append(e(i2) ? 'X' : CoreConstants.DOT);
        }
        return sb6.toString();
    }
}
