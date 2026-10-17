package hma;

import ffk.t;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements rla.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f153598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ekg.g f153599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vjg.g f153600c;
    public final ang.f d;
    public final lma.b e;
    public final bn2.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cm2.g f153601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f153602h;

    public g(t pricingPlanInteractor, ekg.g uiPersonalisationInteractor, vjg.g themeCatalog, ang.f userInteractor, lma.b premiumThemeMigrationRepository, bn2.p backgroundsInteractor, cm2.g backgroundsMigrator) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(themeCatalog, "themeCatalog");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(premiumThemeMigrationRepository, "premiumThemeMigrationRepository");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(backgroundsMigrator, "backgroundsMigrator");
        this.f153598a = pricingPlanInteractor;
        this.f153599b = uiPersonalisationInteractor;
        this.f153600c = themeCatalog;
        this.d = userInteractor;
        this.e = premiumThemeMigrationRepository;
        this.f = backgroundsInteractor;
        this.f153601g = backgroundsMigrator;
        this.f153602h = yhm.j.b(new h1g.a(this, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof hma.a
            if (r0 == 0) goto L13
            r0 = r6
            hma.a r0 = (hma.a) r0
            int r1 = r0.f153586w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f153586w = r1
            goto L18
        L13:
            hma.a r0 = new hma.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f153586w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L46
        L36:
            yhm.o.b(r6)
            r0.f153586w = r4
            vjg.g r6 = r5.f153600c
            gwl.d r6 = (gwl.d) r6
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L46
            goto L53
        L46:
            ekg.g r6 = r5.f153599b
            wjg.a.a(r6)
            r0.f153586w = r3
            java.lang.Object r6 = r5.c(r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hma.g.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof hma.b
            if (r0 == 0) goto L13
            r0 = r6
            hma.b r0 = (hma.b) r0
            int r1 = r0.f153587w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f153587w = r1
            goto L18
        L13:
            hma.b r0 = new hma.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f153587w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L62
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            kotlin.Lazy r6 = r5.f153602h
            java.lang.Object r6 = r6.getValue()
            efm.r r6 = (efm.r) r6
            hg4.a r2 = new hg4.a
            r4 = 17
            r2.<init>(r5, r4)
            efm.r r6 = pd.b.r(r6, r2)
            hkb.e r2 = new hkb.e
            r4 = 6
            r2.<init>(r4)
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f153587w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hma.g.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r13) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hma.g.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r7, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof hma.d
            if (r0 == 0) goto L13
            r0 = r9
            hma.d r0 = (hma.d) r0
            int r1 = r0.f153593y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f153593y = r1
            goto L18
        L13:
            hma.d r0 = new hma.d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f153591w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f153593y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r7 = r0.v
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r8 = r0.u
            yhm.o.b(r9)
            goto L6c
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r8 = r0.v
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r7 = r0.u
            yhm.o.b(r9)
            goto L50
        L3e:
            yhm.o.b(r9)
            r0.u = r7
            r0.v = r8
            r0.f153593y = r4
            ekg.g r9 = r6.f153599b
            java.lang.Object r9 = r9.n(r8, r0)
            if (r9 != r1) goto L50
            goto L68
        L50:
            bn2.p r9 = r6.f
            boolean r9 = r9.d(r7)
            if (r9 == 0) goto L6f
            r0.u = r7
            r0.v = r8
            r0.f153593y = r3
            cm2.g r9 = r6.f153601g
            bn2.s r9 = (bn2.s) r9
            java.lang.Object r9 = r9.a(r7, r8, r0)
            if (r9 != r1) goto L69
        L68:
            return r1
        L69:
            r5 = r8
            r8 = r7
            r7 = r5
        L6c:
            r5 = r8
            r8 = r7
            r7 = r5
        L6f:
            rla.b r9 = new rla.b
            r9.<init>(r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hma.g.d(com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r12 == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        if (r12 == r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof hma.e
            if (r0 == 0) goto L14
            r0 = r12
            hma.e r0 = (hma.e) r0
            int r1 = r0.f153595x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f153595x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            hma.e r0 = new hma.e
            r0.<init>(r11, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f153595x
            r2 = 3
            r3 = 2
            r4 = 1
            r6 = r1
            ekg.g r1 = r11.f153599b
            r7 = 0
            if (r6 == 0) goto L46
            if (r6 == r4) goto L42
            if (r6 == r3) goto L3c
            if (r6 != r2) goto L34
            yhm.o.b(r12)
            goto Lbf
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3c:
            com.revolut.feature.uipersonalisation.api.models.ColorThemeOption r3 = r5.u
            yhm.o.b(r12)
            goto L9a
        L42:
            yhm.o.b(r12)
            goto L89
        L46:
            yhm.o.b(r12)
            com.revolut.feature.uipersonalisation.api.models.AppTheme r12 = r1.j()
            xjg.j r12 = r12.f94563c
            vjg.g r6 = r11.f153600c
            java.util.ArrayList r6 = r6.c()
            java.util.Iterator r6 = r6.iterator()
        L59:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L6b
            java.lang.Object r8 = r6.next()
            r9 = r8
            com.revolut.feature.uipersonalisation.api.models.ColorThemeOption r9 = (com.revolut.feature.uipersonalisation.api.models.ColorThemeOption) r9
            xjg.j r9 = r9.f94564a
            if (r9 != r12) goto L59
            goto L6c
        L6b:
            r8 = r7
        L6c:
            r12 = r8
            com.revolut.feature.uipersonalisation.api.models.ColorThemeOption r12 = (com.revolut.feature.uipersonalisation.api.models.ColorThemeOption) r12
            if (r12 != 0) goto L8c
            r6 = r4
            xjg.j r4 = xjg.j.DEFAULT
            r5.u = r7
            r5.f153595x = r6
            r3 = 0
            r6 = 3
            r2 = 0
            java.lang.Object r12 = wjg.a.b(r1, r2, r3, r4, r5, r6)
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            if (r12 != r1) goto L84
            goto L86
        L84:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L86:
            if (r12 != r0) goto L89
            goto Lbe
        L89:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L8c:
            r5.u = r12
            r5.f153595x = r3
            java.lang.Object r3 = r11.b(r5)
            if (r3 != r0) goto L97
            goto Lbe
        L97:
            r10 = r3
            r3 = r12
            r12 = r10
        L9a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            xjg.k r3 = r3.f94566c
            xjg.k r4 = xjg.k.PREMIUM
            if (r3 != r4) goto Lc2
            if (r12 != 0) goto Lc2
            xjg.j r4 = xjg.j.DEFAULT
            r5.u = r7
            r5.f153595x = r2
            r3 = 0
            r6 = 3
            r2 = 0
            java.lang.Object r12 = wjg.a.b(r1, r2, r3, r4, r5, r6)
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            if (r12 != r1) goto Lba
            goto Lbc
        Lba:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        Lbc:
            if (r12 != r0) goto Lbf
        Lbe:
            return r0
        Lbf:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        Lc2:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: hma.g.e(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r6, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r7, gim.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof hma.f
            if (r0 == 0) goto L13
            r0 = r8
            hma.f r0 = (hma.f) r0
            int r1 = r0.f153597x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f153597x = r1
            goto L18
        L13:
            hma.f r0 = new hma.f
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f153597x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L76
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r7 = r0.u
            yhm.o.b(r8)
            goto L48
        L38:
            yhm.o.b(r8)
            r0.u = r7
            r0.f153597x = r4
            ekg.g r8 = r5.f153599b
            java.lang.Object r6 = r8.n(r6, r0)
            if (r6 != r1) goto L48
            goto L75
        L48:
            r6 = 0
            r0.u = r6
            r0.f153597x = r3
            bn2.p r8 = r5.f
            km2.k r8 = r8.f17033a
            km2.j r7 = m70.a.j(r7)
            km2.r r8 = (km2.r) r8
            r8.getClass()
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            kb7.c r3 = new kb7.c
            r4 = 22
            r3.<init>(r8, r7, r6, r4)
            java.lang.Object r6 = skm.e0.J(r2, r3, r0)
            if (r6 != r1) goto L6c
            goto L6e
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L6e:
            if (r6 != r1) goto L71
            goto L73
        L71:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L73:
            if (r6 != r1) goto L76
        L75:
            return r1
        L76:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hma.g.f(com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration, gim.c):java.lang.Object");
    }
}
