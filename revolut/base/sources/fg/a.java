package fg;

import ch.qos.logback.core.CoreConstants;
import ie.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hlm.c f134856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f134857b;

    public a(hlm.c mutex) {
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.f134856a = mutex;
        this.f134857b = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f134856a.equals(aVar.f134856a) && Intrinsics.f(this.f134857b, aVar.f134857b);
    }

    public final int hashCode() {
        int iHashCode = this.f134856a.hashCode() * 31;
        k kVar = this.f134857b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f134856a + ", subscriber=" + this.f134857b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
