package xh;

/* JADX INFO: loaded from: classes17.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f305782a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(yh.b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i5 = i - i3;
            int i6 = i5;
            while (true) {
                int i21 = i + i3;
                if (i6 <= i21) {
                    bVar.b(i6, i5);
                    bVar.b(i6, i21);
                    bVar.b(i5, i6);
                    bVar.b(i21, i6);
                    i6++;
                }
            }
        }
        int i22 = i - i2;
        bVar.b(i22, i22);
        int i32 = i22 + 1;
        bVar.b(i32, i22);
        bVar.b(i22, i32);
        int i33 = i + i2;
        bVar.b(i33, i22);
        bVar.b(i33, i32);
        bVar.b(i33, i33 - 1);
    }

    public static yh.a b(yh.a aVar, int i, int i2) {
        zh.a aVar2;
        int i3 = aVar.f313678b / i2;
        if (i2 == 4) {
            aVar2 = zh.a.f322197j;
        } else if (i2 == 6) {
            aVar2 = zh.a.i;
        } else if (i2 == 8) {
            aVar2 = zh.a.f322198l;
        } else if (i2 == 10) {
            aVar2 = zh.a.f322196h;
        } else {
            if (i2 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
            }
            aVar2 = zh.a.f322195g;
        }
        su9.c cVar = new su9.c(aVar2);
        int i5 = i / i2;
        int[] iArr = new int[i5];
        int i6 = aVar.f313678b / i2;
        for (int i21 = 0; i21 < i6; i21++) {
            int i22 = 0;
            for (int i32 = 0; i32 < i2; i32++) {
                i22 |= aVar.e((i21 * i2) + i32) ? 1 << ((i2 - i32) - 1) : 0;
            }
            iArr[i21] = i22;
        }
        cVar.c(i5 - i3, iArr);
        yh.a aVar3 = new yh.a();
        aVar3.b(0, i % i2);
        for (int i33 = 0; i33 < i5; i33++) {
            aVar3.b(iArr[i33], i2);
        }
        return aVar3;
    }

    public static yh.a c(yh.a aVar, int i) {
        yh.a aVar2 = new yh.a();
        int i2 = aVar.f313678b;
        int i3 = (1 << i) - 2;
        int i5 = 0;
        while (i5 < i2) {
            int i6 = 0;
            for (int i21 = 0; i21 < i; i21++) {
                int i22 = i5 + i21;
                if (i22 >= i2 || aVar.e(i22)) {
                    i6 |= 1 << ((i - 1) - i21);
                }
            }
            int i32 = i6 & i3;
            if (i32 == i3) {
                aVar2.b(i32, i);
            } else if (i32 == 0) {
                aVar2.b(i6 | 1, i);
            } else {
                aVar2.b(i6, i);
                i5 += i;
            }
            i5--;
            i5 += i;
        }
        return aVar2;
    }
}
