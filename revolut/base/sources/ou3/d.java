package ou3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f229787a;

    public d(n popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        this.f229787a = popup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f229787a, ((d) obj2).f229787a);
    }

    public final int hashCode() {
        return this.f229787a.hashCode();
    }
}
