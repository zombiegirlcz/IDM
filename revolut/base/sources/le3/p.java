package le3;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import tof.cc;
import tof.fc;
import tof.i7;
import tof.n7;
import tof.na;
import tof.o7;
import tof.oa;
import tof.ob;
import tof.pb;
import tof.q7;
import tof.qb;
import tof.u8;
import tof.u9;
import tof.v6;
import tof.v8;
import tof.va;
import tof.wa;
import tof.xa;
import tof.y6;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f194485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f194486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f194487c;

    public p(m categorisationTransactionFilterInteractor, o categorisationTransactionFilterInteractorV2, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(categorisationTransactionFilterInteractor, "categorisationTransactionFilterInteractor");
        Intrinsics.checkNotNullParameter(categorisationTransactionFilterInteractorV2, "categorisationTransactionFilterInteractorV2");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f194485a = categorisationTransactionFilterInteractor;
        this.f194486b = categorisationTransactionFilterInteractorV2;
        this.f194487c = featureToggleInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final efm.r a(CategorisationFilter categorisationFilter) {
        Pair pair;
        efm.r rVarW;
        char c2;
        q7 q7VarA;
        i7 i7VarA;
        Pair pair2;
        i7 i7VarB;
        Intrinsics.checkNotNullParameter(categorisationFilter, "categorisationFilter");
        boolean zC = ((jte.d) this.f194487c).c(AnalyticsFeatureApi$Toggles.AnalyticsFiltersImprovements.f87384c);
        CategorisationFilter.Scope.Empty empty = CategorisationFilter.Scope.Empty.f65753a;
        if (!zC) {
            m mVar = this.f194485a;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(categorisationFilter, "categorisationFilter");
            he3.b bVar = categorisationFilter.f65745g;
            Interval interval = categorisationFilter.f65744c;
            int i = l.f194473a[bVar.ordinal()];
            if (i == 1) {
                DateTime start = interval.getStart();
                Intrinsics.checkNotNullExpressionValue(start, "getStart(...)");
                ob obVar = new ob(start, true);
                DateTime end2 = interval.getEnd();
                Intrinsics.checkNotNullExpressionValue(end2, "getEnd(...)");
                pair = new Pair(obVar, new pb(end2, true));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                DateTime start2 = interval.getStart();
                Intrinsics.checkNotNullExpressionValue(start2, "getStart(...)");
                u8 u8Var = new u8(start2);
                DateTime end3 = interval.getEnd();
                Intrinsics.checkNotNullExpressionValue(end3, "getEnd(...)");
                pair = new Pair(u8Var, new v8(end3, true));
            }
            i7 i7Var = (i7) pair.f186385a;
            i7 i7Var2 = (i7) pair.f186386b;
            if (Intrinsics.f(categorisationFilter.f65743b, empty)) {
                rVarW = zi0.c.j(f0.f322471a);
            } else {
                efm.r rVarSwitchMap = mVar.f194476a.d(wog.a.POCKETS).switchMap(new lak.i(new laj.b(categorisationFilter, mVar), 23));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                rVarW = nim.a.w(rVarSwitchMap, new l9k.v(mVar, categorisationFilter, 13));
            }
            return nim.a.w(rVarW, new ja3.d(i7Var, i7Var2, mVar, categorisationFilter, 16));
        }
        o oVar = this.f194486b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(categorisationFilter, "categorisationFilter");
        he3.d dVar = categorisationFilter.f65742a;
        CategorisationFilter.Scope scope = categorisationFilter.f65743b;
        int i2 = n.f194481a[dVar.ordinal()];
        if (i2 == 1) {
            c2 = 1;
            i7.c cVar = i7.Companion;
            n7 n7Var = new n7();
            y6[] y6VarArr = {y6.EXCHANGE};
            cVar.getClass();
            i7[] i7VarArr = {n7Var, fc.b(i7.c.d(y6VarArr))};
            cVar.getClass();
            i7[] i7VarArr2 = (i7[]) zhm.v.k(i7.c.b(i7.c.a(new o7(), o.b()), i7.c.a(i7VarArr)), ((scope instanceof CategorisationFilter.Scope.PocketsIdSet) || (scope instanceof CategorisationFilter.Scope.AllPockets)) ? oVar.a(categorisationFilter) : null).toArray(new i7[0]);
            q7VarA = i7.c.a((i7[]) Arrays.copyOf(i7VarArr2, i7VarArr2.length));
        } else if (i2 == 2) {
            c2 = 1;
            List listK = zhm.v.k(oVar.a(categorisationFilter), new o7(), o.b());
            i7.c cVar2 = i7.Companion;
            i7[] i7VarArr3 = (i7[]) listK.toArray(new i7[0]);
            i7[] i7VarArr4 = (i7[]) Arrays.copyOf(i7VarArr3, i7VarArr3.length);
            cVar2.getClass();
            q7VarA = i7.c.a(i7VarArr4);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayListN = zhm.v.n(new n7());
            if ((scope instanceof CategorisationFilter.Scope.PocketsIdSet) || (scope instanceof CategorisationFilter.Scope.AllPockets)) {
                i7.c cVar3 = i7.Companion;
                io3.l lVar = io3.l.SAVINGS;
                na naVarB = fc.b(new xa(lVar));
                xa xaVar = new xa(io3.l.UNKNOWN);
                xa xaVar2 = new xa(lVar);
                y6[] y6VarArr2 = {y6.REWARD};
                cVar3.getClass();
                cc ccVarD = i7.c.d(y6VarArr2);
                c2 = 1;
                i7.l lVar2 = i7.l.f272818a;
                oa oaVarB = i7.c.b(i7.c.b(naVarB, xaVar, i7.c.a(xaVar2, ccVarD, lVar2)), o.c(categorisationFilter));
                q7 q7VarA2 = i7.c.a(lVar2, i7.c.d(y6.TRANSFER));
                q7 q7VarA3 = oVar.a(categorisationFilter);
                y6[] y6VarArr3 = {y6.EXCHANGE};
                cVar3.getClass();
                zhm.a0.x(zhm.v.k(q7VarA3, fc.b(i7.c.d(y6VarArr3)), oaVarB, fc.b(q7VarA2)), arrayListN);
            } else {
                c2 = 1;
            }
            i7.c cVar4 = i7.Companion;
            i7[] i7VarArr5 = (i7[]) arrayListN.toArray(new i7[0]);
            i7[] i7VarArr6 = (i7[]) Arrays.copyOf(i7VarArr5, i7VarArr5.length);
            cVar4.getClass();
            q7VarA = i7.c.a(i7VarArr6);
        }
        if (scope instanceof CategorisationFilter.Scope.PocketsIdSet) {
            i7VarA = new va(((CategorisationFilter.Scope.PocketsIdSet) scope).f65754a);
        } else if (scope instanceof CategorisationFilter.Scope.AllPockets) {
            i7.c cVar5 = i7.Companion;
            CategorisationFilter.Scope.AllPockets allPockets = (CategorisationFilter.Scope.AllPockets) scope;
            Set set = allPockets.f65751a;
            ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                arrayList.add(new xa((io3.l) it8.next()));
            }
            xa[] xaVarArr = (xa[]) arrayList.toArray(new xa[0]);
            i7[] i7VarArr7 = (i7[]) Arrays.copyOf(xaVarArr, xaVarArr.length);
            cVar5.getClass();
            oa oaVarB2 = i7.c.b(i7VarArr7);
            na naVarB2 = allPockets.f65752b ? fc.b(new wa(io3.i.EXTERNAL)) : null;
            i7[] i7VarArr8 = new i7[2];
            i7VarArr8[0] = oaVarB2;
            i7VarArr8[c2] = naVarB2;
            i7VarA = i7.c.a(i7VarArr8);
        } else {
            if (!Intrinsics.f(scope, empty)) {
                throw new NoWhenBranchMatchedException();
            }
            i7VarA = null;
        }
        Interval interval2 = categorisationFilter.f65744c;
        DateTime start3 = interval2.getStart();
        DateTime end4 = interval2.getEnd();
        int i3 = n.f194482b[categorisationFilter.f65745g.ordinal()];
        boolean z = c2;
        if (i3 == z) {
            Intrinsics.h(start3);
            ob obVar2 = new ob(start3, z);
            Intrinsics.h(end4);
            pair2 = new Pair(obVar2, new pb(end4, z));
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.h(start3);
            u8 u8Var2 = new u8(start3);
            Intrinsics.h(end4);
            pair2 = new Pair(u8Var2, new v8(end4, z));
        }
        i7 i7Var3 = (i7) pair2.f186385a;
        i7 i7Var4 = (i7) pair2.f186386b;
        i7.Companion.getClass();
        q7 q7VarA4 = i7.c.a(i7Var3, i7Var4);
        int i5 = n.f194483c[categorisationFilter.f65746h.ordinal()];
        if (i5 != 1) {
            i7VarB = i7.g.f272813a;
            if (i5 == 2) {
                i7VarB = fc.b(i7VarB);
            } else if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i7VarB = null;
        }
        v6[] v6VarArr = (v6[]) categorisationFilter.d.toArray(new v6[0]);
        qb qbVarC = i7.c.c((v6[]) Arrays.copyOf(v6VarArr, v6VarArr.length));
        i7 i7Var5 = categorisationFilter.e;
        u9 u9Var = new u9(false);
        y6[] y6VarArr4 = (y6[]) k71.k.f181789a.toArray(new y6[0]);
        i7[] elements = {q7VarA, i7VarA, q7VarA4, i7VarB, qbVarC, i7Var5, u9Var, i7.c.e(i7.c.a(i7.c.d((y6[]) Arrays.copyOf(y6VarArr4, y6VarArr4.length)), i7.t.f272826a))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        i7[] i7VarArr9 = (i7[]) kotlin.collections.d.L(elements).toArray(new i7[0]);
        return zi0.c.j(i7.c.a((i7[]) Arrays.copyOf(i7VarArr9, i7VarArr9.length)));
    }
}
