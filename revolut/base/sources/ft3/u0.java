package ft3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final it3.k f137880b;

    public u0(String invitationId) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        this.f137879a = invitationId;
        this.f137880b = it3.k.INVITATION;
    }

    @Override // ft3.y0
    public final it3.k c0() {
        return this.f137880b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u0) && Intrinsics.f(this.f137879a, ((u0) obj2).f137879a);
    }

    public final int hashCode() {
        return this.f137879a.hashCode();
    }
}
