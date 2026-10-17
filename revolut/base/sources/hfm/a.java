package hfm;

import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import od0.i;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152028a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f152028a) {
            case 0:
                return b.f152029a;
            case 1:
                TimeoutException timeoutException = new TimeoutException("Source TransactionsWidgetVisibleTransactionsCount does not emit initial value");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, timeoutException, h0Var);
                return 2;
            case 2:
                return Boolean.FALSE;
            default:
                return i.f224256b;
        }
    }
}
