package ieg;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.api.R$string;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f160712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8g.c f160713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8g.b f160714c;
    public final c d;

    public c0(l80.e dateProvider, p8g.c travelHotelsFeatureInteractor, q8g.b campaignsHubMapper, c filtersMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(campaignsHubMapper, "campaignsHubMapper");
        Intrinsics.checkNotNullParameter(filtersMapper, "filtersMapper");
        this.f160712a = dateProvider;
        this.f160713b = travelHotelsFeatureInteractor;
        this.f160714c = campaignsHubMapper;
        this.d = filtersMapper;
    }

    public static List a(List list, boolean z, Function2 function2) {
        return nkm.y.J(nkm.y.x(nkm.y.H(nkm.y.F(nkm.y.t(zhm.d0.Q(list), new cd0.a(3, function2)), new b0()), 2), new g7b.q(z, 23)));
    }

    public static List b() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_STATE_ITEM_ID", new TextLocalisedClause(R$string.hotels_choose_rooms_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.hotels_choose_rooms_empty_state_message, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, new TextLocalisedClause(R$string.hotels_choose_rooms_empty_state_action, null, null, 14), false, null, null, false, 0, 0, 31696);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(model);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(t1.t(domainState.f160720a, domainState.f160721b), new id8.a(this, 23), new y(this, 0), new z(this, domainState, 0));
        afi.a aVar = (afi.a) domainState.f160720a.getContent();
        CompositeClause compositeClause = null;
        if (aVar != null) {
            List list2 = aVar.e;
            LocalDate checkInDate = aVar.f4102c;
            LocalDate checkOutDate = aVar.d;
            Intrinsics.checkNotNullParameter(checkInDate, "checkInDate");
            Intrinsics.checkNotNullParameter(checkOutDate, "checkOutDate");
            int iBetween = (int) ChronoUnit.DAYS.between(checkInDate, checkOutDate);
            compositeClause = new CompositeClause(zhm.v.k(new TextLocalisedQuantityClause(R$plurals.hotels_stays_search_guests_count, Integer.valueOf(hx7.a.l(list2)), zhm.u.c(Integer.valueOf(hx7.a.l(list2))), (Style) null, 24), new DotDividerClause((Integer) null), new TextLocalisedQuantityClause(R$plurals.hotels_common_nights_count, Integer.valueOf(iBetween), zhm.u.c(Integer.valueOf(iBetween)), (Style) null, 24)), null, null, null, 14);
        }
        return new q(list, compositeClause, ((e) this.d).a(domainState.d));
    }
}
