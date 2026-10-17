package com.revolut.feature.retail.cfd.impl.flows.withdraw;

import a3b.c;
import a3b.g;
import com.revolut.feature.retail.cfd.impl.flows.withdraw.CfdWithdrawFlowContract$Step;
import i90.b;
import java.time.Instant;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import p2b.j;
import ybl.d;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements c {
    public final CfdWithdrawFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f82199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f82200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f82201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f82202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final usc.a f82203t;
    public final UUID u;
    public final yki.a v;

    public a(CfdWithdrawFlowContract$InputData inputData, d portfolioInteractor, j cfdShareablePerformanceInteractor, b uuidUtils, g dialogsMapper, j60.a bottomExpandableDialogControllerExtension, usc.a wealthDisclaimersInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(cfdShareablePerformanceInteractor, "cfdShareablePerformanceInteractor");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(dialogsMapper, "dialogsMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(wealthDisclaimersInteractor, "wealthDisclaimersInteractor");
        this.o = inputData;
        this.f82199p = portfolioInteractor;
        this.f82200q = cfdShareablePerformanceInteractor;
        this.f82201r = dialogsMapper;
        this.f82202s = bottomExpandableDialogControllerExtension;
        this.f82203t = wealthDisclaimersInteractor;
        UUID uuidA = od0.j.a(Instant.now());
        Intrinsics.checkNotNullExpressionValue(uuidA, "generate(...)");
        this.u = uuidA;
        a09.b bVar = new a09.b(this, 8);
        this.v = cp5.d.a(this, CfdWithdrawFlowContract$Step.Screen.f82198a, f0.f322471a, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.retail.cfd.impl.flows.withdraw.a r8, dj0.d r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof a3b.j
            if (r0 == 0) goto L14
            r0 = r10
            a3b.j r0 = (a3b.j) r0
            int r1 = r0.f1089w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f1089w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a3b.j r0 = new a3b.j
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f1089w
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r10)
            r1 = r8
            goto L53
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r10)
            a3b.h r3 = new a3b.h
            r10 = 0
            r3.<init>(r8, r10)
            a3b.i r4 = new a3b.i
            r4.<init>(r8, r9, r10)
            a3b.k r5 = new a3b.k
            r10 = 1
            r1 = 0
            r5.<init>(r8, r9, r1, r10)
            r6.f1089w = r2
            r2 = 0
            r7 = 1
            r1 = r8
            java.lang.Object r10 = n14.k.V(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L53
            return r0
        L53:
            nii.h r10 = (nii.h) r10
            boolean r8 = r10 instanceof nii.g
            if (r8 == 0) goto L5f
            yki.a r8 = r1.v
            oki.h.D2(r8)
            goto L63
        L5f:
            boolean r8 = r10 instanceof nii.f
            if (r8 == 0) goto L66
        L63:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L66:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.cfd.impl.flows.withdraw.a.I2(com.revolut.feature.retail.cfd.impl.flows.withdraw.a, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.retail.cfd.impl.flows.withdraw.a r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof a3b.l
            if (r0 == 0) goto L13
            r0 = r7
            a3b.l r0 = (a3b.l) r0
            int r1 = r0.f1092w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1092w = r1
            goto L18
        L13:
            a3b.l r0 = new a3b.l
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1092w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L61
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            usc.a r6 = r6.f82203t
            rdh.b r7 = rdh.b.CFD_WITHDRAWAL_CONFIRMATION
            java.util.List r7 = zhm.u.c(r7)
            w4l.h r2 = w4l.h.f294642c
            kotlinx.coroutines.flow.Flow r6 = r6.l(r7, r2)
            a2g.m r7 = new a2g.m
            r2 = 1
            r7.<init>(r2)
            a08.n r2 = new a08.n
            r4 = 18
            r2.<init>(r4)
            a08.n r4 = new a08.n
            r5 = 19
            r4.<init>(r5)
            jhi.b r6 = mo3.a.f(r6, r2, r7, r4)
            r0.f1092w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            od0.i r7 = (od0.i) r7
            if (r7 == 0) goto L6a
            java.lang.Object r6 = r7.f224257a
            rdh.a r6 = (rdh.a) r6
            return r6
        L6a:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.cfd.impl.flows.withdraw.a.J2(com.revolut.feature.retail.cfd.impl.flows.withdraw.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.retail.cfd.impl.flows.withdraw.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof a3b.m
            if (r0 == 0) goto L13
            r0 = r6
            a3b.m r0 = (a3b.m) r0
            int r1 = r0.f1093w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1093w = r1
            goto L18
        L13:
            a3b.m r0 = new a3b.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1093w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            p2b.j r6 = r5.f82200q
            com.revolut.feature.retail.cfd.impl.flows.withdraw.CfdWithdrawFlowContract$InputData r5 = r5.o
            java.lang.String r5 = r5.f82196a
            r2 = 6
            r4 = 0
            kotlinx.coroutines.flow.Flow r5 = p2b.j.b(r6, r5, r4, r2)
            r6 = 3
            jhi.b r5 = mo3.a.g(r5, r4, r4, r6)
            r0.f1093w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            y49.f r6 = (y49.f) r6
            java.util.List r5 = r6.e
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.cfd.impl.flows.withdraw.a.K2(com.revolut.feature.retail.cfd.impl.flows.withdraw.a, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
