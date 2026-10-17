package n50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f212480a;

    public f(UUID messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.f212480a = messageId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f212480a, ((f) obj2).f212480a);
    }

    public final int hashCode() {
        return this.f212480a.hashCode();
    }
}
