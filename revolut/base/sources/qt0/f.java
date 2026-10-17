package qt0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f248900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f248901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f248902c;
    public final c d;

    public f(c title, e eVar, c cVar, c cVar2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f248900a = title;
        this.f248901b = eVar;
        this.f248902c = cVar;
        this.d = cVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f248900a, fVar.f248900a) && Intrinsics.f(this.f248901b, fVar.f248901b) && Intrinsics.f(this.f248902c, fVar.f248902c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f248900a.hashCode() * 31;
        e eVar = this.f248901b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c cVar = this.f248902c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.d;
        return iHashCode3 + (cVar2 != null ? cVar2.hashCode() : 0);
    }
}
