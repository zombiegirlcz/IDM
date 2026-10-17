package nvg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a0 {
    public abstract void a(eel.c cVar, String str, String str2, String str3);

    public abstract void b(ArrayList arrayList);

    public void c(ArrayList dividend) {
        Intrinsics.checkNotNullParameter(dividend, "dividend");
        ArrayList arrayList = new ArrayList(zhm.w.t(dividend, 10));
        Iterator it8 = dividend.iterator();
        while (it8.hasNext()) {
            pvg.u uVar = (pvg.u) it8.next();
            arrayList.add(new w0(uVar.f240223a, uVar.f240224b, uVar.f240225c, uVar.d));
        }
        for (w0 w0Var : zhm.d0.U(arrayList)) {
            a(w0Var.f219687a, w0Var.f219688b, w0Var.f219689c, w0Var.d);
        }
        b(dividend);
    }

    public abstract List d(eel.c cVar, String str, List list);

    public abstract List e(eel.c cVar, String str);
}
