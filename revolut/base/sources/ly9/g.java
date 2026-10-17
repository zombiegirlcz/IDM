package ly9;

import kotlin.jvm.internal.Intrinsics;
import x5k.s;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200761a;

    public g(s action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f200761a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f200761a, ((g) obj2).f200761a);
    }

    public final int hashCode() {
        return this.f200761a.hashCode();
    }
}
