package s0d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258943a;

    public g(String invitationId) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        this.f258943a = invitationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f258943a, ((g) obj2).f258943a);
    }

    public final int hashCode() {
        return this.f258943a.hashCode();
    }
}
