package aja;

import hr6.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements uia.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xia.b f5531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f5532b;

    public d(xia.b repository, l freelancerCommandFactory) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        this.f5531a = repository;
        this.f5532b = freelancerCommandFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.core.navigation.FeatureCommand r9, com.revolut.retail.core.navigation.FeatureCommand r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aja.d.a(com.revolut.retail.core.navigation.FeatureCommand, com.revolut.retail.core.navigation.FeatureCommand, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.core.navigation.NaviCommand r5, dr6.a r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof aja.c
            if (r0 == 0) goto L13
            r0 = r7
            aja.c r0 = (aja.c) r0
            int r1 = r0.f5530x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5530x = r1
            goto L18
        L13:
            aja.c r0 = new aja.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5530x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.retail.core.navigation.NaviCommand r5 = r0.u
            yhm.o.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig$ShowArticle r7 = new com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig$ShowArticle
            r7.<init>(r6)
            r0.u = r5
            r0.f5530x = r3
            hr6.l r6 = r4.f5532b
            ct6.m r6 = (ct6.m) r6
            com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy$NavigateToMain r0 = com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy.NavigateToMain.f73261a
            com.revolut.retail.core.navigation.FeatureCommand r7 = r6.e(r7, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.retail.core.navigation.CompositeCommand r5 = com.revolut.retail.core.navigation.a.c(r5, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: aja.d.b(com.revolut.retail.core.navigation.NaviCommand, dr6.a, gim.c):java.lang.Object");
    }
}
