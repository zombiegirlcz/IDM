package nya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.a f220738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f220739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f220740c;
    public final boolean d;
    public final boolean e;

    public k(com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.a homeScreenDomainState, i c2BReferralsInfo, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(homeScreenDomainState, "homeScreenDomainState");
        Intrinsics.checkNotNullParameter(c2BReferralsInfo, "c2BReferralsInfo");
        this.f220738a = homeScreenDomainState;
        this.f220739b = c2BReferralsInfo;
        this.f220740c = z;
        this.d = z3;
        this.e = z4;
    }

    public static k a(k kVar, com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.a aVar, i iVar, boolean z, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            aVar = kVar.f220738a;
        }
        com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.a homeScreenDomainState = aVar;
        if ((i & 2) != 0) {
            iVar = kVar.f220739b;
        }
        i c2BReferralsInfo = iVar;
        if ((i & 4) != 0) {
            z = kVar.f220740c;
        }
        boolean z6 = z;
        if ((i & 8) != 0) {
            z3 = kVar.d;
        }
        boolean z11 = z3;
        if ((i & 16) != 0) {
            z4 = kVar.e;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(homeScreenDomainState, "homeScreenDomainState");
        Intrinsics.checkNotNullParameter(c2BReferralsInfo, "c2BReferralsInfo");
        return new k(homeScreenDomainState, c2BReferralsInfo, z6, z11, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f220738a, kVar.f220738a) && Intrinsics.f(this.f220739b, kVar.f220739b) && this.f220740c == kVar.f220740c && this.d == kVar.d && this.e == kVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c((this.f220739b.hashCode() + (this.f220738a.hashCode() * 31)) * 31, 31, this.f220740c), 31, this.d);
    }
}
