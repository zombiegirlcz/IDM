package bob;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import tnb.g0;
import yfe.o0;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final slb.a f17372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final elb.b f17373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ijb.a f17374c;
    public final t d;
    public final g0 e;
    public final ang.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f01.c f17375g;

    public j(slb.a savingsCreationAvailabilityInteractor, elb.b savingsFeatureConfigInteractor, ijb.a savingsProductInteractor, t pricingPlanInteractor, g0 savingsEntryPointsContentProvider, ang.f userInteractor, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(savingsCreationAvailabilityInteractor, "savingsCreationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(savingsEntryPointsContentProvider, "savingsEntryPointsContentProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f17372a = savingsCreationAvailabilityInteractor;
        this.f17373b = savingsFeatureConfigInteractor;
        this.f17374c = savingsProductInteractor;
        this.d = pricingPlanInteractor;
        this.e = savingsEntryPointsContentProvider;
        this.f = userInteractor;
        this.f17375g = uiKitResources;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum e(bob.j r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof bob.i
            if (r0 == 0) goto L13
            r0 = r7
            bob.i r0 = (bob.i) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            bob.i r0 = new bob.i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L68
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            elb.b r6 = r6.f17373b
            w4l.j r7 = w4l.j.f294644c
            cxe.u r6 = r6.a(r7)
            bng.a r7 = new bng.a
            r2 = 13
            r7.<init>(r2)
            akg.n r6 = nim.a.v(r6, r7)
            bn4.y r7 = new bn4.y
            r2 = 9
            r7.<init>(r2)
            r2 = 0
            jhi.b r6 = mo3.a.g(r6, r2, r7, r3)
            a35.k r7 = new a35.k
            r4 = 3
            r5 = 26
            r7.<init>(r4, r5, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r6 = rd0.e.e(r6, r2, r7)
            r0.v = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            uib.c r7 = (uib.c) r7
            if (r7 != 0) goto L6f
            uib.c r6 = uib.c.SAVINGS
            return r6
        L6f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bob.j.e(bob.j, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yfe.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof bob.d
            if (r0 == 0) goto L13
            r0 = r9
            bob.d r0 = (bob.d) r0
            int r1 = r0.f17363w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17363w = r1
            goto L1a
        L13:
            bob.d r0 = new bob.d
            gim.c r9 = (gim.c) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17363w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            goto L75
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            yhm.o.b(r9)
            goto L64
        L39:
            yhm.o.b(r9)
            slb.a r9 = r8.f17372a
            r2 = 3
            cxe.u r9 = yib.a.a(r9, r2)
            bn4.y r6 = new bn4.y
            r7 = 10
            r6.<init>(r7)
            jhi.b r9 = mo3.a.g(r9, r5, r6, r4)
            a35.k r6 = new a35.k
            r7 = 25
            r6.<init>(r2, r7, r5)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r9 = rd0.e.e(r9, r2, r6)
            r0.f17363w = r4
            java.lang.Object r9 = vkm.q.z(r9, r0)
            if (r9 != r1) goto L64
            goto L74
        L64:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = pd.b.j(r9)
            if (r9 == 0) goto L78
            r0.f17363w = r3
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r1) goto L75
        L74:
            return r1
        L75:
            yfe.h r9 = (yfe.h) r9
            return r9
        L78:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bob.j.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yfe.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey r4, java.util.ArrayList r5, dj0.d r6, kotlin.coroutines.Continuation r7) {
        /*
            r3 = this;
            boolean r4 = r7 instanceof bob.e
            if (r4 == 0) goto L13
            r4 = r7
            bob.e r4 = (bob.e) r4
            int r0 = r4.f17366y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f17366y = r0
            goto L1a
        L13:
            bob.e r4 = new bob.e
            gim.c r7 = (gim.c) r7
            r4.<init>(r3, r7)
        L1a:
            java.lang.Object r7 = r4.f17364w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f17366y
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            dj0.d r6 = r4.v
            java.util.ArrayList r5 = r4.u
            yhm.o.b(r7)
            goto L46
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            yhm.o.b(r7)
            r4.u = r5
            r4.v = r6
            r4.f17366y = r2
            r7 = 0
            java.lang.Object r7 = r3.d(r7, r4)
            if (r7 != r0) goto L46
            return r0
        L46:
            java.lang.String r7 = (java.lang.String) r7
            int r4 = r5.size()
            yfe.o1 r5 = yfe.o1.INSTANCE
            yfe.k r0 = new yfe.k
            r0.<init>(r7, r6, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bob.j.b(com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey, java.util.ArrayList, dj0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof bob.f
            if (r0 == 0) goto L13
            r0 = r12
            bob.f r0 = (bob.f) r0
            int r1 = r0.f17367w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17367w = r1
            goto L18
        L13:
            bob.f r0 = new bob.f
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17367w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r12)
            goto L86
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L30:
            yhm.o.b(r12)
            ncd.m r12 = ncd.m.ACTIVE
            java.util.List r8 = zhm.u.c(r12)
            r9 = 0
            r10 = 11
            ijb.a r5 = r11.f17374c
            r6 = 0
            r7 = 0
            akg.n r12 = ijb.a.a(r5, r6, r7, r8, r9, r10)
            ffk.t r2 = r11.d
            efm.r r2 = r2.q()
            vkm.d r2 = rd0.e.b(r2)
            ang.f r5 = r11.f
            w4l.j r6 = w4l.j.f294644c
            akg.n r5 = r5.j(r6)
            bng.a r6 = new bng.a
            r7 = 15
            r6.<init>(r7)
            akg.n r5 = nim.a.v(r5, r6)
            kotlinx.coroutines.flow.Flow r5 = vkm.q.q(r5)
            akg.n r12 = zh9.u0.i(r12, r2, r5)
            bob.g r2 = new bob.g
            r2.<init>(r11, r3)
            jhi.k r12 = nim.a.u(r2, r12)
            bng.a r2 = new bng.a
            r5 = 14
            r2.<init>(r5)
            cxe.u r12 = nim.a.A(r12, r2)
            r0.f17367w = r4
            java.lang.Object r12 = vkm.q.z(r12, r0)
            if (r12 != r1) goto L86
            return r1
        L86:
            com.revolut.data.model.Data r12 = (com.revolut.data.model.Data) r12
            if (r12 == 0) goto L91
            java.lang.Object r12 = r12.getContent()
            yfe.n0 r12 = (yfe.n0) r12
            return r12
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bob.j.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(uib.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bob.h
            if (r0 == 0) goto L13
            r0 = r6
            bob.h r0 = (bob.h) r0
            int r1 = r0.f17371w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17371w = r1
            goto L18
        L13:
            bob.h r0 = new bob.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17371w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            if (r5 != 0) goto L40
            r0.f17371w = r3
            java.lang.Enum r6 = e(r4, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            r5 = r6
            uib.c r5 = (uib.c) r5
        L40:
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = tnb.g0.d(r5)
            f01.c r6 = r4.f17375g
            java.lang.CharSequence r5 = r6.b(r5)
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bob.j.d(uib.c, gim.c):java.lang.Object");
    }
}
