package k4l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181005a;

    public u(String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        this.f181005a = securityRef;
    }

    @Override // k4l.v
    public final String b() {
        return this.f181005a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f181005a, ((u) obj2).f181005a);
    }

    public final int hashCode() {
        return this.f181005a.hashCode();
    }
}
