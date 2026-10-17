package qoh;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import poh.m;
import poh.n;
import poh.o;
import poh.p;
import poh.q;
import poh.r;
import poh.s;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements m {
    @Override // poh.m
    public final wgl.d a(zel.f instrumentGroup, Map selections) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(selections, "selections");
        Object obj2 = selections.get(poh.h.f237998a);
        poh.f fVar = obj2 instanceof poh.f ? (poh.f) obj2 : null;
        if (fVar == null) {
            fVar = poh.h.e;
        }
        zel.f fVar2 = fVar.f237995a;
        Object obj3 = selections.get(i.f248218a);
        g gVar = obj3 instanceof g ? (g) obj3 : null;
        if (gVar == null) {
            gVar = i.e;
        }
        zel.c cVar = gVar.f248215a;
        Object obj4 = selections.get(s.f238010a);
        q qVar = obj4 instanceof q ? (q) obj4 : null;
        if (qVar == null) {
            qVar = s.e;
        }
        return new wgl.b(fVar2, cVar, qVar.f238007a);
    }

    @Override // poh.m
    public final Map b(wgl.d params) {
        Object obj2;
        Object obj3;
        Object obj4;
        Intrinsics.checkNotNullParameter(params, "params");
        wgl.b bVar = (wgl.b) params;
        poh.h hVar = poh.h.f237998a;
        zel.f fVar = bVar.f297339a;
        int i = fVar == null ? -1 : poh.g.f237997a[fVar.ordinal()];
        if (i == -1) {
            obj2 = poh.a.f237990c;
        } else if (i == 1) {
            obj2 = poh.e.f237994c;
        } else if (i == 2) {
            obj2 = poh.d.f237993c;
        } else if (i == 3) {
            obj2 = poh.b.f237991c;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            obj2 = poh.c.f237992c;
        }
        Pair pair = new Pair(hVar, obj2);
        i iVar = i.f248218a;
        zel.c type = bVar.f297340b;
        Intrinsics.checkNotNullParameter(type, "type");
        int i2 = h.f248217a[type.ordinal()];
        if (i2 == 1) {
            obj3 = f.f248214c;
        } else if (i2 == 2) {
            obj3 = d.f248212c;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            obj3 = e.f248213c;
        }
        Pair pair2 = new Pair(iVar, obj3);
        s sVar = s.f238010a;
        zel.a period = bVar.f297341c;
        Intrinsics.checkNotNullParameter(period, "period");
        int i3 = r.f238009a[period.ordinal()];
        if (i3 == 1) {
            obj4 = n.f238004c;
        } else if (i3 == 2) {
            obj4 = o.f238005c;
        } else {
            if (i3 != 3) {
                if (i3 != 4 && i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Period " + period + " is not supported by MetaCollectionPeriodFilter").toString());
            }
            obj4 = p.f238006c;
        }
        return r0.k(pair, pair2, new Pair(sVar, obj4));
    }
}
