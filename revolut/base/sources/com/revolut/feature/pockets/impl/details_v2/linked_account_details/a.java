package com.revolut.feature.pockets.impl.details_v2.linked_account_details;

import cea.k;
import cea.q;
import cea.v;
import cea.z;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import efm.d0;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import le6.c;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rea.m;
import rp0.g1;
import uea.f;
import vi0.b;
import vkm.z1;
import w4l.i;
import wsg.n;
import xg6.j;
import xg6.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements k {

    @NotNull
    public static final q Companion = new q();
    public final b A;
    public final f80.a B;
    public final c C;
    public final com.revolut.feature.external_accounts.api.navigation.a D;
    public final s70.a E;
    public final rh6.b F;
    public final l61.a G;
    public final z1 H;
    public final y I;
    public final com.revolut.kompot.navigable.vc.modal.a J;
    public final LinkedAccountDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f80816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f80817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r70.c f80818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final oe6.a f80819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f80820t;
    public final n u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f80821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f80822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zca.b f80823y;
    public final g1 z;

    public a(LinkedAccountDetailsScreenContract$InputData inputData, z stateMapper, c70.a clipboard, r70.c hapticEngine, oe6.a externalInstitutionsInteractor, l linkExternalInstitutionsInteractor, n walletInteractor, gte.a featureToggleInteractor, m pocketDetailsInteractor, f pocketDetailsRepository, zca.b revokeConfirmationDialogProvider, g1 shotDialogDisplayer, b accountIdProvider, f80.a uriHelper, c linkBankApplicationDialogModelFactory, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, s70.a intentProvider, rh6.b institutionAvailabilityStringProvider, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsInteractor, "linkExternalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsRepository, "pocketDetailsRepository");
        Intrinsics.checkNotNullParameter(revokeConfirmationDialogProvider, "revokeConfirmationDialogProvider");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(accountIdProvider, "accountIdProvider");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(linkBankApplicationDialogModelFactory, "linkBankApplicationDialogModelFactory");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(institutionAvailabilityStringProvider, "institutionAvailabilityStringProvider");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.o = inputData;
        this.f80816p = stateMapper;
        this.f80817q = clipboard;
        this.f80818r = hapticEngine;
        this.f80819s = externalInstitutionsInteractor;
        this.f80820t = linkExternalInstitutionsInteractor;
        this.u = walletInteractor;
        this.v = featureToggleInteractor;
        this.f80821w = pocketDetailsInteractor;
        this.f80822x = pocketDetailsRepository;
        this.f80823y = revokeConfirmationDialogProvider;
        this.z = shotDialogDisplayer;
        this.A = accountIdProvider;
        this.B = uriHelper;
        this.C = linkBankApplicationDialogModelFactory;
        this.D = externalPocketNavigationFactory;
        this.E = intentProvider;
        this.F = institutionAvailabilityStringProvider;
        this.G = userCompanyInteractor;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.H = z1VarB;
        this.I = d.b(this, new cea.f(inputData.f80812a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.J = e.a(this, new c9f.c(this, 13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a r9, gim.c r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof cea.r
            if (r0 == 0) goto L16
            r0 = r10
            cea.r r0 = (cea.r) r0
            int r1 = r0.f23456w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f23456w = r1
            goto L1b
        L16:
            cea.r r0 = new cea.r
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23456w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r10)
            goto L6a
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            yhm.o.b(r10)
            goto L4f
        L39:
            yhm.o.b(r10)
            com.revolut.feature.pockets.impl.details_v2.linked_account_details.LinkedAccountDetailsScreenContract$InputData r10 = r9.o
            io3.d r10 = r10.f80812a
            java.lang.String r10 = r10.f163145a
            ufm.i r10 = r9.L2(r10)
            r0.f23456w = r4
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L4f
            goto L69
        L4f:
            java.lang.String r10 = (java.lang.String) r10
            oe6.a r2 = r9.f80819s
            kotlin.jvm.internal.Intrinsics.h(r10)
            r0.f23456w = r3
            xg6.j r2 = (xg6.j) r2
            r71.a r2 = r2.f305582a
            w21.o r2 = (w21.o) r2
            java.lang.Object r10 = r2.a(r10, r0)
            if (r10 != r1) goto L65
            goto L67
        L65:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L67:
            if (r10 != r1) goto L6a
        L69:
            return r1
        L6a:
            mii.k r2 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r10 = com.revolut.feature.pockets.impl.R$string.open_banking_linked_confirm_account_widget_toast_success
            r0 = 14
            r1 = 0
            r4.<init>(r10, r1, r1, r0)
            r7 = 0
            r8 = 28
            java.lang.String r3 = "ID_CONFIRM_SUCCESS"
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.X1(r2)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pockets.impl.details_v2.linked_account_details.a.I2(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a8, code lost:
    
        if (r1 != r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pockets.impl.details_v2.linked_account_details.a.J2(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable K2(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof cea.t
            if (r0 == 0) goto L13
            r0 = r5
            cea.t r0 = (cea.t) r0
            int r1 = r0.f23460w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23460w = r1
            goto L18
        L13:
            cea.t r0 = new cea.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23460w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L57
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L57
            l61.a r4 = r4.G     // Catch: java.lang.Throwable -> L57
            ang.b r4 = (ang.b) r4     // Catch: java.lang.Throwable -> L57
            efm.d0 r4 = r4.a()     // Catch: java.lang.Throwable -> L57
            r0.f23460w = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = nim.a.b(r4, r0)     // Catch: java.lang.Throwable -> L57
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)     // Catch: java.lang.Throwable -> L57
            l71.d r5 = (l71.d) r5     // Catch: java.lang.Throwable -> L57
            boolean r4 = l71.f.e(r5)     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L57
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L57
            goto L5e
        L57:
            r4 = move-exception
            yhm.m$a r5 = yhm.m.INSTANCE
            yhm.n r4 = yhm.o.a(r4)
        L5e:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r0 = r4 instanceof yhm.n
            if (r0 == 0) goto L65
            r4 = r5
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pockets.impl.details_v2.linked_account_details.a.K2(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a, gim.c):java.io.Serializable");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, nim.a.u(new v(this, continuation, 2), rd0.e.b(((j) this.f80819s).j(i.f294643c))), null, null, new v(this, continuation, 3), 3);
        yji.l.a1(this, vkm.q.Q(this.H, new a32.b(continuation, this, this.o.f80812a, 21)), null, null, new v(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.J;
    }

    public final ufm.i L2(String str) {
        d0 d0VarZ = this.u.z(this.A.f289492a, str);
        cd0.c cVar = new cd0.c(new ccg.c(18), 24);
        d0VarZ.getClass();
        ufm.i iVar = new ufm.i(d0VarZ, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    @Override // cli.z
    public final g getState() {
        return this.I;
    }
}
