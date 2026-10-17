package nvg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class q0 {
    public void a(ArrayList contributors) {
        Intrinsics.checkNotNullParameter(contributors, "contributors");
        ArrayList arrayList = new ArrayList(zhm.w.t(contributors, 10));
        Iterator it8 = contributors.iterator();
        while (it8.hasNext()) {
            pvg.f0 f0Var = (pvg.f0) it8.next();
            arrayList.add(new vf0.y(f0Var.f240125a, f0Var.f240126b, f0Var.f240127c, f0Var.d, f0Var.e, f0Var.f));
        }
        for (vf0.y yVar : zhm.d0.U(arrayList)) {
            b((iwg.a) yVar.f288491a, (eel.c) yVar.f288492b, (iwg.c) yVar.f288493c, (a3) yVar.d, (String) yVar.e, (String) yVar.f);
        }
        c(contributors);
    }

    public abstract void b(iwg.a aVar, eel.c cVar, iwg.c cVar2, a3 a3Var, String str, String str2);

    public abstract void c(ArrayList arrayList);

    public abstract List d(iwg.a aVar, eel.c cVar, iwg.c cVar2, a3 a3Var, String str, String str2);
}
