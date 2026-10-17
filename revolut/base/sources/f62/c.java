package f62;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import nii.z;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d12.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentProfile f132375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c62.e f132376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a62.d f132377c;

    public c(ApmPaymentProfile profile, c62.e irisInteractor, a62.d errorProvider) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(irisInteractor, "irisInteractor");
        Intrinsics.checkNotNullParameter(errorProvider, "errorProvider");
        this.f132375a = profile;
        this.f132376b = irisInteractor;
        this.f132377c = errorProvider;
    }

    @Override // d12.b
    public final z a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        z zVarA = this.f132377c.a(throwable);
        return zVarA == null ? new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764) : zVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d12.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof f62.b
            if (r0 == 0) goto L13
            r0 = r5
            f62.b r0 = (f62.b) r0
            int r1 = r0.f132374w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132374w = r1
            goto L18
        L13:
            f62.b r0 = new f62.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132374w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            i02.j r5 = i02.j.ONBOARDING
            r0.f132374w = r3
            c62.e r2 = r4.f132376b
            c62.i r2 = (c62.i) r2
            com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile r3 = r4.f132375a
            java.lang.Object r5 = r2.a(r3, r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus r5 = (com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus) r5
            f62.a r0 = new f62.a
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f62.c.b(gim.c):java.lang.Object");
    }
}
