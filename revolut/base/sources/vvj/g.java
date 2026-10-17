package vvj;

import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import sa6.o;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements j0j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xvj.e f292565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f292566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f292567c;

    public g(xvj.e repository, h productCatalogueInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f292565a = repository;
        this.f292566b = productCatalogueInteractor;
        this.f292567c = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r11, java.util.List r12, wi0.b r13) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof vvj.a
            if (r0 == 0) goto L13
            r0 = r11
            vvj.a r0 = (vvj.a) r0
            int r1 = r0.f292559w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292559w = r1
            goto L18
        L13:
            vvj.a r0 = new vvj.a
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292559w
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            goto L56
        L28:
            r0 = move-exception
            r11 = r0
            goto L5b
        L2b:
            r0 = move-exception
            r11 = r0
            goto L68
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            yhm.o.b(r11)
            yhm.m$a r11 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            xvj.e r7 = r10.f292565a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            r0.f292559w = r3     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            r7.getClass()     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            wh3.h r4 = new wh3.h     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            r9 = 20
            r6 = r12
            r5 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            skm.p0 r11 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            elm.f r11 = elm.f.f127540b     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            if (r11 != r1) goto L56
            return r1
        L56:
            com.revolut.retail.feature.api.trips.models.Trip r11 = (com.revolut.retail.feature.api.trips.models.Trip) r11     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2b
            goto L61
        L5b:
            yhm.m$a r12 = yhm.m.INSTANCE
            yhm.n r11 = yhm.o.a(r11)
        L61:
            boolean r12 = r11 instanceof yhm.n
            if (r12 == 0) goto L66
            goto L67
        L66:
            r8 = r11
        L67:
            return r8
        L68:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vvj.g.b(gim.c, java.util.List, wi0.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vvj.b
            if (r0 == 0) goto L13
            r0 = r6
            vvj.b r0 = (vvj.b) r0
            int r1 = r0.f292560w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292560w = r1
            goto L18
        L13:
            vvj.b r0 = new vvj.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292560w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L43
        L27:
            r5 = move-exception
            goto L48
        L29:
            r5 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            xvj.e r6 = r4.f292565a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f292560w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L4e
        L48:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L4e:
            boolean r5 = r5 instanceof yhm.n
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vvj.g.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vvj.c
            if (r0 == 0) goto L13
            r0 = r6
            vvj.c r0 = (vvj.c) r0
            int r1 = r0.f292561w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292561w = r1
            goto L18
        L13:
            vvj.c r0 = new vvj.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292561w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L43
        L27:
            r5 = move-exception
            goto L48
        L29:
            r5 = move-exception
            goto L54
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            xvj.e r6 = r4.f292565a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f292561w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r6 = r6.c(r5, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L4e
        L48:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r5)
        L4e:
            boolean r5 = r6 instanceof yhm.n
            if (r5 == 0) goto L53
            r6 = 0
        L53:
            return r6
        L54:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vvj.g.d(java.lang.String, gim.c):java.io.Serializable");
    }

    public final Flow e() {
        return ((jte.d) this.f292567c).c(AnalyticsFeatureApi$Toggles.AnalyticsTravelFeatures.f87390c) ? new go.g(Boolean.TRUE, 2) : new o(bla.b.b(this.f292566b, "TRAVEL_LIFECYCLE.travel_map"), 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, long r6, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof vvj.e
            if (r0 == 0) goto L13
            r0 = r8
            vvj.e r0 = (vvj.e) r0
            int r1 = r0.f292563w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292563w = r1
            goto L18
        L13:
            vvj.e r0 = new vvj.e
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292563w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L43
        L27:
            r5 = move-exception
            goto L48
        L29:
            r5 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            xvj.e r8 = r4.f292565a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f292563w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r8.d(r5, r6, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L4e
        L48:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L4e:
            boolean r5 = r5 instanceof yhm.n
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vvj.g.f(java.lang.String, long, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r9, java.time.ZonedDateTime r10, java.time.ZonedDateTime r11, java.util.ArrayList r12, gim.c r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof vvj.f
            if (r0 == 0) goto L14
            r0 = r13
            vvj.f r0 = (vvj.f) r0
            int r1 = r0.f292564w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f292564w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            vvj.f r0 = new vvj.f
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f292564w
            r7 = 1
            if (r1 == 0) goto L37
            if (r1 != r7) goto L2f
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            goto L4b
        L29:
            r0 = move-exception
            r9 = r0
            goto L50
        L2c:
            r0 = move-exception
            r9 = r0
            goto L5e
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            yhm.o.b(r13)
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            xvj.e r1 = r8.f292565a     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            r6.f292564w = r7     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r9 = r1.e(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            if (r9 != r0) goto L4b
            return r0
        L4b:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            goto L56
        L50:
            yhm.m$a r10 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L56:
            boolean r9 = r9 instanceof yhm.n
            r9 = r9 ^ r7
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L5e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vvj.g.g(java.lang.String, java.time.ZonedDateTime, java.time.ZonedDateTime, java.util.ArrayList, gim.c):java.lang.Object");
    }
}
