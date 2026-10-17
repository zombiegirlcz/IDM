package b88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final psg.a f13120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ejb.b f13121b;

    public d(psg.a walletProfile, ejb.b savingsAccountsInfo) {
        Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
        Intrinsics.checkNotNullParameter(savingsAccountsInfo, "savingsAccountsInfo");
        this.f13120a = walletProfile;
        this.f13121b = savingsAccountsInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f13120a, dVar.f13120a) && Intrinsics.f(this.f13121b, dVar.f13121b);
    }

    public final int hashCode() {
        return this.f13121b.hashCode() + (this.f13120a.hashCode() * 31);
    }
}
