package rm0;

import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final void a(Function0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Intrinsics.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "MainThreadChecker", (String) message.invoke(), null, h0Var);
        }
    }
}
