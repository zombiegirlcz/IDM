package v30;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f285833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f285834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f285835c;
    public final boolean d;
    public final Instant e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f285836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f285837h;

    public y(UUID id10, c0 feedType, j jVar, boolean z, Instant timestamp, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.f285833a = id10;
        this.f285834b = feedType;
        this.f285835c = jVar;
        this.d = z;
        this.e = timestamp;
        this.f = z3;
        this.f285836g = z4;
        this.f285837h = z6;
    }

    public static y a(y yVar, boolean z) {
        UUID id10 = yVar.f285833a;
        c0 feedType = yVar.f285834b;
        j jVar = yVar.f285835c;
        boolean z3 = yVar.d;
        Instant timestamp = yVar.e;
        boolean z4 = yVar.f;
        boolean z6 = yVar.f285836g;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new y(id10, feedType, jVar, z3, timestamp, z4, z6, z);
    }

    public final j b() {
        return this.f285835c;
    }

    public final c0 c() {
        return this.f285834b;
    }

    public final UUID d() {
        return this.f285833a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f285833a, yVar.f285833a) && this.f285834b == yVar.f285834b && Intrinsics.f(this.f285835c, yVar.f285835c) && this.d == yVar.d && Intrinsics.f(this.e, yVar.e) && this.f == yVar.f && this.f285836g == yVar.f285836g && this.f285837h == yVar.f285837h;
    }

    public final int hashCode() {
        int iHashCode = (this.f285834b.hashCode() + (this.f285833a.hashCode() * 31)) * 31;
        j jVar = this.f285835c;
        return Boolean.hashCode(this.f285837h) + j6.a.c(j6.a.c(t61.a.g(this.e, j6.a.c((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.d), 31), 31, this.f), 31, this.f285836g);
    }
}
