package com.revolut.feature.freelancer.impl.ui.cashback.flow;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import et6.u0;
import gr6.p;
import inh.g;
import java.util.Set;
import jv6.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import tof.a3;
import tof.i7;
import tof.q6;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements e {
    public final u0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f73744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FreelancerCashbackFlowContract$InputData f73745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zja.a f73746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f73747s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f73748t;

    public c(u0 freelancerCapabilitiesInteractor, p freelancerProductArticleInteractor, FreelancerCashbackFlowContract$InputData inputData, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(freelancerCapabilitiesInteractor, "freelancerCapabilitiesInteractor");
        Intrinsics.checkNotNullParameter(freelancerProductArticleInteractor, "freelancerProductArticleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = freelancerCapabilitiesInteractor;
        this.f73744p = freelancerProductArticleInteractor;
        this.f73745q = inputData;
        this.f73746r = productArticleInteractor;
        this.f73747s = hx7.e.b(this, new FreelancerCashbackFlowContract$DomainState(0));
        this.f73748t = d8l.d.a(this, new jnf.d(this, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.freelancer.impl.ui.cashback.flow.c r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof jv6.f
            if (r0 == 0) goto L16
            r0 = r5
            jv6.f r0 = (jv6.f) r0
            int r1 = r0.f178788w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f178788w = r1
            goto L1b
        L16:
            jv6.f r0 = new jv6.f
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178788w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L47
            goto L44
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            gr6.p r4 = r4.f73744p     // Catch: java.lang.Exception -> L47
            ir6.b r5 = ir6.b.BOOSTER     // Catch: java.lang.Exception -> L47
            r0.f178788w = r3     // Catch: java.lang.Exception -> L47
            et6.x2 r4 = (et6.x2) r4     // Catch: java.lang.Exception -> L47
            java.lang.Object r5 = r4.g(r5, r0)     // Catch: java.lang.Exception -> L47
            if (r5 != r1) goto L44
            return r1
        L44:
            com.revolut.feature.product_article.api.models.ProductArticleParams r5 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r5     // Catch: java.lang.Exception -> L47
            return r5
        L47:
            r4 = move-exception
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.cashback.flow.c.I2(com.revolut.feature.freelancer.impl.ui.cashback.flow.c, gim.c):java.lang.Object");
    }

    public static Object L2(c cVar, ProductArticleParams productArticleParams, jv6.d dVar, gim.i iVar, int i) {
        Continuation continuation = null;
        if ((i & 1) != 0) {
            productArticleParams = null;
        }
        if ((i & 2) != 0) {
            dVar = jv6.d.DEFAULT;
        }
        cVar.getClass();
        jp3.b bVar = new jp3.b(cVar, dVar, 21);
        if (productArticleParams == null) {
            return cVar.p2(iVar, new g(cVar, bVar, continuation, 25));
        }
        bVar.invoke(productArticleParams);
        return Unit.f186387a;
    }

    public final void J2(a3 a3Var) {
        C1(zh9.u0.c(new TransactionsFeatureConfig.Details(new k71.g(a3Var), null, null, null, 126)));
    }

    public final void K2(i7 i7Var) {
        C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(i7Var, null, null, 6), (String) null, (AccountId) null, (rhf.h) null, rhf.g.OTHER, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65263)));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // qki.e
    public final d getState() {
        return this.f73747s;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f73748t;
    }
}
