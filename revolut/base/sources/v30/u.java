package v30;

import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f285817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f285818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f285819c;
    public final UUID d;
    public final String e;
    public final UUID f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f285820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f285821h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f285822j;
    public final Long k;

    public u(UUID id10, Instant time, Instant ticketCreatedAt, UUID uuid, String mediaType, UUID uuid2, String str, Map map, String str2, String str3, Long l2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        this.f285817a = id10;
        this.f285818b = time;
        this.f285819c = ticketCreatedAt;
        this.d = uuid;
        this.e = mediaType;
        this.f = uuid2;
        this.f285820g = str;
        this.f285821h = map;
        this.i = str2;
        this.f285822j = str3;
        this.k = l2;
    }

    @Override // v30.w
    public final String Z() {
        return this.f285820g;
    }

    @Override // v30.w
    public final Map a() {
        return this.f285821h;
    }

    @Override // v30.w
    public final Instant b() {
        return this.f285818b;
    }

    @Override // v30.w
    public final UUID c() {
        return this.f;
    }

    @Override // v30.w
    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f285817a, uVar.f285817a) && Intrinsics.f(this.f285818b, uVar.f285818b) && Intrinsics.f(this.f285819c, uVar.f285819c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && Intrinsics.f(this.f, uVar.f) && Intrinsics.f(this.f285820g, uVar.f285820g) && Intrinsics.f(this.f285821h, uVar.f285821h) && Intrinsics.f(this.i, uVar.i) && Intrinsics.f(this.f285822j, uVar.f285822j) && Intrinsics.f(this.k, uVar.k);
    }

    @Override // v30.w
    public final String getFilePath() {
        return this.i;
    }

    public final int hashCode() {
        int iG = t61.a.g(this.f285819c, t61.a.g(this.f285818b, this.f285817a.hashCode() * 31, 31), 31);
        UUID uuid = this.d;
        int iC = p.a.c((iG + (uuid == null ? 0 : uuid.hashCode())) * 31, 31, this.e);
        UUID uuid2 = this.f;
        int iHashCode = (iC + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        String str = this.f285820g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f285821h;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f285822j;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.k;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }
}
