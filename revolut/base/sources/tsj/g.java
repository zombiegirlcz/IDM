package tsj;

import akg.n;
import jla.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vsj.q;
import w4l.k;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vsj.a f274141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f274142b;

    public g(vsj.a repository, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f274141a = repository;
        this.f274142b = productCatalogueInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dj0.d r5, gim.c r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tsj.a
            if (r0 == 0) goto L13
            r0 = r6
            tsj.a r0 = (tsj.a) r0
            int r1 = r0.f274135w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274135w = r1
            goto L18
        L13:
            tsj.a r0 = new tsj.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274135w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L4a
        L29:
            r5 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.a r6 = r4.f274141a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f274135w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.q r6 = (vsj.q) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r6.c(r5, r0, r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L50
        L4a:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L50:
            boolean r5 = r5 instanceof yhm.n
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L58:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tsj.g.a(dj0.d, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(vzi.a r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof tsj.b
            if (r0 == 0) goto L13
            r0 = r7
            tsj.b r0 = (tsj.b) r0
            int r1 = r0.f274136w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274136w = r1
            goto L18
        L13:
            tsj.b r0 = new tsj.b
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274136w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L4a
        L29:
            r5 = move-exception
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.a r7 = r4.f274141a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f274136w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.q r7 = (vsj.q) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r7 = r7.d(r5, r6, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r7 != r1) goto L45
            return r1
        L45:
            com.revolut.retail.feature.api.custom_assets.models.CustomAsset r7 = (com.revolut.retail.feature.api.custom_assets.models.CustomAsset) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r7
        L4a:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
            return r5
        L51:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tsj.g.b(vzi.a, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tsj.c
            if (r0 == 0) goto L13
            r0 = r6
            tsj.c r0 = (tsj.c) r0
            int r1 = r0.f274137w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274137w = r1
            goto L18
        L13:
            tsj.c r0 = new tsj.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274137w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L4a
        L29:
            r5 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.a r6 = r4.f274141a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f274137w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.q r6 = (vsj.q) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r6.e(r5, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L50
        L4a:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L50:
            boolean r5 = r5 instanceof yhm.n
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L58:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tsj.g.c(java.lang.String, gim.c):java.lang.Object");
    }

    public final boolean d() {
        return this.f274142b.d("MONEY_HEALTH.custom_assets", null).a();
    }

    public final boolean e() {
        if (d()) {
            jla.c cVarC = bla.b.c(this.f274142b, "MONEY_HEALTH");
            if (cVarC != null ? Intrinsics.f(cVarC.a("custom_assets_smart_estimation"), Boolean.TRUE) : false) {
                return true;
            }
        }
        return false;
    }

    public final n f(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        q qVar = (q) this.f274141a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(qVar.f.b(Unit.f186387a, loadingStrategy), new tpi.g(28));
    }

    public final vkm.d g(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        q qVar = (q) this.f274141a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return qVar.f291840g.b(Unit.f186387a, loadingStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tsj.d
            if (r0 == 0) goto L13
            r0 = r6
            tsj.d r0 = (tsj.d) r0
            int r1 = r0.f274138w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274138w = r1
            goto L18
        L13:
            tsj.d r0 = new tsj.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274138w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L4a
        L29:
            r5 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.a r6 = r4.f274141a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f274138w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.q r6 = (vsj.q) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r6.i(r5, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L50
        L4a:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L50:
            boolean r5 = r5 instanceof yhm.n
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L58:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tsj.g.h(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r5, vzi.g r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof tsj.e
            if (r0 == 0) goto L13
            r0 = r7
            tsj.e r0 = (tsj.e) r0
            int r1 = r0.f274139w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274139w = r1
            goto L18
        L13:
            tsj.e r0 = new tsj.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274139w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L4a
        L29:
            r5 = move-exception
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.a r7 = r4.f274141a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f274139w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.q r7 = (vsj.q) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r7 = r7.j(r5, r6, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r7 != r1) goto L45
            return r1
        L45:
            vzi.h r7 = (vzi.h) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r7
        L4a:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
            return r5
        L51:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tsj.g.i(java.lang.String, vzi.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r5, java.time.LocalDate r6, dj0.d r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof tsj.f
            if (r0 == 0) goto L13
            r0 = r8
            tsj.f r0 = (tsj.f) r0
            int r1 = r0.f274140w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274140w = r1
            goto L18
        L13:
            tsj.f r0 = new tsj.f
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274140w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L4a
        L29:
            r5 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.a r8 = r4.f274141a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f274140w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vsj.q r8 = (vsj.q) r8     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r8.k(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L50
        L4a:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L50:
            boolean r5 = r5 instanceof yhm.n
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L58:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tsj.g.j(java.lang.String, java.time.LocalDate, dj0.d, gim.c):java.lang.Object");
    }
}
