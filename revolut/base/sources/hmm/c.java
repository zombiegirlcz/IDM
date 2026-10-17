package hmm;

import com.google.common.primitives.UnsignedBytes;
import kotlin.text.Charsets;
import mmm.m;
import vlm.h;

/* JADX INFO: loaded from: classes14.dex */
public final class c {
    public static final String a(c cVar, m mVar, m[] mVarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i5;
        cVar.getClass();
        int iD = mVar.d();
        int i6 = 0;
        while (i6 < iD) {
            int i21 = (i6 + iD) / 2;
            while (i21 > -1 && mVar.k(i21) != 10) {
                i21--;
            }
            int i22 = i21 + 1;
            int i32 = 1;
            while (true) {
                i2 = i22 + i32;
                if (mVar.k(i2) == 10) {
                    break;
                }
                i32++;
            }
            int i33 = i2 - i22;
            int i43 = i;
            boolean z3 = false;
            int i59 = 0;
            int i66 = 0;
            while (true) {
                if (z3) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bK = mVarArr[i43].k(i59);
                    byte[] bArr = h.f290508a;
                    int i74 = bK & UnsignedBytes.MAX_VALUE;
                    z = z3;
                    i3 = i74;
                }
                byte bK2 = mVar.k(i22 + i66);
                byte[] bArr2 = h.f290508a;
                i5 = i3 - (bK2 & UnsignedBytes.MAX_VALUE);
                if (i5 != 0) {
                    break;
                }
                i66++;
                i59++;
                if (i66 == i33) {
                    break;
                }
                if (mVarArr[i43].d() != i59) {
                    z3 = z;
                } else {
                    if (i43 == mVarArr.length - 1) {
                        break;
                    }
                    i43++;
                    i59 = -1;
                    z3 = true;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i92 = i33 - i66;
                    int iD2 = mVarArr[i43].d() - i59;
                    int length = mVarArr.length;
                    for (int i96 = i43 + 1; i96 < length; i96++) {
                        iD2 += mVarArr[i96].d();
                    }
                    if (iD2 >= i92) {
                        if (iD2 <= i92) {
                            return mVar.r(i22, i33 + i22).q(Charsets.UTF_8);
                        }
                    }
                }
                i6 = i2 + 1;
            }
            iD = i21;
        }
        return null;
    }
}
