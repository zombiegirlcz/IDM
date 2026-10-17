package up;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f281673a;

    public b(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f281673a = cause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f281673a, ((b) obj2).f281673a);
    }

    public final int hashCode() {
        return this.f281673a.hashCode();
    }
}
