package cjb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9i.c f24633a;

    public d(f9i.c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f24633a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f24633a.equals(((d) obj2).f24633a);
    }

    public final int hashCode() {
        return this.f24633a.f132975a.hashCode();
    }
}
