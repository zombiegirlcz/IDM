package pw8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f240347b;

    public f(String id10, Object obj2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f240346a = id10;
        this.f240347b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f240346a, fVar.f240346a) && Intrinsics.f(this.f240347b, fVar.f240347b);
    }

    public final int hashCode() {
        int iHashCode = this.f240346a.hashCode() * 31;
        Object obj2 = this.f240347b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
