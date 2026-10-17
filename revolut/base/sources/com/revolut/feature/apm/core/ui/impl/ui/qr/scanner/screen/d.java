package com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen;

import cli.n;
import cli.y;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState;
import e60.s;
import g12.l;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n32.g;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import t38.e;
import vkm.q;
import vkm.t0;
import x32.f;
import x32.i;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends h implements x32.d {

    @NotNull
    public static final f Companion = new f();
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ar2.c f62392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q12.a f62393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n32.f f62394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n32.a f62395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f62396t;

    public d(l qrHandler, ar2.c frameProcessor, q12.a apmErrorProvider, n32.f qrFileDetectorInteractor, n32.a qrDialogModelProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        Intrinsics.checkNotNullParameter(frameProcessor, "frameProcessor");
        Intrinsics.checkNotNullParameter(apmErrorProvider, "apmErrorProvider");
        Intrinsics.checkNotNullParameter(qrFileDetectorInteractor, "qrFileDetectorInteractor");
        Intrinsics.checkNotNullParameter(qrDialogModelProvider, "qrDialogModelProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = qrHandler;
        this.f62392p = frameProcessor;
        this.f62393q = apmErrorProvider;
        this.f62394r = qrFileDetectorInteractor;
        this.f62395s = qrDialogModelProvider;
        this.f62396t = mra.d.b(this, new x32.c(QrScanningScreenContract$ProcessingState.Detecting.f62385a), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d r5, java.lang.Throwable r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof x32.g
            if (r0 == 0) goto L13
            r0 = r7
            x32.g r0 = (x32.g) r0
            int r1 = r0.f302626w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302626w = r1
            goto L18
        L13:
            x32.g r0 = new x32.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302626w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            if (r6 == 0) goto L3e
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            r4 = 0
            rd0.d.a(r2, r4, r4, r6, r7)
        L3e:
            com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState$Error r7 = new com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState$Error
            r7.<init>(r6)
            r5.M2(r7)
            r0.f302626w = r3
            r6 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r6 = skm.k0.b(r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r5.L2()
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d.I2(com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d, java.lang.Throwable, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d r5, java.lang.Throwable r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof x32.h
            if (r0 == 0) goto L13
            r0 = r7
            x32.h r0 = (x32.h) r0
            int r1 = r0.f302627w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302627w = r1
            goto L18
        L13:
            x32.h r0 = new x32.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302627w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            if (r6 == 0) goto L3e
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            r4 = 0
            rd0.d.a(r2, r4, r4, r6, r7)
        L3e:
            com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState$Error r7 = new com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState$Error
            r7.<init>(r6)
            r5.M2(r7)
            r0.f302627w = r3
            r6 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r6 = skm.k0.b(r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState$Detecting r6 = com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState.Detecting.f62385a
            r5.M2(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d.J2(com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d, java.lang.Throwable, gim.c):java.lang.Object");
    }

    public final void K2(Throwable th10) {
        z zVarA;
        Throwable illegalStateException = th10 == null ? new IllegalStateException("Unknown camera exception") : th10;
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        M2(new QrScanningScreenContract$ProcessingState.Error(th10));
        if (th10 == null || (zVarA = this.f62393q.a(th10, false)) == null) {
            return;
        }
        X1(new y0("ERROR_DIALOG_ID", zVarA, false, 4));
    }

    public final void L2() {
        M2(QrScanningScreenContract$ProcessingState.Detecting.f62385a);
        yji.l.a1(this, q.H(new i(this, null, 0), new t0(new e(kii.e.t(this.f62392p.f8507g, "hide(...)"), 24, this.f62396t.B(new x29.a(9)), new a(3, null)), 1)), new i(this, null, 1), null, new b(this, null), 2);
    }

    public final void M2(QrScanningScreenContract$ProcessingState qrScanningScreenContract$ProcessingState) {
        H2(this.f62396t, new x0b.c(qrScanningScreenContract$ProcessingState, 13));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.b(this.f62392p.f8505b.f128528a), null, new wuh.q(this, continuation, 24), 3);
        g gVar = (g) this.f62394r;
        yji.l.a1(this, q.Q(rd0.e.b(((s) gVar.f211674a).f122868g), new mk0.f(continuation, gVar, 14)), null, null, new c(this, null), 3);
        L2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f62396t;
    }
}
