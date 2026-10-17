package com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root;

import com.revolut.feature.rev_points.buying.api.navigation.InputData;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.RevPointsExclusiveStoreProductFlowContract$Step;
import com.revolut.feature.store.core.api.model.StoreProductStatusResponse;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nk4.o;
import nt4.f;
import nvb.b;
import nvb.j;
import oki.h;
import qki.d;
import vkm.q;
import y21.c;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final ExclusiveStoreInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f83591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o7.b f83592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f83593r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InputData f83594s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f83595t;
    public final i u;

    public a(ExclusiveStoreInputData inputData, zja.a productArticleInteractor, o7.b storeProductStatusInteractor, c optOutRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(storeProductStatusInteractor, "storeProductStatusInteractor");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.o = inputData;
        this.f83591p = productArticleInteractor;
        this.f83592q = storeProductStatusInteractor;
        this.f83593r = optOutRepository;
        this.f83594s = new InputData(false, (Integer) null, (Function1) new nvb.d(this, 0), 7);
        this.f83595t = e.b(this, new RevPointsExclusiveStoreProductFlowContract$FlowState(false));
        this.u = d8l.d.a(this, new o(this, 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof nvb.g
            if (r0 == 0) goto L13
            r0 = r6
            nvb.g r0 = (nvb.g) r0
            int r1 = r0.f219579w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219579w = r1
            goto L18
        L13:
            nvb.g r0 = new nvb.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f219579w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            goto L42
        L36:
            yhm.o.b(r6)
            r0.f219579w = r4
            java.lang.Object r6 = r5.O2(r0)
            if (r6 != r1) goto L42
            goto L50
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0.f219579w = r3
            java.lang.Object r5 = r5.J2(r6, r0)
            if (r5 != r1) goto L51
        L50:
            return r1
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a.I2(com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(boolean r7, gim.c r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof nvb.h
            if (r0 == 0) goto L13
            r0 = r8
            nvb.h r0 = (nvb.h) r0
            int r1 = r0.f219580w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219580w = r1
            goto L18
        L13:
            nvb.h r0 = new nvb.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f219580w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L28
            goto L56
        L28:
            r7 = move-exception
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            o7.b r8 = r6.f83592q     // Catch: java.lang.Exception -> L28
            v1e.c r2 = new v1e.c     // Catch: java.lang.Exception -> L28
            com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData r5 = r6.o     // Catch: java.lang.Exception -> L28
            java.lang.String r5 = r5.getF83576a()     // Catch: java.lang.Exception -> L28
            r2.<init>(r5, r7)     // Catch: java.lang.Exception -> L28
            vkm.d r7 = r8.q(r2)     // Catch: java.lang.Exception -> L28
            m84.c r8 = new m84.c     // Catch: java.lang.Exception -> L28
            r2 = 2
            r5 = 7
            r8.<init>(r2, r5, r4)     // Catch: java.lang.Exception -> L28
            r0.f219580w = r3     // Catch: java.lang.Exception -> L28
            java.lang.Object r8 = vkm.q.A(r7, r8, r0)     // Catch: java.lang.Exception -> L28
            if (r8 != r1) goto L56
            return r1
        L56:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8     // Catch: java.lang.Exception -> L28
            if (r8 == 0) goto L61
            java.lang.Object r7 = r8.getContent()     // Catch: java.lang.Exception -> L28
            com.revolut.feature.store.core.api.model.StoreProductStatusResponse r7 = (com.revolut.feature.store.core.api.model.StoreProductStatusResponse) r7     // Catch: java.lang.Exception -> L28
            return r7
        L61:
            return r4
        L62:
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto L70
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r7, r8)
            return r4
        L70:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a.J2(boolean, gim.c):java.lang.Object");
    }

    public final void K2(String str) {
        h.w2(this.u, new RevPointsExclusiveStoreProductFlowContract$Step.Checkout(str), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void L2(boolean z, StoreProductStatusResponse storeProductStatusResponse) {
        ExclusiveStoreInputData exclusiveStoreInputData = this.o;
        if (exclusiveStoreInputData instanceof ExclusiveStoreInputData.Checkout) {
            K2(((ExclusiveStoreInputData.Checkout) exclusiveStoreInputData).f83572a);
            return;
        }
        if (exclusiveStoreInputData instanceof ExclusiveStoreInputData.Onboarding) {
            ExclusiveStoreInputData.Onboarding onboarding = (ExclusiveStoreInputData.Onboarding) exclusiveStoreInputData;
            h.t2(this, this.u, new RevPointsExclusiveStoreProductFlowContract$Step.ProductArticle(onboarding.f83574a, onboarding.f83575b), true, null, false, 12);
            l.a1(this, q.g(((kka.h) this.f83591p).d), null, null, new j(this, null), 3);
            return;
        }
        if (exclusiveStoreInputData instanceof ExclusiveStoreInputData.SoldOut) {
            if (z) {
                K2(((ExclusiveStoreInputData.SoldOut) exclusiveStoreInputData).f83576a);
                return;
            } else {
                M2(nvb.c.SOLD_OUT, storeProductStatusResponse);
                return;
            }
        }
        if (!(exclusiveStoreInputData instanceof ExclusiveStoreInputData.ComingSoon)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            K2(((ExclusiveStoreInputData.ComingSoon) exclusiveStoreInputData).f83573a);
        } else {
            M2(nvb.c.COMING_SOON, storeProductStatusResponse);
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new f(this, null, 4), new yi5.b(26));
    }

    public final void M2(nvb.c cVar, StoreProductStatusResponse storeProductStatusResponse) {
        h.w2(this.u, new RevPointsExclusiveStoreProductFlowContract$Step.UnavailableProduct(cVar, storeProductStatusResponse != null ? storeProductStatusResponse.d : null, storeProductStatusResponse != null ? storeProductStatusResponse.e : null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void N2() {
        i iVar = this.u;
        if (iVar.d() instanceof RevPointsExclusiveStoreProductFlowContract$Step.ProductArticle) {
            B2();
        } else {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            iVar.n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(gim.c r9) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r9 instanceof nvb.k
            if (r0 == 0) goto L13
            r0 = r9
            nvb.k r0 = (nvb.k) r0
            int r1 = r0.f219582w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219582w = r1
            goto L18
        L13:
            nvb.k r0 = new nvb.k
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f219582w
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2b
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L29
            goto L58
        L29:
            r9 = move-exception
            goto L71
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            yhm.o.b(r9)
            y21.c r9 = r8.f83593r     // Catch: java.lang.Exception -> L29
            r9.getClass()     // Catch: java.lang.Exception -> L29
            com.revolut.data.network.models.security.SecuritySettings r2 = com.revolut.data.network.models.security.SecuritySettings.PERSONALIZED_THIRD_PARTY_PROMOTION     // Catch: java.lang.Exception -> L29
            w4l.h r6 = w4l.h.f294642c     // Catch: java.lang.Exception -> L29
            efm.r r9 = r9.b(r2, r6)     // Catch: java.lang.Exception -> L29
            vkm.d r9 = rd0.e.b(r9)     // Catch: java.lang.Exception -> L29
            m84.c r2 = new m84.c     // Catch: java.lang.Exception -> L29
            r6 = 2
            r7 = 8
            r2.<init>(r6, r7, r3)     // Catch: java.lang.Exception -> L29
            r0.f219582w = r5     // Catch: java.lang.Exception -> L29
            java.lang.Object r9 = vkm.q.A(r9, r2, r0)     // Catch: java.lang.Exception -> L29
            if (r9 != r1) goto L58
            return r1
        L58:
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9     // Catch: java.lang.Exception -> L29
            if (r9 == 0) goto L7e
            java.lang.Object r9 = r9.getContent()     // Catch: java.lang.Exception -> L29
            od0.i r9 = (od0.i) r9     // Catch: java.lang.Exception -> L29
            if (r9 == 0) goto L7e
            java.lang.Object r9 = r9.g()     // Catch: java.lang.Exception -> L29
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L29
            if (r9 == 0) goto L7e
            boolean r4 = r9.booleanValue()     // Catch: java.lang.Exception -> L29
            goto L7e
        L71:
            boolean r0 = r9 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L83
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r9, r0)
        L7e:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        L83:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a.O2(gim.c):java.lang.Object");
    }

    @Override // qki.e
    public final d getState() {
        return this.f83595t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
