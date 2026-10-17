package xnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zkm.d f307445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f307446b;

    public s(zkm.d coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f307445a = coroutineScope;
        this.f307446b = new ConcurrentHashMap();
    }

    public static q a(Set set) throws IOException {
        String f99186a;
        Set<AnalyticsAccount> set2 = set;
        boolean z = false;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it8 = set2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                AnalyticsAccount analyticsAccount = (AnalyticsAccount) it8.next();
                if (!(analyticsAccount instanceof AnalyticsAccount.Junior) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving)) {
                    if (!(analyticsAccount instanceof AnalyticsAccount.Joint) && !(analyticsAccount instanceof AnalyticsAccount.Linked) && !(analyticsAccount instanceof AnalyticsAccount.Personal) && !(analyticsAccount instanceof AnalyticsAccount.Pro) && !(analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) && !(analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (AnalyticsAccount analyticsAccount2 : set2) {
            if (analyticsAccount2 instanceof AnalyticsAccount.Junior) {
                f99186a = ((AnalyticsAccount.Junior) analyticsAccount2).getF99186a();
            } else if (analyticsAccount2 instanceof AnalyticsAccount.Savings.JuniorSaving) {
                f99186a = ((AnalyticsAccount.Savings.JuniorSaving) analyticsAccount2).f99202b;
            } else {
                if (!(analyticsAccount2 instanceof AnalyticsAccount.Joint) && !(analyticsAccount2 instanceof AnalyticsAccount.Linked) && !(analyticsAccount2 instanceof AnalyticsAccount.Personal) && !(analyticsAccount2 instanceof AnalyticsAccount.Pro) && !(analyticsAccount2 instanceof AnalyticsAccount.Savings.PersonalAll) && !(analyticsAccount2 instanceof AnalyticsAccount.Savings.PersonalIndividual) && !(analyticsAccount2 instanceof AnalyticsAccount.Savings.JointAll) && !(analyticsAccount2 instanceof AnalyticsAccount.Savings.JointIndividual)) {
                    throw new NoWhenBranchMatchedException();
                }
                f99186a = null;
            }
            if (f99186a != null) {
                arrayList.add(f99186a);
            }
        }
        List listU = zhm.d0.U(arrayList);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listU, 10));
        Iterator it9 = listU.iterator();
        while (it9.hasNext()) {
            arrayList2.add("junior_overview_" + ((String) it9.next()));
        }
        aim.e eVarB = zhm.u.b();
        if (z) {
            eVarB.add("personal_overview");
        }
        eVarB.addAll(arrayList2);
        aim.e eVarA = zhm.u.a(eVarB);
        String strK0 = (String) zhm.d0.M0(eVarA);
        if (strK0 == null) {
            strK0 = zhm.d0.k0(eVarA, "|", null, null, 0, null, 62);
        }
        return new q(strK0);
    }
}
