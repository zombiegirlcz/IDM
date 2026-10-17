package hag;

import android.os.Parcelable;
import aw0.o9;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.CellDetailsTextProgressDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.property.Window;
import ip0.c20;
import ip0.y10;
import java.util.ArrayList;
import java.util.List;
import k71.q;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m1c.r1;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalTime;
import pyb.s;
import qv0.i;
import qv0.o;
import rei.g;
import whf.n;
import whf.p;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f150508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m9g.b f150509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p8g.c f150510c;
    public final iag.a d;
    public final iag.c e;

    public f(l80.e dateProvider, m9g.b bookingDatePrinter, a pointsRewardsBannerFactory, p8g.c travelHotelsFeatureInteractor, iag.a travelHotelsBookingTransactionItemsMapper, iag.c travelHotelsSuggestedExperiencesItemsMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(bookingDatePrinter, "bookingDatePrinter");
        Intrinsics.checkNotNullParameter(pointsRewardsBannerFactory, "pointsRewardsBannerFactory");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsBookingTransactionItemsMapper, "travelHotelsBookingTransactionItemsMapper");
        Intrinsics.checkNotNullParameter(travelHotelsSuggestedExperiencesItemsMapper, "travelHotelsSuggestedExperiencesItemsMapper");
        this.f150508a = dateProvider;
        this.f150509b = bookingDatePrinter;
        this.f150510c = travelHotelsFeatureInteractor;
        this.d = travelHotelsBookingTransactionItemsMapper;
        this.e = travelHotelsSuggestedExperiencesItemsMapper;
    }

    public static Clause a(Window window) {
        LocalTime localTime = window.f98074a;
        LocalTime localTime2 = window.f98075b;
        if (localTime != null && localTime2 != null) {
            return new TextClause(localTime.toString("HH:mm") + " - " + localTime2.toString("HH:mm"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (localTime != null) {
            return new TextLocalisedClause(R$string.hotels_booking_details_time_interval_only_start, u.c(localTime.toString("HH:mm")), null, 12);
        }
        if (localTime2 != null) {
            return new TextLocalisedClause(R$string.hotels_booking_details_time_interval_only_end, u.c(localTime2.toString("HH:mm")), null, 12);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static j b() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_booking_details_booking_status_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        m70.a.t(t0.f186434a);
        Object[] elements = {textLocalisedClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.hotels_booking_details_booking_status_confirmed_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), 10)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        CellDetailsTextProgressDelegate.Model model = new CellDetailsTextProgressDelegate.Model("BOOKING_STATUS_ITEM_ID", new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), null, null, 1020);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static ListSubheaderDelegate.Model c() {
        return new ListSubheaderDelegate.Model("PAYMENTS_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.hotels_booking_details_payments_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public final List d(l9g.d transactionsContent) {
        o oVarG;
        List list = transactionsContent.f193248a;
        q qVar = transactionsContent.f193249b;
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model modelC = c();
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        List<l9g.c> list2 = transactionsContent.f193248a;
        ArrayList arrayList = new ArrayList();
        for (l9g.c cVar : list2) {
            boolean z = cVar instanceof l9g.a;
            iag.a aVar = this.d;
            if (z) {
                oVarG = (i) d0.d0(n.a(aVar.f160019a, new p(u.c(((l9g.a) cVar).f193245b), qVar, transactionsContent.f193250c), null, null, null, 14));
            } else {
                if (!(cVar instanceof l9g.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                oVarG = ((s) aVar.f160020b).g(new r1(((l9g.b) cVar).f193246b, null), qVar, TimeClause.Format.TimeDefault.f57977b);
            }
            if (oVarG != null) {
                arrayList.add(oVarG);
            }
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return i2b.a.q(modelC, arrayList);
    }

    public final List e(tei.b bookingRequestStatus, g gVar) {
        List listC;
        Intrinsics.checkNotNullParameter(bookingRequestStatus, "bookingRequestStatus");
        switch (e.f150505a[bookingRequestStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                CellDetailsTextProgressDelegate.Model model = new CellDetailsTextProgressDelegate.Model("BOOKING_STATUS_ITEM_ID", new TextLocalisedClause(R$string.hotels_booking_details_booking_status_progress_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, new CellDetailsTextProgressDelegate.a(true, 0, 6, 0), GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return u.c(model);
            case 4:
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_booking_details_booking_status_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                m70.a.t(t0.f186434a);
                sa saVar = new sa("BOOKING_STATUS_ITEM_ID", (Clause) null, (Clause) new CompositeClause(v.k(textLocalisedClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.hotels_booking_details_booking_status_partially_successful_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10)), null, null, null, 14), u.c(new ActionsView.Item("PARTIALLY_COMPLETED_STATUS_CONTACT_ACTION_ID", mx0.d.ACCENT, true, new TextLocalisedClause(R$string.hotels_booking_details_booking_status_partially_successful_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_chat, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 1988)), false, (c20) null, (y10) null, (Object) gVar, 114);
                yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
                return u.c(saVar);
            case 5:
            case 6:
            case 7:
                CellDetailsTextProgressDelegate.Model model2 = new CellDetailsTextProgressDelegate.Model("BOOKING_STATUS_ITEM_ID", new TextLocalisedClause(R$string.hotels_booking_details_booking_status_cancelled_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, null, 1020);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                return u.c(model2);
            case 8:
                if (gVar != null) {
                    if (gVar.e.f253603b.isBefore(((l80.f) this.f150508a).e())) {
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_booking_details_booking_status_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                        m70.a.t(t0.f186434a);
                        Object[] elements = {textLocalisedClause2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.hotels_booking_details_booking_status_completed_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), 10)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        CellDetailsTextProgressDelegate.Model model3 = new CellDetailsTextProgressDelegate.Model("BOOKING_STATUS_ITEM_ID", new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), null, null, 1020);
                        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                        listC = u.c(model3);
                    } else {
                        listC = u.c(b());
                    }
                    if (listC != null) {
                        return listC;
                    }
                }
                return u.c(b());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
