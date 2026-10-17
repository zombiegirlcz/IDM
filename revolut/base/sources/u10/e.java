package u10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f276262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f276263b;

    public e(d draft, h hVar) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        this.f276262a = draft;
        this.f276263b = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f276262a, eVar.f276262a) && Intrinsics.f(this.f276263b, eVar.f276263b);
    }

    public final int hashCode() {
        int iHashCode = this.f276262a.hashCode() * 31;
        h hVar = this.f276263b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
