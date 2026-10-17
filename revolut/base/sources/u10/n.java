package u10;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f276309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f276310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f276311c;
    public final UUID d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f276312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f276313h;

    public n(UUID uploadCorrelationId, UUID ticketId, UUID messageId, UUID messageCorrelationId, String filePath, String str, o status, long j2) {
        Intrinsics.checkNotNullParameter(uploadCorrelationId, "uploadCorrelationId");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(messageCorrelationId, "messageCorrelationId");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f276309a = uploadCorrelationId;
        this.f276310b = ticketId;
        this.f276311c = messageId;
        this.d = messageCorrelationId;
        this.e = filePath;
        this.f = str;
        this.f276312g = status;
        this.f276313h = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f276309a, nVar.f276309a) && Intrinsics.f(this.f276310b, nVar.f276310b) && Intrinsics.f(this.f276311c, nVar.f276311c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && this.f276312g == nVar.f276312g && this.f276313h == nVar.f276313h;
    }

    public final int hashCode() {
        int iC = p.a.c(t61.a.f(this.d, t61.a.f(this.f276311c, t61.a.f(this.f276310b, this.f276309a.hashCode() * 31, 31), 31), 31), 31, this.e);
        String str = this.f;
        return Long.hashCode(this.f276313h) + ((this.f276312g.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
