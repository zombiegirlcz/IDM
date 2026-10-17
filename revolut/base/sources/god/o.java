package god;

import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.TripsCountryPickerContract$Country;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((TripsCountryPickerContract$Country) obj2).f87603a, ((TripsCountryPickerContract$Country) obj3).f87603a);
    }
}
