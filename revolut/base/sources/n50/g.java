package n50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f212481a;

    public g(UUID messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.f212481a = messageId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f212481a, ((g) obj2).f212481a);
    }

    public final int hashCode() {
        return this.f212481a.hashCode();
    }
}
