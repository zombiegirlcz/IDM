package g79;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import s69.m;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141138c;
    public final Instant d;
    public final String e;

    public b(String id10, String title, String description, Instant timestamp, String detailsDeeplink) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(detailsDeeplink, "detailsDeeplink");
        this.f141136a = id10;
        this.f141137b = title;
        this.f141138c = description;
        this.d = timestamp;
        this.e = detailsDeeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f141136a, bVar.f141136a) && Intrinsics.f(this.f141137b, bVar.f141137b) && Intrinsics.f(this.f141138c, bVar.f141138c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.g(this.d, p.a.c(p.a.c(this.f141136a.hashCode() * 31, 31, this.f141137b), 31, this.f141138c), 31);
    }
}
