package w07;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.profile.terms.FreelancerTermsScreenContract$InputData;
import gr6.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends oki.h implements i {
    public final r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mre.c f293661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f293662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f293663r;

    public n(FreelancerTermsScreenContract$InputData inputData, cli.n stateMapper, r freelancerTermsInteractor, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(freelancerTermsInteractor, "freelancerTermsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = freelancerTermsInteractor;
        this.f293661p = termsNavigationFactory;
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f293662q = z1VarB;
        this.f293663r = mra.d.b(this, new f(inputData.f74063a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(w07.n r5, com.revolut.feature.freelancer.api.terms.FreelancerTerms r6, gim.c r7) {
        /*
            mre.c r0 = r5.f293661p
            boolean r1 = r7 instanceof w07.l
            if (r1 == 0) goto L15
            r1 = r7
            w07.l r1 = (w07.l) r1
            int r2 = r1.f293659w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f293659w = r2
            goto L1a
        L15:
            w07.l r1 = new w07.l
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r5 = r1.u
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f293659w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L87
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r5)
            boolean r5 = r6 instanceof com.revolut.feature.freelancer.api.terms.FreelancerTerms.Scoped
            r2 = 0
            if (r5 == 0) goto L6b
            com.revolut.feature.freelancer.api.terms.FreelancerTerms$Scoped r6 = (com.revolut.feature.freelancer.api.terms.FreelancerTerms.Scoped) r6
            com.revolut.feature.terms.api.model.Terms r5 = r6.f73262a
            com.revolut.feature.terms.api.model.TermsScope r6 = r5.f
            com.revolut.feature.terms.api.model.TermsScope$a r7 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r7.getClass()
            com.revolut.feature.terms.api.model.TermsScope r7 = com.revolut.feature.terms.api.model.TermsScope.L
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L60
            java.lang.String r5 = r5.f90357c
            if (r5 == 0) goto L5f
            com.revolut.feature.vaults.api.navigation.VaultTermsViewerDestination r6 = new com.revolut.feature.vaults.api.navigation.VaultTermsViewerDestination
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.freelancer.impl.R$string.freelancer_terms_and_conditions_title
            r1 = 14
            r7.<init>(r0, r2, r2, r1)
            r6.<init>(r5, r7, r3, r2)
            return r6
        L5f:
            return r2
        L60:
            rre.d r0 = (rre.d) r0
            com.revolut.retail.core.navigation.FeatureCommand r5 = r0.b(r5)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r5)
            return r5
        L6b:
            boolean r5 = r6 instanceof com.revolut.feature.freelancer.api.terms.FreelancerTerms.Template
            if (r5 == 0) goto L93
            com.revolut.feature.terms.api.model.TermsScope r5 = new com.revolut.feature.terms.api.model.TermsScope
            com.revolut.feature.freelancer.api.terms.FreelancerTerms$Template r6 = (com.revolut.feature.freelancer.api.terms.FreelancerTerms.Template) r6
            java.lang.String r6 = r6.f73263a
            r5.<init>(r6)
            rre.d r0 = (rre.d) r0
            ufm.i r5 = r0.c(r5, r2)
            r1.f293659w = r3
            java.lang.Object r5 = nim.a.b(r5, r1)
            if (r5 != r7) goto L87
            return r7
        L87:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r5)
            return r5
        L93:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w07.n.I2(w07.n, com.revolut.feature.freelancer.api.terms.FreelancerTerms, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.e(q.Q(this.f293662q, new sdi.a(continuation, this, 24)), h0.f322473a, new v77.c(3, 3, continuation)), null, new vrl.d(this, continuation, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f293663r;
    }
}
