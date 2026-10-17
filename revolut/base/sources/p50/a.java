package p50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f232988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f232989b;

    public a(UUID chatId, Instant instant) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f232988a = chatId;
        this.f232989b = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f232988a, aVar.f232988a) && Intrinsics.f(this.f232989b, aVar.f232989b);
    }

    public final int hashCode() {
        int iHashCode = this.f232988a.hashCode() * 31;
        Instant instant = this.f232989b;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }
}
