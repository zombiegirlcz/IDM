package hob;

import cob.f;
import com.revolut.feature.retail.goals.api.navigation.GoalsContract$Account;
import com.revolut.feature.retail.goals.api.navigation.GoalsDestination;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import com.revolut.feature.retail.savings.api.navigation.providers.SavingsNavigationProvider$TopUpConfig;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig$SpareChange$Destination;
import com.revolut.feature.vaults.common.SavingAccountType;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import djb.n;
import g48.r;
import g48.r0;
import gob.h;
import hkb.e;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n38.q;
import pcd.e0;
import pcd.s;
import skm.p0;
import te0.w;
import ufm.i;
import yhm.m;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements mjb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5i.b f154264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f154265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f154266c;
    public final c9e.c d;
    public final n e;
    public final h f;

    public d(w5i.b moveMoneyAccountEligibilityChecker, r0 jointAccountsInteractor, f selectableTransactionsFilterFactory, c9e.c subscriptionNaviProvider, n savingsAccountsDetailsInteractor, h routeResolver) {
        Intrinsics.checkNotNullParameter(moveMoneyAccountEligibilityChecker, "moveMoneyAccountEligibilityChecker");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(selectableTransactionsFilterFactory, "selectableTransactionsFilterFactory");
        Intrinsics.checkNotNullParameter(subscriptionNaviProvider, "subscriptionNaviProvider");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(routeResolver, "routeResolver");
        this.f154264a = moveMoneyAccountEligibilityChecker;
        this.f154265b = jointAccountsInteractor;
        this.f154266c = selectableTransactionsFilterFactory;
        this.d = subscriptionNaviProvider;
        this.e = savingsAccountsDetailsInteractor;
        this.f = routeResolver;
    }

    public static StartUpPocket i(s sVar) {
        int i = a.f154259a[sVar.f234889n.ordinal()];
        if (i == 1 || i == 2) {
            return new StartUpPocket.SavingsAccount(sVar.f());
        }
        if (i == 3) {
            return new StartUpPocket.JointSavingsAccount(sVar.f());
        }
        if (i == 4) {
            return new StartUpPocket.JuniorSavingsAccount(sVar.f());
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("MoneyBoxAccountType.PERSONAL_UNDER_18 not supported");
    }

    public final Object a(gim.c cVar) {
        q[] elements = {q.ACTIVE, q.OFFBOARDING, q.PENDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return vkm.q.x(new r(mo3.a.g(zi0.c.w(this.f154265b.e(kotlin.collections.d.y0(elements), w4l.h.f294642c)), null, new e(16), 1), 8), cVar);
    }

    public final SavingsAccountCreationFlow$Destination b(String juniorId, String productId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new SavingsAccountCreationFlow$Destination(new SavingsAccountCreationFlow$Filter.ProductId(productId), new SavingAccountType.Junior(juniorId), 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r14, xi0.b r15, java.util.List r16, gim.c r17) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hob.d.c(java.lang.String, xi0.b, java.util.List, gim.c):java.lang.Object");
    }

    public final NaviCommand d(s savingsAccount, Long l2) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
        try {
            m.Companion companion = m.INSTANCE;
            Intrinsics.checkNotNullParameter(savingsAccount, "<this>");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (!(savingsAccount.f234885h instanceof e0)) {
            throw new IllegalArgumentException("Parameter account is not a savings vault");
        }
        objA = u0.f(new GoalsDestination(new GoalsContract$Account.SavingsAccount(savingsAccount.f234881a, l2)));
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        return (NaviCommand) objA;
    }

    public final SavingsAccountCreationFlow$Destination e() {
        return new SavingsAccountCreationFlow$Destination(null, null, 15);
    }

    public final NaviCommand f(s savingsAccount, Long l2) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
        try {
            m.Companion companion = m.INSTANCE;
            Intrinsics.checkNotNullParameter(savingsAccount, "<this>");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (!(savingsAccount.f234885h instanceof e0)) {
            throw new IllegalArgumentException("Parameter savingsAccount is not a savings vault");
        }
        objA = vhi.c.c(new VaultsKompotFeatureConfig$SpareChange$Destination(savingsAccount.f234881a, l2), yhi.b.BOTTOM_DIALOG, null, false, 12);
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        return (NaviCommand) (objA instanceof yhm.n ? null : objA);
    }

    public final ufm.b g(SavingsNavigationProvider$TopUpConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return w.o0(p0.f264003c, new hg0.n(this, config, null, 15));
    }

    public final i h(s vault) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        i iVar = new i(((n7i.s) this.f154264a).d(vault.f234881a), new hje.e(new aed.c(this, vault, 3), 22), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
