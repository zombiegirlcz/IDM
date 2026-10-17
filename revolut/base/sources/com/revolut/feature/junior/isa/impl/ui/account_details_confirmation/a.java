package com.revolut.feature.junior.isa.impl.ui.account_details_confirmation;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import da8.g;
import da8.i;
import da8.p;
import da8.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lh8.f;
import mra.d;
import oki.h;
import prl.e;
import rh8.l;
import rh8.o0;
import vii.b;
import vkm.q;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements i {
    public final JuniorAccountDetailsConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f76752p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f76753q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hj8.a f76754r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f76755s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f76756t;
    public final q78.e u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f76757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f76758x;

    public a(JuniorAccountDetailsConfirmationScreenContract$InputData inputData, o0 termsProvider, f termsUiFactory, hj8.a juniorProfileInteractor, e juniorCreationInteractor, l juniorDetailsValidationInteractor, q78.e juniorAccountDestinationResolver, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsProvider, "termsProvider");
        Intrinsics.checkNotNullParameter(termsUiFactory, "termsUiFactory");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorCreationInteractor, "juniorCreationInteractor");
        Intrinsics.checkNotNullParameter(juniorDetailsValidationInteractor, "juniorDetailsValidationInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f76752p = termsProvider;
        this.f76753q = termsUiFactory;
        this.f76754r = juniorProfileInteractor;
        this.f76755s = juniorCreationInteractor;
        this.f76756t = juniorDetailsValidationInteractor;
        this.u = juniorAccountDestinationResolver;
        this.v = d.b(this, new g(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), "", "", Address.INSTANCE.getEMPTY(), r0.g(), false), stateMapper, null, false, 12);
        this.f76757w = hx7.e.a(this, new cwj.h(this, 16));
        this.f76758x = new b();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof da8.m
            if (r0 == 0) goto L14
            r0 = r9
            da8.m r0 = (da8.m) r0
            int r1 = r0.f112488x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f112488x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            da8.m r0 = new da8.m
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f112488x
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.String r8 = r5.u
            yhm.o.b(r9)
            goto L48
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r9)
            q78.e r1 = r7.u
            r5.u = r8
            r5.f112488x = r2
            r3 = 0
            r4 = 0
            r6 = 6
            r2 = r8
            java.lang.Object r9 = u68.b.c(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L47
            return r0
        L47:
            r8 = r2
        L48:
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r9 = (com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination.JustShow) r9
            com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination$PostOnboarding r0 = new com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination$PostOnboarding     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L6f
            com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination$PostOnboarding$InputData r1 = new com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination$PostOnboarding$InputData     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L6f
            r1.<init>(r8)     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L6f
            r0.<init>(r1)     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L6f
            r7.C1(r0)     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L6f
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L6f
            goto L67
        L5a:
            r0 = move-exception
            r8 = r0
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r8, r0)
            r8 = r2
        L67:
            if (r8 != 0) goto L6c
            r7.C1(r9)
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L6f:
            r0 = move-exception
            r7 = r0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a.I2(com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new p(this, continuation, 1), new yi5.b(26));
        yji.l.a1(this, q.Q(this.f76758x, new cvi.i(continuation, this, 14)), null, null, new da8.q(this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f76757w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
