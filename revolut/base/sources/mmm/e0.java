package mmm;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 {
    public static void a(long j2, h hVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i21;
        int i22 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i32 = i2; i32 < i3; i32++) {
            if (((m) arrayList4.get(i32)).d() < i22) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        m mVar = (m) arrayList.get(i2);
        m mVar2 = (m) arrayList4.get(i3 - 1);
        if (i22 == mVar.d()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i33 = i2 + 1;
            m mVar3 = (m) arrayList4.get(i33);
            i5 = i33;
            i6 = iIntValue;
            mVar = mVar3;
        } else {
            i5 = i2;
            i6 = -1;
        }
        if (mVar.k(i22) == mVar2.k(i22)) {
            int iMin = Math.min(mVar.d(), mVar2.d());
            int i43 = 0;
            for (int i59 = i22; i59 < iMin && mVar.k(i59) == mVar2.k(i59); i59++) {
                i43++;
            }
            long j5 = 4;
            long j16 = (hVar.f207266b / j5) + j2 + ((long) 2) + ((long) i43) + 1;
            hVar.z(-i43);
            hVar.z(i6);
            int i66 = i22 + i43;
            while (i22 < i66) {
                hVar.z(mVar.k(i22) & 255);
                i22++;
            }
            if (i5 + 1 == i3) {
                if (i66 != ((m) arrayList4.get(i5)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                hVar.z(((Number) arrayList5.get(i5)).intValue());
                return;
            } else {
                h hVar2 = new h();
                hVar.z(((int) ((hVar2.f207266b / j5) + j16)) * (-1));
                a(j16, hVar2, i66, arrayList4, i5, i3, arrayList5);
                hVar.R8(hVar2);
                return;
            }
        }
        int i74 = 1;
        for (int i92 = i5 + 1; i92 < i3; i92++) {
            if (((m) arrayList4.get(i92 - 1)).k(i22) != ((m) arrayList4.get(i92)).k(i22)) {
                i74++;
            }
        }
        long j22 = 4;
        long j42 = (hVar.f207266b / j22) + j2 + ((long) 2) + ((long) (i74 * 2));
        hVar.z(i74);
        hVar.z(i6);
        for (int i96 = i5; i96 < i3; i96++) {
            int iK = ((m) arrayList4.get(i96)).k(i22);
            if (i96 == i5 || iK != ((m) arrayList4.get(i96 - 1)).k(i22)) {
                hVar.z(iK & 255);
            }
        }
        h hVar3 = new h();
        int i99 = i5;
        while (i99 < i3) {
            byte bK = ((m) arrayList4.get(i99)).k(i22);
            int i100 = i99 + 1;
            int i101 = i100;
            while (true) {
                if (i101 >= i3) {
                    i101 = i3;
                    break;
                } else if (bK != ((m) arrayList4.get(i101)).k(i22)) {
                    break;
                } else {
                    i101++;
                }
            }
            if (i100 == i101 && i22 + 1 == ((m) arrayList4.get(i99)).d()) {
                hVar.z(((Number) arrayList5.get(i99)).intValue());
                arrayList3 = arrayList5;
                j3 = j42;
                i21 = i101;
            } else {
                hVar.z(((int) ((hVar3.f207266b / j22) + j42)) * (-1));
                arrayList3 = arrayList5;
                j3 = j42;
                i21 = i101;
                a(j3, hVar3, i22 + 1, arrayList, i99, i21, arrayList3);
                arrayList4 = arrayList;
            }
            j42 = j3;
            i99 = i21;
            arrayList5 = arrayList3;
        }
        hVar.R8(hVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static mmm.f0 b(mmm.m... r11) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mmm.e0.b(mmm.m[]):mmm.f0");
    }
}
