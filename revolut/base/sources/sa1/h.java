package sa1;

import com.youTransactor.uCube.ITaskCancelListener;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.payment.PaymentContext;
import com.youTransactor.uCube.payment.task.IAuthorizationTask;
import efm.d0;
import efm.h0;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements IAuthorizationTask {

    @NotNull
    public static final g Companion = new g();
    public static final byte[] e = {ISOFileInfo.LCS_BYTE, 2, 57, 56};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lal.a f261225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f261226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PaymentContext f261227c;
    public ITaskMonitor d;

    public h(lal.a authorizationDelegate) {
        Intrinsics.checkNotNullParameter(authorizationDelegate, "authorizationDelegate");
        this.f261225a = authorizationDelegate;
    }

    @Override // com.youTransactor.uCube.ITask
    public final void cancel(ITaskCancelListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ITaskMonitor iTaskMonitor = this.d;
        if (iTaskMonitor == null) {
            Intrinsics.r("monitor");
            throw null;
        }
        iTaskMonitor.handleEvent(TaskEvent.CANCELLED, new Object[0]);
        listener.onCancelFinish(true);
    }

    @Override // com.youTransactor.uCube.ITask
    public final void execute(ITaskMonitor monitor) {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        this.d = monitor;
        PaymentContext paymentContext = this.f261227c;
        if (paymentContext == null) {
            Intrinsics.r("paymentContext");
            throw null;
        }
        pu9.a aVar = new pu9.a(paymentContext, this, 22);
        ofm.i iVar = new ofm.i(new s65.o(new f(this, monitor, 0), 23), new s65.o(new f(this, monitor, 1), 24), 0);
        try {
            try {
                Object objCall = aVar.call();
                mfm.f.b(objCall, "The singleSupplier returned a null SingleSource");
                ((d0) ((h0) objCall)).q(iVar);
            } catch (Throwable th10) {
                m70.a.u(th10);
                lfm.e.e(th10, iVar);
            }
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th11) {
            m70.a.u(th11);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th11);
            throw nullPointerException;
        }
    }

    @Override // com.youTransactor.uCube.payment.task.IAuthorizationTask
    public final byte[] getAuthorizationResponse() {
        byte[] bArr = this.f261226b;
        if (bArr != null) {
            return bArr;
        }
        Intrinsics.r("authResponse");
        throw null;
    }

    @Override // com.youTransactor.uCube.payment.task.IPaymentTask
    public final PaymentContext getContext() {
        PaymentContext paymentContext = this.f261227c;
        if (paymentContext != null) {
            return paymentContext;
        }
        Intrinsics.r("paymentContext");
        throw null;
    }

    @Override // com.youTransactor.uCube.payment.task.IPaymentTask
    public final void setContext(PaymentContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f261227c = context;
    }
}
