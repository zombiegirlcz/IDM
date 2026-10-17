package b2b;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wel.e f11930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y49.f f11931c;

    public a(List positionsPerformance, wel.e eVar, y49.f fVar) {
        Intrinsics.checkNotNullParameter(positionsPerformance, "positionsPerformance");
        this.f11929a = positionsPerformance;
        this.f11930b = eVar;
        this.f11931c = fVar;
    }

    public static a a(a aVar, List positionsPerformance) {
        wel.e eVar = aVar.f11930b;
        y49.f fVar = aVar.f11931c;
        Intrinsics.checkNotNullParameter(positionsPerformance, "positionsPerformance");
        return new a(positionsPerformance, eVar, fVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f11929a, aVar.f11929a) && Intrinsics.f(this.f11930b, aVar.f11930b) && Intrinsics.f(this.f11931c, aVar.f11931c);
    }

    public final int hashCode() {
        int iHashCode = this.f11929a.hashCode() * 31;
        wel.e eVar = this.f11930b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        y49.f fVar = this.f11931c;
        return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }
}
