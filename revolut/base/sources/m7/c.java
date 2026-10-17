package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f203224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f203225b;

    public c(float[] fArr, int[] iArr) {
        this.f203224a = fArr;
        this.f203225b = iArr;
    }

    public final void a(c cVar) {
        int i = 0;
        while (true) {
            int[] iArr = cVar.f203225b;
            if (i >= iArr.length) {
                return;
            }
            this.f203224a[i] = cVar.f203224a[i];
            this.f203225b[i] = iArr[i];
            i++;
        }
    }

    public final c b(float[] fArr) {
        int iP;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.f203224a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.f203225b;
            if (iBinarySearch >= 0) {
                iP = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iP = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iP = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f4 = fArr2[i3];
                    iP = zi0.c.p((f - f4) / (fArr2[i2] - f4), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iP;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && c.class == obj2.getClass()) {
            c cVar = (c) obj2;
            if (Arrays.equals(this.f203224a, cVar.f203224a) && Arrays.equals(this.f203225b, cVar.f203225b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f203225b) + (Arrays.hashCode(this.f203224a) * 31);
    }
}
