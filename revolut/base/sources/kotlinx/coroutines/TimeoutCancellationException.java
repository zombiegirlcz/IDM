package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import skm.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lskm/w;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimeoutCancellationException extends CancellationException implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Job f187931a;

    public TimeoutCancellationException(String str, Job job2) {
        super(str);
        this.f187931a = job2;
    }

    @Override // skm.w
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f187931a);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
