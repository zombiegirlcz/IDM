package y20;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f310535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f310536b;

    public q(UUID chatId, Instant instant) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f310535a = chatId;
        this.f310536b = instant;
    }

    @Override // y20.t
    public final boolean a() {
        return this.f310536b == null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f310535a, qVar.f310535a) && Intrinsics.f(this.f310536b, qVar.f310536b);
    }

    public final int hashCode() {
        int iB = j6.a.b(100, this.f310535a.hashCode() * 31, 31);
        Instant instant = this.f310536b;
        return iB + (instant == null ? 0 : instant.hashCode());
    }
}
