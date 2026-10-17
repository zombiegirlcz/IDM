package org.tensorflow.lite.support.model;

import java.io.Closeable;
import java.io.IOException;
import org.tensorflow.lite.Delegate;

/* JADX INFO: loaded from: classes14.dex */
class GpuDelegateProxy implements Delegate, Closeable {
    private static final String TAG = "GpuDelegateProxy";
    private final Closeable proxiedCloseable;
    private final Delegate proxiedDelegate;

    private GpuDelegateProxy(Object obj2) {
        this.proxiedCloseable = (Closeable) obj2;
        this.proxiedDelegate = (Delegate) obj2;
    }

    public static GpuDelegateProxy maybeNewInstance() {
        try {
            return new GpuDelegateProxy(Class.forName("org.tensorflow.lite.gpu.GpuDelegate").getDeclaredConstructor(null).newInstance(null));
        } catch (ReflectiveOperationException e) {
            return null;
        }
    }

    @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.proxiedCloseable.close();
        } catch (IOException e) {
        }
    }

    @Override // org.tensorflow.lite.Delegate
    public long getNativeHandle() {
        return this.proxiedDelegate.getNativeHandle();
    }
}
