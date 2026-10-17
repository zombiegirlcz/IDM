package com.revolut.feature.paynow.impl.screens.qr;

import ang.f;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.paynow.api.R$string;
import com.revolut.feature.paynow.impl.screens.qr.PayNowQrScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import czc.d0;
import d7a.g;
import d7a.i;
import d7a.j;
import d7a.k;
import d7a.l;
import d7a.n;
import d7a.r;
import dj0.d;
import f7a.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n80.b;
import oki.h;
import org.jetbrains.annotations.NotNull;
import r70.c;
import tsk.t;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements g {

    @NotNull
    public static final n Companion = new n();
    public final PayNowQrScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f80302p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f80303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f80304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f7a.c f80305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f80306t;
    public final fkg.a u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final tqi.g f80307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f80308x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f80309y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(PayNowQrScreenContract$InputData inputData, c70.a clipboard, c hapticEngine, t payNowInteractor, f7a.c payNowQrImageProvider, e payNowQrImageSaver, fkg.a qrCodeGenerator, b buildInfo, tqi.g shareNaviCommandFactory, f userInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(payNowInteractor, "payNowInteractor");
        Intrinsics.checkNotNullParameter(payNowQrImageProvider, "payNowQrImageProvider");
        Intrinsics.checkNotNullParameter(payNowQrImageSaver, "payNowQrImageSaver");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f80302p = clipboard;
        this.f80303q = hapticEngine;
        this.f80304r = payNowInteractor;
        this.f80305s = payNowQrImageProvider;
        this.f80306t = payNowQrImageSaver;
        this.u = qrCodeGenerator;
        this.v = buildInfo;
        this.f80307w = shareNaviCommandFactory;
        this.f80308x = userInteractor;
        d dVar = inputData.f80299a;
        this.f80309y = mra.d.b(this, new d7a.e(dVar != null ? Long.valueOf(dVar.f115082a) : null, 7), stateMapper, null, false, 12);
        this.z = hx7.e.a(this, new cwj.h(this, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.paynow.impl.screens.qr.a r17, i80.a r18, gim.c r19) throws java.lang.Throwable {
        /*
            r1 = r17
            r2 = r18
            r0 = r19
            boolean r3 = r0 instanceof d7a.o
            if (r3 == 0) goto L19
            r3 = r0
            d7a.o r3 = (d7a.o) r3
            int r4 = r3.f111908x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f111908x = r4
            goto L1e
        L19:
            d7a.o r3 = new d7a.o
            r3.<init>(r1, r0)
        L1e:
            java.lang.Object r0 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f111908x
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L4b
            if (r5 == r8) goto L45
            if (r5 == r7) goto L3d
            if (r5 != r6) goto L35
            yhm.o.b(r0)
            goto La5
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            i80.a r2 = r3.u
            yhm.o.b(r0)     // Catch: java.lang.Exception -> L43
            goto L78
        L43:
            r0 = move-exception
            goto L91
        L45:
            i80.a r2 = r3.u
            yhm.o.b(r0)     // Catch: java.lang.Exception -> L43
            goto L5b
        L4b:
            yhm.o.b(r0)
            f7a.c r0 = r1.f80305s     // Catch: java.lang.Exception -> L43
            r3.u = r2     // Catch: java.lang.Exception -> L43
            r3.f111908x = r8     // Catch: java.lang.Exception -> L43
            java.lang.Object r0 = r0.b(r2, r3)     // Catch: java.lang.Exception -> L43
            if (r0 != r4) goto L5b
            goto La7
        L5b:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Exception -> L43
            f7a.e r5 = r1.f80306t     // Catch: java.lang.Exception -> L43
            r3.u = r2     // Catch: java.lang.Exception -> L43
            r3.f111908x = r7     // Catch: java.lang.Exception -> L43
            kotlinx.coroutines.CoroutineDispatcher r7 = r5.f132588c     // Catch: java.lang.Exception -> L43
            ew1.d r8 = new ew1.d     // Catch: java.lang.Exception -> L43
            r10 = 27
            r8.<init>(r5, r0, r9, r10)     // Catch: java.lang.Exception -> L43
            java.lang.Object r0 = skm.e0.J(r7, r8, r3)     // Catch: java.lang.Exception -> L43
            if (r0 != r4) goto L73
            goto L75
        L73:
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L43
        L75:
            if (r0 != r4) goto L78
            goto La7
        L78:
            mii.k r10 = new mii.k     // Catch: java.lang.Exception -> L43
            java.lang.String r11 = "ID_QR_DOWNLOADED"
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause     // Catch: java.lang.Exception -> L43
            int r0 = com.revolut.feature.paynow.api.R$string.topup_paynow_qr_downloaded     // Catch: java.lang.Exception -> L43
            r5 = 14
            r12.<init>(r0, r9, r9, r5)     // Catch: java.lang.Exception -> L43
            r15 = 0
            r16 = 28
            r13 = 0
            r14 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L43
            r1.X1(r10)     // Catch: java.lang.Exception -> L43
            goto La5
        L91:
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            rd0.d.a(r7, r9, r9, r0, r5)
            r3.u = r9
            r3.f111908x = r6
            java.lang.Object r0 = r1.L2(r2, r3)
            if (r0 != r4) goto La5
            goto La7
        La5:
            kotlin.Unit r4 = kotlin.Unit.f186387a
        La7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.paynow.impl.screens.qr.a.I2(com.revolut.feature.paynow.impl.screens.qr.a, i80.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.paynow.impl.screens.qr.a r7, dj0.d r8, gim.c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof d7a.s
            if (r0 == 0) goto L13
            r0 = r9
            d7a.s r0 = (d7a.s) r0
            int r1 = r0.f111914x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111914x = r1
            goto L18
        L13:
            d7a.s r0 = new d7a.s
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111914x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dj0.d r8 = r0.u
            yhm.o.b(r9)
            goto L54
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r9)
            tsk.t r9 = r7.f80304r
            r0.u = r8
            r0.f111914x = r3
            java.lang.Object r9 = r9.f274170b
            v6a.a r9 = (v6a.a) r9
            r9.getClass()
            v06.i r2 = new v06.i
            r3 = 0
            r4 = 14
            r2.<init>(r9, r8, r3, r4)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r2, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            y6a.a r9 = (y6a.a) r9
            java.lang.String r1 = r9.f311243a
            fkg.a r0 = r7.u
            h90.a r2 = new h90.a
            r3 = 33
            r2.<init>(r3, r3)
            i80.c r3 = i80.c.H
            i80.b r4 = i80.b.QR_CODE
            r5 = 0
            r6 = 36
            i80.a r0 = fkg.a.l(r0, r1, r2, r3, r4, r5, r6)
            i80.a r0 = mif.a.Z(r0)
            cli.y r1 = r7.f80309y
            d27.g0 r2 = new d27.g0
            r3 = 5
            r2.<init>(r8, r3, r9, r0)
            r7.H2(r1, r2)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.paynow.impl.screens.qr.a.J2(com.revolut.feature.paynow.impl.screens.qr.a, dj0.d, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new r(this, null, 0), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    public final void K2(l uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        if (uiEvent instanceof j) {
            B2();
            return;
        }
        if (uiEvent instanceof i) {
            C2(d7a.f.f111900a);
            return;
        }
        Continuation continuation = null;
        if (uiEvent instanceof k) {
            this.f80302p.c("CLIPBOARD_LABEL", String.valueOf(((k) uiEvent).f111904a.e), true, new d0(21));
            c.b(this.f80303q, 3);
            X1(new mii.k("ID_COPIED_TO_CLIPBOARD", new TextLocalisedClause(R$string.topup_paynow_copied_message, null, null, 14), null, null, null, 28));
            return;
        }
        if (!(uiEvent instanceof d7a.h)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((d7a.h) uiEvent).f111901a;
        if (Intrinsics.f(str, "DOWNLOAD_ACTION_BUTTON")) {
            l2(new r(this, continuation, 1), new yi5.b(26));
        } else if (Intrinsics.f(str, "SET_AMOUNT_ACTION_BUTTON")) {
            h.v2(this.z, new PayNowQrScreenContract$ModalStep.SetAmount(((d7a.e) ((j2) this.f80309y.f22677a).getValue()).d), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(i80.a r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d7a.t
            if (r0 == 0) goto L13
            r0 = r7
            d7a.t r0 = (d7a.t) r0
            int r1 = r0.f111915w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111915w = r1
            goto L18
        L13:
            d7a.t r0 = new d7a.t
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111915w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L44
        L36:
            yhm.o.b(r7)
            r0.f111915w = r4
            f7a.c r7 = r5.f80305s
            java.lang.Object r7 = r7.b(r6, r0)
            if (r7 != r1) goto L44
            goto L58
        L44:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            r0.f111915w = r3
            f7a.e r6 = r5.f80306t
            zk0.b r6 = r6.f132586a
            byte[] r7 = do3.q.H(r7)
            java.lang.String r2 = "rev_paynow_qr_code.jpg"
            java.lang.Object r7 = zk0.b.a(r6, r7, r2, r0)
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            java.io.File r7 = (java.io.File) r7
            r6 = 0
            if (r7 != 0) goto L71
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "We couldn't generate QR code image"
            r7.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r6, r6, r7, r0)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L71:
            tqi.g r0 = r5.f80307w
            com.revolut.retail.core.navigation.ActivityNavigateCommand r6 = r0.e(r6, r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r5.C1(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.paynow.impl.screens.qr.a.L2(i80.a, gim.c):java.lang.Object");
    }

    public final void M2(Long l2) {
        xi0.b bVar;
        d dVar = this.o.f80299a;
        if (dVar == null || (bVar = dVar.f115083b) == null) {
            xi0.b.Companion.getClass();
            bVar = xi0.b.f306275l;
        }
        l2(new cuc.c(this, l2, bVar, (Continuation) null, 19), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f80309y;
    }
}
