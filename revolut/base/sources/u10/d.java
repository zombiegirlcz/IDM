package u10;

import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f276256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276258c;
    public final String d;
    public final long e;
    public final UUID f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f276259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f276260h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f276261j;
    public final Instant k;

    public d(UUID id10, String routingMode, String routingKeyValue, String str, long j2, UUID uuid, String str2, List list, String str3, Instant createdAt, Instant expiresAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(routingMode, "routingMode");
        Intrinsics.checkNotNullParameter(routingKeyValue, "routingKeyValue");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        this.f276256a = id10;
        this.f276257b = routingMode;
        this.f276258c = routingKeyValue;
        this.d = str;
        this.e = j2;
        this.f = uuid;
        this.f276259g = str2;
        this.f276260h = list;
        this.i = str3;
        this.f276261j = createdAt;
        this.k = expiresAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f276256a, dVar.f276256a) && Intrinsics.f(this.f276257b, dVar.f276257b) && Intrinsics.f(this.f276258c, dVar.f276258c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f276259g, dVar.f276259g) && Intrinsics.f(this.f276260h, dVar.f276260h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f276261j, dVar.f276261j) && Intrinsics.f(this.k, dVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f276256a.hashCode() * 31, 31, this.f276257b), 31, this.f276258c);
        String str = this.d;
        int iC2 = a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        UUID uuid = this.f;
        int iHashCode = (iC2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str2 = this.f276259g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f276260h;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.i;
        return this.k.hashCode() + t61.a.g(this.f276261j, (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }
}
