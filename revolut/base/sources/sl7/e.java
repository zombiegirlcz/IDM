package sl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9i.c f264156a;

    public e(f9i.c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f264156a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f264156a, ((e) obj2).f264156a);
    }

    public final int hashCode() {
        return this.f264156a.f132975a.hashCode();
    }
}
