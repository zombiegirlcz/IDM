package androidx.camera.core.processing;

import androidx.core.util.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class Edge<T> implements Consumer<T> {
    private Consumer<T> mListener;

    @Override // androidx.core.util.Consumer
    public void accept(T t2) {
        Intrinsics.i(this.mListener, "Listener is not set.");
        this.mListener.accept(t2);
    }

    public void setListener(Consumer<T> consumer) {
        this.mListener = consumer;
    }
}
