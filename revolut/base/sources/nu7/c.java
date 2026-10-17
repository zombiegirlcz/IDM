package nu7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9i.c f219221a;

    public c(f9i.c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f219221a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f219221a, ((c) obj2).f219221a);
    }

    public final int hashCode() {
        return this.f219221a.f132975a.hashCode();
    }
}
