package z6e;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import h6e.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements z5e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f319757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6e.i f319758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ssi.o f319759c;
    public final g6e.f d;
    public final g6e.g e;
    public final a7e.f f;

    public r(a7e.f defaultRemovalSource, g6e.d subaccountInteractor, g6e.f transactionInteractor, g6e.g navigationProvider, ssi.o transactionsWidgetUiModel, x6e.i mapper) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(defaultRemovalSource, "defaultRemovalSource");
        this.f319757a = subaccountInteractor;
        this.f319758b = mapper;
        this.f319759c = transactionsWidgetUiModel;
        this.d = transactionInteractor;
        this.e = navigationProvider;
        this.f = defaultRemovalSource;
    }

    @Override // z5e.c
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nim.a.v(((l0) this.d).a(accountId.f89729a, SubaccountType.Personal.f88963a), new z1.c(this, accountId, 17));
    }

    @Override // z5e.c
    public final Object c(ProductAccountId productAccountId, yhe.k kVar) {
        return this.f.d(productAccountId.f89729a, SubaccountType.Personal.f88963a, kVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (((s6e.z) r3).z(com.revolut.feature.subaccount.api.models.SubaccountType.Personal.f88963a, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z5e.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.tab.accounts.models.ProductAccountId r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof z6e.q
            if (r0 == 0) goto L13
            r0 = r8
            z6e.q r0 = (z6e.q) r0
            int r1 = r0.f319756x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319756x = r1
            goto L1a
        L13:
            z6e.q r0 = new z6e.q
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319756x
            g6e.d r3 = r6.f319757a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            yhm.o.b(r8)
            goto L6b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.revolut.feature.tab.accounts.models.ProductAccountId r7 = r0.u
            yhm.o.b(r8)
            goto L4f
        L3c:
            yhm.o.b(r8)
            r0.u = r7
            r0.f319756x = r5
            xvh.a$b r8 = xvh.a.b.f309269a
            r2 = r3
            s6e.z r2 = (s6e.z) r2
            java.lang.Object r8 = r2.i(r8, r0)
            if (r8 != r1) goto L4f
            goto L6a
        L4f:
            yvh.b r8 = (yvh.b) r8
            java.lang.String r8 = r8.f317178c
            java.lang.String r7 = r7.f89729a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r8, r7)
            if (r7 == 0) goto L6e
            r7 = 0
            r0.u = r7
            r0.f319756x = r4
            s6e.z r3 = (s6e.z) r3
            com.revolut.feature.subaccount.api.models.SubaccountType$Personal r7 = com.revolut.feature.subaccount.api.models.SubaccountType.Personal.f88963a
            java.lang.Object r7 = r3.z(r7, r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L6e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z6e.r.d(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // z5e.c
    public final Object e(ProductAccountId productAccountId, Continuation continuation) {
        HomeFeedWidgetContext.PersonalPocket.Companion companion = HomeFeedWidgetContext.PersonalPocket.INSTANCE;
        String str = productAccountId.f89729a;
        companion.getClass();
        return new sfe.z(HomeFeedWidgetContext.PersonalPocket.Companion.a(str));
    }

    @Override // z5e.c
    public final Flow f(ProductSpaceIdentifier productSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(productSpaceIdentifier, "productSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return xam.a.h(new p(this, null), ((s6e.z) this.f319757a).w(f.e.f149640a, c8g.c.C(dataLoadingMode)));
    }

    @Override // z5e.c
    public final Object g(ProductAccountId productAccountId, a6e.f fVar) {
        return this.f.c(productAccountId, fVar);
    }

    @Override // z5e.c
    public final Flow h(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return vkm.q.Q(b(accountId), new g((Continuation) null, this, 1));
    }

    @Override // z5e.c
    public final Object i(ProductAccountId productAccountId, Continuation continuation) {
        Object objE = this.f.e(productAccountId, (yhe.i) continuation);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }

    @Override // z5e.c
    public final Flow j(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return xam.a.h(new o(accountId, this, null), ((s6e.z) this.f319757a).u(accountId.f89729a));
    }
}
