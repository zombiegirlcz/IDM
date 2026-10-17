package com.revolut.feature.onboarding.impl.onboarding.waiting_verification;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.impl.onboarding.waiting_verification.WaitingVerificationFlowContract$Step;
import com.revolut.revolut.feature_fourthline_impl.R;
import fwj.p;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import yji.l;
import yy6.f;
import zab.s;
import zb9.b;
import zb9.d;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final WaitingVerificationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f78512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sf0.h f78513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f78514r;

    public a(WaitingVerificationFlowContract$InputData inputData, p userOnboardingInteractor, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.o = inputData;
        this.f78512p = userOnboardingInteractor;
        this.f78513q = serverErrorParser;
        z8d.h hVar = new z8d.h(6);
        this.f78514r = cp5.d.a(this, WaitingVerificationFlowContract$Step.Await.f78511a, f0.f322471a, hVar);
    }

    public static final void I2(a aVar, Throwable th10) {
        aVar.getClass();
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        Continuation continuation = null;
        rd0.d.a(c.ERROR, null, null, th10, h0Var);
        ServerError serverErrorA = aVar.f78513q.a(th10);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        int iA = i89.a.CAN_NOT_OPEN_ACCOUNT.a();
        if (numValueOf == null || numValueOf.intValue() != iA) {
            int iA2 = i89.a.CAN_NOT_OPEN_ACCOUNT_FOREIGN_APPLICANT.a();
            if (numValueOf == null || numValueOf.intValue() != iA2) {
                l.a1(aVar, aVar.X1(new y0("DIALOG_ID", new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 4)), null, null, new f(aVar, continuation, 25), 3);
                return;
            }
        }
        aVar.C2(zb9.c.f320846a);
    }

    @Override // yji.l
    public final void I1() {
        l2(new zb9.f(this, null, 0), new s(1, this, a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r8 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0067 -> B:25:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof zb9.e
            if (r0 == 0) goto L13
            r0 = r8
            zb9.e r0 = (zb9.e) r0
            int r1 = r0.f320848x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320848x = r1
            goto L18
        L13:
            zb9.e r0 = new zb9.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320848x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L6a
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            long r5 = r0.u
            yhm.o.b(r8)
            goto L54
        L38:
            yhm.o.b(r8)
            com.revolut.feature.onboarding.impl.onboarding.waiting_verification.WaitingVerificationFlowContract$InputData r8 = r7.o
            long r5 = r8.f78510a
        L3f:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            boolean r8 = skm.e0.x(r8)
            if (r8 == 0) goto L84
            r0.u = r5
            r0.f320848x = r4
            java.lang.Object r8 = skm.k0.b(r5, r0)
            if (r8 != r1) goto L54
            goto L69
        L54:
            fwj.p r8 = r7.f78512p
            t0j.a r8 = r8.f138685a
            twj.f r8 = (twj.f) r8
            r2 = 0
            ufm.i r8 = r8.d(r2)
            r0.u = r5
            r0.f320848x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            java.util.List r8 = (java.util.List) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            java.lang.Object r8 = zhm.d0.d0(r8)
            com.revolut.retail.feature.api.userauth.models.UserAuthElement r8 = (com.revolut.retail.feature.api.userauth.models.UserAuthElement) r8
            boolean r2 = r8 instanceof com.revolut.retail.feature.api.userauth.models.UserAuthElement.WaitingVerification
            if (r2 != 0) goto L7f
            zb9.c r8 = zb9.c.f320846a
            r7.C2(r8)
            goto L84
        L7f:
            com.revolut.retail.feature.api.userauth.models.UserAuthElement$WaitingVerification r8 = (com.revolut.retail.feature.api.userauth.models.UserAuthElement.WaitingVerification) r8
            long r5 = r8.f99330a
            goto L3f
        L84:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a.J2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (J2(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof zb9.g
            if (r0 == 0) goto L13
            r0 = r7
            zb9.g r0 = (zb9.g) r0
            int r1 = r0.f320850w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320850w = r1
            goto L18
        L13:
            zb9.g r0 = new zb9.g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320850w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L4d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L44
        L36:
            yhm.o.b(r7)
            r0.f320850w = r4
            r4 = 0
            java.lang.Object r7 = skm.k0.b(r4, r0)
            if (r7 != r1) goto L44
            goto L4c
        L44:
            r0.f320850w = r3
            java.lang.Object r7 = r6.J2(r0)
            if (r7 != r1) goto L4d
        L4c:
            return r1
        L4d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a.K2(gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78514r;
    }
}
