package com.revolut.feature.topup_screen.impl.flow.init_top_up;

import cu8.r0;
import d8l.d;
import e0f.t0;
import gvc.m;
import gwe.b;
import gwe.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import owe.e;
import yki.i;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t0 f90627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final owe.b f90628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f90629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f90630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f90631t;

    public a(c inputData, t0 initTopupInteractorRevamped, owe.b bgnRestrictionDialogProvider, e topUpUnsupportedCurrencyDialogProvider, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(initTopupInteractorRevamped, "initTopupInteractorRevamped");
        Intrinsics.checkNotNullParameter(bgnRestrictionDialogProvider, "bgnRestrictionDialogProvider");
        Intrinsics.checkNotNullParameter(topUpUnsupportedCurrencyDialogProvider, "topUpUnsupportedCurrencyDialogProvider");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.o = inputData;
        this.f90627p = initTopupInteractorRevamped;
        this.f90628q = bgnRestrictionDialogProvider;
        this.f90629r = topUpUnsupportedCurrencyDialogProvider;
        this.f90630s = kycRequiredActionTransformer;
        this.f90631t = d.a(this, new ghl.c(this, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.topup_screen.impl.flow.init_top_up.a r9, gim.c r10) {
        /*
            yki.i r1 = r9.f90631t
            boolean r0 = r10 instanceof gwe.g
            if (r0 == 0) goto L15
            r0 = r10
            gwe.g r0 = (gwe.g) r0
            int r2 = r0.f147326w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.f147326w = r2
            goto L1a
        L15:
            gwe.g r0 = new gwe.g
            r0.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r0.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r0.f147326w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r10)
            goto L43
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            gwe.c r10 = r9.o
            r0.f147326w = r4
            e0f.t0 r3 = r9.f90627p
            com.revolut.feature.topup_screen.api.config.TopUpConfig r10 = r10.f147319a
            java.lang.Object r10 = r3.f(r10, r0)
            if (r10 != r2) goto L43
            return r2
        L43:
            e0f.l0 r10 = (e0f.l0) r10
            boolean r0 = r10 instanceof e0f.j0
            if (r0 == 0) goto L58
            oki.h.D2(r1)
            e0f.j0 r10 = (e0f.j0) r10
            com.revolut.retail.core.navigation.FeatureCommand r10 = r10.f121620a
            com.revolut.kompot.bridge.navigation.BridgeDestination r10 = zh9.u0.b(r10)
            r9.C1(r10)
            goto L99
        L58:
            boolean r0 = r10 instanceof e0f.k0
            if (r0 == 0) goto L79
            com.revolut.feature.topup_screen.impl.flow.init_top_up.InitTopUpFlowContract$Step$TopupFlow r2 = new com.revolut.feature.topup_screen.impl.flow.init_top_up.InitTopUpFlowContract$Step$TopupFlow
            e0f.k0 r10 = (e0f.k0) r10
            com.revolut.feature.topup_screen.common.TopUpTarget r3 = r10.f121626a
            pte.a r4 = r10.f121627b
            xi0.b r5 = r10.f121628c
            com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId r6 = r10.d
            boolean r7 = r10.e
            dj0.d r8 = r10.f
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            r0 = r9
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            goto L99
        L79:
            boolean r9 = r10 instanceof e0f.m0
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r0 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            if (r9 == 0) goto L90
            com.revolut.feature.topup_screen.impl.flow.init_top_up.InitTopUpFlowContract$Step$UnsupportedCurrencyDialog r9 = new com.revolut.feature.topup_screen.impl.flow.init_top_up.InitTopUpFlowContract$Step$UnsupportedCurrencyDialog
            e0f.m0 r10 = (e0f.m0) r10
            xi0.b r2 = r10.f121640a
            xi0.b r3 = r10.f121641b
            com.revolut.retail.core.navigation.FeatureCommand r10 = r10.f121642c
            r9.<init>(r2, r3, r10)
            oki.h.w2(r1, r9, r0)
            goto L99
        L90:
            boolean r9 = r10 instanceof e0f.l0.a
            if (r9 == 0) goto L9c
            com.revolut.feature.topup_screen.impl.flow.init_top_up.InitTopUpFlowContract$Step$BgnRestrictionsDialog r9 = com.revolut.feature.topup_screen.impl.flow.init_top_up.InitTopUpFlowContract$Step.BgnRestrictionsDialog.f90620a
            oki.h.w2(r1, r9, r0)
        L99:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L9c:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flow.init_top_up.a.I2(com.revolut.feature.topup_screen.impl.flow.init_top_up.a, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new m(this, null, 1), new gwe.d(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90631t;
    }
}
