package u10;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f276303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f276304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f276305c;
    public final c0 d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f276306g;

    public l(UUID messageId, UUID chatId, UUID uuid, c0 c0Var, Instant ticketCreatedAt, Instant createdAt, String str) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f276303a = messageId;
        this.f276304b = chatId;
        this.f276305c = uuid;
        this.d = c0Var;
        this.e = ticketCreatedAt;
        this.f = createdAt;
        this.f276306g = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f276303a, lVar.f276303a) && Intrinsics.f(this.f276304b, lVar.f276304b) && Intrinsics.f(this.f276305c, lVar.f276305c) && this.d == lVar.d && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f276306g, lVar.f276306g);
    }

    public final int hashCode() {
        int iF = t61.a.f(this.f276304b, this.f276303a.hashCode() * 31, 31);
        UUID uuid = this.f276305c;
        int iHashCode = (iF + (uuid == null ? 0 : uuid.hashCode())) * 31;
        c0 c0Var = this.d;
        int iG = t61.a.g(this.f, t61.a.g(this.e, (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31, 31), 31);
        String str = this.f276306g;
        return iG + (str != null ? str.hashCode() : 0);
    }
}
