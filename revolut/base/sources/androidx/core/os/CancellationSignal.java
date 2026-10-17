package androidx.core.os;

import ag.p;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private OnCancelListener mOnCancelListener;

    public interface OnCancelListener {
    }

    private void waitForCancelFinishedLocked() {
        while (this.mCancelInProgress) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void cancel() {
        synchronized (this) {
            try {
                if (this.mIsCanceled) {
                    return;
                }
                this.mIsCanceled = true;
                this.mCancelInProgress = true;
                OnCancelListener onCancelListener = this.mOnCancelListener;
                Object obj2 = this.mCancellationSignalObj;
                if (onCancelListener != null) {
                    try {
                        ((p) onCancelListener).f();
                    } catch (Throwable th10) {
                        synchronized (this) {
                            this.mCancelInProgress = false;
                            notifyAll();
                            throw th10;
                        }
                    }
                }
                if (obj2 != null) {
                    ((android.os.CancellationSignal) obj2).cancel();
                }
                synchronized (this) {
                    this.mCancelInProgress = false;
                    notifyAll();
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    public Object getCancellationSignalObject() {
        Object obj2;
        synchronized (this) {
            try {
                if (this.mCancellationSignalObj == null) {
                    android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
                    this.mCancellationSignalObj = cancellationSignal;
                    if (this.mIsCanceled) {
                        cancellationSignal.cancel();
                    }
                }
                obj2 = this.mCancellationSignalObj;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return obj2;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this) {
            z = this.mIsCanceled;
        }
        return z;
    }

    public void setOnCancelListener(OnCancelListener onCancelListener) {
        synchronized (this) {
            try {
                waitForCancelFinishedLocked();
                if (this.mOnCancelListener == onCancelListener) {
                    return;
                }
                this.mOnCancelListener = onCancelListener;
                if (this.mIsCanceled && onCancelListener != null) {
                    ((p) onCancelListener).f();
                }
            } finally {
            }
        }
    }
}
