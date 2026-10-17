package k6g;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.x4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.api.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tf f181718a = new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246)));

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(int i, TextLocalisedClause textLocalisedClause, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause, null, 0, null, null, null, 0, f181718a, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
    }

    public static CompositeClause b() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_booking_details_manage_customer_order_reference_title, null, null, 14);
        int i = R$drawable.uikit_icn_24_copy;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone50);
        Float fValueOf = Float.valueOf(16.0f);
        return new CompositeClause(v.k(textLocalisedClause, new ImageClause(i, numValueOf, fValueOf, fValueOf, 16)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Collection collectionC;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f181713b;
        String str = (String) data.getContent();
        if (str != null) {
            CounterTextDelegate.Model modelC = CounterTextDelegate.Model.Companion.c(CounterTextDelegate.Model.INSTANCE, "MANAGE_BOOKING_ORDER_REFERENCE", b(), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, true, 2024);
            yp0.b.l(modelC, 0, 0, 0, 0, null, false, 63);
            collectionC = u.c(modelC);
        } else if (data.getLoading()) {
            CounterTextDelegate.Model modelB = CounterTextDelegate.Model.Companion.b(CounterTextDelegate.Model.INSTANCE, "MANAGE_BOOKING_ORDER_REFERENCE", new x4(b()), 0, 0, 0, 0, 124);
            yp0.b.l(modelB, 0, 0, 0, 0, null, false, 63);
            collectionC = u.c(modelB);
        } else {
            collectionC = f0.f322471a;
        }
        ArrayList arrayListE0 = d0.E0(yp0.b.g(v.k(a(R$drawable.uikit_icn_24_suitcase, new TextLocalisedClause(R$string.travel_flights_booking_details_manage_more_add_baggage_or_add_ons, null, null, 14), "MANAGE_BOOKING_ADD_BAGGAGE"), a(R$drawable.uikit_icn_24_travel, new TextLocalisedClause(R$string.travel_flights_booking_details_manage_more_change_booking, null, null, 14), "MANAGE_BOOKING_CHANGE_BOOKING"), a(R$drawable.uikit_icn_24_profile, new TextLocalisedClause(R$string.travel_flights_booking_details_manage_more_change_traveller_details, null, null, 14), "MANAGE_BOOKING_CHANGE_TRAVELLER_DETAILS"), a(R$drawable.uikit_icn_24_document, new TextLocalisedClause(R$string.travel_flights_booking_details_manage_more_documents, null, null, 14), "MANAGE_BOOKING_DOCUMENTS")), new ListSubheaderDelegate.Model("MANAGE_BOOKING_MORE_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.travel_flights_booking_details_manage_more_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), d0.E0(yp0.b.g(v.k(a(R$drawable.uikit_icn_24_question_outline, new TextLocalisedClause(R$string.travel_flights_booking_details_manage_faq, null, null, 14), "MANAGE_BOOKING_BROWSE_FAQS"), a(R$drawable.uikit_icn_24_message, new TextLocalisedClause(R$string.travel_flights_booking_details_manage_get_help_start_chat, null, null, 14), "MANAGE_BOOKING_START_CHAT"), a(R$drawable.uikit_icn_24_call, new TextLocalisedClause(R$string.travel_flights_booking_details_manage_call, null, null, 14), "MANAGE_BOOKING_CALL_US")), new ListSubheaderDelegate.Model("MANAGE_BOOKING_GET_HELP_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.travel_flights_booking_details_manage_get_help_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), collectionC));
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("MANAGE_BOOKING_CANCEL_BOOKING", LargeActionButton.ButtonStyle.f58731l, null, new TextLocalisedClause(R$string.travel_flights_booking_details_manage_cancel_booking, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return new i(d0.E0(u.c(model), arrayListE0));
    }
}
