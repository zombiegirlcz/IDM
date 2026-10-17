package jhe;

import ahe.j0;
import ahe.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements pfe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f174242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f174243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kge.d f174244c;

    public w(gte.a featureToggleInteractor, d4m.a interactor, x mapper, kge.d apmHomeActionsProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(apmHomeActionsProvider, "apmHomeActionsProvider");
        this.f174242a = featureToggleInteractor;
        this.f174243b = interactor;
        this.f174244c = apmHomeActionsProvider;
    }

    @Override // pfe.g
    public final Flow a() {
        return new v1(new u(this, null));
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        w0 w0Var = (w0) ((ahe.t) this.f174243b.get());
        w0Var.getClass();
        return nim.a.v(u0.m(nim.a.v(u0.m(new v1(new j0(w0Var, null, 0)), vkm.q.q(nim.a.v(w0Var.f5043g.e(w4l.h.f294642c), new agh.h(15)))), new ahe.u(w0Var, 2)), this.f174244c.p()), new je5.n(this, 28));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (skm.e0.o(r8, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof jhe.v
            if (r0 == 0) goto L13
            r0 = r8
            jhe.v r0 = (jhe.v) r0
            int r1 = r0.f174241x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174241x = r1
            goto L1a
        L13:
            jhe.v r0 = new jhe.v
            gim.c r8 = (gim.c) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174241x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L95
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            ahe.w0 r2 = r0.u
            yhm.o.b(r8)
            goto L76
        L3b:
            yhm.o.b(r8)
            com.revolut.feature.tab.accounts.api.TabAccountsApi$Toggles$HomeTotalWealth r8 = com.revolut.feature.tab.accounts.api.TabAccountsApi$Toggles.HomeTotalWealth.f89457c
            gte.a r2 = r7.f174242a
            jte.d r2 = (jte.d) r2
            boolean r8 = r2.c(r8)
            if (r8 != 0) goto L4d
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L4d:
            d4m.a r8 = r7.f174243b
            java.lang.Object r8 = r8.get()
            java.lang.String r2 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            ahe.t r8 = (ahe.t) r8
            r2 = r8
            ahe.w0 r2 = (ahe.w0) r2
            r2.getClass()
            ahe.j0 r8 = new ahe.j0
            r6 = 0
            r8.<init>(r2, r5, r6)
            vkm.v1 r6 = new vkm.v1
            r6.<init>(r8)
            r0.u = r2
            r0.f174241x = r4
            java.lang.Object r8 = vkm.q.x(r6, r0)
            if (r8 != r1) goto L76
            goto L94
        L76:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r4 = r8.getContent()
            if (r4 != 0) goto L98
            boolean r8 = r8.getLoading()
            if (r8 != 0) goto L85
            goto L98
        L85:
            ix6.l0 r8 = new ix6.l0
            r8.<init>(r2, r5)
            r0.u = r5
            r0.f174241x = r3
            java.lang.Object r8 = skm.e0.o(r8, r0)
            if (r8 != r1) goto L95
        L94:
            return r1
        L95:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L98:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jhe.w.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
