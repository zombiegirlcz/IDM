package roh;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements poh.m {
    @Override // poh.m
    public final wgl.d a(zel.f instrumentGroup, Map selections) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(selections, "selections");
        Object obj2 = selections.get(o.f256024a);
        m mVar = obj2 instanceof m ? (m) obj2 : null;
        if (mVar == null) {
            mVar = o.e;
        }
        zel.k kVar = mVar.f256021a;
        Object obj3 = selections.get(j.f256016a);
        h hVar = obj3 instanceof h ? (h) obj3 : null;
        if (hVar == null) {
            hVar = j.e;
        }
        return new wgl.c(instrumentGroup, kVar, hVar.f256013a);
    }

    @Override // poh.m
    public final Map b(wgl.d params) {
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        wgl.c cVar = (wgl.c) params;
        o oVar = o.f256024a;
        zel.k type = cVar.f297343b;
        Intrinsics.checkNotNullParameter(type, "type");
        int i = n.f256023a[type.ordinal()];
        if (i == 1) {
            obj2 = k.f256019c;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            obj2 = l.f256020c;
        }
        Pair pair = new Pair(oVar, obj2);
        j jVar = j.f256016a;
        zel.a period = cVar.f297344c;
        Intrinsics.checkNotNullParameter(period, "period");
        int i2 = i.f256015a[period.ordinal()];
        if (i2 == 1) {
            obj3 = d.f256009c;
        } else if (i2 == 2) {
            obj3 = e.f256010c;
        } else if (i2 == 3) {
            obj3 = f.f256011c;
        } else if (i2 == 4) {
            obj3 = g.f256012c;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            obj3 = c.f256008c;
        }
        return r0.k(pair, new Pair(jVar, obj3));
    }
}
