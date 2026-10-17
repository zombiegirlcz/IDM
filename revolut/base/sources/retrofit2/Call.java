package retrofit2;

import java.io.IOException;
import mmm.v0;
import ulm.j1;

/* JADX INFO: loaded from: classes13.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    j1 request();

    v0 timeout();
}
