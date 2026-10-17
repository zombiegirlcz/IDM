package nnd;

import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends oki.h implements h {
    public final c0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rnd.j f217553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qnd.b f217554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xnd.j f217555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qnd.d f217556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rnd.i f217557t;
    public final gte.a u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f217558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f217559x;

    public i0(k0 stateMapper, c0 accountPickerDelegate, rnd.j analyticsAccountProvider, qnd.b accountPickerLegalEntityProvider, xnd.j analyticsDashboardPeriodProvider, qnd.d accountPickerMultiselectProvider, rnd.i analyticsAccountMetadataProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(accountPickerDelegate, "accountPickerDelegate");
        Intrinsics.checkNotNullParameter(analyticsAccountProvider, "analyticsAccountProvider");
        Intrinsics.checkNotNullParameter(accountPickerLegalEntityProvider, "accountPickerLegalEntityProvider");
        Intrinsics.checkNotNullParameter(analyticsDashboardPeriodProvider, "analyticsDashboardPeriodProvider");
        Intrinsics.checkNotNullParameter(accountPickerMultiselectProvider, "accountPickerMultiselectProvider");
        Intrinsics.checkNotNullParameter(analyticsAccountMetadataProvider, "analyticsAccountMetadataProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = accountPickerDelegate;
        this.f217553p = analyticsAccountProvider;
        this.f217554q = accountPickerLegalEntityProvider;
        this.f217555r = analyticsDashboardPeriodProvider;
        this.f217556s = accountPickerMultiselectProvider;
        this.f217557t = analyticsAccountMetadataProvider;
        this.u = featureToggleInteractor;
        this.v = new vii.b();
        this.f217558w = vkm.q.c(Boolean.valueOf(((jte.d) featureToggleInteractor).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c)));
        this.f217559x = mra.d.b(this, new c(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public static boolean I2(AnalyticsAccount analyticsAccount, l lVar) {
        int i = e0.f217543a[lVar.ordinal()];
        if (i == 1) {
            return analyticsAccount instanceof SpendingAnalyticsAccount;
        }
        if (i == 2) {
            return analyticsAccount instanceof AnalyticsAccount.Savings;
        }
        if (i == 3) {
            return analyticsAccount instanceof AnalyticsAccount.Pro;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static AnalyticsAccountsSelection J2(AnalyticsAccount analyticsAccount, Set set) {
        if (analyticsAccount instanceof AnalyticsAccount.Pro) {
            AnalyticsAccountsSelection.Pro.Companion companion = AnalyticsAccountsSelection.Pro.INSTANCE;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (obj2 instanceof AnalyticsAccount.Pro) {
                    arrayList.add(obj2);
                }
            }
            Set setI1 = zhm.d0.i1(arrayList);
            companion.getClass();
            return AnalyticsAccountsSelection.Pro.Companion.a(setI1);
        }
        if (analyticsAccount instanceof AnalyticsAccount.Savings) {
            AnalyticsAccountsSelection.Savings.Companion companion2 = AnalyticsAccountsSelection.Savings.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : set) {
                if (obj3 instanceof AnalyticsAccount.Savings) {
                    arrayList2.add(obj3);
                }
            }
            Set setI12 = zhm.d0.i1(arrayList2);
            companion2.getClass();
            return AnalyticsAccountsSelection.Savings.Companion.a(setI12);
        }
        if (!(analyticsAccount instanceof SpendingAnalyticsAccount)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsAccountsSelection.Spending.Companion companion3 = AnalyticsAccountsSelection.Spending.INSTANCE;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : set) {
            if (obj4 instanceof SpendingAnalyticsAccount) {
                arrayList3.add(obj4);
            }
        }
        Set setI13 = zhm.d0.i1(arrayList3);
        companion3.getClass();
        return AnalyticsAccountsSelection.Spending.Companion.a(setI13);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x008c A[LOOP:1: B:53:0x0086->B:55:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean L2(java.util.Set r3, boolean r4, java.util.ArrayList r5) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nnd.i0.L2(java.util.Set, boolean, java.util.ArrayList):boolean");
    }

    public static ArrayList M2(List list, l lVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (I2(((c1) obj2).a(), lVar)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final j K2(AnalyticsAccountsSelection analyticsAccountsSelection, boolean z, l lVar, ArrayList arrayList) {
        Set set;
        Set set2;
        a aVar = (a) ((c) ((j2) this.f217559x.f22677a).getValue()).f217532a.getContent();
        k kVar = aVar != null ? aVar.f217519b : null;
        j jVar = kVar instanceof j ? (j) kVar : null;
        Set f99208a = analyticsAccountsSelection.getF99208a();
        if (jVar == null || (set = jVar.f217562c) == null) {
            Set f99208a2 = analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth ? null : analyticsAccountsSelection.getF99208a();
            if (f99208a2 == null) {
                Set set3 = zhm.h0.f322473a;
                set = set3;
            } else {
                set = f99208a2;
            }
        } else {
            set = set3;
        }
        if (jVar == null || (set2 = jVar.e) == null) {
            set2 = zhm.h0.f322473a;
        }
        return new j(f99208a, z, set, arrayList, set2, lVar);
    }

    public final void N2(Object obj2) throws Throwable {
        final LinkedHashSet linkedHashSetA;
        AnalyticsAccount analyticsAccountA;
        AnalyticsAccount analyticsAccountA2;
        AnalyticsAccount analyticsAccountA3;
        final a aVar;
        if (obj2 instanceof m) {
            Set set = ((m) obj2).f217568a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                linkedHashSet.add(((c1) it8.next()).a());
            }
            AnalyticsAccountsSelection.TotalWealth.INSTANCE.getClass();
            P2(AnalyticsAccountsSelection.TotalWealth.Companion.a(linkedHashSet));
            return;
        }
        if (obj2 instanceof b) {
            Set set2 = ((b) obj2).f217525a;
            ArrayList arrayList = new ArrayList(zhm.w.t(set2, 10));
            Iterator it9 = set2.iterator();
            while (it9.hasNext()) {
                arrayList.add(((c1) it9.next()).a());
            }
            Set setI1 = zhm.d0.i1(arrayList);
            AnalyticsAccount analyticsAccount = (AnalyticsAccount) zhm.d0.c0(setI1);
            if (analyticsAccount == null) {
                return;
            }
            P2(J2(analyticsAccount, setI1));
            return;
        }
        boolean z = obj2 instanceof g;
        cli.y yVar = this.f217559x;
        if (z) {
            Set set3 = ((g) obj2).f217545a;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it10 = set3.iterator();
            while (it10.hasNext()) {
                linkedHashSet2.add(((w0) it10.next()).f217602a);
            }
            if (linkedHashSet2.isEmpty() || (aVar = (a) ((c) ((j2) yVar.f22677a).getValue()).f217532a.getContent()) == null) {
                return;
            }
            final k kVar = aVar.f217519b;
            if (kVar instanceof i) {
                AnalyticsAccount.Linked linked = (AnalyticsAccount.Linked) zhm.d0.c0(linkedHashSet2);
                if (linked == null) {
                    return;
                }
                P2(J2(linked, linkedHashSet2));
                return;
            }
            if (!(kVar instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            Set set4 = ((j) kVar).f217562c;
            final LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            for (Object obj3 : set4) {
                if (!(((AnalyticsAccount) obj3) instanceof AnalyticsAccount.Linked)) {
                    linkedHashSet3.add(obj3);
                }
            }
            if (!set4.containsAll(linkedHashSet2)) {
                linkedHashSet3 = zhm.a1.l(linkedHashSet3, linkedHashSet2);
            }
            final int i = 0;
            H2(yVar, new Function1() { // from class: nnd.d0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    c update = (c) obj4;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return c.a(update, new Data(a.a(aVar, j.a((j) kVar, linkedHashSet3, null, null, 59)), null, false, 6, null), null, 2);
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return c.a(update, new Data(a.a(aVar, j.a((j) kVar, linkedHashSet3, null, null, 59)), null, false, 6, null), null, 2);
                    }
                }
            });
            return;
        }
        if (!(obj2 instanceof c1)) {
            wp5.y.B("Unhandled parcel on row clicked");
            return;
        }
        final a aVar2 = (a) ((c) ((j2) yVar.f22677a).getValue()).f217532a.getContent();
        if (aVar2 == null) {
            return;
        }
        final k kVar2 = aVar2.f217519b;
        if (kVar2 instanceof i) {
            AnalyticsAccountsSelection.Companion companion = AnalyticsAccountsSelection.INSTANCE;
            AnalyticsAccount analyticsAccountA4 = ((c1) obj2).a();
            companion.getClass();
            P2(AnalyticsAccountsSelection.Companion.a(analyticsAccountA4));
            return;
        }
        if (!(kVar2 instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        c1 newAccount = (c1) obj2;
        j selection = (j) kVar2;
        Set set5 = selection.f217562c;
        this.f217556s.getClass();
        Intrinsics.checkNotNullParameter(newAccount, "newAccount");
        Intrinsics.checkNotNullParameter(selection, "selection");
        ArrayList arrayList2 = selection.d;
        if (set5.contains(newAccount.a())) {
            linkedHashSetA = zhm.a1.j(set5, newAccount.a());
        } else if (newAccount instanceof x0) {
            AnalyticsAccount.Personal.All all2 = ((x0) newAccount).f217605a;
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            for (Object obj4 : set5) {
                AnalyticsAccount getAggregatedSelection = (AnalyticsAccount) obj4;
                Intrinsics.checkNotNullParameter(getAggregatedSelection, "$this$getAggregatedSelection");
                if (!(getAggregatedSelection instanceof AnalyticsAccount.Personal)) {
                    linkedHashSet4.add(obj4);
                }
            }
            linkedHashSetA = zhm.a1.m(linkedHashSet4, all2);
        } else if (newAccount instanceof q0) {
            AnalyticsAccount.Joint.All all3 = ((q0) newAccount).f217580a;
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            for (Object obj5 : set5) {
                AnalyticsAccount getAggregatedSelection2 = (AnalyticsAccount) obj5;
                Intrinsics.checkNotNullParameter(getAggregatedSelection2, "$this$getAggregatedSelection");
                if (!(getAggregatedSelection2 instanceof AnalyticsAccount.Joint)) {
                    linkedHashSet5.add(obj5);
                }
            }
            linkedHashSetA = zhm.a1.m(linkedHashSet5, all3);
        } else if (newAccount instanceof n0) {
            AnalyticsAccount.Savings.PersonalAll personalAll = ((n0) newAccount).f217572a;
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            for (Object obj6 : set5) {
                AnalyticsAccount getAggregatedSelection3 = (AnalyticsAccount) obj6;
                Intrinsics.checkNotNullParameter(getAggregatedSelection3, "$this$getAggregatedSelection");
                if (!(getAggregatedSelection3 instanceof AnalyticsAccount.Savings.PersonalIndividual)) {
                    linkedHashSet6.add(obj6);
                }
            }
            linkedHashSetA = zhm.a1.m(linkedHashSet6, personalAll);
        } else if (newAccount instanceof l0) {
            AnalyticsAccount.Savings.JointAll jointAll = ((l0) newAccount).f217566a;
            LinkedHashSet linkedHashSet7 = new LinkedHashSet();
            for (Object obj7 : set5) {
                AnalyticsAccount getAggregatedSelection4 = (AnalyticsAccount) obj7;
                Intrinsics.checkNotNullParameter(getAggregatedSelection4, "$this$getAggregatedSelection");
                if (!(getAggregatedSelection4 instanceof AnalyticsAccount.Savings.JointIndividual)) {
                    linkedHashSet7.add(obj7);
                }
            }
            linkedHashSetA = zhm.a1.m(linkedHashSet7, jointAll);
        } else if (newAccount instanceof a1) {
            AnalyticsAccount.Pro.All all4 = ((a1) newAccount).f217523a;
            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
            for (Object obj8 : set5) {
                AnalyticsAccount getAggregatedSelection5 = (AnalyticsAccount) obj8;
                Intrinsics.checkNotNullParameter(getAggregatedSelection5, "$this$getAggregatedSelection");
                if (!(getAggregatedSelection5 instanceof AnalyticsAccount.Pro)) {
                    linkedHashSet8.add(obj8);
                }
            }
            linkedHashSetA = zhm.a1.m(linkedHashSet8, all4);
        } else if ((newAccount instanceof o0) || (newAccount instanceof y0) || (newAccount instanceof z0)) {
            linkedHashSetA = qnd.d.a(newAccount.a(), AnalyticsAccount.Personal.All.f99192a, selection, new ql6.s(28));
        } else {
            Object obj9 = null;
            if ((newAccount instanceof r0) || (newAccount instanceof t0)) {
                AnalyticsAccount analyticsAccountA5 = newAccount.a();
                Iterator it11 = arrayList2.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        break;
                    }
                    Object next = it11.next();
                    if (((c1) next).a() instanceof AnalyticsAccount.Joint.All) {
                        obj9 = next;
                        break;
                    }
                }
                c1 c1Var = (c1) obj9;
                if (c1Var == null || (analyticsAccountA = c1Var.a()) == null) {
                    hx7.e.n(new IllegalStateException("Cannot have individual joint accounts without joint all"));
                    linkedHashSetA = zhm.a1.m(set5, newAccount.a());
                } else {
                    linkedHashSetA = qnd.d.a(analyticsAccountA5, analyticsAccountA, selection, new ql6.s(29));
                }
            } else if (newAccount instanceof b1) {
                linkedHashSetA = qnd.d.a(((b1) newAccount).f217529a, AnalyticsAccount.Pro.All.f99196a, selection, new qnd.c(0));
            } else if (newAccount instanceof p0) {
                linkedHashSetA = qnd.d.a(((p0) newAccount).f217578a, AnalyticsAccount.Savings.PersonalAll.f99203a, selection, new qnd.c(1));
            } else if (newAccount instanceof s0) {
                AnalyticsAccount.Savings.JointIndividual jointIndividual = ((s0) newAccount).f217590a;
                Iterator it12 = arrayList2.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        break;
                    }
                    Object next2 = it12.next();
                    if (((c1) next2).a() instanceof AnalyticsAccount.Savings.JointAll) {
                        obj9 = next2;
                        break;
                    }
                }
                c1 c1Var2 = (c1) obj9;
                if (c1Var2 == null || (analyticsAccountA3 = c1Var2.a()) == null) {
                    hx7.e.n(new IllegalStateException("Cannot have individual joint savings without joint all"));
                    linkedHashSetA = zhm.a1.m(set5, jointIndividual);
                } else {
                    linkedHashSetA = qnd.d.a(jointIndividual, analyticsAccountA3, selection, new qnd.c(2));
                }
            } else if (newAccount instanceof m0) {
                AnalyticsAccount.Junior.All all5 = ((m0) newAccount).f217569a;
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                for (Object obj10 : set5) {
                    AnalyticsAccount getAggregatedSelection6 = (AnalyticsAccount) obj10;
                    Intrinsics.checkNotNullParameter(getAggregatedSelection6, "$this$getAggregatedSelection");
                    if (!((getAggregatedSelection6 instanceof AnalyticsAccount.Junior) && Intrinsics.f(((AnalyticsAccount.Junior) getAggregatedSelection6).getF99186a(), ((m0) newAccount).f217569a.f99184a))) {
                        linkedHashSet9.add(obj10);
                    }
                }
                linkedHashSetA = zhm.a1.m(linkedHashSet9, all5);
            } else if (newAccount instanceof u0) {
                AnalyticsAccount.Junior.CurrencyPocket currencyPocket = ((u0) newAccount).f217596a;
                Iterator it13 = arrayList2.iterator();
                while (true) {
                    if (!it13.hasNext()) {
                        break;
                    }
                    Object next3 = it13.next();
                    AnalyticsAccount analyticsAccountA6 = ((c1) next3).a();
                    if ((analyticsAccountA6 instanceof AnalyticsAccount.Junior.All) && Intrinsics.f(((AnalyticsAccount.Junior.All) analyticsAccountA6).f99184a, currencyPocket.f99186a)) {
                        obj9 = next3;
                        break;
                    }
                }
                c1 c1Var3 = (c1) obj9;
                if (c1Var3 == null || (analyticsAccountA2 = c1Var3.a()) == null) {
                    hx7.e.n(new IllegalStateException("Cannot have individual junior accounts without junior all"));
                    linkedHashSetA = zhm.a1.m(set5, currencyPocket);
                } else {
                    linkedHashSetA = qnd.d.a(currencyPocket, analyticsAccountA2, selection, new pnd.a(newAccount, 1));
                }
            } else {
                if (!(newAccount instanceof w0) && !(newAccount instanceof v0)) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedHashSetA = zhm.a1.m(set5, newAccount.a());
            }
        }
        final int i2 = 1;
        H2(yVar, new Function1() { // from class: nnd.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj42) {
                c update = (c) obj42;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        return c.a(update, new Data(a.a(aVar2, j.a((j) kVar2, linkedHashSetA, null, null, 59)), null, false, 6, null), null, 2);
                    default:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        return c.a(update, new Data(a.a(aVar2, j.a((j) kVar2, linkedHashSetA, null, null, 59)), null, false, 6, null), null, 2);
                }
            }
        });
    }

    public final void O2(f item) {
        Intrinsics.checkNotNullParameter(item, "item");
        cli.y yVar = this.f217559x;
        a aVar = (a) ((c) ((j2) yVar.f22677a).getValue()).f217532a.getContent();
        if (aVar == null) {
            return;
        }
        k kVar = aVar.f217519b;
        j jVar = kVar instanceof j ? (j) kVar : null;
        if (jVar == null) {
            return;
        }
        Set set = jVar.e;
        H2(yVar, new neg.q(aVar, 2, jVar, set.contains(item) ? zhm.a1.j(set, item) : zhm.a1.m(set, item)));
    }

    public final void P2(AnalyticsAccountsSelection analyticsAccountsSelection) {
        n2(new njj.n0(this, analyticsAccountsSelection, null, 11), new whi.b(6));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.q(vkm.q.Q(new vkm.t0(this.f217559x.B(new nme.c0(27)), 1), new g0(0, continuation, this))), null, new h0(0, null, this), 3);
        yji.l.b1(this, vkm.q.Q(this.v, new g0(1, continuation, this)), null, new h0(1, null, this), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f217559x;
    }
}
