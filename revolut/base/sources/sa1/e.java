package sa1;

import com.youTransactor.uCube.ITaskCancelListener;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.payment.PaymentContext;
import com.youTransactor.uCube.payment.task.IApplicationSelectionTask;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements IApplicationSelectionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PaymentContext f261219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ITaskMonitor f261220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f261221c;

    @Override // com.youTransactor.uCube.ITask
    public final void cancel(ITaskCancelListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ITaskMonitor iTaskMonitor = this.f261220b;
        if (iTaskMonitor == null) {
            Intrinsics.r("monitor");
            throw null;
        }
        iTaskMonitor.handleEvent(TaskEvent.CANCELLED, 0);
        listener.onCancelFinish(true);
    }

    @Override // com.youTransactor.uCube.ITask
    public final void execute(ITaskMonitor monitor) {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        this.f261220b = monitor;
        monitor.handleEvent(TaskEvent.SUCCESS, 0);
    }

    @Override // com.youTransactor.uCube.payment.task.IPaymentTask
    public final PaymentContext getContext() {
        PaymentContext paymentContext = this.f261219a;
        if (paymentContext != null) {
            return paymentContext;
        }
        Intrinsics.r("context");
        throw null;
    }

    @Override // com.youTransactor.uCube.payment.task.IApplicationSelectionTask
    public final List getSelection() {
        List list = this.f261221c;
        if (list != null) {
            return list;
        }
        Intrinsics.r("availableApplications");
        throw null;
    }

    @Override // com.youTransactor.uCube.payment.task.IApplicationSelectionTask
    public final void setAvailableApplication(List applications) {
        Intrinsics.checkNotNullParameter(applications, "applications");
        ea1.b.a("EMV applications=" + applications, fa1.k.INFO);
        this.f261221c = applications;
    }

    @Override // com.youTransactor.uCube.payment.task.IPaymentTask
    public final void setContext(PaymentContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f261219a = context;
    }
}
