package cbh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f22827a;

    public l() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f22827a, ((l) obj2).f22827a);
    }

    public final int hashCode() {
        lk0.g gVar = this.f22827a;
        if (gVar == null) {
            return 0;
        }
        return gVar.f196174a.hashCode();
    }

    public l(lk0.g gVar) {
        this.f22827a = gVar;
    }
}
