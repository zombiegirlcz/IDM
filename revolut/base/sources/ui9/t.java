package ui9;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.l2;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh9.a f280347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f280348b;

    public t(xh9.a payLaterInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f280347a = payLaterInteractor;
        this.f280348b = dateProvider;
    }

    public static boolean a(dj0.d dVar, l2 l2Var) {
        xi0.b bVar = dVar.f115083b;
        xi0.b.Companion.getClass();
        dj0.d dVarC = dj0.d.c(dVar, Intrinsics.f(bVar, xi0.b.k) ? 13000L : CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, null, 2);
        l2[] elements = {l2.GROCERIES, l2.RESTAURANTS, l2.SHOPPING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return dVar.compareTo(dVarC) < 0 && d0.T(kotlin.collections.d.y0(elements), l2Var);
    }

    public static boolean b(dj0.d dVar, l2 l2Var) {
        xi0.b bVar = dVar.f115083b;
        xi0.b.Companion.getClass();
        dj0.d dVarC = dj0.d.c(dVar, Intrinsics.f(bVar, xi0.b.k) ? 43000L : 10000L, null, 2);
        l2[] elements = {l2.HEALTH, l2.UTILITIES, l2.TRANSPORT, l2.SHOPPING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return dVar.compareTo(dVarC) >= 0 && d0.T(kotlin.collections.d.y0(elements), l2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(ui9.t r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof ui9.p
            if (r0 == 0) goto L13
            r0 = r5
            ui9.p r0 = (ui9.p) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ui9.p r0 = new ui9.p
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L63
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            xh9.a r4 = r4.f280347a
            efm.r r4 = xh9.a.a(r4)
            ueg.p0 r5 = new ueg.p0
            r2 = 20
            r5.<init>(r2)
            efm.r r4 = nim.a.w(r4, r5)
            ud3.f0 r5 = new ud3.f0
            r2 = 24
            r5.<init>(r2)
            r2 = 0
            efm.r r4 = m70.a.g(r4, r2, r5, r3)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            efm.r r4 = r4.onErrorReturnItem(r5)
            java.lang.String r5 = "onErrorReturnItem(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.v = r3
            java.lang.Object r5 = nim.a.c(r4, r0)
            if (r5 != r1) goto L63
            return r1
        L63:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ui9.t.d(ui9.t, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ui9.o
            if (r0 == 0) goto L13
            r0 = r7
            ui9.o r0 = (ui9.o) r0
            int r1 = r0.f280344w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280344w = r1
            goto L18
        L13:
            ui9.o r0 = new ui9.o
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280344w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L9b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L42
        L36:
            yhm.o.b(r7)
            r0.f280344w = r4
            java.lang.Object r7 = d(r6, r0)
            if (r7 != r1) goto L42
            goto L9a
        L42:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L63
            wi9.g r7 = new wi9.g
            wi9.b r0 = wi9.b.Loan
            wi9.a r1 = wi9.a.Generic
            r7.<init>(r0, r1)
            wi9.g r0 = new wi9.g
            wi9.b r2 = wi9.b.CreditCard
            r0.<init>(r2, r1)
            wi9.g[] r7 = new wi9.g[]{r7, r0}
            java.util.List r7 = zhm.v.k(r7)
            return r7
        L63:
            r0.f280344w = r3
            w4l.j r7 = w4l.j.f294644c
            xh9.a r2 = r6.f280347a
            ti9.g r2 = (ti9.g) r2
            cxe.u r7 = r2.k(r7)
            ueg.p0 r2 = new ueg.p0
            r3 = 19
            r2.<init>(r3)
            akg.n r7 = nim.a.v(r7, r2)
            ud3.f0 r2 = new ud3.f0
            r3 = 23
            r2.<init>(r3)
            r3 = 0
            jhi.b r7 = mo3.a.g(r7, r3, r2, r4)
            tc6.d r2 = new tc6.d
            r4 = 3
            r5 = 22
            r2.<init>(r4, r5, r3)
            zhm.h0 r3 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r3, r2)
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L9b
        L9a:
            return r1
        L9b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lbc
            wi9.g r7 = new wi9.g
            wi9.b r0 = wi9.b.Loan
            wi9.a r1 = wi9.a.Contextual
            r7.<init>(r0, r1)
            wi9.g r0 = new wi9.g
            wi9.b r2 = wi9.b.CreditCard
            r0.<init>(r2, r1)
            wi9.g[] r7 = new wi9.g[]{r7, r0}
            java.util.List r7 = zhm.v.k(r7)
            return r7
        Lbc:
            zhm.f0 r7 = zhm.f0.f322471a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ui9.t.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(ai9.e r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ui9.q
            if (r0 == 0) goto L13
            r0 = r8
            ui9.q r0 = (ui9.q) r0
            int r1 = r0.f280345w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280345w = r1
            goto L18
        L13:
            ui9.q r0 = new ui9.q
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280345w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)
            goto L66
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            yhm.o.b(r8)
            java.lang.String r8 = r7.f5221a
            int r7 = r7.f5222b
            xh9.a r2 = r6.f280347a
            ti9.g r2 = (ti9.g) r2
            r2.getClass()
            java.lang.String r5 = "planId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r5)
            efm.r r8 = r2.l(r8)
            l2c.l r2 = new l2c.l
            r5 = 20
            r2.<init>(r7, r5)
            efm.r r7 = nim.a.w(r8, r2)
            ud3.f0 r8 = new ud3.f0
            r2 = 25
            r8.<init>(r2)
            efm.r r7 = m70.a.g(r7, r4, r8, r3)
            r0.f280345w = r3
            java.lang.Object r8 = nim.a.c(r7, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            zh9.y r8 = (zh9.y) r8
            zh9.r0 r7 = r8.f322365a
            java.lang.String r7 = r7.f322329g
            if (r7 == 0) goto L72
            tof.l2 r4 = tof.l3.c(r7)
        L72:
            zh9.r0 r7 = r8.f322365a
            dj0.d r7 = r7.f322331j
            aim.e r8 = zhm.u.b()
            tof.l2 r0 = tof.l2.TRAVEL
            if (r4 != r0) goto L8b
            wi9.g r0 = new wi9.g
            wi9.b r1 = wi9.b.Loan
            wi9.a r2 = wi9.a.Contextual
            r0.<init>(r1, r2)
            r8.add(r0)
            goto L9d
        L8b:
            boolean r0 = b(r7, r4)
            if (r0 == 0) goto L9d
            wi9.g r0 = new wi9.g
            wi9.b r1 = wi9.b.Loan
            wi9.a r2 = wi9.a.Generic
            r0.<init>(r1, r2)
            r8.add(r0)
        L9d:
            boolean r7 = a(r7, r4)
            if (r7 == 0) goto Laf
            wi9.g r7 = new wi9.g
            wi9.b r0 = wi9.b.CreditCard
            wi9.a r1 = wi9.a.Generic
            r7.<init>(r0, r1)
            r8.add(r7)
        Laf:
            aim.e r7 = zhm.u.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ui9.t.e(ai9.e, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(gim.c r7) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ui9.t.f(gim.c):java.io.Serializable");
    }
}
