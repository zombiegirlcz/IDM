package e17;

import c17.o;
import c17.r;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreenContract$InputData;
import e17.a;
import et6.k3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import skm.a2;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends n implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k3 f121907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wj0.a f121908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sz6.a f121909n;
    public FreelancerWebsiteScreenContract$InputData o;

    public j(k3 freelancerSettingsInteractor, wj0.a idempotencyKeyHolder, sz6.a onboardingInputDataValidator) {
        Intrinsics.checkNotNullParameter(freelancerSettingsInteractor, "freelancerSettingsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(onboardingInputDataValidator, "onboardingInputDataValidator");
        this.f121907l = freelancerSettingsInteractor;
        this.f121908m = idempotencyKeyHolder;
        this.f121909n = onboardingInputDataValidator;
    }

    public static final a2 Z2(j jVar) {
        return n.j2(jVar, jVar.L2(new y0(null, new z(new TextLocalisedClause(R$string.freelancer_business_website_editing_confirmation_error_message, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(e17.j r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof e17.i
            if (r0 == 0) goto L13
            r0 = r6
            e17.i r0 = (e17.i) r0
            int r1 = r0.f121906w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121906w = r1
            goto L18
        L13:
            e17.i r0 = new e17.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121906w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            sz6.a r6 = r4.f121909n
            com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreenContract$InputData r4 = r4.o
            if (r4 == 0) goto L54
            gs6.a r4 = r4.f74076b
            com.revolut.feature.freelancer.impl.ui.onboarding.validation.a r6 = (com.revolut.feature.freelancer.impl.ui.onboarding.validation.a) r6
            efm.r r4 = r6.b(r5, r4)
            vkm.d r4 = rd0.e.b(r4)
            r0.f121906w = r3
            java.lang.Object r6 = vkm.q.F(r4, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            boolean r4 = r6 instanceof com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState.Valid
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L54:
            java.lang.String r4 = "inputData"
            kotlin.jvm.internal.Intrinsics.r(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e17.j.b3(e17.j, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        this.f121908m.a("IDEMPOTENCY_TAG_FREELANCER_URL_UPDATE");
    }

    @Override // e17.c
    public final Object E0(c17.h hVar, r rVar) {
        String str = hVar.f20389b;
        if (str == null) {
            r2().M0(a.C0716a.f121896b);
            return Unit.f186387a;
        }
        Object objB = pu7.a.B(this.e, "changeFreelancerWebsite", new g(this, str, null, 1), rVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    @Override // e17.c
    public final Unit p0(c17.h hVar) {
        String str = hVar.f20390c;
        String str2 = hVar.f20389b;
        if (Intrinsics.f(str, str2)) {
            r2().M0(a.C0716a.f121896b);
        } else if (str2 != null) {
            r2().M0(new b(str2));
        }
        return Unit.f186387a;
    }

    @Override // e17.c
    public final void y1(FreelancerWebsiteScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
    }

    @Override // e17.c
    public final o z1(gs6.a urlVerificationMode) {
        Intrinsics.checkNotNullParameter(urlVerificationMode, "urlVerificationMode");
        int i = f.f121903a[urlVerificationMode.ordinal()];
        if (i == 1) {
            return o.SETTINGS;
        }
        if (i == 2) {
            return o.E_COMMERCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
