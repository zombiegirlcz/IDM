package zbd;

import com.revolut.feature.shared.savings.models.info_sheets.Icon;
import kotlin.text.a0;
import mcd.b;
import ybd.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final Icon a(c cVar) {
        mcd.a aVar;
        b bVar;
        String str = cVar.f312221a;
        b[] bVarArrValues = b.values();
        int length = bVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            aVar = null;
            if (i2 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i2];
            if (a0.z(bVar.name(), str, true)) {
                break;
            }
            i2++;
        }
        if (bVar == null) {
            bVar = b.UNKNOWN;
        }
        String str2 = cVar.f312222b;
        if (str2 != null) {
            mcd.a[] aVarArrValues = mcd.a.values();
            int length2 = aVarArrValues.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                mcd.a aVar2 = aVarArrValues[i];
                if (a0.z(aVar2.name(), str2, true)) {
                    aVar = aVar2;
                    break;
                }
                i++;
            }
        }
        return new Icon(bVar, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0289 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.shared.savings.models.info_sheets.InfoSheet b(ybd.q0 r22) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zbd.a.b(ybd.q0):com.revolut.feature.shared.savings.models.info_sheets.InfoSheet");
    }
}
