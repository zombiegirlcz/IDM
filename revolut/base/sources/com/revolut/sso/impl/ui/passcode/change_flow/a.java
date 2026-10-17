package com.revolut.sso.impl.ui.passcode.change_flow;

import akl.f1;
import akl.l;
import bjl.o0;
import bjl.p0;
import com.revolut.sso.api.passcode.change.ChangePasscodeInputData;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import xif.k;
import xlb.o;
import xnl.b;
import yki.i;
import ynl.c;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements b {
    public final ChangePasscodeInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f106594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f106595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p0 f106596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f1 f106597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rql.a f106598t;
    public final c u;
    public final akl.o0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f106599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f106600x;

    public a(ChangePasscodeInputData inputData, l claimsRepository, o0 revolutSsoAuthErrorHandler, p0 revolutSsoDependenciesProvider, f1 sessionTokenRepository, rql.a ssoReauthenticationRepository, c ssoServerErrorPasscodeRelatedToDialogMapper, akl.o0 userInfoRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(claimsRepository, "claimsRepository");
        Intrinsics.checkNotNullParameter(revolutSsoAuthErrorHandler, "revolutSsoAuthErrorHandler");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(sessionTokenRepository, "sessionTokenRepository");
        Intrinsics.checkNotNullParameter(ssoReauthenticationRepository, "ssoReauthenticationRepository");
        Intrinsics.checkNotNullParameter(ssoServerErrorPasscodeRelatedToDialogMapper, "ssoServerErrorPasscodeRelatedToDialogMapper");
        Intrinsics.checkNotNullParameter(userInfoRepository, "userInfoRepository");
        this.o = inputData;
        this.f106594p = claimsRepository;
        this.f106595q = revolutSsoAuthErrorHandler;
        this.f106596r = revolutSsoDependenciesProvider;
        this.f106597s = sessionTokenRepository;
        this.f106598t = ssoReauthenticationRepository;
        this.u = ssoServerErrorPasscodeRelatedToDialogMapper;
        this.v = userInfoRepository;
        this.f106599w = d8l.d.a(this, new k(this, 14));
        this.f106600x = e.b(this, new ChangePasscodeFlowContract$State("", ""));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        if (d9.e1.f0(r8, r2, r3, r4, r5, r6, r7) == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.sso.impl.ui.passcode.change_flow.a r8, boolean r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof xnl.d
            if (r0 == 0) goto L14
            r0 = r10
            xnl.d r0 = (xnl.d) r0
            int r1 = r0.f307516x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f307516x = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            xnl.d r0 = new xnl.d
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f307516x
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r10)
            goto L87
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            boolean r9 = r7.u
            yhm.o.b(r10)
            goto L4c
        L3a:
            yhm.o.b(r10)
            bjl.p0 r10 = r8.f106596r
            r7.u = r9
            r7.f307516x = r3
            rqk.k r10 = (rqk.k) r10
            java.lang.Object r10 = r10.e(r7)
            if (r10 != r0) goto L4c
            goto L86
        L4c:
            java.lang.String r10 = (java.lang.String) r10
            r1 = 0
            if (r10 != 0) goto L61
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Unable to get user's phone for passcode validation"
            r4.<init>(r5)
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.WARNING
            rd0.d.a(r6, r1, r1, r4, r5)
        L61:
            r4 = r2
            cjl.s r2 = cjl.s.GLOBAL
            r5 = r3
            bjl.o0 r3 = r8.f106595q
            r6 = r4
            xnl.e r4 = new xnl.e
            r4.<init>(r8, r1, r5)
            et0.q0 r5 = new et0.q0
            r1 = 12
            r5.<init>(r8, r9, r10, r1)
            r10 = r6
            xge.h r6 = new xge.h
            r1 = 5
            r6.<init>(r8, r1)
            r7.u = r9
            r7.f307516x = r10
            r1 = r8
            java.lang.Object r8 = d9.e1.f0(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L87
        L86:
            return r0
        L87:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.passcode.change_flow.a.I2(com.revolut.sso.impl.ui.passcode.change_flow.a, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.sso.impl.ui.passcode.change_flow.a r20, znl.c r21, gim.c r22) {
        /*
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof xnl.g
            if (r2 == 0) goto L17
            r2 = r1
            xnl.g r2 = (xnl.g) r2
            int r3 = r2.f307520w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f307520w = r3
            goto L1c
        L17:
            xnl.g r2 = new xnl.g
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f307520w
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto L49
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            yhm.o.b(r1)
            xb4.g r1 = new xb4.g
            r4 = 10
            r7 = r21
            r1.<init>(r0, r7, r6, r4)
            r2.f307520w = r5
            java.lang.Object r1 = ue8.c.f0(r0, r1, r2)
            if (r1 != r3) goto L49
            return r3
        L49:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L85
            nii.y0 r1 = new nii.y0
            nii.j0 r7 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.sso.api.R$string.revolut_sso_passcode_change_success_title
            r3 = 14
            r8.<init>(r2, r6, r6, r3)
            r18 = 0
            r19 = 4094(0xffe, float:5.737E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = 0
            r3 = 5
            r1.<init>(r6, r7, r2, r3)
            kotlinx.coroutines.flow.Flow r1 = r0.X1(r1)
            xnl.c r4 = new xnl.c
            r2 = 1
            r4.<init>(r0, r6, r2)
            r5 = 3
            r2 = 0
            r3 = 0
            yji.l.a1(r0, r1, r2, r3, r4, r5)
        L85:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.passcode.change_flow.a.J2(com.revolut.sso.impl.ui.passcode.change_flow.a, znl.c, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() throws Throwable {
        this.f106598t.clear();
        l2(new mt8.b(this, false, null, 17), new o(1, this, a.class, "handleInitPasscodeSubmissionError", "handleInitPasscodeSubmissionError(Ljava/lang/Throwable;)Z", 0, 7));
    }

    @Override // qki.e
    public final d getState() {
        return this.f106600x;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106599w;
    }
}
