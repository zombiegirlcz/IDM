package kl;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.workflow.OnfidoWorkflow;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b2 implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f185146a;

    public b2(c2 c2Var) {
        this.f185146a = c2Var;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        PublishSubject publishSubject = this.f185146a.D;
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        publishSubject.onNext(new ml.i(new OnfidoWorkflow.WorkflowException.WorkflowUnknownException(message, null, 2, null)));
        Timber.INSTANCE.e(throwable, "Error during Qes Consent flow", new Object[0]);
    }
}
