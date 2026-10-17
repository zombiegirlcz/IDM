package guk;

import kotlin.jvm.internal.Intrinsics;
import rwk.f;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f146969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f146970b;

    public a(f barChartInfo, f fVar) {
        Intrinsics.checkNotNullParameter(barChartInfo, "barChartInfo");
        this.f146969a = barChartInfo;
        this.f146970b = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f146969a.equals(aVar.f146969a) && Intrinsics.f(this.f146970b, aVar.f146970b);
    }

    public final int hashCode() {
        int iHashCode = this.f146969a.hashCode() * 31;
        f fVar = this.f146970b;
        return Integer.hashCode(4) + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31);
    }
}
