package f23;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f131350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f131351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pi3.h f131352c;
    public final String d;
    public final zn3.a e;
    public final AnalyticsProduct f;

    public b(AccountId accountId, NaviCommand naviCommand, pi3.h hVar, String str, zn3.a aVar, AnalyticsProduct automaticEventProduct) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f131350a = accountId;
        this.f131351b = naviCommand;
        this.f131352c = hVar;
        this.d = str;
        this.e = aVar;
        this.f = automaticEventProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f131350a, bVar.f131350a) && Intrinsics.f(this.f131351b, bVar.f131351b) && Intrinsics.f(this.f131352c, bVar.f131352c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f131350a.hashCode() * 31;
        NaviCommand naviCommand = this.f131351b;
        int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        pi3.h hVar = this.f131352c;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        zn3.a aVar = this.e;
        return this.f.hashCode() + ((iHashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }
}
