package h2j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1j.d f148846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f148847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do3.n f148848c;

    public n(t1j.d balancesInfoWithCountryProfiles, List currencies, do3.n user) {
        Intrinsics.checkNotNullParameter(balancesInfoWithCountryProfiles, "balancesInfoWithCountryProfiles");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f148846a = balancesInfoWithCountryProfiles;
        this.f148847b = currencies;
        this.f148848c = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f148846a, nVar.f148846a) && Intrinsics.f(this.f148847b, nVar.f148847b) && Intrinsics.f(this.f148848c, nVar.f148848c);
    }

    public final int hashCode() {
        return this.f148848c.hashCode() + p.a.d(this.f148846a.hashCode() * 31, 31, this.f148847b);
    }
}
