package v30;

import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f285823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f285824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f285825c;
    public final UUID d;
    public final String e;
    public final UUID f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f285826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f285827h;
    public final String i;

    public v(UUID id10, Instant time, Instant ticketCreatedAt, UUID uuid, String mediaType, UUID uuid2, String str, Map map, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        this.f285823a = id10;
        this.f285824b = time;
        this.f285825c = ticketCreatedAt;
        this.d = uuid;
        this.e = mediaType;
        this.f = uuid2;
        this.f285826g = str;
        this.f285827h = map;
        this.i = str2;
    }

    @Override // v30.w
    public final String Z() {
        return this.f285826g;
    }

    @Override // v30.w
    public final Map a() {
        return this.f285827h;
    }

    @Override // v30.w
    public final Instant b() {
        return this.f285824b;
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
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f285823a, vVar.f285823a) && Intrinsics.f(this.f285824b, vVar.f285824b) && Intrinsics.f(this.f285825c, vVar.f285825c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f285826g, vVar.f285826g) && Intrinsics.f(this.f285827h, vVar.f285827h) && Intrinsics.f(this.i, vVar.i);
    }

    @Override // v30.w
    public final String getFilePath() {
        return this.i;
    }

    public final int hashCode() {
        int iG = t61.a.g(this.f285825c, t61.a.g(this.f285824b, this.f285823a.hashCode() * 31, 31), 31);
        UUID uuid = this.d;
        int iC = p.a.c((iG + (uuid == null ? 0 : uuid.hashCode())) * 31, 31, this.e);
        UUID uuid2 = this.f;
        int iHashCode = (iC + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        String str = this.f285826g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f285827h;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
