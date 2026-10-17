package hw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f155999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f156000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f156001c;

    public f(p labelFormat, e eVar, e eVar2) {
        Intrinsics.checkNotNullParameter(labelFormat, "labelFormat");
        this.f155999a = labelFormat;
        this.f156000b = eVar;
        this.f156001c = eVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f155999a, fVar.f155999a) && Intrinsics.f(this.f156000b, fVar.f156000b) && Intrinsics.f(this.f156001c, fVar.f156001c);
    }

    public final int hashCode() {
        int iHashCode = this.f155999a.hashCode() * 31;
        e eVar = this.f156000b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e eVar2 = this.f156001c;
        return iHashCode2 + (eVar2 != null ? eVar2.hashCode() : 0);
    }
}
