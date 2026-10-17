package u3a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f276833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f276834c;

    public a(List accounts, List pixBeneficiaries, List mobileWallet) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(pixBeneficiaries, "pixBeneficiaries");
        Intrinsics.checkNotNullParameter(mobileWallet, "mobileWallet");
        this.f276832a = accounts;
        this.f276833b = pixBeneficiaries;
        this.f276834c = mobileWallet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f276832a, aVar.f276832a) && Intrinsics.f(this.f276833b, aVar.f276833b) && Intrinsics.f(this.f276834c, aVar.f276834c);
    }

    public final int hashCode() {
        return this.f276834c.hashCode() + p.a.d(this.f276832a.hashCode() * 31, 31, this.f276833b);
    }
}
