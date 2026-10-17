package u10;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f276288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f276289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f276290c;
    public final String d;
    public final c0 e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UUID f276291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UUID f276292h;
    public final String i;

    public i(UUID id10, Instant createdAt, UUID chatId, String data, c0 c0Var, Instant ticketCreatedAt, UUID uuid, UUID uuid2, String uploadType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(uploadType, "uploadType");
        this.f276288a = id10;
        this.f276289b = createdAt;
        this.f276290c = chatId;
        this.d = data;
        this.e = c0Var;
        this.f = ticketCreatedAt;
        this.f276291g = uuid;
        this.f276292h = uuid2;
        this.i = uploadType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f276288a, iVar.f276288a) && Intrinsics.f(this.f276289b, iVar.f276289b) && Intrinsics.f(this.f276290c, iVar.f276290c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f276291g, iVar.f276291g) && Intrinsics.f(this.f276292h, iVar.f276292h) && Intrinsics.f(this.i, iVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(t61.a.f(this.f276290c, t61.a.g(this.f276289b, this.f276288a.hashCode() * 31, 31), 31), 31, this.d);
        c0 c0Var = this.e;
        int iG = t61.a.g(this.f, (iC + (c0Var == null ? 0 : c0Var.hashCode())) * 31, 31);
        UUID uuid = this.f276291g;
        int iHashCode = (iG + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.f276292h;
        return this.i.hashCode() + ((iHashCode + (uuid2 != null ? uuid2.hashCode() : 0)) * 31);
    }
}
