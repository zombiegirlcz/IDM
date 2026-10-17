package s0d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258945a;

    public i(String invitationId) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        this.f258945a = invitationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f258945a, ((i) obj2).f258945a);
    }

    public final int hashCode() {
        return this.f258945a.hashCode();
    }
}
