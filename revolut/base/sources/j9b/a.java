package j9b;

import a0.d;
import c21.e;
import cn0.h;
import ifm.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import np.b;
import w4l.g;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b {
    @Override // np.b
    public final void a(Collection dataManagers) {
        Intrinsics.checkNotNullParameter(dataManagers, "dataManagers");
        g.f294641a.d();
        hf0.a aVar = (hf0.a) hf0.b.d.c();
        phm.a aVar2 = (phm.a) aVar.a().get(g8b.a.class);
        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
        if (aVar3 == null) {
            throw new IllegalStateException(d.q("Api ", g8b.a.class, " is not found"));
        }
        ((g8b.a) aVar3.b()).c().dispose();
        phm.a aVar4 = (phm.a) aVar.a().get(e.class);
        b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
        if (aVar5 == null) {
            throw new IllegalStateException(d.q("Api ", e.class, " is not found"));
        }
        ((c) ((c21.b) ((e) aVar5.b())).U.get()).dispose();
        phm.a aVar6 = (phm.a) aVar.a().get(rg0.e.class);
        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
        if (aVar7 == null) {
            throw new IllegalStateException(d.q("Api ", rg0.e.class, " is not found"));
        }
        ((og0.a) ((rg0.e) aVar7.b()).f253997b.get()).a();
        phm.a aVar8 = (phm.a) aVar.a().get(cri.d.class);
        b60.a aVar9 = aVar8 != null ? (b60.a) aVar8.get() : null;
        if (aVar9 == null) {
            throw new IllegalStateException(d.q("Api ", cri.d.class, " is not found"));
        }
        ((nzl.a) ((ozl.a) ((cri.d) aVar9.b())).a()).clear();
        phm.a aVar10 = (phm.a) aVar.a().get(an0.c.class);
        b60.a aVar11 = aVar10 != null ? (b60.a) aVar10.get() : null;
        if (aVar11 == null) {
            throw new IllegalStateException(d.q("Api ", an0.c.class, " is not found"));
        }
        ((h) ((an0.c) aVar11.b()).f6526l.get()).clear();
        phm.a aVar12 = (phm.a) aVar.a().get(an0.c.class);
        b60.a aVar13 = aVar12 != null ? (b60.a) aVar12.get() : null;
        if (aVar13 == null) {
            throw new IllegalStateException(d.q("Api ", an0.c.class, " is not found"));
        }
        ((xm0.a) ((an0.c) aVar13.b()).f6530q.get()).clear();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : dataManagers) {
            if (obj2 instanceof if0.a) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((if0.a) it8.next()).clear();
        }
    }
}
