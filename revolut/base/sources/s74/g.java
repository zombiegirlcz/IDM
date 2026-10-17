package s74;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht3.a f260511a;

    public g(ht3.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f260511a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f260511a, ((g) obj2).f260511a);
    }

    public final int hashCode() {
        return this.f260511a.hashCode();
    }
}
