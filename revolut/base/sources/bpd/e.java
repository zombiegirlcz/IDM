package bpd;

import a26.q;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.api.AnalyticsAccount;
import djb.p;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import pcd.j;
import rnb.w;
import w4l.h;
import wsg.n;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f17600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f17601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f17602c;
    public final ppk.f d;
    public final j9l.a e;
    public final le3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineScope f17603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f17604h;

    public e(n walletInteractor, p savingsStatisticsInteractor, w savingsVaultInteractor, ppk.f ratesInteractor, j9l.a moneyCalculator, le3.a analyticsCurrencyInteractor, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(savingsStatisticsInteractor, "savingsStatisticsInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(analyticsCurrencyInteractor, "analyticsCurrencyInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f17600a = walletInteractor;
        this.f17601b = savingsStatisticsInteractor;
        this.f17602c = savingsVaultInteractor;
        this.d = ratesInteractor;
        this.e = moneyCalculator;
        this.f = analyticsCurrencyInteractor;
        this.f17603g = coroutineScope;
        this.f17604h = new ConcurrentHashMap();
    }

    public final Flow a(AnalyticsAccount.Savings savings) {
        boolean z = savings instanceof AnalyticsAccount.Savings.PersonalAll;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        n nVar = this.f17600a;
        h hVar = h.f294642c;
        w wVar = this.f17602c;
        Continuation continuation = null;
        if (z) {
            return xam.a.h(new bi2.n(this, continuation, 16), u0.m(wVar.d(new pcd.e(j.d.f234867a)), rd0.e.b(nVar.J(personal, hVar))));
        }
        if (savings instanceof AnalyticsAccount.Savings.PersonalIndividual) {
            return xam.a.h(new q(this, continuation, continuation, 22), wVar.c(((AnalyticsAccount.Savings.PersonalIndividual) savings).f99204a, hVar));
        }
        if (savings instanceof AnalyticsAccount.Savings.JuniorSaving) {
            return xam.a.h(new q(this, continuation, continuation, 22), wVar.c(((AnalyticsAccount.Savings.JuniorSaving) savings).f99201a, hVar));
        }
        if (savings instanceof AnalyticsAccount.Savings.JointAll) {
            AccountId.Joint joint = ((AnalyticsAccount.Savings.JointAll) savings).f99198a;
            return xam.a.h(new b(this, joint, null), u0.m(wVar.d(new pcd.e(j.c.f234866a)), rd0.e.b(nVar.J(personal, hVar))));
        }
        if (!(savings instanceof AnalyticsAccount.Savings.JointIndividual)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsAccount.Savings.JointIndividual jointIndividual = (AnalyticsAccount.Savings.JointIndividual) savings;
        String str = jointIndividual.f99200b;
        String str2 = jointIndividual.f99199a.f51413b;
        return xam.a.h(new q(this, str2, continuation, 22), wVar.c(str, hVar));
    }
}
