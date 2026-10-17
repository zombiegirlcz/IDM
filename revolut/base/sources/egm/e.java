package egm;

import android.os.Handler;
import android.os.Message;
import fgm.o;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends Scheduler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f125675c;

    public e(Handler handler) {
        this.f125675c = handler;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final o b() {
        return new c(this.f125675c);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable d(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f125675c;
        d dVar = new d(handler, runnable);
        Message messageObtain = Message.obtain(handler, dVar);
        messageObtain.setAsynchronous(true);
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j2));
        return dVar;
    }
}
