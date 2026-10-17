package t50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f268022a;

    public k(UUID chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f268022a = chatId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f268022a, ((k) obj2).f268022a);
    }

    public final int hashCode() {
        return this.f268022a.hashCode();
    }
}
