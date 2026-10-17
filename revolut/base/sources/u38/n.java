package u38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276830a;

    public n(String invitationId) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        this.f276830a = invitationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f276830a, ((n) obj2).f276830a);
    }

    public final int hashCode() {
        return this.f276830a.hashCode();
    }
}
