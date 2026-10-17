package zgk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322194b;

    public d(String invitationId, String familyId) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        Intrinsics.checkNotNullParameter(familyId, "familyId");
        this.f322193a = invitationId;
        this.f322194b = familyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f322193a, dVar.f322193a) && Intrinsics.f(this.f322194b, dVar.f322194b);
    }

    public final int hashCode() {
        return this.f322194b.hashCode() + (this.f322193a.hashCode() * 31);
    }
}
