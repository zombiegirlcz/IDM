package s74;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht3.a f260510a;

    public f(ht3.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f260510a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f260510a, ((f) obj2).f260510a);
    }

    public final int hashCode() {
        return this.f260510a.hashCode();
    }
}
