package ml;

import com.onfido.workflow.OnfidoWorkflow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnfidoWorkflow.WorkflowException f206530a;

    public i(OnfidoWorkflow.WorkflowException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f206530a = exception;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f206530a, ((i) obj2).f206530a);
    }

    public final int hashCode() {
        return this.f206530a.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.f206530a + ")";
    }
}
