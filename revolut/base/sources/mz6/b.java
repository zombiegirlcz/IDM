package mz6;

import hr6.l;
import jr6.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.a f210718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f210719b;

    public b(gr6.a freelancerAccountDetailsInteractor, l freelancerCommandFactory) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        this.f210718a = freelancerAccountDetailsInteractor;
        this.f210719b = freelancerCommandFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.core.navigation.NaviCommand r7, w4l.h r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof mz6.a
            if (r0 == 0) goto L13
            r0 = r9
            mz6.a r0 = (mz6.a) r0
            int r1 = r0.f210717x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210717x = r1
            goto L18
        L13:
            mz6.a r0 = new mz6.a
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210717x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            com.revolut.retail.core.navigation.NaviCommand r7 = r0.u
            yhm.o.b(r9)
            goto L5b
        L39:
            yhm.o.b(r9)
            r0.u = r7
            r0.f210717x = r4
            gr6.a r9 = r6.f210718a
            et6.g r9 = (et6.g) r9
            vkm.d r8 = r9.d(r8)
            mig.a r9 = new mig.a
            r2 = 10
            r9.<init>(r2)
            r2 = 6
            jhi.b r8 = mo3.a.h(r8, r9, r5, r2)
            java.lang.Object r9 = vkm.q.x(r8, r0)
            if (r9 != r1) goto L5b
            goto L78
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L79
            r0.u = r5
            r0.f210717x = r3
            com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy$NavigateToCustom r8 = new com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy$NavigateToCustom
            r8.<init>(r7)
            hr6.l r7 = r6.f210719b
            ct6.m r7 = (ct6.m) r7
            com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig$DoNotShowArticle r9 = com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig.DoNotShowArticle.f73172a
            com.revolut.retail.core.navigation.FeatureCommand r7 = r7.e(r9, r8)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mz6.b.a(com.revolut.retail.core.navigation.NaviCommand, w4l.h, gim.c):java.lang.Object");
    }
}
