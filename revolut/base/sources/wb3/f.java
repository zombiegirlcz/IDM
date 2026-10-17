package wb3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7l.k f296001a;

    public f(e7l.k links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f296001a = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f296001a, ((f) obj2).f296001a);
    }

    public final int hashCode() {
        return this.f296001a.hashCode();
    }
}
