package v4e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f286054a;

    public j(o type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f286054a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f286054a == ((j) obj2).f286054a;
    }

    public final int hashCode() {
        return this.f286054a.hashCode();
    }
}
