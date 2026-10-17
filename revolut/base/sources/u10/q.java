package u10;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f276317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f276318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f276319c;
    public final UUID d;
    public final UUID e;
    public final c0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UUID f276320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f276321h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f276322j;

    public q(UUID id10, Instant createdAt, Instant ticketCreatedAt, UUID chatId, UUID uuid, c0 c0Var, UUID uuid2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f276317a = id10;
        this.f276318b = createdAt;
        this.f276319c = ticketCreatedAt;
        this.d = chatId;
        this.e = uuid;
        this.f = c0Var;
        this.f276320g = uuid2;
        this.f276321h = i;
        this.i = i2;
        this.f276322j = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f276317a, qVar.f276317a) && Intrinsics.f(this.f276318b, qVar.f276318b) && Intrinsics.f(this.f276319c, qVar.f276319c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && this.f == qVar.f && Intrinsics.f(this.f276320g, qVar.f276320g) && this.f276321h == qVar.f276321h && this.i == qVar.i && this.f276322j == qVar.f276322j;
    }

    public final int hashCode() {
        int iF = t61.a.f(this.d, t61.a.g(this.f276319c, t61.a.g(this.f276318b, this.f276317a.hashCode() * 31, 31), 31), 31);
        UUID uuid = this.e;
        int iHashCode = (iF + (uuid == null ? 0 : uuid.hashCode())) * 31;
        c0 c0Var = this.f;
        int iHashCode2 = (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid2 = this.f276320g;
        return Integer.hashCode(this.f276322j) + j6.a.b(this.i, j6.a.b(this.f276321h, (iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0)) * 31, 31), 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(h entity) {
        this(entity.f276282a, entity.f276283b, entity.f, entity.f276284c, entity.f276285g, entity.e, entity.f276286h, entity.i, entity.f276287j, entity.k);
        Intrinsics.checkNotNullParameter(entity, "entity");
    }
}
