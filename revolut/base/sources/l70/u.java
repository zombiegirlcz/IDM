package l70;

import android.os.Looper;
import android.os.MessageQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u implements e4m.e {
    public static os2.g a() {
        s.Companion.getClass();
        MessageQueue queue = Looper.getMainLooper().getQueue();
        Intrinsics.checkNotNullExpressionValue(queue, "getQueue(...)");
        return new os2.g(queue);
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
