package nvg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class x {
    public abstract void a(iwg.a aVar, eel.c cVar, iwg.c cVar2, boolean z, String str, String str2);

    public abstract void b(ArrayList arrayList);

    public void c(ArrayList contributors) {
        Intrinsics.checkNotNullParameter(contributors, "contributors");
        ArrayList arrayList = new ArrayList(zhm.w.t(contributors, 10));
        Iterator it8 = contributors.iterator();
        while (it8.hasNext()) {
            pvg.s sVar = (pvg.s) it8.next();
            arrayList.add(new vf0.y(sVar.f240214a, sVar.f240215b, sVar.f240216c, Boolean.valueOf(sVar.d), sVar.e, sVar.f));
        }
        for (vf0.y yVar : zhm.d0.U(arrayList)) {
            a((iwg.a) yVar.f288491a, (eel.c) yVar.f288492b, (iwg.c) yVar.f288493c, ((Boolean) yVar.d).booleanValue(), (String) yVar.e, (String) yVar.f);
        }
        b(contributors);
    }

    public abstract List d(iwg.a aVar, eel.c cVar, iwg.c cVar2, boolean z, String str, String str2);
}
