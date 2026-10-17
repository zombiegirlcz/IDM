package s71;

import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import fva.j;
import ibd.e;
import ibd.h;
import io3.l;
import java.util.List;
import java.util.Set;
import qua.p;
import tof.fc;
import tof.i7;
import tof.mb;
import tof.n7;
import tof.o7;
import tof.pa;
import tof.s9;
import tof.x7;
import tof.xa;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class c {
    public static i7 a(p pVar, boolean z) {
        List list;
        Set setI1 = null;
        setI1 = null;
        h hVar = pVar != null ? pVar.f249314a.f160152c : null;
        switch (hVar == null ? -1 : b.f260500a[hVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                Set set = pVar.G;
                if (set == null) {
                    set = h0.f322473a;
                }
                return new s9(set);
            case 5:
                j jVar = pVar.O;
                if (jVar != null && (list = jVar.f138402b) != null) {
                    setI1 = d0.i1(list);
                }
                if (setI1 == null) {
                    setI1 = h0.f322473a;
                }
                return new x7(setI1);
            case 6:
                Set set2 = pVar.G;
                if (set2 == null) {
                    set2 = h0.f322473a;
                }
                return fc.a(new s9(set2), new xa(l.CURRENT));
            case 7:
                return new pa(pVar.f249314a.f160150a);
            case 8:
            case 9:
                return fc.a(new mb(pVar.f249314a.f160150a), z ? new o7() : new n7());
            case 10:
                WalletAutomation walletAutomation = pVar.f249317b0;
                e eVar = pVar.f249314a;
                if (walletAutomation == null) {
                    return new mb(eVar.f160150a);
                }
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {new mb(eVar.f160150a), new o7()};
                cVar.getClass();
                return i7.c.a(i7VarArr);
            default:
                String str = pVar != null ? pVar.f249314a.f160150a : null;
                if (str == null) {
                    str = "";
                }
                return new mb(str);
        }
    }
}
