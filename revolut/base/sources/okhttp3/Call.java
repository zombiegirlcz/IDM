package okhttp3;

import ulm.j1;
import ulm.p;

/* JADX INFO: loaded from: classes13.dex */
public interface Call extends Cloneable {
    void cancel();

    void d(p pVar);

    Response execute();

    boolean isCanceled();

    j1 request();

    ylm.p timeout();
}
