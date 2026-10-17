package e25;

import a35.n;
import kotlin.jvm.internal.Intrinsics;
import nhe.p;
import yfe.h;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends yfe.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vie.h f122033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final she.g f122034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f122035n;

    public e(vie.h tabCreditAvailabilityInteractor, she.g productAccountDestinationResolver, n creditProductsMediator) {
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(creditProductsMediator, "creditProductsMediator");
        this.f122033l = tabCreditAvailabilityInteractor;
        this.f122034m = productAccountDestinationResolver;
        this.f122035n = creditProductsMediator;
    }

    @Override // yfe.c
    public final Object b3(h.c cVar, p pVar) {
        return e3(pVar);
    }

    @Override // yfe.c
    public final Object c3(h.a aVar, p pVar) {
        return e3(pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof e25.c
            if (r0 == 0) goto L13
            r0 = r6
            e25.c r0 = (e25.c) r0
            int r1 = r0.f122030w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122030w = r1
            goto L18
        L13:
            e25.c r0 = new e25.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122030w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L61
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            w4l.j r6 = w4l.j.f294644c
            a35.n r2 = r5.f122035n
            a35.q r2 = (a35.q) r2
            kotlinx.coroutines.flow.Flow r6 = r2.a(r6)
            e1d.h r2 = new e1d.h
            r4 = 2
            r2.<init>(r4)
            cxe.u r6 = n14.k.p(r6, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r6 = rd0.e.n(r6, r2)
            e07.k r2 = new e07.k
            r4 = 12
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f122030w = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L67
            zhm.f0 r6 = zhm.f0.f322471a
        L67:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e25.e.d3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof e25.d
            if (r0 == 0) goto L13
            r0 = r6
            e25.d r0 = (e25.d) r0
            int r1 = r0.f122032x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122032x = r1
            goto L18
        L13:
            e25.d r0 = new e25.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122032x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            e25.e r0 = r0.u
            yhm.o.b(r6)
            goto L67
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            goto L4f
        L38:
            yhm.o.b(r6)
            vie.h r6 = r5.f122033l
            boolean r6 = r6.a()
            if (r6 != 0) goto L46
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L46:
            r0.f122032x = r4
            java.lang.Object r6 = r5.d3(r0)
            if (r6 != r1) goto L4f
            goto L65
        L4f:
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            if (r6 != r4) goto L6d
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r6 = ibb.c.f
            r0.u = r5
            r0.f122032x = r3
            she.g r2 = r5.f122034m
            java.lang.Object r6 = r2.b(r6, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            r0 = r5
        L67:
            aii.u r6 = (aii.u) r6
            r0.A2(r6)
            goto L6e
        L6d:
            r4 = 0
        L6e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e25.e.e3(gim.c):java.lang.Object");
    }
}
