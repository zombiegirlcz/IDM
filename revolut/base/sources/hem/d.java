package hem;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tem.a f151727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f151728b;

    public d(tem.a expectedType, Object response) {
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f151727a = expectedType;
        this.f151728b = response;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f151727a, dVar.f151727a) && Intrinsics.f(this.f151728b, dVar.f151728b);
    }

    public final int hashCode() {
        return (this.f151727a.hashCode() * 31) + this.f151728b.hashCode();
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.f151727a + ", response=" + this.f151728b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
