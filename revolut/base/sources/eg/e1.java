package eg;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import az0.r1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f125426a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(CoroutineContext backgroundDispatcher) {
        super(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f125426a = backgroundDispatcher;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        String string;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != 3) {
            String str = "Received unexpected event from the SessionLifecycleService: " + msg;
            super.handleMessage(msg);
            return;
        }
        Bundle data = msg.getData();
        if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
            string = "";
        }
        skm.e0.C(skm.e0.c(this.f125426a), null, null, new r1(string, null, 3), 3);
    }
}
