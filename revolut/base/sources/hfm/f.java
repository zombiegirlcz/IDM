package hfm;

import android.os.Handler;
import android.os.Message;
import efm.c0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f152036c;

    public f(Handler handler) {
        this.f152036c = handler;
    }

    @Override // efm.c0
    public final c0.a b() {
        return new d(this.f152036c);
    }

    @Override // efm.c0
    public final ifm.c d(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f152036c;
        e eVar = new e(handler, runnable);
        handler.sendMessageDelayed(Message.obtain(handler, eVar), timeUnit.toMillis(j2));
        return eVar;
    }
}
