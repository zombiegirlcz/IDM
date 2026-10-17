package ns1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7l.c f218729a;

    public c(e7l.c cVar) {
        this.f218729a = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f218729a, ((c) obj2).f218729a);
    }

    public final int hashCode() {
        e7l.c cVar = this.f218729a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }
}
