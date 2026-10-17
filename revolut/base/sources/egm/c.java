package egm;

import android.os.Handler;
import android.os.Message;
import fgm.o;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f125670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f125671b;

    public c(Handler handler) {
        this.f125670a = handler;
    }

    @Override // fgm.o
    public final Disposable a(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.f125671b) {
            return jgm.c.INSTANCE;
        }
        Handler handler = this.f125670a;
        d dVar = new d(handler, runnable);
        Message messageObtain = Message.obtain(handler, dVar);
        messageObtain.obj = this;
        messageObtain.setAsynchronous(true);
        this.f125670a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j2));
        if (!this.f125671b) {
            return dVar;
        }
        this.f125670a.removeCallbacks(dVar);
        return jgm.c.INSTANCE;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f125671b = true;
        this.f125670a.removeCallbacksAndMessages(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f125671b;
    }
}
