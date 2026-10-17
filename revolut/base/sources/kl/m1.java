package kl;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.workflow.OnfidoWorkflow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class m1 implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f185198a;

    public m1(c2 c2Var) {
        this.f185198a = c2Var;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        MotionHostFragment.AvcHostResult.Error error = (MotionHostFragment.AvcHostResult.Error) obj2;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f185198a.D.onNext(new ml.i(new OnfidoWorkflow.WorkflowException.WorkflowUnknownException(error.getMessage(), null, 2, null)));
    }
}
