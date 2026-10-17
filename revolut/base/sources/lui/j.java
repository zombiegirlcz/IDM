package lui;

import aw0.t0;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassRefundBreakdown;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$InputData;
import ip0.tm0;
import ip0.um0;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftCancelBookingScreenContract$InputData f200249a;

    public j(AsftCancelBookingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f200249a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.asft_manage_booking_cancel_description_free_cancellation;
        AsftCancelBookingScreenContract$InputData asftCancelBookingScreenContract$InputData = this.f200249a;
        LocalDateTime localDateTime = asftCancelBookingScreenContract$InputData.f98851c.toLocalDateTime();
        Intrinsics.checkNotNullExpressionValue(localDateTime, "toLocalDateTime(...)");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(0), null, null, 12)), null, 12);
        aim.e eVarB = u.b();
        aim.e eVarB2 = u.b();
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.asft_cancel_booking_amount_refund, null, null, 14), (Image) null, 0, false, 30);
        AsftPassRefundBreakdown asftPassRefundBreakdown = asftCancelBookingScreenContract$InputData.d;
        eVarB2.add(new CellDetailsDelegate.Model("list_id_money_refund", t0Var, new MoneyClause(asftPassRefundBreakdown.f98731b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        String str = asftPassRefundBreakdown.f98730a;
        if (str != null) {
            eVarB2.add(new CellDetailsActionDelegate.Model("list_id_revpoints_refund", new TextLocalisedClause(R$string.asft_cancel_booking_points_refund, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.asft_cancel_booking_points, u.c(str), null, 12), null, false, false, null, null, null, 0, 0, 0, 0, 4194276));
        }
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        eVarB.add(new um0("list_id_buttons", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.asft_cancel_booking_dismiss, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.e, null, new TextLocalisedClause(R$string.asft_cancel_booking_cancel, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016));
        return new i(u.a(eVarB), textLocalisedClause);
    }
}
