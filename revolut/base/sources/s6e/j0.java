package s6e;

import java.util.LinkedHashSet;
import tof.fc;
import tof.gb;
import tof.i7;
import tof.n7;
import tof.oa;
import tof.q7;
import tof.r7;
import tof.ua;
import tof.va;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa f260292a;

    public j0() {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {fc.b(new r7(yvh.f.SPARE_CHANGE)), new gb(null), new n7()};
        cVar.getClass();
        this.f260292a = i7.c.b(i7VarArr);
    }

    public final q7 a(pcd.s... sVarArr) {
        pcd.p pVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (pcd.s sVar : sVarArr) {
            pcd.g0 g0Var = sVar.f234885h;
            String str = null;
            pcd.f0 f0Var = g0Var instanceof pcd.f0 ? (pcd.f0) g0Var : null;
            if (f0Var != null && (pVar = f0Var.d) != null) {
                str = pVar.f234875a;
            }
            if (str == null) {
                throw new IllegalStateException(("Subaccount should always have pocket vault origin but got " + g0Var).toString());
            }
            linkedHashSet.add(str);
            String strB = sVar.f234885h.b();
            if (strB != null) {
                linkedHashSet.add(strB);
            }
        }
        i7 uaVar = linkedHashSet.size() == 1 ? new ua((String) zhm.d0.a0(linkedHashSet)) : new va(linkedHashSet);
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {uaVar, this.f260292a};
        cVar.getClass();
        return i7.c.a(i7VarArr);
    }
}
