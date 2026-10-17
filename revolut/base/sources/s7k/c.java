package s7k;

import com.revolut.data.model.Data;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f260862b;

    public /* synthetic */ c(Data data, int i) {
        this.f260861a = i;
        this.f260862b = data;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f260861a;
        Data data = this.f260862b;
        switch (i) {
            case 0:
                TimeoutException timeoutException = new TimeoutException("Source PaymentLinkPending does not emit initial value");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, timeoutException, h0Var);
                break;
            default:
                TimeoutException timeoutException2 = new TimeoutException("Source JuniorTransferRequests does not emit initial value");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, timeoutException2, h0Var2);
                break;
        }
        return data;
    }
}
