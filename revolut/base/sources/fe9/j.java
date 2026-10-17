package fe9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee9.g f134485a;

    public j() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f134485a, ((j) obj2).f134485a);
    }

    public final int hashCode() {
        ee9.g gVar = this.f134485a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }

    public j(ee9.g gVar) {
        this.f134485a = gVar;
    }
}
