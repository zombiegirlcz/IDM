package w1m;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293894a;

    public h(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        this.f293894a = projectId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f293894a, ((h) obj2).f293894a);
    }

    public final int hashCode() {
        return this.f293894a.hashCode();
    }

    public final String toString() {
        return j6.a.u(new StringBuilder("ProjectApiAuthParams(projectId="), this.f293894a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
