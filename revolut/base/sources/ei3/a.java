package ei3;

import h93.f0;
import h93.j0;
import h93.l0;
import hha.s;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.Period;
import yhm.r;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pi3.l f126359b;

    public /* synthetic */ a(pi3.l lVar, int i) {
        this.f126358a = i;
        this.f126359b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        hha.o oVarM;
        Object next2;
        Object next3;
        Object next4;
        e93.n nVar;
        switch (this.f126358a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                f0 f0Var = (f0) pair.f186385a;
                Iterator it8 = ((List) pair.f186386b).iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        e93.f fVar = (e93.f) next;
                        if (!Intrinsics.f(fVar.c(), f0Var.f150114h.f13639a) || !Intrinsics.f(uj3.b.F(fVar).f13640b, f0Var.f150114h.f13640b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                e93.f fVar2 = (e93.f) next;
                c93.j jVarP = fVar2 != null ? fVar2.p() : null;
                if (jVarP == null) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar = od0.i.Companion;
                String str = f0Var.f150110a;
                pi3.l lVar = this.f126359b;
                String str2 = lVar.f236409a;
                b93.j jVar = f0Var.f150114h;
                b93.b bVar = jVar.f13639a;
                String str3 = bVar.f13615a;
                e93.b bVar2 = (e93.b) u1.v(jVar.f13640b, hx7.l.j());
                if (bVar2 == null) {
                    bVar2 = e93.b.UNKNOWN;
                }
                c93.j.Companion.getClass();
                pi3.d dVar = new pi3.d(str, str2, bVar, bVar2, str3, jVarP, (d93.b) null, c93.j.f22287c, true, (c93.j) null, lVar.e, f0Var.f, f0Var.H, f0Var.G, fVar2.o(), 33280);
                hVar.getClass();
                return od0.h.a(dVar);
            case 1:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                pi3.l lVar2 = this.f126359b;
                pi3.p pVar = lVar2.d;
                if (pVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Iterator it9 = plans.iterator();
                while (true) {
                    oVarM = null;
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((hha.d) next2).f152287a, pVar.f236414a)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                hha.d dVar2 = (hha.d) next2;
                Period periodA = pi3.b.a(pVar.f236415b);
                if (periodA != null && dVar2 != null) {
                    oVarM = cp5.c.m(dVar2, periodA);
                }
                hha.o oVar = oVarM;
                if (dVar2 == null || oVar == null) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar2 = od0.i.Companion;
                pi3.e eVar = new pi3.e(dVar2.f152287a, s.f(dVar2), lVar2.f236409a, oVar, dVar2.f152288b, pVar.f236415b, lVar2.e, null, pVar.f236416c);
                hVar2.getClass();
                return od0.h.a(eVar);
            default:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                f0 f0Var2 = (f0) rVar.f314201a;
                List list = (List) rVar.f314202b;
                d93.d dVar3 = (d93.d) rVar.f314203c;
                Iterator it10 = list.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next3 = it10.next();
                        e93.d dVar4 = (e93.d) next3;
                        if (!dVar4.f123827c.equals(f0Var2.f150114h.f13639a) || !Intrinsics.f(uj3.b.F(dVar4).f13640b, f0Var2.f150114h.f13640b)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                e93.d dVar5 = (e93.d) next3;
                c93.j jVar2 = dVar5 != null ? dVar5.e : null;
                c93.j jVar3 = (dVar5 == null || (nVar = dVar5.i) == null) ? null : nVar.d;
                Iterator it11 = dVar3.f112340a.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next4 = it11.next();
                        if (Intrinsics.f(((d93.b) next4).f112336a, f0Var2.k.f150140n)) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                d93.b bVar3 = (d93.b) next4;
                if (jVar2 == null || bVar3 == null) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar3 = od0.i.Companion;
                String str4 = f0Var2.f150110a;
                pi3.l lVar3 = this.f126359b;
                String str5 = lVar3.f236409a;
                b93.j jVar4 = f0Var2.f150114h;
                b93.b bVar4 = jVar4.f13639a;
                String str6 = bVar4.f13615a;
                e93.b bVar5 = (e93.b) u1.v(jVar4.f13640b, hx7.l.j());
                if (bVar5 == null) {
                    bVar5 = e93.b.UNKNOWN;
                }
                c93.j jVar5 = bVar3.e;
                boolean z = f0Var2.f150112c;
                c93.j jVar6 = f0Var2.f150117m ? jVar3 : null;
                Instant instant = lVar3.e;
                h93.r rVar2 = f0Var2.f;
                j0 j0Var = f0Var2.H;
                l0 l0Var = f0Var2.G;
                dj0.d dVar6 = dVar5.B;
                pi3.n nVar2 = lVar3.f236411c;
                pi3.d dVar7 = new pi3.d(str4, str5, bVar4, bVar5, str6, jVar2, bVar3, jVar5, z, jVar6, instant, rVar2, j0Var, l0Var, dVar6, nVar2 != null ? nVar2.f236413b : null);
                hVar3.getClass();
                return od0.h.a(dVar7);
        }
    }
}
