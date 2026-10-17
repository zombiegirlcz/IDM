package eg;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f125490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f125491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f125492c;

    public s0(o eventType, d1 sessionData, b applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.f125490a = eventType;
        this.f125491b = sessionData;
        this.f125492c = applicationInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return this.f125490a == s0Var.f125490a && Intrinsics.f(this.f125491b, s0Var.f125491b) && Intrinsics.f(this.f125492c, s0Var.f125492c);
    }

    public final int hashCode() {
        return this.f125492c.hashCode() + ((this.f125491b.hashCode() + (this.f125490a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.f125490a + ", sessionData=" + this.f125491b + ", applicationInfo=" + this.f125492c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
