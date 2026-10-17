package q4g;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import ip0.a20;
import ip0.c20;
import ip0.y10;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(boolean z) {
        if (!z) {
            return f0.f322471a;
        }
        List listC = u.c(new sa("FLIGHTS_SEPARATE_TICKETS_BANNER", (Clause) new TextLocalisedClause(R$string.travel_flights_separate_tickets_banner_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.travel_flights_separate_tickets_banner_message, u.c(new TextLocalisedClause(R$string.travel_flights_separate_tickets_banner_action, null, new Click(30, (Integer) null, (Object) null, "SEPARATE_TICKETS_INFO_CLICK", false), 10)), null, 12), (List) null, false, (c20) new a20(new ResourceImage(R$drawable.uikit_icn_24_info_legacy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246)), (y10) null, (Object) null, 200));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
