package pnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import ip0.qd0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nnd.a1;
import nnd.b1;
import nnd.c1;
import nnd.l0;
import nnd.m0;
import nnd.n0;
import nnd.o0;
import nnd.p0;
import nnd.q0;
import nnd.r0;
import nnd.s0;
import nnd.t0;
import nnd.u0;
import nnd.v0;
import nnd.w0;
import nnd.x0;
import nnd.y0;
import nnd.z0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnd.i f237698a;

    public e(rnd.i analyticsAccountMetadataProvider) {
        Intrinsics.checkNotNullParameter(analyticsAccountMetadataProvider, "analyticsAccountMetadataProvider");
        this.f237698a = analyticsAccountMetadataProvider;
    }

    public static qd0 a(boolean z, Function0 function0) {
        return z ? qd0.SELECTED : ((Boolean) function0.invoke()).booleanValue() ? qd0.INDETERMINATE : qd0.UNSELECTED;
    }

    public static qd0 c(final c1 account, nnd.j selection) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(selection, "selection");
        final Set set = selection.f217562c;
        boolean zContains = set.contains(account.a());
        if ((account instanceof o0) || (account instanceof y0) || (account instanceof z0)) {
            if (!zContains && !set.contains(AnalyticsAccount.Personal.All.f99192a)) {
                return qd0.UNSELECTED;
            }
            return qd0.SELECTED;
        }
        if ((account instanceof r0) || (account instanceof t0)) {
            if (zContains) {
                return qd0.SELECTED;
            }
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it8 = set2.iterator();
                while (it8.hasNext()) {
                    if (((AnalyticsAccount) it8.next()) instanceof AnalyticsAccount.Joint.All) {
                        return qd0.SELECTED;
                    }
                }
            }
            return qd0.UNSELECTED;
        }
        if (account instanceof b1) {
            if (!zContains && !set.contains(AnalyticsAccount.Pro.All.f99196a)) {
                return qd0.UNSELECTED;
            }
            return qd0.SELECTED;
        }
        if (account instanceof m0) {
            final int i = 0;
            return a(zContains, new Function0() { // from class: pnd.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    boolean z3;
                    switch (i) {
                        case 0:
                            Set<AnalyticsAccount> set3 = set;
                            if ((set3 instanceof Collection) && set3.isEmpty()) {
                                z = false;
                            } else {
                                for (AnalyticsAccount analyticsAccount : set3) {
                                    if ((analyticsAccount instanceof AnalyticsAccount.Junior) && Intrinsics.f(((AnalyticsAccount.Junior) analyticsAccount).getF99186a(), ((m0) account).f217569a.f99184a) && !(analyticsAccount instanceof AnalyticsAccount.Junior.All)) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        default:
                            Set<AnalyticsAccount> set4 = set;
                            if ((set4 instanceof Collection) && set4.isEmpty()) {
                                z3 = false;
                            } else {
                                for (AnalyticsAccount analyticsAccount2 : set4) {
                                    if ((analyticsAccount2 instanceof AnalyticsAccount.Junior.All) && Intrinsics.f(((AnalyticsAccount.Junior.All) analyticsAccount2).f99184a, ((u0) account).f217596a.f99186a)) {
                                        z3 = true;
                                    }
                                }
                                z3 = false;
                            }
                            return Boolean.valueOf(z3);
                    }
                }
            });
        }
        if (account instanceof u0) {
            final int i2 = 1;
            Function0 function0 = new Function0() { // from class: pnd.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    boolean z3;
                    switch (i2) {
                        case 0:
                            Set<AnalyticsAccount> set3 = set;
                            if ((set3 instanceof Collection) && set3.isEmpty()) {
                                z = false;
                            } else {
                                for (AnalyticsAccount analyticsAccount : set3) {
                                    if ((analyticsAccount instanceof AnalyticsAccount.Junior) && Intrinsics.f(((AnalyticsAccount.Junior) analyticsAccount).getF99186a(), ((m0) account).f217569a.f99184a) && !(analyticsAccount instanceof AnalyticsAccount.Junior.All)) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        default:
                            Set<AnalyticsAccount> set4 = set;
                            if ((set4 instanceof Collection) && set4.isEmpty()) {
                                z3 = false;
                            } else {
                                for (AnalyticsAccount analyticsAccount2 : set4) {
                                    if ((analyticsAccount2 instanceof AnalyticsAccount.Junior.All) && Intrinsics.f(((AnalyticsAccount.Junior.All) analyticsAccount2).f99184a, ((u0) account).f217596a.f99186a)) {
                                        z3 = true;
                                    }
                                }
                                z3 = false;
                            }
                            return Boolean.valueOf(z3);
                    }
                }
            };
            if (!zContains && !((Boolean) function0.invoke()).booleanValue()) {
                return qd0.UNSELECTED;
            }
            return qd0.SELECTED;
        }
        if ((account instanceof v0) || (account instanceof w0)) {
            return zContains ? qd0.SELECTED : qd0.UNSELECTED;
        }
        if (account instanceof s0) {
            if (zContains) {
                return qd0.SELECTED;
            }
            Set set3 = set;
            if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                Iterator it9 = set3.iterator();
                while (it9.hasNext()) {
                    if (((AnalyticsAccount) it9.next()) instanceof AnalyticsAccount.Savings.JointAll) {
                        return qd0.SELECTED;
                    }
                }
            }
            return qd0.UNSELECTED;
        }
        if (account instanceof p0) {
            if (zContains) {
                return qd0.SELECTED;
            }
            Set set4 = set;
            if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                Iterator it10 = set4.iterator();
                while (it10.hasNext()) {
                    if (((AnalyticsAccount) it10.next()) instanceof AnalyticsAccount.Savings.PersonalAll) {
                        return qd0.SELECTED;
                    }
                }
            }
            return qd0.UNSELECTED;
        }
        if (account instanceof x0) {
            return a(zContains, new an.l(1, set));
        }
        if (account instanceof q0) {
            return a(zContains, new an.l(2, set));
        }
        if (account instanceof a1) {
            if (zContains) {
                return qd0.SELECTED;
            }
            Set set5 = set;
            if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                Iterator it11 = set5.iterator();
                while (it11.hasNext()) {
                    if (((AnalyticsAccount) it11.next()) instanceof AnalyticsAccount.Pro.CurrencyPocket) {
                        return qd0.INDETERMINATE;
                    }
                }
            }
            return qd0.UNSELECTED;
        }
        if (account instanceof l0) {
            if (zContains) {
                return qd0.SELECTED;
            }
            Set set6 = set;
            if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                Iterator it12 = set6.iterator();
                while (it12.hasNext()) {
                    if (((AnalyticsAccount) it12.next()) instanceof AnalyticsAccount.Savings.JointIndividual) {
                        return qd0.INDETERMINATE;
                    }
                }
            }
            return qd0.UNSELECTED;
        }
        if (!(account instanceof n0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (zContains) {
            return qd0.SELECTED;
        }
        Set set7 = set;
        if (!(set7 instanceof Collection) || !set7.isEmpty()) {
            Iterator it13 = set7.iterator();
            while (it13.hasNext()) {
                if (((AnalyticsAccount) it13.next()) instanceof AnalyticsAccount.Savings.PersonalIndividual) {
                    return qd0.INDETERMINATE;
                }
            }
        }
        return qd0.UNSELECTED;
    }

    public static boolean d(c1 account, nnd.i iVar) {
        AnalyticsAccountsSelection analyticsAccountsSelection;
        Intrinsics.checkNotNullParameter(account, "account");
        return (iVar == null || (analyticsAccountsSelection = iVar.f217550a) == null || (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth) || !analyticsAccountsSelection.getF99208a().contains(account.a()) || analyticsAccountsSelection.getF99208a().size() != 1) ? false : true;
    }

    public final int b(nnd.j selection, Function1 shouldIncludeAccount) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(shouldIncludeAccount, "shouldIncludeAccount");
        Set set = selection.f217562c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj2 : set) {
            if (((Boolean) shouldIncludeAccount.invoke(obj2)).booleanValue()) {
                linkedHashSet.add(obj2);
            }
        }
        ArrayList arrayList = selection.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((c1) it8.next()).a());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((Boolean) shouldIncludeAccount.invoke(obj3)).booleanValue()) {
                arrayList3.add(obj3);
            }
        }
        return this.f237698a.a(linkedHashSet, arrayList3);
    }
}
