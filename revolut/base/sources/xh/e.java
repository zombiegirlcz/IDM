package xh;

/* JADX INFO: loaded from: classes17.dex */
public final class e {
    public static final e e = new e(f.f305790b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f305787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f305788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f305789c;
    public final int d;

    public e(f fVar, int i, int i2, int i3) {
        this.f305788b = fVar;
        this.f305787a = i;
        this.f305789c = i2;
        this.d = i3;
    }

    public final e a(int i) {
        f dVar = this.f305788b;
        int i2 = this.f305787a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int[] iArr = c.f305784b[i2];
            i2 = 0;
            int i5 = iArr[0];
            int i6 = 65535 & i5;
            int i21 = i5 >> 16;
            dVar.getClass();
            i3 += i21;
            dVar = new d(dVar, i6, i21);
        }
        int i22 = this.f305789c;
        int i32 = (i22 == 0 || i22 == 31) ? 18 : i22 == 62 ? 9 : 8;
        int i33 = i22 + 1;
        e eVar = new e(dVar, i2, i33, i3 + i32);
        return i33 == 2078 ? eVar.b(i + 1) : eVar;
    }

    public final e b(int i) {
        int i2 = this.f305789c;
        if (i2 == 0) {
            return this;
        }
        f fVar = this.f305788b;
        fVar.getClass();
        return new e(new a(fVar, i - i2, i2), this.f305787a, 0, this.d);
    }

    public final boolean c(e eVar) {
        int i;
        int i2 = this.d + (c.f305784b[this.f305787a][eVar.f305787a] >> 16);
        int i3 = eVar.f305789c;
        if (i3 > 0 && ((i = this.f305789c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= eVar.d;
    }

    public final e d(int i, int i2) {
        int i3 = this.d;
        f dVar = this.f305788b;
        int i5 = this.f305787a;
        if (i != i5) {
            int i6 = c.f305784b[i5][i];
            int i21 = 65535 & i6;
            int i22 = i6 >> 16;
            dVar.getClass();
            i3 += i22;
            dVar = new d(dVar, i21, i22);
        }
        int i32 = i == 2 ? 4 : 5;
        dVar.getClass();
        return new e(new d(dVar, i2, i32), i, 0, i3 + i32);
    }

    public final e e(int i, int i2) {
        int i3 = this.f305787a;
        int i5 = i3 == 2 ? 4 : 5;
        int i6 = c.d[i3][i];
        f fVar = this.f305788b;
        fVar.getClass();
        return new e(new d(new d(fVar, i6, i5), i2, 5), i3, 0, this.d + i5 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", c.f305783a[this.f305787a], Integer.valueOf(this.d), Integer.valueOf(this.f305789c));
    }
}
