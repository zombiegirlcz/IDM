package n3f;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f212045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f212046c;
    public final a0 d;
    public final a e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f212047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f212048h;

    public e0(String id10, ZonedDateTime completedDate, ZonedDateTime updatedDate, a0 a0Var, a aVar, j jVar, k kVar, g gVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        this.f212044a = id10;
        this.f212045b = completedDate;
        this.f212046c = updatedDate;
        this.d = a0Var;
        this.e = aVar;
        this.f = jVar;
        this.f212047g = kVar;
        this.f212048h = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f212044a, e0Var.f212044a) && Intrinsics.f(this.f212045b, e0Var.f212045b) && Intrinsics.f(this.f212046c, e0Var.f212046c) && Intrinsics.f(this.d, e0Var.d) && Intrinsics.f(this.e, e0Var.e) && Intrinsics.f(this.f, e0Var.f) && Intrinsics.f(this.f212047g, e0Var.f212047g) && Intrinsics.f(this.f212048h, e0Var.f212048h);
    }

    public final int hashCode() {
        int iH = h30.l.h(this.f212046c, h30.l.h(this.f212045b, this.f212044a.hashCode() * 31, 31), 31);
        a0 a0Var = this.d;
        int iHashCode = (iH + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        a aVar = this.e;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        j jVar = this.f;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.f212047g;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        g gVar = this.f212048h;
        return iHashCode4 + (gVar != null ? gVar.f212052a.hashCode() : 0);
    }
}
