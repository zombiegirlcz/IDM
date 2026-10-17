package hb0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f150539a;

    public g() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f150539a, ((g) obj2).f150539a);
    }

    public final int hashCode() {
        lk0.g gVar = this.f150539a;
        if (gVar == null) {
            return 0;
        }
        return gVar.f196174a.hashCode();
    }

    public g(lk0.g gVar) {
        this.f150539a = gVar;
    }
}
