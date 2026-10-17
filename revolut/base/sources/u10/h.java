package u10;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f276282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f276283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f276284c;
    public final String d;
    public final c0 e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UUID f276285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UUID f276286h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f276287j;
    public final int k;

    public h(UUID id10, Instant createdAt, UUID chatId, String data, c0 c0Var, Instant ticketCreatedAt, UUID uuid, UUID uuid2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        this.f276282a = id10;
        this.f276283b = createdAt;
        this.f276284c = chatId;
        this.d = data;
        this.e = c0Var;
        this.f = ticketCreatedAt;
        this.f276285g = uuid;
        this.f276286h = uuid2;
        this.i = i;
        this.f276287j = i2;
        this.k = i3;
    }

    public static h a(h hVar, int i, int i2, int i3) {
        UUID id10 = hVar.f276282a;
        Instant createdAt = hVar.f276283b;
        UUID chatId = hVar.f276284c;
        String data = hVar.d;
        c0 c0Var = hVar.e;
        Instant ticketCreatedAt = hVar.f;
        UUID uuid = hVar.f276285g;
        UUID uuid2 = hVar.f276286h;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        return new h(id10, createdAt, chatId, data, c0Var, ticketCreatedAt, uuid, uuid2, i, i2, i3);
    }

    public final UUID b() {
        return this.f276284c;
    }

    public final Instant c() {
        return this.f276283b;
    }

    public final String d() {
        return this.d;
    }

    public final UUID e() {
        return this.f276285g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f276282a, hVar.f276282a) && Intrinsics.f(this.f276283b, hVar.f276283b) && Intrinsics.f(this.f276284c, hVar.f276284c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f276285g, hVar.f276285g) && Intrinsics.f(this.f276286h, hVar.f276286h) && this.i == hVar.i && this.f276287j == hVar.f276287j && this.k == hVar.k;
    }

    public final c0 f() {
        return this.e;
    }

    public final UUID g() {
        return this.f276282a;
    }

    public final UUID h() {
        return this.f276286h;
    }

    public final int hashCode() {
        int iC = p.a.c(t61.a.f(this.f276284c, t61.a.g(this.f276283b, this.f276282a.hashCode() * 31, 31), 31), 31, this.d);
        c0 c0Var = this.e;
        int iG = t61.a.g(this.f, (iC + (c0Var == null ? 0 : c0Var.hashCode())) * 31, 31);
        UUID uuid = this.f276285g;
        int iHashCode = (iG + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.f276286h;
        return Integer.hashCode(this.k) + j6.a.b(this.f276287j, j6.a.b(this.i, (iHashCode + (uuid2 != null ? uuid2.hashCode() : 0)) * 31, 31), 31);
    }

    public final Instant i() {
        return this.f;
    }

    public /* synthetic */ h(UUID uuid, Instant instant, UUID uuid2, String str, c0 c0Var, Instant instant2, UUID uuid3, UUID uuid4) {
        this(uuid, instant, uuid2, str, c0Var, instant2, uuid3, uuid4, 0, 0, 0);
    }
}
