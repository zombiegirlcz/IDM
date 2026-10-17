package hfm;

import android.os.Handler;
import android.os.Message;
import efm.c0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f152031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f152032b;

    public d(Handler handler) {
        this.f152031a = handler;
    }

    @Override // efm.c0.a
    public final ifm.c b(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.f152032b) {
            return lfm.e.INSTANCE;
        }
        Handler handler = this.f152031a;
        e eVar = new e(handler, runnable);
        Message messageObtain = Message.obtain(handler, eVar);
        messageObtain.obj = this;
        this.f152031a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j2));
        if (!this.f152032b) {
            return eVar;
        }
        this.f152031a.removeCallbacks(eVar);
        return lfm.e.INSTANCE;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f152032b = true;
        this.f152031a.removeCallbacksAndMessages(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f152032b;
    }
}
