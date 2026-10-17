package kvl;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f190162a;

    public e(UUID tradingAccountId) {
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        this.f190162a = tradingAccountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f190162a, ((e) obj2).f190162a);
    }

    public final int hashCode() {
        return this.f190162a.hashCode();
    }
}
