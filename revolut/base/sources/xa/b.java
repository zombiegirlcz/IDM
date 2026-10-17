package xa;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import sa.c;
import sri.m;
import ue0.e;
import ufm.i;
import wp5.y;
import x9h.d;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f303765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pa.a f303766b;

    public b(m navigator, pa.a userDetailsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(userDetailsInteractor, "userDetailsInteractor");
        this.f303765a = navigator;
        this.f303766b = userDetailsInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "profile-details") || Intrinsics.f(cVar.e(1), "tax-certification-issues");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r14 = r15 instanceof xa.a
            if (r14 == 0) goto L13
            r14 = r15
            xa.a r14 = (xa.a) r14
            int r0 = r14.f303764w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r14.f303764w = r0
            goto L1a
        L13:
            xa.a r14 = new xa.a
            gim.c r15 = (gim.c) r15
            r14.<init>(r13, r15)
        L1a:
            java.lang.Object r15 = r14.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r14.f303764w
            qa.a r2 = qa.a.f243919a
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2c
            yhm.o.b(r15)
            goto L5a
        L2c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L34:
            yhm.o.b(r15)
            pa.a r15 = r13.f303766b
            wa.a r15 = (wa.a) r15
            efm.r r15 = r15.a()
            r1 = 3
            efm.r r15 = m70.a.g(r15, r4, r4, r1)
            efm.d0 r15 = r15.firstOrError()
            java.lang.String r1 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
            pfm.z r15 = ue0.e.F(r15, r2)
            r14.f303764w = r3
            java.lang.Object r15 = nim.a.b(r15, r14)
            if (r15 != r0) goto L5a
            return r0
        L5a:
            qa.c r15 = (qa.c) r15
            boolean r14 = r15 instanceof qa.b
            if (r14 == 0) goto L85
            q06.h r14 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.onboarding.api.workflow.WorkflowFeatureConfig r2 = new com.revolut.feature.onboarding.api.workflow.WorkflowFeatureConfig
            com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration$Workflow r5 = new com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration$Workflow
            qa.b r15 = (qa.b) r15
            java.lang.String r6 = r15.f243920a
            r11 = 0
            r12 = 126(0x7e, float:1.77E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2.<init>(r5, r3)
            r1.<init>(r2)
            r0.<init>(r1)
            r14.<init>(r0, r4)
            return r14
        L85:
            boolean r14 = kotlin.jvm.internal.Intrinsics.f(r15, r2)
            if (r14 == 0) goto L93
            q06.h r14 = new q06.h
            com.feature.user.details.api.navigation.UserDetailsDestination r15 = com.feature.user.details.api.navigation.UserDetailsDestination.f26226a
            r14.<init>(r15, r4)
            return r14
        L93:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarFirstOrError = m70.a.g(((wa.a) this.f303766b).a(), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        i iVar = new i(e.F(d0VarFirstOrError, qa.a.f243919a), new d(2, new x8h.d(this, 19)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return e.F(iVar, Boolean.FALSE);
    }
}
