package we3;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f296615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f296616c;
    public final String d;
    public final double e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f296617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f296618h;
    public final Double i;

    public b(String id10, a state, String category, String title, double d, Instant startsAt, Instant endsAt, Double d5, Double d6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(startsAt, "startsAt");
        Intrinsics.checkNotNullParameter(endsAt, "endsAt");
        this.f296614a = id10;
        this.f296615b = state;
        this.f296616c = category;
        this.d = title;
        this.e = d;
        this.f = startsAt;
        this.f296617g = endsAt;
        this.f296618h = d5;
        this.i = d6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f296614a, bVar.f296614a) && this.f296615b == bVar.f296615b && Intrinsics.f(this.f296616c, bVar.f296616c) && Intrinsics.f(this.d, bVar.d) && Double.compare(this.e, bVar.e) == 0 && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f296617g, bVar.f296617g) && Intrinsics.f(this.f296618h, bVar.f296618h) && Intrinsics.f(this.i, bVar.i);
    }

    public final int hashCode() {
        int iC = r6.b.c(r6.b.c(m72.b.c(p.a.c(p.a.c((this.f296615b.hashCode() + (this.f296614a.hashCode() * 31)) * 31, 31, this.f296616c), 31, this.d), this.e, 31), 31, this.f), 31, this.f296617g);
        Double d = this.f296618h;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.i;
        return iHashCode + (d5 != null ? d5.hashCode() : 0);
    }
}
