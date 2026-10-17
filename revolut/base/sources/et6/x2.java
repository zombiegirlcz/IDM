package et6;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 implements gr6.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9k.f f129369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zja.a f129370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final au6.z1 f129371c;
    public final hs6.b d;
    public final p1 e;
    public final zjh.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gr6.h f129372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bbd.b f129373h;
    public final bgc.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ang.f f129374j;
    public final l61.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ppg.b f129375l;

    public x2(b9k.f acquiringOrderInteractor, zja.a productArticleInteractor, au6.z1 productArticleRepository, hs6.b proProductArticleFactory, p1 freelancerInvoiceInteractor, zjh.c freelancerPricingPlanInteractor, gr6.h freelancerCashbackInteractor, bbd.b orderInitiationPageInteractor, bgc.e rewardsInteractor, ang.f userInteractor, l61.a userCompanyInteractor, ppg.b vaultsInteractor) {
        Intrinsics.checkNotNullParameter(acquiringOrderInteractor, "acquiringOrderInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(productArticleRepository, "productArticleRepository");
        Intrinsics.checkNotNullParameter(proProductArticleFactory, "proProductArticleFactory");
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(freelancerPricingPlanInteractor, "freelancerPricingPlanInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(orderInitiationPageInteractor, "orderInitiationPageInteractor");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        this.f129369a = acquiringOrderInteractor;
        this.f129370b = productArticleInteractor;
        this.f129371c = productArticleRepository;
        this.d = proProductArticleFactory;
        this.e = freelancerInvoiceInteractor;
        this.f = freelancerPricingPlanInteractor;
        this.f129372g = freelancerCashbackInteractor;
        this.f129373h = orderInitiationPageInteractor;
        this.i = rewardsInteractor;
        this.f129374j = userInteractor;
        this.k = userCompanyInteractor;
        this.f129375l = vaultsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ir6.b r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof et6.n2
            if (r0 == 0) goto L13
            r0 = r8
            et6.n2 r0 = (et6.n2) r0
            int r1 = r0.f129281x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129281x = r1
            goto L18
        L13:
            et6.n2 r0 = new et6.n2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129281x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            ir6.b r7 = r0.u
            yhm.o.b(r8)
            goto L57
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            gr6.h r8 = r6.f129372g
            et6.y0 r8 = (et6.y0) r8
            w4l.h r2 = w4l.h.f294642c
            akg.n r5 = r8.e(r2)
            vkm.y r8 = r8.c(r2)
            t38.e r8 = zh9.u0.m(r5, r8)
            r2 = 3
            jhi.b r8 = mo3.a.g(r8, r4, r4, r2)
            r0.u = r7
            r0.f129281x = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r0 = r8.f186385a
            rr6.m r0 = (rr6.m) r0
            java.lang.Object r8 = r8.f186386b
            rr6.g r8 = (rr6.g) r8
            int[] r1 = et6.m2.f129274b
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 != r3) goto L85
            java.math.BigDecimal r7 = r0.f256721a
            java.lang.String r0 = "boosterInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.freelancer.api.article.ProProductArticleKey r2 = com.revolut.feature.freelancer.api.article.ProProductArticleKey.CASHBACK_BOOSTER
            r1.<init>(r2)
            hs6.b r2 = r6.d
            java.util.LinkedHashMap r7 = r2.b(r4, r7, r8)
            r0.<init>(r1, r7)
            return r0
        L85:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.x2.a(ir6.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ir6.c r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.x2.b(ir6.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ir6.d r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.x2.c(ir6.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r11 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (r11 != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ir6.e r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.x2.d(ir6.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(ir6.e r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof et6.r2
            if (r0 == 0) goto L13
            r0 = r6
            et6.r2 r0 = (et6.r2) r0
            int r1 = r0.f129319x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129319x = r1
            goto L18
        L13:
            et6.r2 r0 = new et6.r2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129319x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ir6.e r5 = r0.u
            yhm.o.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ang.f r6 = r4.f129374j
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.u = r5
            r0.f129319x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            do3.n r6 = (do3.n) r6
            com.revolut.feature.address.models.Address r6 = r6.k
            if (r6 == 0) goto L57
            java.lang.String r6 = r6.getCountry()
            if (r6 == 0) goto L57
            wi0.b r6 = com.bumptech.glide.d.c(r6)
            goto L58
        L57:
            r6 = 0
        L58:
            int[] r0 = et6.m2.f129275c
            int r5 = r5.ordinal()
            r5 = r0[r5]
            if (r5 == r3) goto L93
            r0 = 2
            if (r5 != r0) goto L8d
            com.revolut.feature.product_article.api.models.ProductArticleParams r5 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            wi0.a r1 = wi0.b.Companion
            r1.getClass()
            wi0.b r1 = wi0.b.O
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r6, r1)
            if (r1 == 0) goto L79
            com.revolut.feature.freelancer.api.article.ProProductArticleKey r6 = com.revolut.feature.freelancer.api.article.ProProductArticleKey.POCKETS_TAX_CO
            goto L86
        L79:
            wi0.b r1 = wi0.b.t2
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r1)
            if (r6 == 0) goto L84
            com.revolut.feature.freelancer.api.article.ProProductArticleKey r6 = com.revolut.feature.freelancer.api.article.ProProductArticleKey.POCKETS_TAX_PL
            goto L86
        L84:
            com.revolut.feature.freelancer.api.article.ProProductArticleKey r6 = com.revolut.feature.freelancer.api.article.ProProductArticleKey.POCKETS_TAX
        L86:
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L8d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L93:
            com.revolut.feature.product_article.api.models.ProductArticleParams r5 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            wi0.a r1 = wi0.b.Companion
            r1.getClass()
            wi0.b r1 = wi0.b.O
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r1)
            if (r6 == 0) goto La7
            com.revolut.feature.freelancer.api.article.ProProductArticleKey r6 = com.revolut.feature.freelancer.api.article.ProProductArticleKey.POCKETS_REGULAR_CO
            goto La9
        La7:
            com.revolut.feature.freelancer.api.article.ProProductArticleKey r6 = com.revolut.feature.freelancer.api.article.ProProductArticleKey.POCKETS_REGULAR
        La9:
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.x2.e(ir6.e, gim.c):java.lang.Object");
    }

    public final Object f(ir6.h hVar, gim.c cVar) {
        if (hVar == ir6.b.BOOSTER || hVar == ir6.c.ONBOARDING || hVar == ir6.g.TAX_HUB || hVar == ir6.d.PRO_PERKS) {
            return new ir6.a(false);
        }
        if (hVar == ir6.e.PRO_REGULAR || hVar == ir6.e.PRO_TAX) {
            if (hVar != null) {
                return d((ir6.e) hVar, cVar);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.freelancer.api.stories.FreelancerProductArticleType.Pockets");
        }
        if (hVar != ir6.f.INVOICE && hVar != ir6.f.PAYMENT_LINK && hVar != ir6.f.SHOPIFY) {
            throw new NoWhenBranchMatchedException();
        }
        if (hVar != null) {
            return h((ir6.f) hVar, cVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.freelancer.api.stories.FreelancerProductArticleType.Sales");
    }

    public final Object g(ir6.h hVar, gim.c cVar) {
        if (hVar == ir6.b.BOOSTER) {
            if (hVar != null) {
                return a((ir6.b) hVar, cVar);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.freelancer.api.stories.FreelancerProductArticleType.Cashback");
        }
        if (hVar == ir6.e.PRO_REGULAR || hVar == ir6.e.PRO_TAX) {
            if (hVar != null) {
                return e((ir6.e) hVar, cVar);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.freelancer.api.stories.FreelancerProductArticleType.Pockets");
        }
        if (hVar == ir6.c.ONBOARDING) {
            if (hVar != null) {
                return b((ir6.c) hVar, cVar);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.freelancer.api.stories.FreelancerProductArticleType.Onboarding");
        }
        if (hVar == ir6.f.INVOICE || hVar == ir6.f.PAYMENT_LINK || hVar == ir6.f.SHOPIFY) {
            if (hVar != null) {
                return i((ir6.f) hVar, cVar);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.freelancer.api.stories.FreelancerProductArticleType.Sales");
        }
        if (hVar == ir6.g.TAX_HUB) {
            if (hVar != null) {
                return j((ir6.g) hVar, cVar);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.freelancer.api.stories.FreelancerProductArticleType.Taxes");
        }
        if (hVar != ir6.d.PRO_PERKS) {
            throw new NoWhenBranchMatchedException();
        }
        if (hVar != null) {
            return c((ir6.d) hVar, cVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.freelancer.api.stories.FreelancerProductArticleType.Perks");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(ir6.f r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof et6.s2
            if (r0 == 0) goto L13
            r0 = r10
            et6.s2 r0 = (et6.s2) r0
            int r1 = r0.f129322w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129322w = r1
            goto L18
        L13:
            et6.s2 r0 = new et6.s2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129322w
            r3 = 4
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L45
            if (r2 == r7) goto L41
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r10)
            goto L79
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            yhm.o.b(r10)
            goto L68
        L3d:
            yhm.o.b(r10)
            goto La3
        L41:
            yhm.o.b(r10)
            goto L8e
        L45:
            yhm.o.b(r10)
            int[] r10 = et6.m2.f129273a
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r7) goto L83
            if (r9 == r6) goto L5d
            if (r9 != r5) goto L57
            goto Lac
        L57:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L5d:
            r0.f129322w = r5
            nr6.e r9 = nr6.e.INVOICE
            java.lang.Object r10 = r8.k(r9, r0)
            if (r10 != r1) goto L68
            goto La2
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto L81
            r0.f129322w = r3
            java.lang.Object r10 = r8.l(r0)
            if (r10 != r1) goto L79
            goto La2
        L79:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto Lac
        L81:
            r4 = r7
            goto Lac
        L83:
            r0.f129322w = r7
            nr6.e r9 = nr6.e.LINK
            java.lang.Object r10 = r8.k(r9, r0)
            if (r10 != r1) goto L8e
            goto La2
        L8e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto L81
            r0.f129322w = r6
            vad.e r9 = vad.e.PAYMENT_LINK
            bbd.b r10 = r8.f129373h
            java.lang.Object r10 = r10.a(r9, r0)
            if (r10 != r1) goto La3
        La2:
            return r1
        La3:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto Lac
            goto L81
        Lac:
            ir6.a r9 = new ir6.a
            r9.<init>(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.x2.h(ir6.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(ir6.f r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.x2.i(ir6.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(ir6.g r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof et6.u2
            if (r0 == 0) goto L13
            r0 = r6
            et6.u2 r0 = (et6.u2) r0
            int r1 = r0.f129344x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129344x = r1
            goto L18
        L13:
            et6.u2 r0 = new et6.u2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129344x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ir6.g r5 = r0.u
            yhm.o.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ang.f r6 = r4.f129374j
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.u = r5
            r0.f129344x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            do3.n r6 = (do3.n) r6
            int[] r0 = et6.m2.d
            int r5 = r5.ordinal()
            r5 = r0[r5]
            if (r5 != r3) goto L7b
            kotlin.jvm.internal.Intrinsics.h(r6)
            wi0.b r5 = do3.q.y(r6)
            java.lang.String r6 = "countryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            wi0.a r1 = wi0.b.Companion
            r1.getClass()
            wi0.b r1 = wi0.b.p0
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L72
            com.revolut.feature.freelancer.api.article.ProProductArticleKey r5 = com.revolut.feature.freelancer.api.article.ProProductArticleKey.TAX_HUB_UK
            goto L74
        L72:
            com.revolut.feature.freelancer.api.article.ProProductArticleKey r5 = com.revolut.feature.freelancer.api.article.ProProductArticleKey.TAX_HUB
        L74:
            r0.<init>(r5)
            r6.<init>(r0)
            return r6
        L7b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.x2.j(ir6.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(nr6.e r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof et6.v2
            if (r0 == 0) goto L13
            r0 = r8
            et6.v2 r0 = (et6.v2) r0
            int r1 = r0.f129356w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129356w = r1
            goto L18
        L13:
            et6.v2 r0 = new et6.v2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129356w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L57
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter$Channel r8 = new com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter$Channel
            java.util.Set r7 = zhm.y0.b(r7)
            r8.<init>(r7)
            r0.f129356w = r3
            b9k.f r7 = r6.f129369a
            java.lang.Object r7 = r7.f
            au6.v r7 = (au6.v) r7
            r7.getClass()
            ap7.k r2 = new ap7.k
            r4 = 12
            r5 = 0
            r2.<init>(r7, r8, r5, r4)
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.f9636c
            java.lang.Object r8 = skm.e0.J(r7, r2, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r8.intValue()
            if (r7 <= 0) goto L60
            goto L61
        L60:
            r3 = 0
        L61:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.x2.k(nr6.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof et6.w2
            if (r0 == 0) goto L13
            r0 = r9
            et6.w2 r0 = (et6.w2) r0
            int r1 = r0.f129363w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129363w = r1
            goto L18
        L13:
            et6.w2 r0 = new et6.w2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129363w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r9)
            goto L76
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L30:
            yhm.o.b(r9)
            et6.p1 r9 = r8.e
            au6.v0 r9 = r9.f129298b
            sr6.k r2 = new sr6.k
            sr6.j r5 = sr6.j.DRAFT
            r6 = 14
            r2.<init>(r3, r5, r6)
            au6.k1 r9 = (au6.k1) r9
            efm.r r2 = r9.c(r2, r3)
            sr6.k r7 = new sr6.k
            r7.<init>(r4, r5, r6)
            efm.r r9 = r9.c(r7, r3)
            efm.r r9 = kli.a.h(r2, r9)
            et6.w r2 = new et6.w
            r5 = 26
            r2.<init>(r5)
            efm.r r9 = nim.a.w(r9, r2)
            r2 = 0
            r5 = 3
            efm.r r9 = m70.a.g(r9, r2, r2, r5)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r0.f129363w = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L76
            return r1
        L76:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 <= 0) goto L7f
            r3 = r4
        L7f:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.x2.l(gim.c):java.lang.Object");
    }
}
