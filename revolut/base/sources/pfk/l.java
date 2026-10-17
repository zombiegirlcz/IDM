package pfk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f235653c;

    public l(String familyId, String invitationId) {
        Intrinsics.checkNotNullParameter(familyId, "familyId");
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        this.f235651a = familyId;
        this.f235652b = invitationId;
        this.f235653c = p.a.p("family_plan_invitation_info_key_prefix_", familyId, invitationId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f235651a, lVar.f235651a) && Intrinsics.f(this.f235652b, lVar.f235652b);
    }

    public final int hashCode() {
        return this.f235652b.hashCode() + (this.f235651a.hashCode() * 31);
    }
}
