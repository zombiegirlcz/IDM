package com.revolut.feature.pockets.impl.details_v2.mcy;

import d8l.d;
import e54.r;
import eea.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import s99.i;
import uea.f;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements c {
    public final PocketDetailsMcyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f80828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f80829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.i f80830r;

    public b(PocketDetailsMcyFlowContract$InputData inputData, f pocketDetailsRepository, i exchangeGlobalAccessInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pocketDetailsRepository, "pocketDetailsRepository");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessInteractor, "exchangeGlobalAccessInteractor");
        this.o = inputData;
        this.f80828p = pocketDetailsRepository;
        this.f80829q = exchangeGlobalAccessInteractor;
        this.f80830r = d.a(this, new r(this, 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.pockets.impl.details_v2.mcy.b r11, gim.c r12) {
        /*
            r11.getClass()
            boolean r0 = r12 instanceof eea.e
            if (r0 == 0) goto L16
            r0 = r12
            eea.e r0 = (eea.e) r0
            int r1 = r0.f125164w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f125164w = r1
            goto L1b
        L16:
            eea.e r0 = new eea.e
            r0.<init>(r11, r12)
        L1b:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125164w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)
            goto L72
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r12)
            uea.f r12 = r11.f80828p
            com.revolut.feature.pockets.impl.details_v2.mcy.PocketDetailsMcyFlowContract$InputData r2 = r11.o
            java.lang.String r5 = r2.f80826c
            io3.l r7 = r2.f80825b
            xi0.b r6 = r2.f80824a
            io3.i r8 = io3.i.INTERNAL
            r12.getClass()
            java.lang.String r2 = "walletId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "currency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r2 = "pocketType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.lang.String r2 = "pocketOriginType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            w4l.f r12 = r12.f
            xda.y r4 = new xda.y
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            efm.b r12 = r12.g(r4, r3)
            pfm.a r12 = ue0.e.v(r12)
            r0.f125164w = r3
            java.lang.Object r12 = nim.a.a(r12, r0)
            if (r12 != r1) goto L72
            return r1
        L72:
            yki.i r11 = r11.f80830r
            oki.h.D2(r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pockets.impl.details_v2.mcy.b.I2(com.revolut.feature.pockets.impl.details_v2.mcy.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new eea.d(this, null, 1), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80830r;
    }
}
