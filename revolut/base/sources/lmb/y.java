package lmb;

import com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelCancellationOutcome;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import nii.t1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y implements t1, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196947a;

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f196947a) {
            case 0:
                return (m0) q.f.invoke(obj2);
            case 1:
                RightToCancelCancellationOutcome p0 = (RightToCancelCancellationOutcome) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ri9.a.a(p0);
            default:
                RightToCancelCancellationOutcome p03 = (RightToCancelCancellationOutcome) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ri9.a.a(p03);
        }
    }

    public final boolean equals(Object obj2) {
        switch (this.f196947a) {
            case 0:
                if ((obj2 instanceof t1) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 1:
                if ((obj2 instanceof t1) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            default:
                if ((obj2 instanceof t1) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
        }
        return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        switch (this.f196947a) {
        }
        return new kotlin.jvm.internal.q(1, 0, ri9.a.class, ri9.a.f254570a, "createCancellationOutcomeSuccessConfiguration", "createCancellationOutcomeSuccessConfiguration(Lcom/revolut/feature/pay_later/impl/models/right_to_cancel/RightToCancelCancellationOutcome;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Success;");
    }

    public final int hashCode() {
        switch (this.f196947a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
