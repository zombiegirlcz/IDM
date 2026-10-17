package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v20.n f181244a;

    public t(v20.n message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f181244a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f181244a, ((t) obj2).f181244a);
    }

    public final int hashCode() {
        return this.f181244a.hashCode();
    }
}
