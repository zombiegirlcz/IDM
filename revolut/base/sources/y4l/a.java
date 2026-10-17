package y4l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import efm.c0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f310966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f310967b;

    public a(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f310966a = handler;
    }

    @Override // efm.c0.a
    public final ifm.c b(Runnable run, long j2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(run, "run");
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f310967b) {
            lfm.e eVar = lfm.e.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(eVar, "disposed(...)");
            return eVar;
        }
        Intrinsics.checkNotNullExpressionValue(run, "onSchedule(...)");
        b bVar = new b(this.f310966a, run);
        Message messageObtain = Message.obtain(this.f310966a, bVar);
        messageObtain.obj = this;
        if (!Intrinsics.f(Looper.myLooper(), this.f310966a.getLooper()) || j2 > 0) {
            this.f310966a.sendMessageDelayed(messageObtain, unit.toMillis(j2));
        } else {
            this.f310966a.dispatchMessage(messageObtain);
        }
        if (!this.f310967b) {
            return bVar;
        }
        this.f310966a.removeCallbacks(bVar);
        lfm.e eVar2 = lfm.e.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(eVar2, "disposed(...)");
        return eVar2;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f310967b = true;
        this.f310966a.removeCallbacksAndMessages(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f310967b;
    }
}
