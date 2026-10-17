package bn4;

import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardholderRemovedDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardRevPointsInfoDestination;
import com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;
import om4.x2;
import om4.y3;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 implements yl4.c, q06.k {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f17059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.p f17060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.d f17061c;
    public final al4.n d;
    public final al4.q e;
    public final lb5.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f73.c f17062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l93.f f17063h;
    public final k0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final al4.e f17064j;
    public final ang.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wie.a f17065l;

    public b0(sri.m navigator, al4.p creditCardProductFeatureTogglesInteractor, al4.d creditCardAdditionalCardholdersInteractor, al4.n creditCardInteractor, al4.q creditCardProductInteractor, lb5.b creditCardAutoPayInteractor, f73.c revolutCardsNavigationFactory, l93.f cardsInteractor, k0 creditCardFeatureInteractor, al4.e creditCardDebitToInstalmentInteractor, ang.f userInteractor, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardAutoPayInteractor, "creditCardAutoPayInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsNavigationFactory, "revolutCardsNavigationFactory");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        Intrinsics.checkNotNullParameter(creditCardDebitToInstalmentInteractor, "creditCardDebitToInstalmentInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.f17059a = navigator;
        this.f17060b = creditCardProductFeatureTogglesInteractor;
        this.f17061c = creditCardAdditionalCardholdersInteractor;
        this.d = creditCardInteractor;
        this.e = creditCardProductInteractor;
        this.f = creditCardAutoPayInteractor;
        this.f17062g = revolutCardsNavigationFactory;
        this.f17063h = cardsInteractor;
        this.i = creditCardFeatureInteractor;
        this.f17064j = creditCardDebitToInstalmentInteractor;
        this.k = userInteractor;
        this.f17065l = creditAccountDestinationResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(bn4.b0 r6, com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink r7, boolean r8, gim.c r9) throws java.io.UnsupportedEncodingException {
        /*
            boolean r0 = r9 instanceof bn4.x
            if (r0 == 0) goto L13
            r0 = r9
            bn4.x r0 = (bn4.x) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            bn4.x r0 = new bn4.x
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f17101x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.retail.core.navigation.NaviCommand r7 = r0.v
            yhm.o.b(r9)
            goto L6e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            boolean r8 = r0.f17100w
            com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink r7 = r0.u
            yhm.o.b(r9)
            goto L4c
        L3c:
            yhm.o.b(r9)
            r0.u = r7
            r0.f17100w = r8
            r0.z = r4
            java.lang.Object r9 = r6.s(r7, r0)
            if (r9 != r1) goto L4c
            goto L6a
        L4c:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            boolean r2 = r9 instanceof com.revolut.retail.core.navigation.DummyCommand
            if (r2 == 0) goto L55
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L55:
            if (r8 == 0) goto L74
            boolean r7 = r7 instanceof com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink.Home
            if (r7 != 0) goto L74
            r7 = 0
            r0.u = r7
            r0.v = r9
            r0.f17100w = r8
            r0.z = r3
            java.lang.Object r7 = r6.o(r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r5 = r9
            r9 = r7
            r7 = r5
        L6e:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            com.revolut.retail.core.navigation.CompositeCommand r9 = com.revolut.retail.core.navigation.a.c(r9, r7)
        L74:
            sri.m r6 = r6.f17059a
            r6.c(r9)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.b(bn4.b0, com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink, boolean, gim.c):java.lang.Object");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        CreditCardDeeplink.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return CreditCardDeeplink.Companion.a(deeplink.f173629c, deeplink.d) != null;
    }

    public final Object c(gim.c cVar) {
        return vkm.q.x(mo3.a.g(nim.a.v(((y3) this.e).e(w4l.j.f294644c, true), new blh.y(23)), null, new bk6.n(28), 1), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r8) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r11, kotlin.coroutines.Continuation r12) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        CreditCardDeeplink.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        CreditCardDeeplink creditCardDeeplinkA = CreditCardDeeplink.Companion.a(deeplink.f173629c, deeplink.d);
        if (creditCardDeeplinkA != null) {
            return te0.w.o0(p0.f264003c, new ald.m(this, creditCardDeeplinkA, z, (Continuation) null, 5));
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof bn4.g
            if (r0 == 0) goto L13
            r0 = r12
            bn4.g r0 = (bn4.g) r0
            int r1 = r0.f17071w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17071w = r1
            goto L18
        L13:
            bn4.g r0 = new bn4.g
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17071w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r12)
            goto L66
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L30:
            yhm.o.b(r12)
            al4.d r12 = r11.f17061c
            om4.l r12 = (om4.l) r12
            om4.k4 r2 = r12.f226626c
            kotlinx.coroutines.flow.Flow r2 = r2.d()
            kotlinx.coroutines.flow.Flow r2 = vkm.q.q(r2)
            jkh.g r5 = new jkh.g
            r6 = 18
            r5.<init>(r3, r12, r6)
            kotlinx.coroutines.flow.Flow r12 = xam.a.h(r5, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r12 = rd0.e.n(r12, r2)
            bk6.n r2 = new bk6.n
            r5 = 20
            r2.<init>(r5)
            jhi.b r12 = mo3.a.g(r12, r3, r2, r4)
            r0.f17071w = r4
            java.lang.Object r12 = vkm.q.x(r12, r0)
            if (r12 != r1) goto L66
            return r1
        L66:
            com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState r12 = (com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState) r12
            boolean r0 = r12 instanceof com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState.NotAvailable
            if (r0 == 0) goto L6d
            goto La5
        L6d:
            boolean r0 = r12 instanceof com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState.Available
            if (r0 == 0) goto La8
            com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState$Available r12 = (com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState.Available) r12
            yw4.l r0 = r12.f69811c
            int[] r1 = bn4.e.f17069b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r4) goto La5
            r1 = 2
            if (r0 != r1) goto L9f
            java.lang.String r12 = r12.f69809a
            java.lang.String r0 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r4 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.credit.card.api.navigation.AdditionalCardsDestination r6 = new com.revolut.feature.credit.card.api.navigation.AdditionalCardsDestination
            r6.<init>(r12, r3)
            r9 = 0
            r10 = 61
            r5 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.<init>(r4)
            return r0
        L9f:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        La5:
            com.revolut.retail.core.navigation.DummyCommand r12 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            return r12
        La8:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.g(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof bn4.h
            if (r0 == 0) goto L13
            r0 = r9
            bn4.h r0 = (bn4.h) r0
            int r1 = r0.f17073x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17073x = r1
            goto L18
        L13:
            bn4.h r0 = new bn4.h
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17073x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            java.lang.String r0 = r0.u
            yhm.o.b(r9)
            goto L6a
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            yhm.o.b(r9)
            goto L45
        L39:
            yhm.o.b(r9)
            r0.f17073x = r5
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r1) goto L45
            goto L66
        L45:
            java.lang.String r9 = (java.lang.String) r9
            r0.u = r9
            r0.f17073x = r4
            w4l.j r2 = w4l.j.f294644c
            lb5.b r4 = r8.f
            yb5.e r4 = (yb5.e) r4
            vkm.d r2 = r4.b(r9, r2)
            bk6.n r4 = new bk6.n
            r6 = 25
            r4.<init>(r6)
            jhi.b r2 = mo3.a.g(r2, r3, r4, r5)
            java.lang.Object r0 = vkm.q.x(r2, r0)
            if (r0 != r1) goto L67
        L66:
            return r1
        L67:
            r7 = r0
            r0 = r9
            r9 = r7
        L6a:
            com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments r9 = (com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments) r9
            com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment$AutoPayment r9 = r9.a()
            java.lang.String r1 = "facilityId"
            if (r9 == 0) goto L82
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.revolut.retail.core.navigation.FeatureCommand r9 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$AutoPaySettings r1 = new com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$AutoPaySettings
            r1.<init>(r0, r3)
            r9.<init>(r1)
            return r9
        L82:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.revolut.retail.core.navigation.FeatureCommand r9 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$SetUpAutoPay r1 = new com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$SetUpAutoPay
            r1.<init>(r0, r3)
            r9.<init>(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.h(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof bn4.i
            if (r0 == 0) goto L13
            r0 = r12
            bn4.i r0 = (bn4.i) r0
            int r1 = r0.f17075x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17075x = r1
            goto L18
        L13:
            bn4.i r0 = new bn4.i
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17075x
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            yw4.p r0 = r0.u
            yhm.o.b(r12)
            goto L7b
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            yhm.o.b(r12)
            goto L65
        L39:
            yhm.o.b(r12)
            w4l.j r12 = w4l.j.f294644c
            al4.q r2 = r11.e
            om4.y3 r2 = (om4.y3) r2
            kotlinx.coroutines.flow.Flow r12 = r2.e(r12, r5)
            blh.y r2 = new blh.y
            r6 = 22
            r2.<init>(r6)
            akg.n r12 = nim.a.v(r12, r2)
            bk6.n r2 = new bk6.n
            r6 = 26
            r2.<init>(r6)
            jhi.b r12 = mo3.a.g(r12, r4, r2, r5)
            r0.f17075x = r5
            java.lang.Object r12 = vkm.q.x(r12, r0)
            if (r12 != r1) goto L65
            goto L77
        L65:
            yw4.p r12 = (yw4.p) r12
            java.lang.String r2 = r12.f317325a
            yw4.f r6 = yw4.f.BALANCE_TRANSFER
            r0.u = r12
            r0.f17075x = r3
            om4.k0 r3 = r11.i
            java.lang.Object r0 = r3.b(r2, r6, r0)
            if (r0 != r1) goto L78
        L77:
            return r1
        L78:
            r10 = r0
            r0 = r12
            r12 = r10
        L7b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            java.lang.String r0 = r0.f317326b
            if (r12 == 0) goto Laf
            java.lang.String r12 = "pocketId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r12)
            com.revolut.retail.core.navigation.FeatureCommand r12 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter$Accounts r1 = com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter.Accounts.f79984a
            java.util.Set r1 = zhm.y0.b(r1)
            g3a.e r2 = g3a.e.BALANCE_TRANSFER_CREDIT_CARD
            com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel r3 = new com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r6 = new com.revolut.feature.transfer.core.models.TransferMoneyPocket
            com.revolut.feature.transfer.core.models.SourceAccount$Pocket r7 = new com.revolut.feature.transfer.core.models.SourceAccount$Pocket
            io3.l r8 = io3.l.CREDIT
            r9 = 4
            r7.<init>(r0, r8, r4, r9)
            r6.<init>(r4, r7, r5)
            r3.<init>(r6)
            com.revolut.feature.payments.who_to_transfer.api.transfer.TransferBridgeFeatureConfig$NewTransfer r0 = new com.revolut.feature.payments.who_to_transfer.api.transfer.TransferBridgeFeatureConfig$NewTransfer
            r0.<init>(r1, r3, r2)
            r12.<init>(r0)
            return r12
        Laf:
            com.revolut.retail.core.navigation.DummyCommand r12 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.i(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof bn4.j
            if (r0 == 0) goto L13
            r0 = r6
            bn4.j r0 = (bn4.j) r0
            int r1 = r0.f17077x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17077x = r1
            goto L18
        L13:
            bn4.j r0 = new bn4.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17077x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            bn4.d r0 = r0.u
            yhm.o.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            bn4.d r6 = bn4.d.f17067a
            r0.u = r6
            r0.f17077x = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L41
            return r1
        L41:
            r4 = r0
            r0 = r6
            r6 = r4
        L44:
            java.lang.String r6 = (java.lang.String) r6
            r0.getClass()
            java.lang.String r0 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$CashbackDetails r1 = new com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$CashbackDetails
            r1.<init>(r6)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.j(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof bn4.k
            if (r0 == 0) goto L13
            r0 = r7
            bn4.k r0 = (bn4.k) r0
            int r1 = r0.f17079x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17079x = r1
            goto L18
        L13:
            bn4.k r0 = new bn4.k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17079x
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L39
            if (r2 == r3) goto L33
            if (r2 != r5) goto L2b
            yhm.o.b(r7)
            goto L5b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            wie.a r2 = r0.u
            yhm.o.b(r7)
            goto L49
        L39:
            yhm.o.b(r7)
            wie.a r2 = r6.f17065l
            r0.u = r2
            r0.f17079x = r3
            java.lang.Object r7 = r6.c(r0)
            if (r7 != r1) goto L49
            goto L5a
        L49:
            java.lang.String r7 = (java.lang.String) r7
            com.revolut.feature.credit.models.CreditAccountType$CreditCard r3 = new com.revolut.feature.credit.models.CreditAccountType$CreditCard
            r3.<init>(r7)
            r0.u = r4
            r0.f17079x = r5
            java.lang.Object r7 = rie.b.b(r2, r3, r0)
            if (r7 != r1) goto L5b
        L5a:
            return r1
        L5b:
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination r7 = (com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination) r7
            boolean r0 = r7 instanceof com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination.JustShow
            if (r0 == 0) goto L72
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = new com.revolut.feature.rev10_main_screen.api.MainScreenTab
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r7 = (com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination.JustShow) r7
            java.lang.String r2 = r7.f83414a
            r1.<init>(r2)
            android.os.Parcelable r7 = r7.f83416c
            r0.<init>(r1, r7)
            return r0
        L72:
            boolean r0 = r7 instanceof com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination.Slide
            if (r0 != 0) goto L81
            boolean r7 = r7 instanceof com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination.Action
            if (r7 == 0) goto L7b
            goto L81
        L7b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L81:
            q06.b r7 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.f
            r7.<init>(r0, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.k(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof bn4.l
            if (r0 == 0) goto L13
            r0 = r9
            bn4.l r0 = (bn4.l) r0
            int r1 = r0.f17080w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17080w = r1
            goto L18
        L13:
            bn4.l r0 = new bn4.l
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17080w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L3b
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            r0.f17080w = r3
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r1) goto L3b
            return r1
        L3b:
            java.lang.String r9 = (java.lang.String) r9
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.credit.card.api.navigation.CreditCardLimitCapDestination r3 = new com.revolut.feature.credit.card.api.navigation.CreditCardLimitCapDestination
            r2 = 0
            r4 = 0
            r3.<init>(r4, r9, r2)
            r6 = 0
            r7 = 61
            r2 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.l(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof bn4.m
            if (r0 == 0) goto L13
            r0 = r6
            bn4.m r0 = (bn4.m) r0
            int r1 = r0.f17081w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17081w = r1
            goto L18
        L13:
            bn4.m r0 = new bn4.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17081w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            r0.f17081w = r3
            java.lang.Object r6 = r5.c(r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            java.lang.String r6 = (java.lang.String) r6
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            com.revolut.feature.credit.card.api.navigation.CreditCardDecreaseLimitDestination r2 = new com.revolut.feature.credit.card.api.navigation.CreditCardDecreaseLimitDestination
            r2.<init>(r6)
            yhi.b r6 = yhi.b.BOTTOM_DIALOG
            r3 = 0
            r4 = 12
            r1.<init>(r2, r6, r3, r4)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.m(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof bn4.n
            if (r0 == 0) goto L13
            r0 = r6
            bn4.n r0 = (bn4.n) r0
            int r1 = r0.f17083x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17083x = r1
            goto L18
        L13:
            bn4.n r0 = new bn4.n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17083x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            bn4.d r0 = r0.u
            yhm.o.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            bn4.d r6 = bn4.d.f17067a
            r0.u = r6
            r0.f17083x = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L41
            return r1
        L41:
            r4 = r0
            r0 = r6
            r6 = r4
        L44:
            java.lang.String r6 = (java.lang.String) r6
            r0.getClass()
            java.lang.String r0 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$Details r1 = new com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$Details
            r1.<init>(r6)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.n(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof bn4.o
            if (r0 == 0) goto L13
            r0 = r6
            bn4.o r0 = (bn4.o) r0
            int r1 = r0.f17085x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17085x = r1
            goto L18
        L13:
            bn4.o r0 = new bn4.o
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17085x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            bn4.d r0 = r0.u
            yhm.o.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            bn4.d r6 = bn4.d.f17067a
            r0.u = r6
            r0.f17085x = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L41
            return r1
        L41:
            r4 = r0
            r0 = r6
            r6 = r4
        L44:
            java.lang.String r6 = (java.lang.String) r6
            r0.getClass()
            java.lang.String r0 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.credit.api.navigation.CreditCardHomeFeatureConfig r1 = new com.revolut.feature.credit.api.navigation.CreditCardHomeFeatureConfig
            r1.<init>(r6)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.o(gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink.InAppStatementDetails r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof bn4.p
            if (r0 == 0) goto L14
            r0 = r10
            bn4.p r0 = (bn4.p) r0
            int r1 = r0.f17087x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f17087x = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            bn4.p r0 = new bn4.p
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r0 = r10.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.f17087x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.time.LocalDate r9 = r10.u
            yhm.o.b(r0)
            goto L71
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            yhm.o.b(r0)
            yl4.b r9 = r9.a()
            java.util.Map r9 = r9.d()
            java.lang.String r0 = "statementStartDate"
            java.lang.Object r9 = r9.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            r2 = 0
            if (r9 == 0) goto L60
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L50
            java.time.LocalDate r9 = java.time.LocalDate.parse(r9)     // Catch: java.lang.Throwable -> L50
            goto L58
        L50:
            r0 = move-exception
            r9 = r0
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L58:
            boolean r0 = r9 instanceof yhm.n
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r2 = r9
        L5e:
            java.time.LocalDate r2 = (java.time.LocalDate) r2
        L60:
            r9 = r2
            if (r9 != 0) goto L66
            com.revolut.retail.core.navigation.DummyCommand r9 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            return r9
        L66:
            r10.u = r9
            r10.f17087x = r3
            java.lang.Object r0 = r8.c(r10)
            if (r0 != r1) goto L71
            return r1
        L71:
            java.lang.String r0 = (java.lang.String) r0
            com.revolut.retail.core.navigation.FeatureCommand r10 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.credit.card.api.navigation.CreditCardInAppStatementDetailsDestination r3 = new com.revolut.feature.credit.card.api.navigation.CreditCardInAppStatementDetailsDestination
            r3.<init>(r0, r9)
            r6 = 0
            r7 = 61
            r2 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.<init>(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.p(com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink$InAppStatementDetails, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof bn4.q
            if (r0 == 0) goto L13
            r0 = r7
            bn4.q r0 = (bn4.q) r0
            int r1 = r0.f17089x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17089x = r1
            goto L18
        L13:
            bn4.q r0 = new bn4.q
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17089x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r0 = r0.u
            yhm.o.b(r7)
            goto L58
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L44
        L38:
            yhm.o.b(r7)
            r0.f17089x = r4
            java.lang.Object r7 = r6.c(r0)
            if (r7 != r1) goto L44
            goto L54
        L44:
            java.lang.String r7 = (java.lang.String) r7
            yw4.f r2 = yw4.f.INSTALMENT_PLAN_VIEW
            r0.u = r7
            r0.f17089x = r3
            om4.k0 r3 = r6.i
            java.lang.Object r0 = r3.b(r7, r2, r0)
            if (r0 != r1) goto L55
        L54:
            return r1
        L55:
            r5 = r0
            r0 = r7
            r7 = r5
        L58:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6b
            com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$Instalment r7 = new com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$Instalment
            r1 = 0
            r7.<init>(r0, r1)
            com.revolut.retail.core.navigation.FeatureCommand r7 = gc0.c.f(r7)
            return r7
        L6b:
            com.revolut.retail.core.navigation.DummyCommand r7 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.q(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        if (r10 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (r10 != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink.InstalmentsTransactions r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.r(com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink$InstalmentsTransactions, gim.c):java.lang.Object");
    }

    public final Object s(CreditCardDeeplink creditCardDeeplink, gim.c cVar) throws UnsupportedEncodingException {
        if (creditCardDeeplink instanceof CreditCardDeeplink.Home) {
            return o(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.Details) {
            return n(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.Repay) {
            return vkm.q.x(mo3.a.g(nim.a.v(nim.a.v(((x2) this.d).l(w4l.j.f294644c), new blh.y(19)), new blh.y(20)), null, new bk6.n(21), 1), cVar);
        }
        if ((creditCardDeeplink instanceof CreditCardDeeplink.AutoPay) || (creditCardDeeplink instanceof CreditCardDeeplink.AutoPaySetup)) {
            return h(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.Cashback) {
            return j(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.CardOrdering) {
            return new FeatureCommand(new CardOrderNewFeatureConfig(SelectedTab.CREDIT, null, null, null, null, false, zn3.a.DEEPLINK, null, null, null, null, null, 16250));
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.AddToWallet) {
            return d(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.Statements) {
            return x(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.RevPointsExistingAccount) {
            String formattedDate = URLDecoder.decode((String) r0.h("startDate", ((CreditCardDeeplink.RevPointsExistingAccount) creditCardDeeplink).a().d()), StandardCharsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(formattedDate, "decode(...)");
            Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
            return new FeatureCommand(new KompotOverlayFeatureConfig(new CreditCardRevPointsInfoDestination(formattedDate, true), yhi.b.BOTTOM_DIALOG, (Integer) null, 12));
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.RevPointsNewAccount) {
            String formattedDate2 = URLDecoder.decode((String) r0.h("startDate", ((CreditCardDeeplink.RevPointsNewAccount) creditCardDeeplink).a().d()), StandardCharsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(formattedDate2, "decode(...)");
            Intrinsics.checkNotNullParameter(formattedDate2, "formattedDate");
            return new FeatureCommand(new KompotOverlayFeatureConfig(new CreditCardRevPointsInfoDestination(formattedDate2, false), yhi.b.BOTTOM_DIALOG, (Integer) null, 12));
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.RevPointsLocked) {
            return t(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.StatementBottomSheet) {
            return v(cVar);
        }
        if ((creditCardDeeplink instanceof CreditCardDeeplink.AutopayFail) || (creditCardDeeplink instanceof CreditCardDeeplink.Help) || (creditCardDeeplink instanceof CreditCardDeeplink.InfoBalance) || (creditCardDeeplink instanceof CreditCardDeeplink.InfoTerminated) || (creditCardDeeplink instanceof CreditCardDeeplink.CashbackPrompt) || (creditCardDeeplink instanceof CreditCardDeeplink.CreditLimitDecreaseAccept) || (creditCardDeeplink instanceof CreditCardDeeplink.Dialog)) {
            return DummyCommand.f98635a;
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.BalanceTransferPayments) {
            return i(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.AdditionalCardholders) {
            return g(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.AdditionalCardholderRemoved) {
            return new FeatureCommand(new KompotOverlayFeatureConfig(AdditionalCardholderRemovedDestination.f68887a, yhi.b.BOTTOM_DIALOG, (Integer) null, 12));
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.SecurityDepositTopup) {
            return u(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.InstalmentsTransactions) {
            return r((CreditCardDeeplink.InstalmentsTransactions) creditCardDeeplink, cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.Instalments) {
            return q(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.StatementDueDate) {
            return w(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.Faq) {
            String str = (String) ((CreditCardDeeplink.Faq) creditCardDeeplink).a().d().get("node");
            if (str == null) {
                str = "topic.credit-cards";
            }
            return gc0.c.f(new FaqFeatureConfig.Starter(str, 2));
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.CreditLimitCap) {
            return l(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.CreditLimitDecrease) {
            return m(cVar);
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.InAppStatementDetails) {
            return p((CreditCardDeeplink.InAppStatementDetails) creditCardDeeplink, cVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof bn4.s
            if (r0 == 0) goto L13
            r0 = r10
            bn4.s r0 = (bn4.s) r0
            int r1 = r0.f17093x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17093x = r1
            goto L18
        L13:
            bn4.s r0 = new bn4.s
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17093x
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r0 = r0.u
            yhm.o.b(r10)
            goto L6a
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            yhm.o.b(r10)
            goto L45
        L39:
            yhm.o.b(r10)
            r0.f17093x = r5
            java.lang.Object r10 = r9.c(r0)
            if (r10 != r1) goto L45
            goto L66
        L45:
            java.lang.String r10 = (java.lang.String) r10
            w4l.j r2 = w4l.j.f294644c
            al4.n r6 = r9.d
            om4.x2 r6 = (om4.x2) r6
            akg.n r2 = r6.h(r10, r2)
            bk6.n r6 = new bk6.n
            r7 = 27
            r6.<init>(r7)
            jhi.b r2 = mo3.a.g(r2, r4, r6, r5)
            r0.u = r10
            r0.f17093x = r3
            java.lang.Object r0 = vkm.q.z(r2, r0)
            if (r0 != r1) goto L67
        L66:
            return r1
        L67:
            r8 = r0
            r0 = r10
            r10 = r8
        L6a:
            com.revolut.feature.credit.card.models.CreditCard r10 = (com.revolut.feature.credit.card.models.CreditCard) r10
            if (r10 == 0) goto L70
            xw4.a r4 = r10.i
        L70:
            xw4.a r1 = xw4.a.OVERDUE
            if (r4 != r1) goto L9a
            dj0.d r10 = r10.f69795g
            java.lang.String r1 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "overdueMoney"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r2 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            com.revolut.feature.credit.card.api.navigation.CreditCardRevPointsLockedDestination r3 = new com.revolut.feature.credit.card.api.navigation.CreditCardRevPointsLockedDestination
            r3.<init>(r10, r0)
            yhi.b r10 = yhi.b.BOTTOM_DIALOG
            r0 = 2200(0x898, float:3.083E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 8
            r2.<init>(r3, r10, r0, r4)
            r1.<init>(r2)
            return r1
        L9a:
            com.revolut.retail.core.navigation.DummyCommand r10 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.t(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof bn4.t
            if (r0 == 0) goto L13
            r0 = r9
            bn4.t r0 = (bn4.t) r0
            int r1 = r0.f17094w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17094w = r1
            goto L18
        L13:
            bn4.t r0 = new bn4.t
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17094w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L5c
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            w4l.j r9 = w4l.j.f294644c
            al4.q r2 = r8.e
            om4.y3 r2 = (om4.y3) r2
            kotlinx.coroutines.flow.Flow r9 = r2.e(r9, r3)
            blh.y r2 = new blh.y
            r4 = 24
            r2.<init>(r4)
            akg.n r9 = nim.a.v(r9, r2)
            bk6.n r2 = new bk6.n
            r4 = 29
            r2.<init>(r4)
            r4 = 0
            jhi.b r9 = mo3.a.g(r9, r4, r2, r3)
            r0.f17094w = r3
            java.lang.Object r9 = vkm.q.z(r9, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            yw4.p r9 = (yw4.p) r9
            if (r9 == 0) goto L81
            java.lang.String r0 = "facility"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$CollateralMoveMoneyDestination r3 = new com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$CollateralMoveMoneyDestination
            java.lang.String r2 = r9.f317325a
            xi0.b r9 = r9.d
            com.revolut.feature.credit.card.api.navigation.a r4 = com.revolut.feature.credit.card.api.navigation.a.ADD_MONEY
            r3.<init>(r2, r9, r4)
            r6 = 0
            r7 = 61
            r2 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            return r0
        L81:
            com.revolut.retail.core.navigation.DummyCommand r9 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.u(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof bn4.u
            if (r0 == 0) goto L13
            r0 = r7
            bn4.u r0 = (bn4.u) r0
            int r1 = r0.f17096x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17096x = r1
            goto L18
        L13:
            bn4.u r0 = new bn4.u
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17096x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            bn4.d r0 = r0.u
            yhm.o.b(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            bn4.d r7 = bn4.d.f17067a
            r0.u = r7
            r0.f17096x = r3
            java.lang.Object r0 = r6.c(r0)
            if (r0 != r1) goto L41
            return r1
        L41:
            r5 = r0
            r0 = r7
            r7 = r5
        L44:
            java.lang.String r7 = (java.lang.String) r7
            r0.getClass()
            java.lang.String r0 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            com.revolut.feature.credit.card.api.navigation.CreditCardStatementBottomSheetDestination r2 = new com.revolut.feature.credit.card.api.navigation.CreditCardStatementBottomSheetDestination
            r2.<init>(r7)
            yhi.b r7 = yhi.b.BOTTOM_DIALOG
            r3 = 0
            r4 = 12
            r1.<init>(r2, r7, r3, r4)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.v(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof bn4.v
            if (r0 == 0) goto L13
            r0 = r9
            bn4.v r0 = (bn4.v) r0
            int r1 = r0.f17097w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17097w = r1
            goto L18
        L13:
            bn4.v r0 = new bn4.v
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17097w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L3b
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            r0.f17097w = r3
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r1) goto L3b
            return r1
        L3b:
            java.lang.String r9 = (java.lang.String) r9
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.credit.card.api.navigation.CreditCardSelectDueDateFlowDestination r3 = new com.revolut.feature.credit.card.api.navigation.CreditCardSelectDueDateFlowDestination
            r3.<init>(r9)
            r6 = 0
            r7 = 61
            r2 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.w(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof bn4.w
            if (r0 == 0) goto L13
            r0 = r7
            bn4.w r0 = (bn4.w) r0
            int r1 = r0.f17099x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17099x = r1
            goto L18
        L13:
            bn4.w r0 = new bn4.w
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17099x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            java.lang.String r0 = r0.u
            yhm.o.b(r7)
            goto L58
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L44
        L38:
            yhm.o.b(r7)
            r0.f17099x = r3
            java.lang.Object r7 = r6.c(r0)
            if (r7 != r1) goto L44
            goto L54
        L44:
            java.lang.String r7 = (java.lang.String) r7
            yw4.f r2 = yw4.f.IN_APP_STATEMENT
            r0.u = r7
            r0.f17099x = r4
            om4.k0 r3 = r6.i
            java.lang.Object r0 = r3.b(r7, r2, r0)
            if (r0 != r1) goto L55
        L54:
            return r1
        L55:
            r5 = r0
            r0 = r7
            r7 = r5
        L58:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r1 = "facilityId"
            if (r7 == 0) goto L6f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$InAppStatement r7 = new com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$InAppStatement
            r7.<init>(r0)
            com.revolut.retail.core.navigation.FeatureCommand r7 = gc0.c.f(r7)
            return r7
        L6f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.revolut.retail.core.navigation.FeatureCommand r7 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$Statement r1 = new com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig$Statement
            r1.<init>(r0)
            r7.<init>(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bn4.b0.x(gim.c):java.lang.Object");
    }
}
