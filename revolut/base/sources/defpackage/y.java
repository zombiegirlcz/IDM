package defpackage;

import com.youTransactor.uCube.ITaskCancelListener;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.payment.PaymentContext;
import com.youTransactor.uCube.payment.task.IApplicationSelectionTask;
import com.youTransactor.uCube.rpc.EMVApplicationDescriptor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class y implements IApplicationSelectionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f310087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f310088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PaymentContext f310089c;
    public ITaskMonitor d;

    @Override // com.youTransactor.uCube.ITask
    public final void cancel(ITaskCancelListener iTaskCancelListener) {
        this.d.handleEvent(TaskEvent.CANCELLED, new Object[0]);
        iTaskCancelListener.onCancelFinish(true);
    }

    @Override // com.youTransactor.uCube.ITask
    public final void execute(ITaskMonitor iTaskMonitor) {
        this.d = iTaskMonitor;
        this.f310088b = new ArrayList();
        List<EMVApplicationDescriptor> list = this.f310087a;
        if (list != null) {
            for (EMVApplicationDescriptor eMVApplicationDescriptor : list) {
                if (this.f310088b.isEmpty()) {
                    this.f310088b.add(eMVApplicationDescriptor);
                } else if (eMVApplicationDescriptor.getPriority() >= ((EMVApplicationDescriptor) this.f310088b.get(0)).getPriority()) {
                    if (eMVApplicationDescriptor.getPriority() > ((EMVApplicationDescriptor) this.f310088b.get(0)).getPriority()) {
                        this.f310088b.clear();
                    }
                    this.f310088b.add(eMVApplicationDescriptor);
                }
            }
        }
        iTaskMonitor.handleEvent(TaskEvent.SUCCESS, new Object[0]);
    }

    @Override // com.youTransactor.uCube.payment.task.IPaymentTask
    public final PaymentContext getContext() {
        return this.f310089c;
    }

    @Override // com.youTransactor.uCube.payment.task.IApplicationSelectionTask
    public final List getSelection() {
        return this.f310088b;
    }

    @Override // com.youTransactor.uCube.payment.task.IApplicationSelectionTask
    public final void setAvailableApplication(List list) {
        this.f310087a = list;
    }

    @Override // com.youTransactor.uCube.payment.task.IPaymentTask
    public final void setContext(PaymentContext paymentContext) {
        this.f310089c = paymentContext;
    }
}
