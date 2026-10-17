package cvl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4l.a f109501a;

    public r(l4l.a source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f109501a = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f109501a == ((r) obj2).f109501a;
    }

    public final int hashCode() {
        return this.f109501a.hashCode();
    }
}
