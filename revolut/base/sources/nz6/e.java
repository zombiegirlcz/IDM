package nz6;

import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;
import nii.m0;
import nii.t1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements t1, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz6.a f220960b;

    public /* synthetic */ e(rz6.a aVar, int i) {
        this.f220959a = i;
        this.f220960b = aVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f220959a) {
            case 0:
                FreelancerAccountOnboardingState p0 = (FreelancerAccountOnboardingState) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                this.f220960b.getClass();
                return rz6.a.a(p0);
            default:
                FreelancerAccountOnboardingState p03 = (FreelancerAccountOnboardingState) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                this.f220960b.getClass();
                return rz6.a.a(p03);
        }
    }

    public final boolean equals(Object obj2) {
        switch (this.f220959a) {
            case 0:
                if ((obj2 instanceof t1) && (obj2 instanceof n)) {
                    break;
                }
                break;
            default:
                if ((obj2 instanceof t1) && (obj2 instanceof n)) {
                    break;
                }
                break;
        }
        return Intrinsics.f(getFunctionDelegate(), ((n) obj2).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        switch (this.f220959a) {
        }
        return new q(1, 0, rz6.a.class, this.f220960b, "getFinishSuccessStatusDialogConfig", "getFinishSuccessStatusDialogConfig(Lcom/revolut/feature/freelancer/common/models/FreelancerAccountOnboardingState;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Success;");
    }

    public final int hashCode() {
        switch (this.f220959a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
