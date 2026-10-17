package androidx.media3.common.util;

import android.os.Looper;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import d0.c;

/* JADX INFO: loaded from: classes15.dex */
public final class BackgroundThreadStateHandler<T> {
    private final HandlerWrapper backgroundHandler;
    private T backgroundState;
    private final HandlerWrapper foregroundHandler;
    private T foregroundState;
    private final StateChangeListener<T> onStateChanged;
    private int pendingOperations;

    public interface StateChangeListener<T> {
        void onStateChanged(T t2, T t3);
    }

    public BackgroundThreadStateHandler(T t2, Looper looper, Looper looper2, Clock clock, StateChangeListener<T> stateChangeListener) {
        this.backgroundHandler = clock.createHandler(looper, null);
        this.foregroundHandler = clock.createHandler(looper2, null);
        this.foregroundState = t2;
        this.backgroundState = t2;
        this.onStateChanged = stateChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$setStateInBackground$2(Object obj2) {
        if (this.pendingOperations == 0) {
            updateStateInForeground(obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$updateStateAsync$0(Object obj2) {
        int i = this.pendingOperations - 1;
        this.pendingOperations = i;
        if (i == 0) {
            updateStateInForeground(obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateAsync$1(Function function) {
        T t2 = (T) function.apply(this.backgroundState);
        this.backgroundState = t2;
        runInForeground(new j4.a(this, t2, 1));
    }

    private void runInForeground(Runnable runnable) {
        if (this.foregroundHandler.getLooper().getThread().isAlive()) {
            this.foregroundHandler.post(runnable);
        }
    }

    private void updateStateInForeground(T t2) {
        T t3 = this.foregroundState;
        this.foregroundState = t2;
        if (t3.equals(t2)) {
            return;
        }
        this.onStateChanged.onStateChanged(t3, t2);
    }

    public T get() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.foregroundHandler.getLooper()) {
            return this.foregroundState;
        }
        Preconditions.checkState(looperMyLooper == this.backgroundHandler.getLooper());
        return this.backgroundState;
    }

    public void runInBackground(Runnable runnable) {
        if (this.backgroundHandler.getLooper().getThread().isAlive()) {
            this.backgroundHandler.post(runnable);
        }
    }

    public void setStateInBackground(T t2) {
        this.backgroundState = t2;
        runInForeground(new j4.a(this, t2, 0));
    }

    public void updateStateAsync(Function<T, T> function, Function<T, T> function2) {
        Preconditions.checkState(Looper.myLooper() == this.foregroundHandler.getLooper());
        this.pendingOperations++;
        runInBackground(new c(this, function2, 25));
        updateStateInForeground(function.apply(this.foregroundState));
    }
}
