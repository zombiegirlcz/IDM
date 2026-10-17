package com.revolut.feature.topup_screen.impl.flow.topup_methods;

import ang.f;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$Step;
import com.revolut.revolut.feature_fourthline_impl.R;
import gim.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.l0;
import nii.y0;
import oki.h;
import q06.l;
import wsg.n;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends h implements hwe.b {
    public final l A;
    public final l2j.a B;
    public final gte.a C;
    public final yki.a D;
    public final TopupMethodsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f90660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mt8.d f90661q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sze.f f90662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z71.a f90663s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f90664t;
    public final tze.a u;
    public final kwe.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f90665w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xoj.a f90666x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final jwe.a f90667y;
    public final vte.a z;

    public d(TopupMethodsFlowContract$InputData inputData, f userInteractor, mt8.d kycInteractor, sze.f navigationFactory, z71.a revolutBankAccountsRepository, n walletInteractor, tze.a selectedCurrencyRelay, kwe.b moveMoneyTargetPocketMapper, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, xoj.a featuresInteractor, jwe.a topUpMethodRestrictionsDialogProvider, vte.a topUpInteractor, l deeplinkRouter, l2j.a currencyChooserFlowFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(revolutBankAccountsRepository, "revolutBankAccountsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(selectedCurrencyRelay, "selectedCurrencyRelay");
        Intrinsics.checkNotNullParameter(moveMoneyTargetPocketMapper, "moveMoneyTargetPocketMapper");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(topUpMethodRestrictionsDialogProvider, "topUpMethodRestrictionsDialogProvider");
        Intrinsics.checkNotNullParameter(topUpInteractor, "topUpInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f90660p = userInteractor;
        this.f90661q = kycInteractor;
        this.f90662r = navigationFactory;
        this.f90663s = revolutBankAccountsRepository;
        this.f90664t = walletInteractor;
        this.u = selectedCurrencyRelay;
        this.v = moveMoneyTargetPocketMapper;
        this.f90665w = externalPocketNavigationFactory;
        this.f90666x = featuresInteractor;
        this.f90667y = topUpMethodRestrictionsDialogProvider;
        this.z = topUpInteractor;
        this.A = deeplinkRouter;
        this.B = currencyChooserFlowFactory;
        this.C = featureToggleInteractor;
        hw9.b bVar = new hw9.b(this, 1);
        this.D = cp5.d.a(this, TopupMethodsFlowContract$Step.TopupMethods.f90650a, f0.f322471a, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.topup_screen.impl.flow.topup_methods.d r11, java.lang.String r12, gim.c r13) {
        /*
            com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$InputData r0 = r11.o
            boolean r1 = r13 instanceof hwe.z
            if (r1 == 0) goto L15
            r1 = r13
            hwe.z r1 = (hwe.z) r1
            int r2 = r1.f156166w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f156166w = r2
            goto L1a
        L15:
            hwe.z r1 = new hwe.z
            r1.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f156166w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r13)
            goto L74
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            yhm.o.b(r13)
            xi0.a r13 = xi0.b.Companion
            r13.getClass()
            xi0.b r6 = xi0.a.a(r12)
            boolean r12 = cp5.d.z(r6)
            if (r12 != 0) goto L82
            boolean r12 = cp5.d.y(r6)
            if (r12 == 0) goto L4a
            goto L82
        L4a:
            com.revolut.feature.topup_screen.common.TopUpTarget r12 = r0.f90634c
            com.revolut.core.model.account.AccountId r13 = e1f.c.a(r12)
            wsg.n r5 = r11.f90664t
            io3.l r7 = e1f.c.b(r12)
            com.revolut.core.model.account.AccountId r9 = e1f.c.a(r12)
            r10 = 28
            r8 = 0
            efm.d0 r12 = osg.b.r(r5, r6, r7, r8, r9, r10)
            hsa.l r0 = new hsa.l
            r3 = 3
            r0.<init>(r11, r3, r6, r13)
            ufm.i r12 = ue0.e.D(r12, r0)
            r1.f156166w = r4
            java.lang.Object r13 = nim.a.b(r12, r1)
            if (r13 != r2) goto L74
            return r2
        L74:
            io3.d r13 = (io3.d) r13
            hwe.j r12 = new hwe.j
            kotlin.jvm.internal.Intrinsics.h(r13)
            r12.<init>(r13)
            r11.C2(r12)
            goto L9d
        L82:
            hwe.f r12 = new hwe.f
            com.revolut.retail.core.navigation.FeatureCommand r13 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig r5 = new com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig
            r9 = 0
            r10 = 62
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r13.<init>(r5)
            com.revolut.kompot.bridge.navigation.BridgeDestination r13 = zh9.u0.b(r13)
            r12.<init>(r13)
            r11.C2(r12)
        L9d:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flow.topup_methods.d.I2(com.revolut.feature.topup_screen.impl.flow.topup_methods.d, java.lang.String, gim.c):java.lang.Object");
    }

    public static final void J2(d dVar) {
        yji.l.b1(dVar, dVar.X1(new y0(null, new l0(new TextLocalisedClause(R.string.topup_kyc_request_title, null, null, 14), null, null, new TextLocalisedClause(R.string.topup_kyc_request_action, null, null, 14), new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), null, false, null, 996), false, 5)), null, new hp2.d(dVar, null, 14), 3);
    }

    public static final void K2(d dVar) {
        dVar.X1(new y0(null, new g0(new TextLocalisedClause(R.string.topup_kyc_pending_title, null, null, 14), new TextLocalisedClause(R.string.topup_kyc_pending_subtitle, null, null, 14), null, new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), null, null, null, null, false, null, false, null, 16372), false, 5));
    }

    public static final Object L2(d dVar, TopupMethod topupMethod, String str, Function0 function0, i iVar) {
        Object objP2 = dVar.p2(iVar, new c(dVar, function0, topupMethod, str, null));
        return objP2 == fim.a.COROUTINE_SUSPENDED ? objP2 : Unit.f186387a;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.D;
    }
}
