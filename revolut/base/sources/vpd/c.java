package vpd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f291152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f291153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemainingBalanceDestination.PlaceholderCurrencyDestination f291154c;
    public final List d;
    public final xi0.b e;
    public final List f;

    public c(List destinations, ArrayList allDestinations, RemainingBalanceDestination.PlaceholderCurrencyDestination placeholderCurrencyDestination, List rates, xi0.b targetCurrency, List crossSellItems) {
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(allDestinations, "allDestinations");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(crossSellItems, "crossSellItems");
        this.f291152a = destinations;
        this.f291153b = allDestinations;
        this.f291154c = placeholderCurrencyDestination;
        this.d = rates;
        this.e = targetCurrency;
        this.f = crossSellItems;
    }

    public static c a(c cVar, ArrayList destinations) {
        ArrayList allDestinations = cVar.f291153b;
        RemainingBalanceDestination.PlaceholderCurrencyDestination placeholderCurrencyDestination = cVar.f291154c;
        List rates = cVar.d;
        xi0.b targetCurrency = cVar.e;
        List crossSellItems = cVar.f;
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(allDestinations, "allDestinations");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(crossSellItems, "crossSellItems");
        return new c(destinations, allDestinations, placeholderCurrencyDestination, rates, targetCurrency, crossSellItems);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f291152a, cVar.f291152a) && this.f291153b.equals(cVar.f291153b) && Intrinsics.f(this.f291154c, cVar.f291154c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f291153b, this.f291152a.hashCode() * 31, 31);
        RemainingBalanceDestination.PlaceholderCurrencyDestination placeholderCurrencyDestination = this.f291154c;
        return this.f.hashCode() + h30.l.j(this.e, p.a.d((iB + (placeholderCurrencyDestination == null ? 0 : placeholderCurrencyDestination.f87837a.hashCode())) * 31, 31, this.d), 31);
    }
}
