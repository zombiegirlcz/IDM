package ew;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f129981a;

    public c(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f129981a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        Thread threadCurrentThread = Thread.currentThread();
        Handler handler = this.f129981a;
        if (Intrinsics.f(threadCurrentThread, handler.getLooper().getThread())) {
            command.run();
        } else {
            handler.post(command);
        }
    }
}
