package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181294a;

    public y0(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.f181294a = messageId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y0) && Intrinsics.f(this.f181294a, ((y0) obj2).f181294a);
    }

    public final int hashCode() {
        return this.f181294a.hashCode();
    }
}
