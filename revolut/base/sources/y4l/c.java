package y4l;

import android.os.Handler;
import android.os.Message;
import efm.c0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import mfm.f;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f310971c;

    public c(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f310971c = handler;
    }

    @Override // efm.c0
    public final c0.a b() {
        return new a(this.f310971c);
    }

    @Override // efm.c0
    public final ifm.c d(Runnable run, long j2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(run, "run");
        Intrinsics.checkNotNullParameter(unit, "unit");
        f.b(run, "run is null");
        Intrinsics.checkNotNullExpressionValue(run, "onSchedule(...)");
        Handler handler = this.f310971c;
        b bVar = new b(handler, run);
        handler.sendMessageDelayed(Message.obtain(handler, bVar), unit.toMillis(j2));
        return bVar;
    }
}
