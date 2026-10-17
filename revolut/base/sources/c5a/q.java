package c5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5a.a f21521a;

    public q(i5a.a aVar) {
        this.f21521a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f21521a, ((q) obj2).f21521a);
    }

    public final int hashCode() {
        i5a.a aVar = this.f21521a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
