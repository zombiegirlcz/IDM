package androidx.media3.common.util;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public interface HandlerWrapper {

    public interface Message {
        void sendToTarget();
    }

    Looper getLooper();

    boolean hasMessages(int i);

    Message obtainMessage(int i);

    Message obtainMessage(int i, int i2, int i3);

    Message obtainMessage(int i, int i2, int i3, Object obj2);

    Message obtainMessage(int i, Object obj2);

    boolean post(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j2);

    void removeCallbacks(Runnable runnable);

    void removeCallbacksAndMessages(Object obj2);

    void removeMessages(int i);

    boolean sendEmptyMessage(int i);

    boolean sendEmptyMessageAtTime(int i, long j2);

    boolean sendEmptyMessageDelayed(int i, int i2);

    boolean sendMessageAtFrontOfQueue(Message message);
}
