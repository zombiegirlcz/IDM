package br9;

import com.revolut.feature.contacts.api.VirtualContactNotSupported;
import cr9.x;
import hx7.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;
import zhm.w;
import zm3.p;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h {
    public static final String a(String str) {
        String str2 = (String) d0.d0(jli.g.j(str));
        if (str2 != null) {
            return str2;
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public static final ArrayList b(List list) {
        x bVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<zm3.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (zm3.a aVar : list2) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            if (aVar instanceof zm3.j) {
                zm3.j jVar = (zm3.j) aVar;
                bVar = new x.a(a(q.y(jVar)), jVar.f);
            } else if (aVar instanceof zm3.i) {
                zm3.f fVar = ((zm3.i) aVar).e;
                bVar = new x.c(a(fVar.f323347c), fVar.f323345a);
            } else if (aVar instanceof zm3.f) {
                zm3.f fVar2 = (zm3.f) aVar;
                bVar = new x.c(a(fVar2.f323347c), fVar2.f323345a);
            } else {
                if (!(aVar instanceof zm3.e)) {
                    if (aVar instanceof p) {
                        throw VirtualContactNotSupported.f65969a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                zm3.e eVar = (zm3.e) aVar;
                bVar = new x.b(a(eVar.f323342c), eVar.f323340a);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
