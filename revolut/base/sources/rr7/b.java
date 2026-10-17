package rr7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9i.c f256733a;

    public b(f9i.c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f256733a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f256733a, ((b) obj2).f256733a);
    }

    public final int hashCode() {
        return this.f256733a.f132975a.hashCode();
    }
}
