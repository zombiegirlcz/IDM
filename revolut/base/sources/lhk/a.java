package lhk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195315b;

    public a(String familyId, String invitationId) {
        Intrinsics.checkNotNullParameter(familyId, "familyId");
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        this.f195314a = familyId;
        this.f195315b = invitationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f195314a, aVar.f195314a) && Intrinsics.f(this.f195315b, aVar.f195315b);
    }

    public final int hashCode() {
        return this.f195315b.hashCode() + (this.f195314a.hashCode() * 31);
    }
}
