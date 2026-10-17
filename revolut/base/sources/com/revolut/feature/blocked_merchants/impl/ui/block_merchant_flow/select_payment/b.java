package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment;

import com.revolut.data.model.Data;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$ScreenType;
import efm.r;
import ffk.t;
import ip0.qn0;
import ip4.m;
import is2.f;
import is2.i;
import is2.k;
import is2.x;
import jki.g;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oce.e;
import qce.d;
import skm.a2;
import tof.aa;
import tof.cc;
import tof.h9;
import tof.i7;
import tof.na;
import tof.qb;
import tof.v6;
import tof.y6;
import yji.l;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends g implements i {
    public final abf.c A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whf.b f64267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ur2.c f64268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xua.a f64269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SelectPaymentToBlockScreenContract$InputData f64270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f64271t;
    public final e u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vr2.d f64272w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f64273x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f64274y;
    public a2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p stateMapper, whf.b transactionsContentProvider, x searchTransformerFactory, ur2.c blockedMerchantsInteractor, xua.a recurringPaymentInteractor, t pricingPlanInteractor, SelectPaymentToBlockScreenContract$InputData inputData, j60.a bottomExpandableDialogControllerExtension, e blockMerchantDialogProvider, d blockSubscriptionDialogProvider, vr2.d blockMerchantDestinationResolver, gte.a featureToggleInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(searchTransformerFactory, "searchTransformerFactory");
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(blockMerchantDialogProvider, "blockMerchantDialogProvider");
        Intrinsics.checkNotNullParameter(blockSubscriptionDialogProvider, "blockSubscriptionDialogProvider");
        Intrinsics.checkNotNullParameter(blockMerchantDestinationResolver, "blockMerchantDestinationResolver");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f64267p = transactionsContentProvider;
        this.f64268q = blockedMerchantsInteractor;
        this.f64269r = recurringPaymentInteractor;
        this.f64270s = inputData;
        this.f64271t = bottomExpandableDialogControllerExtension;
        this.u = blockMerchantDialogProvider;
        this.v = blockSubscriptionDialogProvider;
        this.f64272w = blockMerchantDestinationResolver;
        this.f64273x = featureToggleInteractor;
        this.f64274y = new f("", new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, false);
        Flow stateStream = q2();
        Intrinsics.checkNotNullParameter(stateStream, "stateStream");
        this.A = new abf.c(stateStream, searchTransformerFactory, 26);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable y2(com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof is2.q
            if (r0 == 0) goto L13
            r0 = r7
            is2.q r0 = (is2.q) r0
            int r1 = r0.f168100x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168100x = r1
            goto L18
        L13:
            is2.q r0 = new is2.q
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168100x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L6f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            efm.r r5 = r5.A2()
            ip0.qn0 r7 = new ip0.qn0
            r2 = 20
            r7.<init>(r2)
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r7, r3)
            efm.d0 r5 = r5.firstOrError()
            ik3.a r7 = new ik3.a
            r2 = 8
            r7.<init>(r6, r2)
            ir9.a r2 = new ir9.a
            r4 = 8
            r2.<init>(r7, r4)
            r5.getClass()
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r5, r2, r4)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            r0.u = r6
            r0.f168100x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            qua.p r7 = (qua.p) r7
            if (r7 == 0) goto L74
            return r7
        L74:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r7 = "RecurringPayment with transaction id "
            java.lang.String r0 = " is null, but was displayed to the User"
            java.lang.String r6 = p.a.p(r7, r6, r0)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b.y2(com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b, java.lang.String, gim.c):java.io.Serializable");
    }

    public final r A2() {
        String id10;
        ContentUser contentUser = this.f64270s.f64261a;
        if (Intrinsics.f(contentUser, ContentUser.Self.f64237b)) {
            id10 = null;
        } else {
            if (!(contentUser instanceof ContentUser.Junior)) {
                throw new NoWhenBranchMatchedException();
            }
            id10 = ((ContentUser.Junior) contentUser).d;
            Intrinsics.checkNotNullParameter(id10, "id");
        }
        return xua.a.b(this.f64269r, id10, 1);
    }

    @Override // yji.l
    public final void I1() {
        r rVarJust;
        SelectPaymentToBlockScreenContract$ScreenType selectPaymentToBlockScreenContract$ScreenType = this.f64270s.f64262b;
        int i = 0;
        int i2 = 1;
        Continuation continuation = null;
        if (Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchant.f64263a)) {
            rVarJust = m70.a.g(A2(), null, new qn0(21), 1).map(new ir9.a(new k(this, i), 9));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "map(...)");
        } else if (Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockSubscription.f64265a)) {
            rVarJust = m70.a.g(A2(), null, new qn0(22), 1).map(new ir9.a(new m(16), 10)).map(new ir9.a(new m(17), 11)).map(new ir9.a(new m(18), 7));
            Intrinsics.h(rVarJust);
        } else {
            if (!Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchantOld.f64264a)) {
                throw new NoWhenBranchMatchedException();
            }
            i7.c cVar = i7.Companion;
            i7[] i7VarArr = {new h9(true), new cc(u.c(y6.CARD_PAYMENT)), new qb(v.k(v6.PENDING, v6.COMPLETED, v6.DECLINED)), z2()};
            cVar.getClass();
            rVarJust = r.just(i7.c.a(i7VarArr));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        }
        l.a1(this, rd0.e.b(whf.b.a(this.f64267p, rVarJust, this.A, null, null, 12)), null, null, new is2.r(this, continuation, i), 3);
        l.a1(this, rd0.e.b(ur2.c.c(this.f64268q, null, 3)), null, null, new is2.r(this, continuation, i2), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f64274y;
    }

    public final i7 z2() {
        ContentUser contentUser = this.f64270s.f64261a;
        if (contentUser instanceof ContentUser.Junior) {
            return new aa(((ContentUser.Junior) contentUser).f64235b);
        }
        if (Intrinsics.f(contentUser, ContentUser.Self.f64237b)) {
            return new na(i7.a0.f272807a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
