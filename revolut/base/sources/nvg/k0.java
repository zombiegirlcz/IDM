package nvg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class k0 {
    public abstract void a(iwg.a aVar, eel.c cVar, String str, String str2);

    public abstract void b(ArrayList arrayList);

    public void c(ArrayList pnl2) {
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        ArrayList arrayList = new ArrayList(zhm.w.t(pnl2, 10));
        Iterator it8 = pnl2.iterator();
        while (it8.hasNext()) {
            pvg.b0 b0Var = (pvg.b0) it8.next();
            arrayList.add(new vf0.h(b0Var.f240081a, b0Var.f240082b, b0Var.f240083c, b0Var.d));
        }
        for (vf0.h hVar : zhm.d0.U(arrayList)) {
            a((iwg.a) hVar.f288433a, (eel.c) hVar.f288434b, (String) hVar.f288435c, (String) hVar.d);
        }
        b(pnl2);
    }

    public abstract List d(iwg.a aVar, eel.c cVar, String str, String str2);
}
