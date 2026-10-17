package sa1;

import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.payment.PaymentContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f261223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ITaskMonitor f261224c;

    public /* synthetic */ f(h hVar, ITaskMonitor iTaskMonitor, int i) {
        this.f261222a = i;
        this.f261223b = hVar;
        this.f261224c = iTaskMonitor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f261222a) {
            case 0:
                fa1.y yVar = (fa1.y) obj2;
                h hVar = this.f261223b;
                PaymentContext paymentContext = hVar.f261227c;
                if (paymentContext == null) {
                    Intrinsics.r("paymentContext");
                    throw null;
                }
                paymentContext.setGetSystemFailureInfoL2(yVar.f133226g);
                List list = yVar.f;
                ITaskMonitor iTaskMonitor = this.f261224c;
                if (list != null) {
                    hVar.f261226b = d0.Y0(list);
                    iTaskMonitor.handleEvent(TaskEvent.SUCCESS, new Object[0]);
                } else {
                    hVar.f261226b = h.e;
                    iTaskMonitor.handleEvent(TaskEvent.SUCCESS, new Object[0]);
                }
                return Unit.f186387a;
            default:
                ea1.b.a(v1.c.u("Payment authorization error: ", (Throwable) obj2), fa1.k.ERROR);
                this.f261223b.f261226b = h.e;
                this.f261224c.handleEvent(TaskEvent.SUCCESS, new Object[0]);
                return Unit.f186387a;
        }
    }
}
