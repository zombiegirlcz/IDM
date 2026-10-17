package sam;

import ch.qos.logback.core.CoreConstants;
import ip0.jp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jp f261464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jp f261465b;

    public f(jp deviceOrientation, jp screenOrientation) {
        Intrinsics.checkNotNullParameter(deviceOrientation, "deviceOrientation");
        Intrinsics.checkNotNullParameter(screenOrientation, "screenOrientation");
        this.f261464a = deviceOrientation;
        this.f261465b = screenOrientation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f261464a, fVar.f261464a) && Intrinsics.f(this.f261465b, fVar.f261465b);
    }

    public final int hashCode() {
        return this.f261465b.hashCode() + (this.f261464a.hashCode() * 31);
    }

    public final String toString() {
        return "OrientationState(deviceOrientation=" + this.f261464a + ", screenOrientation=" + this.f261465b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
