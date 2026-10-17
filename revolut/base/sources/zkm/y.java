package zkm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class y implements kotlin.coroutines.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f323132a;

    public y(ThreadLocal threadLocal) {
        this.f323132a = threadLocal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f323132a, ((y) obj2).f323132a);
    }

    public final int hashCode() {
        return this.f323132a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f323132a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
