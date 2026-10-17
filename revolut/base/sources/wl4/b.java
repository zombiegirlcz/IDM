package wl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f298410a;

    public b(a aVar) {
        this.f298410a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f298410a, ((b) obj2).f298410a);
    }

    public final int hashCode() {
        a aVar = this.f298410a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
