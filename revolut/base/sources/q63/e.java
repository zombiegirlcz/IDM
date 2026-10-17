package q63;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f242456a;

    public e(d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f242456a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f242456a == ((e) obj2).f242456a;
    }

    public final int hashCode() {
        return this.f242456a.hashCode();
    }
}
