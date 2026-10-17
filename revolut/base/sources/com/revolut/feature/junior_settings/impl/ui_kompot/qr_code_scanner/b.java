package com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner;

import com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import to8.d;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements to8.b {

    @NotNull
    public static final d Companion = new d();
    public final JuniorAuthQrScannerFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f77320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q06.d f77321q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f77322r;

    public b(JuniorAuthQrScannerFlowContract$InputData inputData, hj8.a juniorProfileInteractor, q06.d deeplinkParser) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.o = inputData;
        this.f77320p = juniorProfileInteractor;
        this.f77321q = deeplinkParser;
        ta8.a aVar = new ta8.a(this, 28);
        this.f77322r = cp5.d.a(this, JuniorAuthQrScannerFlowContract$Step.QrScanner.f77317a, f0.f322471a, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b r8, java.lang.String r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof to8.e
            if (r0 == 0) goto L13
            r0 = r10
            to8.e r0 = (to8.e) r0
            int r1 = r0.f272561x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f272561x = r1
            goto L18
        L13:
            to8.e r0 = new to8.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f272561x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r9 = r0.u
            yhm.o.b(r10)
            goto L88
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r10)
            q06.d r10 = r8.f77321q
            s06.c r10 = (s06.c) r10
            jf0.c r9 = r10.d(r9)
            if (r9 == 0) goto Lac
            java.lang.String r10 = r9.e
            q06.e r2 = q06.e.ChallengesQrDelegated
            java.lang.String r2 = r2.c()
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r10, r2)
            r2 = 0
            if (r10 == 0) goto L4e
            goto L4f
        L4e:
            r9 = r2
        L4f:
            if (r9 != 0) goto L52
            goto Lac
        L52:
            r10 = 3
            java.lang.String r10 = r9.e(r10)
            java.util.HashMap r9 = r9.d
            java.lang.String r4 = "subjectId"
            java.lang.Object r9 = r9.get(r4)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L91
            r0.u = r10
            r0.f272561x = r3
            hj8.a r9 = r8.f77320p
            com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlowContract$InputData r4 = r8.o
            java.lang.String r4 = r4.f77312a
            w4l.j r5 = w4l.j.f294644c
            akg.n r9 = hj8.a.a(r9, r4, r5)
            tj9.d r4 = new tj9.d
            r5 = 20
            r4.<init>(r5)
            jhi.b r9 = mo3.a.g(r9, r2, r4, r3)
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L85
            return r1
        L85:
            r7 = r10
            r10 = r9
            r9 = r7
        L88:
            com.revolut.feature.junior_profile.api.models.a r10 = (com.revolut.feature.junior_profile.api.models.a) r10
            java.lang.String r10 = r10.getF77098a()
            r7 = r10
            r10 = r9
            r9 = r7
        L91:
            r8.s1()
            yki.a r1 = r8.f77322r
            com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlowContract$Step$QrCodeChallenge r2 = new com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlowContract$Step$QrCodeChallenge
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r2.<init>(r10, r9)
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            r0 = r8
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        Lac:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b.I2(com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77322r;
    }
}
