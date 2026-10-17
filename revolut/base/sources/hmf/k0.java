package hmf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public abstract class k0 {
    public static final cmf.p a(cmf.p... blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        List listC = zhm.p.c(blocks);
        hmc.a aVar = new hmc.a(7);
        List list = listC;
        ArrayList flows = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            flows.add(((cmf.p) it8.next()).f25245a);
        }
        ArrayList names = new ArrayList(zhm.w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            names.add(((cmf.p) it9.next()).d);
        }
        Intrinsics.checkNotNullParameter(flows, "flows");
        v1 v1Var = new v1(new dmf.c(flows, null, 0));
        Intrinsics.checkNotNullParameter(v1Var, "<this>");
        Intrinsics.checkNotNullParameter(names, "names");
        ghk.a0 a0Var = new ghk.a0(new g0c.e(v1Var, new AtomicBoolean(false), names, 21), aVar, 20);
        ArrayList arrayList = new ArrayList();
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            zhm.a0.x(((cmf.p) it10.next()).f25247c, arrayList);
        }
        return new cmf.p(a0Var, new d4h.a(listC, 3), arrayList, zhm.d0.k0(list, "+", null, null, 0, new hmc.a(8), 30));
    }
}
