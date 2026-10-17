package kl;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.workflow.OnfidoWorkflow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class l0 implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f185194a;

    public l0(c2 c2Var) {
        this.f185194a = c2Var;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Timber.INSTANCE.e(throwable, "Error happened while storing a biometric token", new Object[0]);
        this.f185194a.D.onNext(new ml.i(new OnfidoWorkflow.WorkflowException.WorkflowBiometricTokenStorageException("Error happened while storing a biometric token", throwable)));
    }
}
