package xs7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f308434c;
    public final e d;

    public f(String title, String value, a aVar, d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f308432a = title;
        this.f308433b = value;
        this.f308434c = aVar;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f308432a, fVar.f308432a) && Intrinsics.f(this.f308433b, fVar.f308433b) && Intrinsics.f(this.f308434c, fVar.f308434c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f308432a.hashCode() * 31, 31, this.f308433b);
        b bVar = this.f308434c;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        e eVar = this.d;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }
}
