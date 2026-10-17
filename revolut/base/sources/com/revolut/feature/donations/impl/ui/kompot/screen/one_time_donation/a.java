package com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation;

import aa6.c;
import aii.m;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mb6.k;
import od0.i;
import oki.h;
import sa6.w;
import sc6.d;
import ukm.f;
import vkm.q;
import vkm.z1;
import w80.b;
import wsg.n;
import zb6.l;
import zb6.u;
import zb6.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements l {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final z1 B;
    public final z1 C;
    public final OneTimeDonationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f72088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f72089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f72090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f72091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w f72092t;
    public final sc6.b u;
    public final k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kb6.b f72093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cc6.c f72094x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final bb6.d f72095y;
    public final y z;

    public a(OneTimeDonationScreenContract$InputData inputData, b moneyEditAmountFormatter, d donationErrorDialogMapper, n walletInteractor, c donationsInteractor, w payWithAnyInteractor, sc6.b confirmDonationDialogMapper, k donationsAcceptTermsInputDataFactory, kb6.b donationResultHandlerExtension, cc6.c donationParametersExtractor, bb6.d focusManager, zb6.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moneyEditAmountFormatter, "moneyEditAmountFormatter");
        Intrinsics.checkNotNullParameter(donationErrorDialogMapper, "donationErrorDialogMapper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(payWithAnyInteractor, "payWithAnyInteractor");
        Intrinsics.checkNotNullParameter(confirmDonationDialogMapper, "confirmDonationDialogMapper");
        Intrinsics.checkNotNullParameter(donationsAcceptTermsInputDataFactory, "donationsAcceptTermsInputDataFactory");
        Intrinsics.checkNotNullParameter(donationResultHandlerExtension, "donationResultHandlerExtension");
        Intrinsics.checkNotNullParameter(donationParametersExtractor, "donationParametersExtractor");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f72088p = moneyEditAmountFormatter;
        this.f72089q = donationErrorDialogMapper;
        this.f72090r = walletInteractor;
        this.f72091s = donationsInteractor;
        this.f72092t = payWithAnyInteractor;
        this.u = confirmDonationDialogMapper;
        this.v = donationsAcceptTermsInputDataFactory;
        this.f72093w = donationResultHandlerExtension;
        this.f72094x = donationParametersExtractor;
        this.f72095y = focusManager;
        this.z = mra.d.b(this, new zb6.h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f72082b), stateMapper, null, false, 12);
        this.A = e.a(this, new yz4.b(this, 28));
        f fVar = f.DROP_OLDEST;
        z1 z1VarB = q.b(0, 2, fVar);
        z1VarB.k(Unit.f186387a);
        this.B = z1VarB;
        z1 z1VarB2 = q.b(0, 2, fVar);
        i.Companion.getClass();
        z1VarB2.k(i.f224256b);
        this.C = z1VarB2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof zb6.w
            if (r0 == 0) goto L13
            r0 = r6
            zb6.w r0 = (zb6.w) r0
            int r1 = r0.f320830y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320830y = r1
            goto L18
        L13:
            zb6.w r0 = new zb6.w
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f320828w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320830y
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.revolut.kompot.navigable.vc.modal.a r5 = r0.v
            com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a r0 = r0.u
            yhm.o.b(r6)
            r4 = r6
            r6 = r5
            r5 = r0
            r0 = r4
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.revolut.kompot.navigable.vc.modal.a r6 = r5.A
            mb6.k r2 = r5.v
            r0.u = r5
            r0.v = r6
            r0.f320830y = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData r0 = (com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData) r0
            com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreenContract$ModalStep$AcceptTerms r1 = new com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreenContract$ModalStep$AcceptTerms
            r1.<init>(r0)
            oki.h.x2(r5, r6, r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a.I2(com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        u uVar = new u(0, this, continuation);
        z1 z1Var = this.B;
        yji.l.a1(this, q.Q(z1Var, uVar), null, null, new v(2, 4, a.class, this, "updateSelectedPocketData", "updateSelectedPocketData(Lcom/revolut/data/model/Data;)V"), 3);
        int i = 4;
        yji.l.a1(this, q.Q(z1Var, new u(1, this, continuation)), null, null, new ys.i(2, this, a.class, "updateExchangeInfo", "updateExchangeInfo(Lcom/revolut/data/model/Data;)V", i, 15), 3);
        yji.l.a1(this, q.Q(z1Var, new u(2, this, continuation)), null, null, new ys.i(2, this, a.class, "updateSuggestions", "updateSuggestions(Lcom/revolut/data/model/Data;)V", i, 16), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // cli.z
    public final g getState() {
        return this.z;
    }

    @Override // yji.l
    public final aii.n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof kb6.a)) {
            return super.o2(event);
        }
        B2();
        return null;
    }
}
