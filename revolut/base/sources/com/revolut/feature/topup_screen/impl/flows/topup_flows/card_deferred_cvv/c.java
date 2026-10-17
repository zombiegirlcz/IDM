package com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv;

import c0f.d;
import com.revolut.data.network.models.topup.mapper.TopUpContextMapperKt;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.CardTopUpThreeDsUiModel;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlowContract$Step;
import e0f.e1;
import e0f.i0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ste.g;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements hze.b {
    public final FacadeCardTopupFlowDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p71.a f90983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y51.a f90984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wwh.a f90985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f90986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cze.d f90987t;
    public final e1 u;
    public final i0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final rve.d f90988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f90989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f90990y;

    public c(FacadeCardTopupFlowDescriptor$InputData inputData, p71.a externalCardsRepository, y51.a externalCardsInteractor, wwh.a cpgInteractor, d topUpPaymentObserver, cze.d hiddenAuthHandler, e1 transactionResultProcessingDelegate, i0 finCrimeCardTopUpInteractor, rve.d cardTopUpInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalCardsRepository, "externalCardsRepository");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(cpgInteractor, "cpgInteractor");
        Intrinsics.checkNotNullParameter(topUpPaymentObserver, "topUpPaymentObserver");
        Intrinsics.checkNotNullParameter(hiddenAuthHandler, "hiddenAuthHandler");
        Intrinsics.checkNotNullParameter(transactionResultProcessingDelegate, "transactionResultProcessingDelegate");
        Intrinsics.checkNotNullParameter(finCrimeCardTopUpInteractor, "finCrimeCardTopUpInteractor");
        Intrinsics.checkNotNullParameter(cardTopUpInteractor, "cardTopUpInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f90983p = externalCardsRepository;
        this.f90984q = externalCardsInteractor;
        this.f90985r = cpgInteractor;
        this.f90986s = topUpPaymentObserver;
        this.f90987t = hiddenAuthHandler;
        this.u = transactionResultProcessingDelegate;
        this.v = finCrimeCardTopUpInteractor;
        this.f90988w = cardTopUpInteractor;
        this.f90989x = featureToggleInteractor;
        this.f90990y = d8l.d.a(this, new hw9.b(this, 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (r13 == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c r11, zve.b r12, gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c.I2(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c, zve.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (r7.K2((cue.d) r10, r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        if (r8.a(r2, r9, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c r7, cue.d r8, java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof hze.g
            if (r0 == 0) goto L13
            r0 = r10
            hze.g r0 = (hze.g) r0
            int r1 = r0.f157155w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157155w = r1
            goto L18
        L13:
            hze.g r0 = new hze.g
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f157155w
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r10)
            goto La2
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            yhm.o.b(r10)
            goto L75
        L3d:
            yhm.o.b(r10)
            goto L6a
        L41:
            yhm.o.b(r10)
            goto L59
        L45:
            yhm.o.b(r10)
            wwh.a r10 = r7.f90985r
            exh.b r10 = (exh.b) r10
            pfm.z r8 = r10.a(r8, r9)
            r0.f157155w = r6
            java.lang.Object r10 = nim.a.b(r8, r0)
            if (r10 != r1) goto L59
            goto La1
        L59:
            cue.d r10 = (cue.d) r10
            java.lang.String r8 = r10.e
            if (r8 == 0) goto L78
            cze.d r8 = r7.f90987t
            r0.f157155w = r5
            java.io.Serializable r10 = r8.a(r10, r0)
            if (r10 != r1) goto L6a
            goto La1
        L6a:
            cue.d r10 = (cue.d) r10
            r0.f157155w = r4
            java.lang.Object r7 = r7.K2(r10, r0)
            if (r7 != r1) goto L75
            goto La1
        L75:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L78:
            boolean r8 = r10.c()
            r9 = 0
            if (r8 == 0) goto L8b
            yki.i r8 = r7.f90990y
            com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlowContract$Step$ThreeDs r0 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlowContract$Step$ThreeDs
            r0.<init>(r9, r10)
            r10 = 6
            oki.h.u2(r7, r8, r0, r9, r10)
            goto La7
        L8b:
            c0f.d r8 = r7.f90986s
            java.lang.String r2 = r10.f108991a
            java.lang.String r10 = r10.f108992b
            if (r10 == 0) goto L99
            java.lang.String r9 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r9)
            r9 = r10
        L99:
            r0.f157155w = r3
            java.lang.Object r8 = r8.a(r2, r9, r0)
            if (r8 != r1) goto La2
        La1:
            return r1
        La2:
            ste.h r8 = ste.h.f265563a
            r7.C2(r8)
        La7:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c.J2(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c, cue.d, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(cue.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof hze.e
            if (r0 == 0) goto L13
            r0 = r6
            hze.e r0 = (hze.e) r0
            int r1 = r0.f157152w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157152w = r1
            goto L18
        L13:
            hze.e r0 = new hze.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f157152w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            boolean r6 = r5.c()
            r2 = 0
            if (r6 == 0) goto L45
            com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlowContract$Step$ThreeDs r6 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlowContract$Step$ThreeDs
            r6.<init>(r2, r5)
            r5 = 6
            yki.i r0 = r4.f90990y
            oki.h.u2(r4, r0, r6, r2, r5)
            goto L61
        L45:
            java.lang.String r6 = r5.f108991a
            java.lang.String r5 = r5.f108992b
            if (r5 == 0) goto L51
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            r2 = r5
        L51:
            r0.f157152w = r3
            c0f.d r5 = r4.f90986s
            java.lang.Object r5 = r5.a(r6, r2, r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            ste.h r5 = ste.h.f265563a
            r4.C2(r5)
        L61:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c.K2(cue.d, gim.c):java.lang.Object");
    }

    public final void L2(zve.b bVar, zve.c cVar) {
        String walletId;
        if (bVar.f325669b == null) {
            l1().M0(new aii.i(new IllegalStateException("No redirect urls present while status is 3DS challenge"), (aii.a) null, 6));
            return;
        }
        FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = this.o;
        TopUpContext topUpContext = facadeCardTopupFlowDescriptor$InputData.d;
        if (topUpContext == null || (walletId = TopUpContextMapperKt.toWalletId(topUpContext)) == null) {
            walletId = TopUpContextMapperKt.toWalletId(e1f.c.d(facadeCardTopupFlowDescriptor$InputData.f90495c));
        }
        h.u2(this, this.f90990y, new CardDeferredCvvFlowContract$Step.ThreeDs(new CardTopUpThreeDsUiModel(bVar.f325668a, cVar.f325670a, bVar.f325669b, walletId), null), null, 6);
    }

    @Override // yki.j
    public final void M0() {
        l2(new hze.h(this, null), new hze.c(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r13.v.c((nii.e) r0, r3, r4, r8) == r9) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(java.lang.String r14, gim.c r15) {
        /*
            r13 = this;
            boolean r2 = r15 instanceof hze.i
            if (r2 == 0) goto L14
            r2 = r15
            hze.i r2 = (hze.i) r2
            int r3 = r2.f157157x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r2.f157157x = r3
        L12:
            r8 = r2
            goto L1a
        L14:
            hze.i r2 = new hze.i
            r2.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r8.v
            fim.a r9 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.f157157x
            r10 = 2
            r6 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 == r6) goto L35
            if (r2 != r10) goto L2d
            yhm.o.b(r0)
            goto L85
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L35:
            kotlin.jvm.internal.Ref$ObjectRef r2 = r8.u
            yhm.o.b(r0)
            r12 = r4
            goto L6a
        L3c:
            kotlin.jvm.internal.Ref$ObjectRef r2 = p.a.w(r0)
            al6.c r7 = new al6.c
            r0 = 16
            r7.<init>(r0)
            hze.d r11 = new hze.d
            r0 = 2
            r11.<init>(r13, r0)
            g84.u r0 = new g84.u
            r5 = 23
            r1 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r12 = r4
            r8.u = r2
            r8.f157157x = r6
            tji.f r3 = r13.X()
            r4 = 0
            r5 = r7
            r6 = r11
            r7 = r0
            java.lang.Object r0 = n14.k.P(r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto L6a
            goto L84
        L6a:
            nii.e r0 = (nii.e) r0
            hze.c r3 = new hze.c
            r4 = 4
            r3.<init>(r13, r4)
            hze.j r4 = new hze.j
            r5 = 1
            r4.<init>(r13, r2, r12, r5)
            r8.u = r12
            r8.f157157x = r10
            e0f.i0 r2 = r13.v
            java.lang.Object r0 = r2.c(r0, r3, r4, r8)
            if (r0 != r9) goto L85
        L84:
            return r9
        L85:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c.M2(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r12.v.c((nii.e) r2, r3, r4, r7) == r8) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(java.lang.String r13, com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.RegularTopUp r14, gim.c r15) {
        /*
            r12 = this;
            r0 = r15
            boolean r1 = r0 instanceof hze.k
            if (r1 == 0) goto L15
            r1 = r0
            hze.k r1 = (hze.k) r1
            int r3 = r1.f157161x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r1.f157161x = r3
        L13:
            r7 = r1
            goto L1b
        L15:
            hze.k r1 = new hze.k
            r1.<init>(r12, r15)
            goto L13
        L1b:
            java.lang.Object r0 = r7.v
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f157161x
            r9 = 2
            r6 = 1
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L35
            if (r1 != r9) goto L2d
            yhm.o.b(r0)
            goto L86
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            kotlin.jvm.internal.Ref$ObjectRef r1 = r7.u
            yhm.o.b(r0)
            r2 = r0
            goto L6b
        L3c:
            kotlin.jvm.internal.Ref$ObjectRef r5 = p.a.w(r0)
            al6.c r10 = new al6.c
            r0 = 15
            r10.<init>(r0)
            hze.d r11 = new hze.d
            r0 = 1
            r11.<init>(r12, r0)
            hze.n r0 = new hze.n
            r4 = 0
            r2 = r12
            r3 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            r1 = r5
            r7.u = r1
            r7.f157161x = r6
            r6 = r2
            tji.f r2 = r12.X()
            r3 = 0
            r4 = r10
            r5 = r11
            java.lang.Object r2 = n14.k.P(r2, r3, r4, r5, r6, r7)
            if (r2 != r8) goto L6b
            goto L85
        L6b:
            nii.e r2 = (nii.e) r2
            hze.c r3 = new hze.c
            r4 = 3
            r3.<init>(r12, r4)
            hze.l r4 = new hze.l
            r5 = 0
            r4.<init>(r12, r1, r5)
            r7.u = r5
            r7.f157161x = r9
            e0f.i0 r1 = r12.v
            java.lang.Object r1 = r1.c(r2, r3, r4, r7)
            if (r1 != r8) goto L86
        L85:
            return r8
        L86:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c.N2(java.lang.String, com.revolut.feature.topup_screen.api.descriptor.CardTopUpType$RegularTopUp, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r9.u.b((nii.e) r11, r10, r1, r6) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.RegularTopUp r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof hze.o
            if (r0 == 0) goto L14
            r0 = r11
            hze.o r0 = (hze.o) r0
            int r1 = r0.f157169w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f157169w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            hze.o r0 = new hze.o
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f157169w
            r7 = 2
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L39
            if (r1 == r2) goto L35
            if (r1 != r7) goto L2d
            yhm.o.b(r11)
            goto L75
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            yhm.o.b(r11)
            goto L5c
        L39:
            yhm.o.b(r11)
            al6.c r3 = new al6.c
            r11 = 14
            r3.<init>(r11)
            hze.d r4 = new hze.d
            r11 = 0
            r4.<init>(r9, r11)
            hze.r r5 = new hze.r
            r5.<init>(r9, r10, r8)
            r6.f157169w = r2
            tji.f r1 = r9.X()
            r2 = 0
            java.lang.Object r11 = n14.k.P(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L5c
            goto L74
        L5c:
            nii.e r11 = (nii.e) r11
            hy2.k r10 = new hy2.k
            r1 = 21
            r10.<init>(r1)
            hze.p r1 = new hze.p
            r1.<init>(r9, r8)
            r6.f157169w = r7
            e0f.e1 r2 = r9.u
            java.lang.Object r10 = r2.b(r11, r10, r1, r6)
            if (r10 != r0) goto L75
        L74:
            return r0
        L75:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c.O2(com.revolut.feature.topup_screen.api.descriptor.CardTopUpType$RegularTopUp, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (r10.v.c((nii.e) r12, r2, r3, r6) != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P2(com.revolut.feature.topup_screen.api.descriptor.CardTopUpType.RegularTopUp r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof hze.s
            if (r0 == 0) goto L14
            r0 = r12
            hze.s r0 = (hze.s) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            hze.s r0 = new hze.s
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f157174x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.z
            r7 = 3
            r2 = 2
            r3 = 1
            r8 = 0
            if (r1 == 0) goto L47
            if (r1 == r3) goto L41
            if (r1 == r2) goto L39
            if (r1 != r7) goto L31
            yhm.o.b(r12)
            goto Lc4
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            boolean r11 = r6.f157173w
            kotlin.jvm.internal.Ref$ObjectRef r1 = r6.v
            yhm.o.b(r12)
            goto La6
        L41:
            com.revolut.feature.topup_screen.api.descriptor.CardTopUpType$RegularTopUp r11 = r6.u
            yhm.o.b(r12)
            goto L5a
        L47:
            yhm.o.b(r12)
            hze.u r12 = new hze.u
            r12.<init>(r10, r8)
            r6.u = r11
            r6.z = r3
            java.lang.Object r12 = r10.p2(r6, r12)
            if (r12 != r0) goto L5a
            goto Lc3
        L5a:
            t61.g r12 = (t61.g) r12
            java.lang.Boolean r1 = r12.f268153y
            if (r1 == 0) goto L65
            boolean r12 = r1.booleanValue()
            goto L67
        L65:
            boolean r12 = r12.f268145n
        L67:
            if (r12 == 0) goto L77
            com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlowContract$Step$Cvv r11 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlowContract$Step$Cvv
            r11.<init>(r8)
            r12 = 6
            yki.i r0 = r10.f90990y
            oki.h.u2(r10, r0, r11, r8, r12)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L77:
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            al6.c r3 = new al6.c
            r1 = 17
            r3.<init>(r1)
            hze.d r4 = new hze.d
            r1 = 3
            r4.<init>(r10, r1)
            hze.w r5 = new hze.w
            r5.<init>(r11, r10, r8, r9)
            r6.u = r8
            r6.v = r9
            r6.f157173w = r12
            r6.z = r2
            tji.f r1 = r10.X()
            r2 = 0
            java.lang.Object r11 = n14.k.P(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto La2
            goto Lc3
        La2:
            r1 = r12
            r12 = r11
            r11 = r1
            r1 = r9
        La6:
            nii.e r12 = (nii.e) r12
            hze.c r2 = new hze.c
            r3 = 5
            r2.<init>(r10, r3)
            hze.t r3 = new hze.t
            r3.<init>(r10, r1, r8)
            r6.u = r8
            r6.v = r8
            r6.f157173w = r11
            r6.z = r7
            e0f.i0 r11 = r10.v
            java.lang.Object r11 = r11.c(r12, r2, r3, r6)
            if (r11 != r0) goto Lc4
        Lc3:
            return r0
        Lc4:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c.P2(com.revolut.feature.topup_screen.api.descriptor.CardTopUpType$RegularTopUp, gim.c):java.lang.Object");
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
        return this.f90990y;
    }
}
