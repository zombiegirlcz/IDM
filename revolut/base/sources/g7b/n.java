package g7b;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubPlan;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f141152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsPlanHubPlan f141153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f141154c;
    public final boolean d;

    public n(Data overviewTabData, CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan, List helpItems, boolean z) {
        Intrinsics.checkNotNullParameter(overviewTabData, "overviewTabData");
        Intrinsics.checkNotNullParameter(helpItems, "helpItems");
        this.f141152a = overviewTabData;
        this.f141153b = cobrandedCardsPlanHubPlan;
        this.f141154c = helpItems;
        this.d = z;
    }

    public static n a(n nVar, Data overviewTabData, CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan, List helpItems, boolean z, int i) {
        if ((i & 1) != 0) {
            overviewTabData = nVar.f141152a;
        }
        if ((i & 2) != 0) {
            cobrandedCardsPlanHubPlan = nVar.f141153b;
        }
        if ((i & 4) != 0) {
            helpItems = nVar.f141154c;
        }
        if ((i & 8) != 0) {
            z = nVar.d;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(overviewTabData, "overviewTabData");
        Intrinsics.checkNotNullParameter(helpItems, "helpItems");
        return new n(overviewTabData, cobrandedCardsPlanHubPlan, helpItems, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f141152a, nVar.f141152a) && Intrinsics.f(this.f141153b, nVar.f141153b) && Intrinsics.f(this.f141154c, nVar.f141154c) && this.d == nVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f141152a.hashCode() * 31;
        CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan = this.f141153b;
        return Boolean.hashCode(this.d) + p.a.d((iHashCode + (cobrandedCardsPlanHubPlan == null ? 0 : cobrandedCardsPlanHubPlan.hashCode())) * 31, 31, this.f141154c);
    }
}
