package ta1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f269079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f269080b;

    public c(Object obj2, f status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f269079a = obj2;
        this.f269080b = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f269079a, cVar.f269079a) && Intrinsics.f(this.f269080b, cVar.f269080b);
    }

    public final int hashCode() {
        Object obj2 = this.f269079a;
        return this.f269080b.hashCode() + ((obj2 == null ? 0 : obj2.hashCode()) * 31);
    }
}
