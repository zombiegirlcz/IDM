package r1g;

import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((TravelExperiencesBooking) obj2).d.getMillis()), Long.valueOf(((TravelExperiencesBooking) obj3).d.getMillis()));
    }
}
