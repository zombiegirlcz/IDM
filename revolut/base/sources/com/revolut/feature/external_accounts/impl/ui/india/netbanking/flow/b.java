package com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow;

import kotlin.jvm.internal.Intrinsics;
import m84.e;
import mm6.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import sri.m;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements mm6.b {

    @NotNull
    private static final d Companion = new d();
    public final IndiaNetBankingFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f72929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f61.a f72930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f72931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gg6.a f72932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f72933t;

    public b(IndiaNetBankingFlowContract$InputData inputData, m navigator, f61.a indiaNetBankingInitiatorInteractor, wj0.a idempotencyKeyHolder, gg6.a indiaPreselectedMethodInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(indiaNetBankingInitiatorInteractor, "indiaNetBankingInitiatorInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(indiaPreselectedMethodInteractor, "indiaPreselectedMethodInteractor");
        this.o = inputData;
        this.f72929p = navigator;
        this.f72930q = indiaNetBankingInitiatorInteractor;
        this.f72931r = idempotencyKeyHolder;
        this.f72932s = indiaPreselectedMethodInteractor;
        this.f72933t = d8l.d.a(this, new e(this, 25));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r8.J2((java.lang.String) r10, r9, r6) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b r8, java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof mm6.f
            if (r0 == 0) goto L14
            r0 = r10
            mm6.f r0 = (mm6.f) r0
            int r1 = r0.f207166x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f207166x = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            mm6.f r0 = new mm6.f
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f207166x
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 == r2) goto L34
            if (r1 != r7) goto L2c
            yhm.o.b(r10)
            goto L63
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.String r9 = r6.u
            yhm.o.b(r10)
            goto L55
        L3a:
            yhm.o.b(r10)
            f61.a r1 = r8.f72930q
            com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.IndiaNetBankingFlowContract$InputData r10 = r8.o
            r3 = r2
            dj0.d r2 = r10.f72924a
            java.lang.Boolean r4 = r10.f72925b
            ve6.a r5 = r10.f72926c
            r6.u = r9
            r6.f207166x = r3
            r3 = r9
            java.lang.Object r10 = r1.w(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L54
            goto L62
        L54:
            r9 = r3
        L55:
            java.lang.String r10 = (java.lang.String) r10
            r1 = 0
            r6.u = r1
            r6.f207166x = r7
            java.lang.Object r8 = r8.J2(r10, r9, r6)
            if (r8 != r0) goto L63
        L62:
            return r0
        L63:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b.I2(com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(java.lang.String r8, java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof mm6.e
            if (r0 == 0) goto L13
            r0 = r10
            mm6.e r0 = (mm6.e) r0
            int r1 = r0.f207164x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207164x = r1
            goto L18
        L13:
            mm6.e r0 = new mm6.e
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207164x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.u
            yhm.o.b(r10)
            goto L60
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r10)
            if (r9 == 0) goto L60
            com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.IndiaNetBankingFlowContract$InputData r10 = r7.o
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r10 = r10.e
            r0.u = r8
            r0.f207164x = r3
            gg6.a r2 = r7.f72932s
            zh6.c r2 = r2.f143599a
            r2.getClass()
            zgj.i0 r3 = new zgj.i0
            r4 = 0
            r3.<init>(r2, r10, r9, r4)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r3, r0)
            if (r9 != r1) goto L56
            goto L58
        L56:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L58:
            if (r9 != r1) goto L5b
            goto L5d
        L5b:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L5d:
            if (r9 != r1) goto L60
            return r1
        L60:
            com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.IndiaNetBankingFlowContract$Step$NetBankingWebView r2 = new com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.IndiaNetBankingFlowContract$Step$NetBankingWebView
            r2.<init>(r8)
            r5 = 0
            r6 = 12
            yki.i r1 = r7.f72933t
            r3 = 1
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b.J2(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new mci.e(this, null, 11), new yi5.b(26));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        i iVar = this.f72933t;
        if (iVar.d() != null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        iVar.n();
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72933t;
    }
}
