package yh;

import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f313679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f313680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f313681c;
    public final int[] d;

    public b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f313679a = i;
        this.f313680b = i2;
        int i3 = (i + 31) / 32;
        this.f313681c = i3;
        this.d = new int[i3 * i2];
    }

    public final boolean a(int i, int i2) {
        return ((this.d[(i / 32) + (i2 * this.f313681c)] >>> (i & 31)) & 1) != 0;
    }

    public final void b(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f313681c);
        int[] iArr = this.d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final void c(int i, int i2, int i3, int i5) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i5 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i6 = i3 + i;
        int i21 = i5 + i2;
        if (i21 > this.f313680b || i6 > this.f313679a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i21) {
            int i22 = this.f313681c * i2;
            for (int i32 = i; i32 < i6; i32++) {
                int i33 = (i32 / 32) + i22;
                int[] iArr = this.d;
                iArr[i33] = iArr[i33] | (1 << (i32 & 31));
            }
            i2++;
        }
    }

    public final Object clone() {
        return new b(this.f313679a, this.f313680b, this.f313681c, (int[]) this.d.clone());
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f313679a == bVar.f313679a && this.f313680b == bVar.f313680b && this.f313681c == bVar.f313681c && Arrays.equals(this.d, bVar.d);
    }

    public final int hashCode() {
        int i = this.f313679a;
        return Arrays.hashCode(this.d) + (((((((i * 31) + i) * 31) + this.f313680b) * 31) + this.f313681c) * 31);
    }

    public final String toString() {
        int i = this.f313679a;
        int i2 = this.f313680b;
        StringBuilder sb6 = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i5 = 0; i5 < i; i5++) {
                sb6.append(a(i5, i3) ? "X " : "  ");
            }
            sb6.append("\n");
        }
        return sb6.toString();
    }

    public b(int i, int i2, int i3, int[] iArr) {
        this.f313679a = i;
        this.f313680b = i2;
        this.f313681c = i3;
        this.d = iArr;
    }
}
