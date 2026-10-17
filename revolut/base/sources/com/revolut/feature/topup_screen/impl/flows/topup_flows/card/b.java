package com.revolut.feature.topup_screen.impl.flows.topup_flows.card;

import aii.i;
import c0f.d;
import com.revolut.data.network.models.topup.mapper.TopUpContextMapperKt;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.CardTopUpThreeDsUiModel;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card.CardTopupFlowContract$Step;
import e0f.i0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ste.g;
import zhm.f0;
import zhm.h0;
import zve.c;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements fze.b {
    public final FacadeCardTopupFlowDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p71.a f90971p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wwh.a f90972q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f90973r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cze.d f90974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i0 f90975t;
    public final rve.d u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.a f90976w;

    public b(FacadeCardTopupFlowDescriptor$InputData inputData, p71.a externalCardsRepository, wwh.a cpgInteractor, d topUpPaymentObserver, cze.d hiddenAuthHandler, i0 finCrimeCardTopUpInteractor, rve.d cardTopUpInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalCardsRepository, "externalCardsRepository");
        Intrinsics.checkNotNullParameter(cpgInteractor, "cpgInteractor");
        Intrinsics.checkNotNullParameter(topUpPaymentObserver, "topUpPaymentObserver");
        Intrinsics.checkNotNullParameter(hiddenAuthHandler, "hiddenAuthHandler");
        Intrinsics.checkNotNullParameter(finCrimeCardTopUpInteractor, "finCrimeCardTopUpInteractor");
        Intrinsics.checkNotNullParameter(cardTopUpInteractor, "cardTopUpInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f90971p = externalCardsRepository;
        this.f90972q = cpgInteractor;
        this.f90973r = topUpPaymentObserver;
        this.f90974s = hiddenAuthHandler;
        this.f90975t = finCrimeCardTopUpInteractor;
        this.u = cardTopUpInteractor;
        this.v = featureToggleInteractor;
        fv1.a aVar = new fv1.a(this, 11);
        this.f90976w = cp5.d.a(this, CardTopupFlowContract$Step.Cvv.f90967a, f0.f322471a, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (r13 == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b r11, zve.b r12, gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b.I2(com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b, zve.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r17.M2(r1, r2, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b r17, java.lang.String r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b.J2(com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if (r3.c((nii.e) r2, r4, r5, r7) == r8) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b r12, java.lang.String r13, gim.c r14) {
        /*
            boolean r1 = r14 instanceof fze.g
            if (r1 == 0) goto L14
            r1 = r14
            fze.g r1 = (fze.g) r1
            int r3 = r1.f139182x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r1.f139182x = r3
        L12:
            r7 = r1
            goto L1a
        L14:
            fze.g r1 = new fze.g
            r1.<init>(r12, r14)
            goto L12
        L1a:
            java.lang.Object r0 = r7.v
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f139182x
            r9 = 2
            r6 = 1
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L35
            if (r1 != r9) goto L2d
            yhm.o.b(r0)
            goto L97
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            kotlin.jvm.internal.Ref$ObjectRef r1 = r7.u
            yhm.o.b(r0)
            r2 = r0
            goto L7b
        L3c:
            yhm.o.b(r0)
            com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData r0 = r12.o
            com.revolut.feature.topup_screen.api.descriptor.CardTopUpType r0 = r0.f90493a
            java.lang.String r1 = "null cannot be cast to non-null type com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.RegularTopUp"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            r1 = r0
            com.revolut.feature.topup_screen.api.descriptor.CardTopUpType$RegularTopUp r1 = (com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.RegularTopUp) r1
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            al6.c r10 = new al6.c
            r0 = 11
            r10.<init>(r0)
            an1.d r11 = new an1.d
            r0 = 21
            r11.<init>(r12, r0)
            fze.j r0 = new fze.j
            r4 = 0
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            r1 = r5
            r7.u = r1
            r7.f139182x = r6
            r6 = r2
            tji.f r2 = r12.X()
            r3 = 0
            r4 = r10
            r5 = r11
            java.lang.Object r2 = n14.k.P(r2, r3, r4, r5, r6, r7)
            if (r2 != r8) goto L7b
            goto L96
        L7b:
            nii.e r2 = (nii.e) r2
            e0f.i0 r3 = r12.f90975t
            fze.c r4 = new fze.c
            r5 = 1
            r4.<init>(r12, r5)
            fze.h r5 = new fze.h
            r6 = 1
            r10 = 0
            r5.<init>(r12, r1, r10, r6)
            r7.u = r10
            r7.f139182x = r9
            java.lang.Object r0 = r3.c(r2, r4, r5, r7)
            if (r0 != r8) goto L97
        L96:
            return r8
        L97:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b.K2(com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b, java.lang.String, gim.c):java.lang.Object");
    }

    public final void L2(zve.b bVar, c cVar) {
        zve.a aVar = bVar.f325669b;
        if (aVar == null) {
            l1().M0(new i(new IllegalStateException("No redirect urls present while status is 3DS challenge"), (aii.a) null, 6));
            return;
        }
        String str = bVar.f325668a;
        String str2 = cVar.f325670a;
        FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = this.o;
        TopUpContext topUpContextD = facadeCardTopupFlowDescriptor$InputData.d;
        if (topUpContextD == null) {
            topUpContextD = e1f.c.d(facadeCardTopupFlowDescriptor$InputData.f90495c);
        }
        h.t2(this, this.f90976w, new CardTopupFlowContract$Step.ThreeDs(new CardTopUpThreeDsUiModel(str, str2, aVar, TopUpContextMapperKt.toWalletId(topUpContextD)), null), false, null, false, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r1 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r9.f90973r.a(r4, r8, r2) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(cue.d r10, java.lang.String r11, gim.c r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r2 = r12 instanceof fze.d
            if (r2 == 0) goto L13
            r2 = r12
            fze.d r2 = (fze.d) r2
            int r3 = r2.f139176w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.f139176w = r3
            goto L18
        L13:
            fze.d r2 = new fze.d
            r2.<init>(r9, r12)
        L18:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f139176w
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L3f
            if (r4 == r7) goto L3b
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            yhm.o.b(r1)
            goto La8
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r1)
            goto L64
        L3b:
            yhm.o.b(r1)
            goto L53
        L3f:
            yhm.o.b(r1)
            wwh.a r1 = r9.f90972q
            exh.b r1 = (exh.b) r1
            pfm.z r1 = r1.a(r10, r11)
            r2.f139176w = r7
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L53
            goto La7
        L53:
            cue.d r1 = (cue.d) r1
            java.lang.String r4 = r1.e
            if (r4 == 0) goto L7a
            r2.f139176w = r6
            cze.d r4 = r9.f90974s
            java.io.Serializable r1 = r4.a(r1, r2)
            if (r1 != r3) goto L64
            goto La7
        L64:
            cue.d r1 = (cue.d) r1
            com.revolut.feature.topup_screen.impl.flows.topup_flows.card.a r2 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.card.a
            r2.<init>(r1, r9, r8)
            fze.c r1 = new fze.c
            r3 = 2
            r1.<init>(r9, r3)
            fjd.g0 r3 = new fjd.g0
            r3.<init>(r9, r2, r8)
            r9.l2(r3, r1)
            goto Lad
        L7a:
            boolean r4 = r1.c()
            if (r4 == 0) goto L91
            com.revolut.feature.topup_screen.impl.flows.topup_flows.card.CardTopupFlowContract$Step$ThreeDs r2 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.card.CardTopupFlowContract$Step$ThreeDs
            r2.<init>(r8, r1)
            r5 = 0
            r6 = 12
            yki.a r1 = r9.f90976w
            r3 = 0
            r4 = 0
            r0 = r9
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            goto Lad
        L91:
            java.lang.String r4 = r1.f108991a
            java.lang.String r1 = r1.f108992b
            if (r1 == 0) goto L9d
            java.lang.String r6 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            r8 = r1
        L9d:
            r2.f139176w = r5
            c0f.d r1 = r9.f90973r
            java.lang.Object r1 = r1.a(r4, r8, r2)
            if (r1 != r3) goto La8
        La7:
            return r3
        La8:
            ste.h r1 = ste.h.f265563a
            r9.C2(r1)
        Lad:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b.M2(cue.d, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        C2(new g(throwable));
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90976w;
    }
}
