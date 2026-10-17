package ix4;

import dx4.e1;
import dx4.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b {
    public static boolean a(List items, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        ArrayList<e1> arrayListG = d9.e1.g(items, a.f169335a);
        ArrayList arrayList = new ArrayList(w.t(arrayListG, 10));
        for (e1 e1Var : arrayListG) {
            if (e1Var == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.items.CheckboxItem");
            }
            arrayList.add((t0) e1Var);
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        ArrayList<t0> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((t0) obj2).f120772c) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return true;
        }
        for (t0 t0Var : arrayList2) {
            ax4.a aVar = (ax4.a) constructorState.f10858c.get(t0Var.f120770a);
            if (!(aVar != null ? aVar.f10854a : t0Var.d)) {
                return false;
            }
        }
        return true;
    }
}
