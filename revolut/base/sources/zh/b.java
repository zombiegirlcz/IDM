package zh;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f322202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f322203b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f322202a = aVar;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f322203b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f322203b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.f322203b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public final b a(b bVar) {
        a aVar = bVar.f322202a;
        a aVar2 = this.f322202a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        int[] iArr = this.f322203b;
        if (iArr[0] == 0) {
            return bVar;
        }
        int[] iArr2 = bVar.f322203b;
        if (iArr2[0] == 0) {
            return this;
        }
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new b(aVar2, iArr3);
    }

    public final int b() {
        return this.f322203b.length - 1;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder(b() * 8);
        for (int iB = b(); iB >= 0; iB--) {
            int[] iArr = this.f322203b;
            int i = iArr[(iArr.length - 1) - iB];
            if (i != 0) {
                if (i < 0) {
                    sb6.append(" - ");
                    i = -i;
                } else if (sb6.length() > 0) {
                    sb6.append(" + ");
                }
                if (iB == 0 || i != 1) {
                    a aVar = this.f322202a;
                    if (i == 0) {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i2 = aVar.f322200b[i];
                    if (i2 == 0) {
                        sb6.append('1');
                    } else if (i2 == 1) {
                        sb6.append('a');
                    } else {
                        sb6.append("a^");
                        sb6.append(i2);
                    }
                }
                if (iB != 0) {
                    if (iB == 1) {
                        sb6.append('x');
                    } else {
                        sb6.append("x^");
                        sb6.append(iB);
                    }
                }
            }
        }
        return sb6.toString();
    }
}
