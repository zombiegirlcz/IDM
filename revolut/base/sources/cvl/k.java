package cvl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4l.a f109488a;

    public k(l4l.a source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f109488a = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f109488a == ((k) obj2).f109488a;
    }

    public final int hashCode() {
        return this.f109488a.hashCode();
    }
}
