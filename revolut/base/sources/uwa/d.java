package uwa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pwa.i f283570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pwa.n f283571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f283572c;
    public final pwa.h d;

    public d(pwa.i inviteType, pwa.n referralCampaignV4Type, List list, pwa.h hVar) {
        Intrinsics.checkNotNullParameter(inviteType, "inviteType");
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f283570a = inviteType;
        this.f283571b = referralCampaignV4Type;
        this.f283572c = list;
        this.d = hVar;
    }

    public final List a() {
        return this.f283572c;
    }

    public final pwa.i b() {
        return this.f283570a;
    }

    public final pwa.n c() {
        return this.f283571b;
    }

    public final pwa.h d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f283570a == dVar.f283570a && this.f283571b == dVar.f283571b && Intrinsics.f(this.f283572c, dVar.f283572c) && this.d == dVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f283571b.hashCode() + (this.f283570a.hashCode() * 31)) * 31;
        List list = this.f283572c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        pwa.h hVar = this.d;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }
}
