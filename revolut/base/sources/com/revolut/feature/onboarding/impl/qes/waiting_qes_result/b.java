package com.revolut.feature.onboarding.impl.qes.waiting_qes_result;

import cli.g;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mc9.d;
import mc9.n;
import mc9.q;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pre.c;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements mc9.b {

    @NotNull
    public static final mc9.h Companion = new mc9.h();
    public final o99.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f78537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w39.b f78538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final WaitingForQesResultScreenContract$InputData f78539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f78540s;

    public b(o99.a eSignatureInteractor, c termsInteractor, w39.b locationInteractor, WaitingForQesResultScreenContract$InputData inputData, q stateMapper) {
        Intrinsics.checkNotNullParameter(eSignatureInteractor, "eSignatureInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = eSignatureInteractor;
        this.f78537p = termsInteractor;
        this.f78538q = locationInteractor;
        this.f78539r = inputData;
        d.Companion.getClass();
        this.f78540s = mra.d.b(this, d.f204310c, stateMapper, null, false, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r1 == r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        if (r20.N2(r1, r4) == r5) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b.J2(com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new lo.c(this, (Continuation) null, 29), new lrk.h(1, this, b.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 21));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(gim.c r11, java.lang.String r12, java.util.List r13) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b.I2(gim.c, java.lang.String, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof mc9.l
            if (r0 == 0) goto L13
            r0 = r8
            mc9.l r0 = (mc9.l) r0
            int r1 = r0.f204322w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204322w = r1
            goto L18
        L13:
            mc9.l r0 = new mc9.l
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204322w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L64
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreenContract$InputData r8 = r7.f78539r
            boolean r8 = r8.f
            if (r8 == 0) goto L7d
            w39.b r8 = r7.f78538q
            r2 = r8
            z39.b r2 = (z39.b) r2
            c49.d r2 = r2.f319221b
            rfm.m r2 = r2.c()
            r4 = 0
            r6 = 3
            efm.i r8 = w39.b.a(r8, r4, r6)
            r8.getClass()
            qfm.d0 r4 = new qfm.d0
            r4.<init>(r8)
            rfm.z r8 = r2.m(r4)
            java.lang.String r2 = "switchIfEmpty(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.f204322w = r3
            java.lang.Object r8 = nim.a.h(r8, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r8 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r8
            pc9.b r0 = pc9.c.Companion
            kotlin.jvm.internal.Intrinsics.h(r8)
            r0.getClass()
            java.lang.String r0 = "location"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            pc9.c r0 = new pc9.c
            double r1 = r8.f78066a
            double r3 = r8.f78067b
            r0.<init>(r1, r3)
            return r0
        L7d:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b.K2(gim.c):java.lang.Object");
    }

    public final void L2(Throwable th10) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        l.a1(this, X1(new y0("DIALOG_ID", new z(new TextLocalisedClause(R$string.qes_error_dialog_title, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 4)), new n(2, this, b.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 4, 0), null, new lr.l(this, th10, (Continuation) null, 15), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mc9.m
            if (r0 == 0) goto L13
            r0 = r7
            mc9.m r0 = (mc9.m) r0
            int r1 = r0.f204323w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204323w = r1
            goto L18
        L13:
            mc9.m r0 = new mc9.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204323w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreenContract$InputData r7 = r5.f78539r
            java.util.List r2 = r7.f78532b
            com.revolut.feature.onboarding.api.esignature.models.ESignatureWorkflowConfiguration r7 = r7.e
            o99.a r4 = r5.o
            ufm.n r6 = r4.d(r2, r7, r6)
            r0.f204323w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess r7 = (com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess) r7
            kc9.h r6 = new kc9.h
            r0 = 1
            r6.<init>(r7, r0)
            cli.y r0 = r5.f78540s
            r5.H2(r0, r6)
            kotlin.jvm.internal.Intrinsics.h(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b.M2(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        if (skm.k0.b(1000, r2) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ff -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b.N2(com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof mc9.p
            if (r0 == 0) goto L13
            r0 = r7
            mc9.p r0 = (mc9.p) r0
            int r1 = r0.f204328w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204328w = r1
            goto L18
        L13:
            mc9.p r0 = new mc9.p
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204328w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            com.revolut.feature.onboarding.impl.qes_terms.data.QesTermsOtpTask r7 = new com.revolut.feature.onboarding.impl.qes_terms.data.QesTermsOtpTask
            java.lang.String r5 = r5.f78147a
            r7.<init>(r5)
            r0.f204328w = r3
            o99.a r5 = r4.o
            r2 = 0
            java.lang.Object r5 = r5.b(r7, r6, r2, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            m9l.d r5 = new m9l.d
            r6 = 24
            r5.<init>(r6)
            cli.y r6 = r4.f78540s
            r4.H2(r6, r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b.O2(com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final g getState() {
        return this.f78540s;
    }
}
