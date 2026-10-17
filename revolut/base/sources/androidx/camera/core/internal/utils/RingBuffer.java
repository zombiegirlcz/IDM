package androidx.camera.core.internal.utils;

/* JADX INFO: loaded from: classes15.dex */
public interface RingBuffer<T> {

    public interface OnRemoveCallback<T> {
    }

    T dequeue();

    void enqueue(T t2);

    boolean isEmpty();
}
