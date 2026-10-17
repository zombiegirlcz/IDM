package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i1 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wac.a f184738n;
    public final kac.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qac.b f184739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f184740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r70.c f184741r;

    public i1(klf.h0 commonDataSource, klf.m1 juniorDataSource, wac.a flightBookingInteractor, kac.e flightBookingUiMapper, qac.b flightBookingRepository, c70.a clipboard, r70.c hapticEngine) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(flightBookingInteractor, "flightBookingInteractor");
        Intrinsics.checkNotNullParameter(flightBookingUiMapper, "flightBookingUiMapper");
        Intrinsics.checkNotNullParameter(flightBookingRepository, "flightBookingRepository");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        this.f184736l = commonDataSource;
        this.f184737m = juniorDataSource;
        this.f184738n = flightBookingInteractor;
        this.o = flightBookingUiMapper;
        this.f184739p = flightBookingRepository;
        this.f184740q = clipboard;
        this.f184741r = hapticEngine;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r11 = r12 instanceof kkf.e1
            if (r11 == 0) goto L13
            r11 = r12
            kkf.e1 r11 = (kkf.e1) r11
            int r0 = r11.f184654w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r11.f184654w = r0
            goto L1a
        L13:
            kkf.e1 r11 = new kkf.e1
            gim.c r12 = (gim.c) r12
            r11.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r11.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.f184654w
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            yhm.o.b(r12)
            r4 = r9
            goto L9c
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            yhm.o.b(r12)
            boolean r12 = r10 instanceof kac.c
            r7 = 0
            if (r12 == 0) goto L5c
            kac.c r10 = (kac.c) r10
            java.lang.String r5 = r10.f182455a
            boolean r10 = r10.f182456b
            r6 = r10 ^ 1
            r11.f184654w = r2
            ald.m r3 = new ald.m
            r8 = 27
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            yi5.b r10 = new yi5.b
            r11 = 27
            r10.<init>(r11)
            r9.T2(r3, r10)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            if (r10 != r0) goto L9c
            return r0
        L5c:
            r4 = r9
            boolean r11 = r10 instanceof kac.a
            if (r11 == 0) goto L6e
            kac.a r10 = (kac.a) r10
            java.lang.String r10 = r10.f182453a
            com.revolut.kompot.common.ExternalDestination$Browser r11 = new com.revolut.kompot.common.ExternalDestination$Browser
            r11.<init>(r10, r7)
            r9.A2(r11)
            goto L9c
        L6e:
            boolean r11 = r10 instanceof kac.b
            r12 = 0
            if (r11 == 0) goto L83
            kac.b r10 = (kac.b) r10
            java.lang.String r10 = r10.f182454a
            k98.a r11 = new k98.a
            r0 = 7
            r11.<init>(r9, r0)
            c70.a r0 = r4.f184740q
            r0.c(r7, r10, r12, r11)
            goto L9c
        L83:
            boolean r10 = r10 instanceof kac.d
            if (r10 == 0) goto L9b
            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController r10 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController
            kac.e r11 = r4.o
            hbc.b r11 = (hbc.b) r11
            dii.a r11 = r11.d()
            r10.<init>(r11)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r11 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r12 = 2
            yji.n.P2(r9, r10, r11, r7, r12)
            goto L9c
        L9b:
            r2 = r12
        L9c:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i1.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
