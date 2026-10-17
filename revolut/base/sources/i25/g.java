package i25;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import hul.v;
import io3.l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n14.k;
import om4.n4;
import om4.x2;
import ssi.o;
import vkm.q;
import wsg.n;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements z5e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f157848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f157849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f157850c;
    public final al4.n d;
    public final n4 e;

    public g(n walletsInteractor, c collateralPocketMapper, o transactionsWidgetUiModel, al4.n creditCardInteractor, n4 securedCreditCardInteractor, h collateralSubaccountTransactionFilterProvider) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(collateralPocketMapper, "collateralPocketMapper");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(securedCreditCardInteractor, "securedCreditCardInteractor");
        Intrinsics.checkNotNullParameter(collateralSubaccountTransactionFilterProvider, "collateralSubaccountTransactionFilterProvider");
        this.f157848a = walletsInteractor;
        this.f157849b = collateralPocketMapper;
        this.f157850c = transactionsWidgetUiModel;
        this.d = creditCardInteractor;
        this.e = securedCreditCardInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z5e.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.tab.accounts.models.ProductAccountId r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof i25.f
            if (r6 == 0) goto L13
            r6 = r7
            i25.f r6 = (i25.f) r6
            int r0 = r6.f157847w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f157847w = r0
            goto L1a
        L13:
            i25.f r6 = new i25.f
            gim.c r7 = (gim.c) r7
            r6.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f157847w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r7)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            al4.n r7 = r5.d
            om4.x2 r7 = (om4.x2) r7
            w4l.h r1 = w4l.h.f294642c
            kotlinx.coroutines.flow.Flow r7 = r7.l(r1)
            kotlinx.coroutines.flow.Flow r7 = vkm.q.q(r7)
            i0k.f r1 = new i0k.f
            r4 = 19
            r1.<init>(r4)
            akg.n r7 = nim.a.v(r7, r1)
            hy2.b r1 = new hy2.b
            r4 = 24
            r1.<init>(r4)
            jhi.b r7 = mo3.a.g(r7, r3, r1, r2)
            r6.f157847w = r2
            java.lang.Object r7 = vkm.q.z(r7, r6)
            if (r7 != r0) goto L62
            return r0
        L62:
            od0.i r7 = (od0.i) r7
            if (r7 == 0) goto L6b
            java.lang.Object r6 = r7.f224257a
            com.revolut.feature.credit.card.models.CreditCard r6 = (com.revolut.feature.credit.card.models.CreditCard) r6
            goto L6c
        L6b:
            r6 = r3
        L6c:
            if (r6 == 0) goto L8d
            sfe.z r6 = new sfe.z
            com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Collateral$a r0 = com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.Collateral.INSTANCE
            java.lang.Object r7 = r7.c()
            com.revolut.feature.credit.card.models.CreditCard r7 = (com.revolut.feature.credit.card.models.CreditCard) r7
            java.lang.String r7 = r7.f69792a
            r0.getClass()
            java.lang.String r0 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Collateral r0 = new com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Collateral
            r0.<init>(r3, r7, r2, r3)
            dsh.s r7 = dsh.s.NONE
            r6.<init>(r0, r7)
            return r6
        L8d:
            sfe.a0 r6 = sfe.a0.f262402a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i25.g.e(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // z5e.c
    public final Flow f(ProductSpaceIdentifier productSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(productSpaceIdentifier, "productSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return k.p(boh.f.e(rd0.e.b(osg.b.g(this.f157848a, c8g.c.C(dataLoadingMode), l.COLLATERAL, null, null, null, null, null, 124)), new v(this, dataLoadingMode, 27)), new i0k.f(20));
    }

    @Override // z5e.c
    public final Flow h(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return rd0.e.e(mo3.a.g(c6d.b.i(u0.m(rd0.e.b(osg.b.s(this.f157848a, accountId.f89729a, null, 6)), nim.a.v(q.q(((x2) this.d).l(w4l.h.f294642c)), new i0k.f(19))), new e(this, accountId, 0)), null, new hy2.b(25), 1), h0.f322473a, new eci.a(3, 20, null));
    }

    @Override // z5e.c
    public final Flow j(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return boh.f.e(rd0.e.b(osg.b.s(this.f157848a, accountId.f89729a, null, 6)), new hw9.a(this, 26));
    }
}
