package cc;

import efm.r;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kfm.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f22902b;

    public c() {
        this.f22901a = 0L;
        this.f22902b = d.REASON_UNKNOWN;
    }

    public e a() {
        return new e(this.f22901a, (d) this.f22902b);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object t2) {
        Intrinsics.checkNotNullParameter(t2, "t");
        if (((AtomicBoolean) this.f22902b).getAndSet(false)) {
            r rVarEmpty = r.empty();
            Intrinsics.h(rVarEmpty);
            return rVarEmpty;
        }
        r rVarDelay = r.just(t2).delay(this.f22901a, TimeUnit.MILLISECONDS);
        Intrinsics.h(rVarDelay);
        return rVarDelay;
    }

    public c(long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f22901a = j2;
        this.f22902b = new AtomicBoolean(true);
    }
}
