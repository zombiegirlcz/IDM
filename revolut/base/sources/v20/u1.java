package v20;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u1 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f285578a;

    public u1(UUID messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.f285578a = messageId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u1) && Intrinsics.f(this.f285578a, ((u1) obj2).f285578a);
    }

    public final int hashCode() {
        return this.f285578a.hashCode();
    }
}
