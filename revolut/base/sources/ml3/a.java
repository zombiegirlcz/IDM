package ml3;

import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public abstract int a();

    public void b(ArrayList arrayList) {
        ArrayList arrayListS = t61.a.s("contacts", arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            i iVar = (i) it8.next();
            i iVarF = f(iVar.i());
            if (iVarF == null) {
                arrayList2.add(iVar);
            } else {
                arrayListS.add(i.a(iVar, iVarF.q(), iVarF.p()));
            }
        }
        n(arrayList2);
        q(arrayListS);
    }

    public abstract int c(List list);

    public abstract i d(String str);

    public abstract d0 e(List list);

    public abstract i f(long j2);

    public abstract i g(String str);

    public abstract i h(String str);

    public abstract List i(int i, int i2);

    public abstract List j();

    public abstract int k();

    public abstract List l();

    public abstract void m(long j2, List list);

    public abstract List n(ArrayList arrayList);

    public abstract efm.r o(List list);

    public abstract efm.r p(List list);

    public abstract void q(ArrayList arrayList);

    public abstract efm.b r(int i, long j2, String str);
}
