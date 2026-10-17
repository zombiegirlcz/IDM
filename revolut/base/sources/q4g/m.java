package q4g;

import aw0.o9;
import aw0.t0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class m {
    public static final CellDetailsDelegate.Model a(Payment payment, String listId, int i) {
        Intrinsics.checkNotNullParameter(payment, "<this>");
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (payment.f93536c.e()) {
            return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextLocalisedClause(R$string.travel_flights_price_breakdown_points_you_earn, null, null, 14), (Image) null, 0, false, 30), nub.a.l(payment.f93536c, o9.NON_SENSITIVE, nub.d.f219277a, null, BitmapDescriptorFactory.HUE_RED, 56), null, null, null, null, null, 0, null, false, false, null, null, null, null, i, 0, 0, 0, 62912504);
        }
        return null;
    }
}
