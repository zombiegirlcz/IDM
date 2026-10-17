package x9m;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f303762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f303763b;

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f303762a, iVar.f303762a) && Intrinsics.f(this.f303763b, iVar.f303763b);
    }

    public final int hashCode() {
        return this.f303763b.hashCode() + (this.f303762a.hashCode() * 31);
    }

    public final String toString() {
        return "Ray(origin=" + this.f303762a + ", direction=" + this.f303763b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
