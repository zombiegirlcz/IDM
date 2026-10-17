package z6e;

import com.revolut.data.model.Data;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.feature.vaults.api.VaultsApi$Toggles;
import h6e.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.l0;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements z5e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f319741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6e.i f319742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ssi.o f319743c;
    public final g6e.f d;
    public final g6e.g e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a7e.f f319744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xvh.c f319745h;

    public k(g6e.d subaccountInteractor, x6e.i mapper, ssi.o transactionsWidgetUiModel, g6e.f transactionInteractor, g6e.g navigationProvider, gte.a featureToggleInteractor, a7e.f defaultRemovalSource, xvh.c autoInvestInteractor) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(defaultRemovalSource, "defaultRemovalSource");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        this.f319741a = subaccountInteractor;
        this.f319742b = mapper;
        this.f319743c = transactionsWidgetUiModel;
        this.d = transactionInteractor;
        this.e = navigationProvider;
        this.f = featureToggleInteractor;
        this.f319744g = defaultRemovalSource;
        this.f319745h = autoInvestInteractor;
    }

    @Override // z5e.c
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        String str = accountId.f89729a;
        l0 l0Var = (l0) this.d;
        SubaccountType.Joint joint = SubaccountType.Joint.f88961a;
        return nim.a.v(u0.i(l0Var.a(str, joint), l0Var.c(accountId.f89729a, joint), nim.a.v(l0Var.d.c(), new s6e.g(9))), new z1.c(this, accountId, 16));
    }

    @Override // z5e.c
    public final Object c(ProductAccountId productAccountId, yhe.k kVar) {
        return this.f319744g.d(productAccountId.f89729a, SubaccountType.Joint.f88961a, kVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (((s6e.z) r5.f319741a).z(com.revolut.feature.subaccount.api.models.SubaccountType.Joint.f88961a, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z5e.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.tab.accounts.models.ProductAccountId r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z6e.j
            if (r0 == 0) goto L13
            r0 = r7
            z6e.j r0 = (z6e.j) r0
            int r1 = r0.f319740x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319740x = r1
            goto L1a
        L13:
            z6e.j r0 = new z6e.j
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319740x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            goto L70
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = r0.u
            yhm.o.b(r7)
            goto L52
        L3a:
            yhm.o.b(r7)
            xvh.a$a r7 = xvh.a.C1716a.f309267a
            xvh.c r2 = r5.f319745h
            b6d.r r2 = (b6d.r) r2
            ufm.i r7 = r2.g(r7)
            r0.u = r6
            r0.f319740x = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L52
            goto L6f
        L52:
            yvh.b r7 = (yvh.b) r7
            java.lang.String r7 = r7.f317178c
            java.lang.String r6 = r6.f89729a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r7, r6)
            if (r6 == 0) goto L73
            r6 = 0
            r0.u = r6
            r0.f319740x = r3
            g6e.d r6 = r5.f319741a
            s6e.z r6 = (s6e.z) r6
            com.revolut.feature.subaccount.api.models.SubaccountType$Joint r7 = com.revolut.feature.subaccount.api.models.SubaccountType.Joint.f88961a
            java.lang.Object r6 = r6.z(r7, r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L73:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z6e.k.d(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // z5e.c
    public final Object e(ProductAccountId productAccountId, Continuation continuation) {
        HomeFeedWidgetContext.JointPocket.Companion companion = HomeFeedWidgetContext.JointPocket.INSTANCE;
        String str = productAccountId.f89729a;
        companion.getClass();
        return new sfe.z(HomeFeedWidgetContext.JointPocket.Companion.a(str));
    }

    @Override // z5e.c
    public final Flow f(ProductSpaceIdentifier productSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(productSpaceIdentifier, "productSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        if (this.f.a(VaultsApi$Toggles.JointSubaccounts.f94695c)) {
            return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        return xam.a.h(new i(this, null), ((s6e.z) this.f319741a).w(f.d.f149639a, c8g.c.C(dataLoadingMode)));
    }

    @Override // z5e.c
    public final Object g(ProductAccountId productAccountId, a6e.f fVar) {
        return this.f319744g.c(productAccountId, fVar);
    }

    @Override // z5e.c
    public final Flow h(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return vkm.q.Q(b(accountId), new g((Continuation) null, this, 0));
    }

    @Override // z5e.c
    public final Object i(ProductAccountId productAccountId, Continuation continuation) {
        Object objE = this.f319744g.e(productAccountId, (yhe.i) continuation);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }

    @Override // z5e.c
    public final Flow j(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return xam.a.h(new h(accountId, this, null), ((s6e.z) this.f319741a).u(accountId.f89729a));
    }
}
