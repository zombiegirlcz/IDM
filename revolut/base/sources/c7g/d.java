package c7g;

import com.revolut.feature.travel.flights.models.domain.search.BaggageItem;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(boh.f.c(((BaggageItem) ((Pair) obj2).f186385a).f93561a)), Integer.valueOf(boh.f.c(((BaggageItem) ((Pair) obj3).f186385a).f93561a)));
    }
}
