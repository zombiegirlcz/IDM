package f30;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f131870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f131871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f131872c;

    public i(UUID messageId, Instant ticketCreatedAt, Instant createdAt) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(ticketCreatedAt, "ticketCreatedAt");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f131870a = messageId;
        this.f131871b = ticketCreatedAt;
        this.f131872c = createdAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f131870a, iVar.f131870a) && Intrinsics.f(this.f131871b, iVar.f131871b) && Intrinsics.f(this.f131872c, iVar.f131872c);
    }

    public final int hashCode() {
        return this.f131872c.hashCode() + t61.a.g(this.f131871b, this.f131870a.hashCode() * 31, 31);
    }
}
