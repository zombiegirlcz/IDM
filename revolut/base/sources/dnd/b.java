package dnd;

import amd.j;
import com.revolut.core.ui_kit.models.CompositeClause;
import dsd.f;
import emd.d;
import fsd.c;
import ipd.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nzi.g;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f116287a;

    public b(c totalWealthGroupMapper, h performanceMapper, f totalWealthBalanceSourceMapper) {
        Intrinsics.checkNotNullParameter(totalWealthGroupMapper, "totalWealthGroupMapper");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(totalWealthBalanceSourceMapper, "totalWealthBalanceSourceMapper");
        this.f116287a = totalWealthBalanceSourceMapper;
    }

    public static dj0.d b(List list) {
        dj0.d.Companion.getClass();
        dj0.d dVarO0 = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarO0 = i == 0 ? mra.d.o0((j) obj2) : pyd.c.O(dVarO0, mra.d.o0((j) obj2));
            i = i2;
        }
        return nz8.d.q(dVarO0);
    }

    public final CompositeClause a(List list, Map map, xi0.b bVar) {
        dj0.d dVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!mra.d.y((j) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (true) {
            Pair pair = null;
            if (!it8.hasNext()) {
                break;
            }
            j jVar = (j) it8.next();
            List listU = d0.U(this.f116287a.a(jVar.f6332a));
            if (listU.isEmpty()) {
                listU = null;
            }
            if (listU != null) {
                List list2 = listU;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        pair = new Pair(jVar, arrayList3);
                        break;
                    }
                    nzi.f fVar = (nzi.f) it9.next();
                    g gVar = (g) map.get(fVar);
                    if (gVar == null) {
                        break;
                    }
                    arrayList3.add(new Pair(fVar, gVar));
                }
            }
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it10 = arrayList2.iterator();
            while (it10.hasNext()) {
                a0.x((List) ((Pair) it10.next()).f186386b, arrayList4);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : arrayList4) {
                if (hashSet.add((nzi.f) ((Pair) obj3).f186385a)) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
            Iterator it11 = arrayList5.iterator();
            while (it11.hasNext()) {
                arrayList6.add((g) ((Pair) it11.next()).f186386b);
            }
            dj0.d.Companion.getClass();
            dj0.d dVarO0 = dj0.d.e;
            int i = 0;
            for (Object obj4 : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                dVarO0 = i == 0 ? mra.d.o0((j) ((Pair) obj4).f186385a) : pyd.c.O(dVarO0, mra.d.o0((j) ((Pair) obj4).f186385a));
                i = i2;
            }
            long j2 = 0;
            if (dVarO0.k()) {
                dVar = new dj0.d(0L, bVar);
            } else {
                if (!Intrinsics.f(dVarO0.f115083b, bVar)) {
                    dVarO0 = null;
                }
                if (dVarO0 != null) {
                    dVar = dVarO0;
                }
            }
            Iterator it12 = arrayList6.iterator();
            while (it12.hasNext()) {
                j2 += ((g) it12.next()).f221072b;
            }
            return h.a(dVar, new dj0.d(j2, bVar), true);
        }
        return null;
    }
}
