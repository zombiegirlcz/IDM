package hyl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f156907a;

    public b(m params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f156907a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f156907a, ((b) obj2).f156907a);
    }

    public final int hashCode() {
        return this.f156907a.hashCode();
    }
}
