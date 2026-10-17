package y20;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f310523a;

    public m(UUID chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f310523a = chatId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f310523a, ((m) obj2).f310523a);
    }

    public final int hashCode() {
        return this.f310523a.hashCode();
    }
}
