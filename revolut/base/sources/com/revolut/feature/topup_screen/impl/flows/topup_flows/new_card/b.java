package com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card;

import c0f.d;
import com.revolut.data.network.models.topup.mapper.TopUpContextMapperKt;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.CardTopUpThreeDsUiModel;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.TopupWithNewCardFlowContract$Step;
import e0f.e1;
import e0f.i0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pze.c;
import pze.g;
import ste.w;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements c {
    public final TopupWithNewCardFlowDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f91010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cze.d f91011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e1 f91012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i0 f91013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p71.a f91014t;
    public final wwh.a u;
    public final rve.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f91015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wsg.b f91016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f91017y;

    public b(TopupWithNewCardFlowDescriptor$InputData inputData, d topUpPaymentObserver, cze.d hiddenAuthHandler, e1 transactionResultProcessingDelegate, i0 finCrimeCardTopUpInteractor, p71.a externalCardsRepository, wwh.a cpgInteractor, rve.d cardTopUpInteractor, gte.a featureToggleInteractor, wsg.b newWalletsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topUpPaymentObserver, "topUpPaymentObserver");
        Intrinsics.checkNotNullParameter(hiddenAuthHandler, "hiddenAuthHandler");
        Intrinsics.checkNotNullParameter(transactionResultProcessingDelegate, "transactionResultProcessingDelegate");
        Intrinsics.checkNotNullParameter(finCrimeCardTopUpInteractor, "finCrimeCardTopUpInteractor");
        Intrinsics.checkNotNullParameter(externalCardsRepository, "externalCardsRepository");
        Intrinsics.checkNotNullParameter(cpgInteractor, "cpgInteractor");
        Intrinsics.checkNotNullParameter(cardTopUpInteractor, "cardTopUpInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.o = inputData;
        this.f91010p = topUpPaymentObserver;
        this.f91011q = hiddenAuthHandler;
        this.f91012r = transactionResultProcessingDelegate;
        this.f91013s = finCrimeCardTopUpInteractor;
        this.f91014t = externalCardsRepository;
        this.u = cpgInteractor;
        this.v = cardTopUpInteractor;
        this.f91015w = featureToggleInteractor;
        this.f91016x = newWalletsInteractor;
        this.f91017y = d8l.d.a(this, new pu4.d(this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b r5, cue.d r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof pze.f
            if (r0 == 0) goto L13
            r0 = r7
            pze.f r0 = (pze.f) r0
            int r1 = r0.f240993w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240993w = r1
            goto L18
        L13:
            pze.f r0 = new pze.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240993w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            boolean r7 = r6.c()
            r2 = 0
            if (r7 == 0) goto L45
            yki.i r7 = r5.f91017y
            com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.TopupWithNewCardFlowContract$Step$ThreeDs r0 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.TopupWithNewCardFlowContract$Step$ThreeDs
            r0.<init>(r2, r6)
            r6 = 6
            oki.h.u2(r5, r7, r0, r2, r6)
            goto L61
        L45:
            c0f.d r7 = r5.f91010p
            java.lang.String r4 = r6.f108991a
            java.lang.String r6 = r6.f108992b
            if (r6 == 0) goto L53
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            r2 = r6
        L53:
            r0.f240993w = r3
            java.lang.Object r6 = r7.a(r4, r2, r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            ste.x r6 = ste.x.f265578a
            r5.C2(r6)
        L61:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.I2(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b, cue.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (r13 == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b r11, zve.b r12, gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.J2(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b, zve.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r1.b((nii.e) r10, r2, r3, r6) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof pze.i
            if (r0 == 0) goto L14
            r0 = r10
            pze.i r0 = (pze.i) r0
            int r1 = r0.f240996w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f240996w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            pze.i r0 = new pze.i
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f240996w
            r7 = 2
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L39
            if (r1 == r2) goto L35
            if (r1 != r7) goto L2d
            yhm.o.b(r10)
            goto L77
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            yhm.o.b(r10)
            goto L5c
        L39:
            yhm.o.b(r10)
            o9a.v r3 = new o9a.v
            r10 = 6
            r3.<init>(r10)
            pze.e r4 = new pze.e
            r10 = 0
            r4.<init>(r9, r10)
            pze.j r5 = new pze.j
            r10 = 1
            r5.<init>(r9, r8, r10)
            r6.f240996w = r2
            tji.f r1 = r9.X()
            r2 = 0
            java.lang.Object r10 = n14.k.P(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L5c
            goto L76
        L5c:
            nii.e r10 = (nii.e) r10
            e0f.e1 r1 = r9.f91012r
            pyc.p r2 = new pyc.p
            r3 = 18
            r2.<init>(r3)
            pnf.f r3 = new pnf.f
            r4 = 27
            r3.<init>(r9, r8, r4)
            r6.f240996w = r7
            java.lang.Object r9 = r1.b(r10, r2, r3, r6)
            if (r9 != r0) goto L77
        L76:
            return r0
        L77:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.K2(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r14.c((nii.e) r15, r2, r3, r6) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b r14, gim.c r15) {
        /*
            boolean r0 = r15 instanceof pze.k
            if (r0 == 0) goto L14
            r0 = r15
            pze.k r0 = (pze.k) r0
            int r1 = r0.f240999x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f240999x = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            pze.k r0 = new pze.k
            r0.<init>(r14, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f240999x
            r7 = 2
            r2 = 1
            r12 = 0
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L36
            if (r1 != r7) goto L2e
            yhm.o.b(r15)
            goto La3
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L36:
            kotlin.jvm.internal.Ref$ObjectRef r1 = r6.u
            yhm.o.b(r15)
            r9 = r14
            goto L88
        L3d:
            yhm.o.b(r15)
            com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData r15 = r14.o
            java.lang.String r11 = r15.f90502g
            if (r11 != 0) goto L5d
            aii.o r14 = r14.l1()
            aii.i r15 = new aii.i
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "newCardId is required when TopUpCardOwnerVerification is enabled"
            r0.<init>(r1)
            r1 = 6
            r15.<init>(r0, r12, r1)
            r14.M0(r15)
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        L5d:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            o9a.v r3 = new o9a.v
            r15 = 7
            r3.<init>(r15)
            pze.e r4 = new pze.e
            r15 = 1
            r4.<init>(r14, r15)
            oqk.h r5 = new oqk.h
            r13 = 8
            r9 = r14
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r6.u = r10
            r6.f240999x = r2
            tji.f r1 = r9.X()
            r2 = 0
            java.lang.Object r15 = n14.k.P(r1, r2, r3, r4, r5, r6)
            if (r15 != r0) goto L87
            goto La2
        L87:
            r1 = r10
        L88:
            nii.e r15 = (nii.e) r15
            e0f.i0 r14 = r9.f91013s
            pze.d r2 = new pze.d
            r3 = 1
            r2.<init>(r9, r3)
            pze.l r3 = new pze.l
            r4 = 1
            r3.<init>(r9, r1, r12, r4)
            r6.u = r12
            r6.f240999x = r7
            java.lang.Object r14 = r14.c(r15, r2, r3, r6)
            if (r14 != r0) goto La3
        La2:
            return r0
        La3:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.L2(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new g(this, null), new pze.d(this, 0));
    }

    public final void M2(zve.b bVar, zve.c cVar) {
        zve.a aVar = bVar.f325669b;
        if (aVar == null) {
            l1().M0(new aii.i(new IllegalStateException("No redirect urls present while status is 3DS challenge"), (aii.a) null, 6));
            return;
        }
        String str = bVar.f325668a;
        String str2 = cVar.f325670a;
        TopupWithNewCardFlowDescriptor$InputData topupWithNewCardFlowDescriptor$InputData = this.o;
        TopUpContext topUpContextD = topupWithNewCardFlowDescriptor$InputData.f;
        if (topUpContextD == null) {
            topUpContextD = e1f.c.d(topupWithNewCardFlowDescriptor$InputData.e);
        }
        h.u2(this, this.f91017y, new TopupWithNewCardFlowContract$Step.ThreeDs(new CardTopUpThreeDsUiModel(str, str2, aVar, TopUpContextMapperKt.toWalletId(topUpContextD)), null), null, 6);
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        C2(new w(throwable));
        h.D2(this.f91017y);
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91017y;
    }
}
