package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import skm.r1;
import skm.w;
import skm.w1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lskm/w;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JobCancellationException extends CancellationException implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Job f187930a;

    public JobCancellationException(String str, Throwable th10, r1 r1Var) {
        super(str);
        this.f187930a = r1Var;
        if (th10 != null) {
            initCause(th10);
        }
    }

    @Override // skm.w
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj2;
        if (!Intrinsics.f(jobCancellationException.getMessage(), getMessage())) {
            return false;
        }
        Object obj3 = jobCancellationException.f187930a;
        if (obj3 == null) {
            obj3 = w1.f264016b;
        }
        Object obj4 = this.f187930a;
        if (obj4 == null) {
            obj4 = w1.f264016b;
        }
        return Intrinsics.f(obj3, obj4) && Intrinsics.f(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        Intrinsics.h(message);
        int iHashCode = message.hashCode() * 31;
        Object obj2 = this.f187930a;
        if (obj2 == null) {
            obj2 = w1.f264016b;
        }
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(super.toString());
        sb6.append("; job=");
        Object obj2 = this.f187930a;
        if (obj2 == null) {
            obj2 = w1.f264016b;
        }
        sb6.append(obj2);
        return sb6.toString();
    }
}
