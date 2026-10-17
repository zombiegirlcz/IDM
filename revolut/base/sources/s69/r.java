package s69;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260178c;
    public final Instant d;
    public final String e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f260179g;

    public r(String id10, String title, String description, Instant timestamp, String detailsDeeplink, p pVar, q qVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(detailsDeeplink, "detailsDeeplink");
        this.f260176a = id10;
        this.f260177b = title;
        this.f260178c = description;
        this.d = timestamp;
        this.e = detailsDeeplink;
        this.f = pVar;
        this.f260179g = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f260176a, rVar.f260176a) && Intrinsics.f(this.f260177b, rVar.f260177b) && Intrinsics.f(this.f260178c, rVar.f260178c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f260179g, rVar.f260179g);
    }

    public final int hashCode() {
        int iC = p.a.c(t61.a.g(this.d, p.a.c(p.a.c(this.f260176a.hashCode() * 31, 31, this.f260177b), 31, this.f260178c), 31), 31, this.e);
        p pVar = this.f;
        int iHashCode = (iC + (pVar == null ? 0 : pVar.f260173a.hashCode())) * 31;
        q qVar = this.f260179g;
        return iHashCode + (qVar != null ? qVar.hashCode() : 0);
    }
}
