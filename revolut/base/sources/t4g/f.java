package t4g;

import com.revolut.feature.travel.flights.models.domain.search.BaggageItem;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(boh.f.c(((BaggageItem) obj2).f93561a)), Integer.valueOf(boh.f.c(((BaggageItem) obj3).f93561a)));
    }
}
