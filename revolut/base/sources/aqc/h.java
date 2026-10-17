package aqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements vpc.a, k {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f8314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z71.a f8315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f8316c;
    public final mqc.f d;
    public final jla.h e;

    public h(ang.f userInteractor, z71.a revolutBankAccountsRepository, gte.a featureToggleInteractor, mqc.f salarySwitchRepository, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(revolutBankAccountsRepository, "revolutBankAccountsRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(salarySwitchRepository, "salarySwitchRepository");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f8314a = userInteractor;
        this.f8315b = revolutBankAccountsRepository;
        this.f8316c = featureToggleInteractor;
        this.d = salarySwitchRepository;
        this.e = productCatalogueInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof aqc.c
            if (r0 == 0) goto L13
            r0 = r7
            aqc.c r0 = (aqc.c) r0
            int r1 = r0.f8308w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8308w = r1
            goto L18
        L13:
            aqc.c r0 = new aqc.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8308w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L4c
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            xi0.a r7 = xi0.b.Companion
            r7.getClass()
            xi0.b r6 = xi0.a.a(r6)
            z71.a r7 = r5.f8315b
            r2 = 6
            pfm.z r6 = z71.a.a(r7, r6, r4, r2)
            r0.f8308w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            java.util.List r7 = (java.util.List) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r6 = r7.iterator()
        L57:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L73
            java.lang.Object r7 = r6.next()
            r0 = r7
            n71.b r0 = (n71.b) r0
            if (r0 == 0) goto L6f
            java.lang.Boolean r0 = r0.k
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            goto L70
        L6f:
            r0 = 0
        L70:
            if (r0 == 0) goto L57
            return r7
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: aqc.h.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof aqc.d
            if (r0 == 0) goto L13
            r0 = r7
            aqc.d r0 = (aqc.d) r0
            int r1 = r0.f8309w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8309w = r1
            goto L18
        L13:
            aqc.d r0 = new aqc.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8309w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L64
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            ang.f r7 = r6.f8314a
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            aqb.s r2 = new aqb.s
            r4 = 6
            r2.<init>(r4)
            aoa.h r4 = new aoa.h
            r5 = 5
            r4.<init>(r2, r5)
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            od0.h r7 = od0.i.Companion
            r7.getClass()
            od0.i r7 = od0.i.f224256b
            pfm.z r7 = ue0.e.F(r2, r7)
            r0.f8309w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            od0.i r7 = (od0.i) r7
            java.lang.Object r7 = r7.f224257a
            java.lang.String r7 = (java.lang.String) r7
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            java.lang.String r0 = "MX"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            gte.a r2 = r6.f8316c
            if (r1 == 0) goto L84
            com.revolut.feature.salary_switch.api.SalarySwitchApi$Toggles$CountrySalarySwitch r7 = com.revolut.feature.salary_switch.api.SalarySwitchApi$Toggles$CountrySalarySwitch.f85225c
            jte.d r2 = (jte.d) r2
            boolean r7 = r2.c(r7)
            if (r7 == 0) goto L97
            return r0
        L84:
            java.lang.String r0 = "BR"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r7 == 0) goto L97
            com.revolut.feature.salary_switch.api.SalarySwitchApi$Toggles$BrazilSalaryTransfers r7 = com.revolut.feature.salary_switch.api.SalarySwitchApi$Toggles$BrazilSalaryTransfers.f85224c
            jte.d r2 = (jte.d) r2
            boolean r7 = r2.c(r7)
            if (r7 == 0) goto L97
            return r0
        L97:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: aqc.h.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof aqc.e
            if (r0 == 0) goto L13
            r0 = r8
            aqc.e r0 = (aqc.e) r0
            int r1 = r0.f8310w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8310w = r1
            goto L18
        L13:
            aqc.e r0 = new aqc.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8310w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r8)
            goto L4e
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            yhm.o.b(r8)
            r0.f8310w = r4
            mqc.f r8 = r7.d
            mqc.k r8 = (mqc.k) r8
            r8.getClass()
            mci.e r2 = new mci.e
            r4 = 18
            r2.<init>(r8, r3, r4)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L5d
            return r3
        L5d:
            java.lang.Object r0 = r8.next()
            boolean r1 = r8.hasNext()
            if (r1 != 0) goto L68
            return r0
        L68:
            r1 = r0
            bqc.n r1 = (bqc.n) r1
            long r1 = r1.f17815c
        L6d:
            java.lang.Object r3 = r8.next()
            r4 = r3
            bqc.n r4 = (bqc.n) r4
            long r4 = r4.f17815c
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L7c
            r0 = r3
            r1 = r4
        L7c:
            boolean r3 = r8.hasNext()
            if (r3 != 0) goto L6d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aqc.h.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview.Account r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof aqc.f
            if (r0 == 0) goto L13
            r0 = r8
            aqc.f r0 = (aqc.f) r0
            int r1 = r0.f8312x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8312x = r1
            goto L18
        L13:
            aqc.f r0 = new aqc.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8312x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview$Account r7 = r0.u
            yhm.o.b(r8)
            goto L88
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview$Account r7 = r0.u
            yhm.o.b(r8)
            goto L60
        L3a:
            yhm.o.b(r8)
            boolean r8 = r7 instanceof com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview.Account.Card
            r2 = 0
            mqc.f r5 = r6.d
            if (r8 == 0) goto L68
            r8 = r7
            com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview$Account$Card r8 = (com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview.Account.Card) r8
            r0.u = r7
            r0.f8312x = r4
            mqc.k r5 = (mqc.k) r5
            r5.getClass()
            mqc.g r3 = new mqc.g
            r3.<init>(r5, r8, r2)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r3, r0)
            if (r8 != r1) goto L60
            goto L87
        L60:
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.String r1 = "[0000] [0000] [0000] [0000] [000]"
            r0.<init>(r8, r1)
            goto L8f
        L68:
            boolean r8 = r7 instanceof com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview.Account.Clabe
            if (r8 == 0) goto Laf
            r8 = r7
            com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview$Account$Clabe r8 = (com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview.Account.Clabe) r8
            r0.u = r7
            r0.f8312x = r3
            mqc.k r5 = (mqc.k) r5
            r5.getClass()
            mqc.h r3 = new mqc.h
            r3.<init>(r5, r8, r2)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r3, r0)
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.String r1 = "[0000] [0000] [0000] [0000000]"
            r0.<init>(r8, r1)
        L8f:
            java.lang.Object r8 = r0.f186385a
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r0.f186386b
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap r1 = im.c.f162274c
            zhm.f0 r1 = zhm.f0.f322471a
            im.c r0 = v13.d.l(r0, r1)
            java.lang.String r7 = r7.getF85234a()
            java.lang.String r7 = uc0.b.f(r7, r0)
            java.lang.String r0 = "{{orderingAccount}}"
            r1 = 0
            java.lang.String r7 = kotlin.text.a0.D(r8, r0, r7, r1)
            return r7
        Laf:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: aqc.h.d(com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview$Account, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof aqc.g
            if (r0 == 0) goto L13
            r0 = r7
            aqc.g r0 = (aqc.g) r0
            int r1 = r0.f8313w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8313w = r1
            goto L18
        L13:
            aqc.g r0 = new aqc.g
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8313w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 == 0) goto L3b
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L3b:
            r0.f8313w = r3
            java.lang.Object r7 = r4.a(r6, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            n71.b r7 = (n71.b) r7
            if (r7 == 0) goto L49
            goto L4a
        L49:
            r3 = 0
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: aqc.h.e(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
