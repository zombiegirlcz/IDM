package hbg;

import android.content.Intent;
import android.provider.CalendarContract;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreen;
import com.revolut.feature_travel_hotels_models.property.Address;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyBrief;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.IntentCommand;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsBookingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TravelHotelsBookingDetailsScreen travelHotelsBookingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsBookingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) tVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str2 = model.f51822a;
        Object obj3 = model.e;
        switch (str2.hashCode()) {
            case -1081312704:
                if (str2.equals("PROPERTY_DETAILS_ITEM_ID")) {
                    j60.a aVar2 = bVar.A;
                    rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.hotels_booking_details_property_details_section_title, null, null, 14), null, null, 30);
                    rp0.l lVar = rp0.l.WINDOW;
                    bVar.z.getClass();
                    LayeredImage.Companion companion = LayeredImage.INSTANCE;
                    List listK = zhm.v.k(new RowDelegate.Model("VIEW_PROPERTY_ITEM_ID", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_hotel, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.hotels_booking_details_property_details_section_view_property, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804), new RowDelegate.Model("POLICIES_ITEM_ID", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.hotels_booking_details_property_details_section_policies, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804), new RowDelegate.Model("ADDITIONAL_INFORMATION_ITEM_ID", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_more_dots, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.hotels_booking_details_property_details_section_additional_information, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804));
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    aVar2.x(new rp0.y(listK, tVar, lVar, 0, null, null, 1000));
                }
                break;
            case 254311484:
                if (str2.equals("ADD_BOOKING_TO_CALENDAR_ID")) {
                    rei.g bookingDetails = obj3 instanceof rei.g ? (rei.g) obj3 : null;
                    if (bookingDetails != null) {
                        rei.e eVar = bookingDetails.e;
                        LocalDate localDate = eVar.f253602a;
                        x8g.b bVar2 = (x8g.b) bVar.B;
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
                        Intent data = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI);
                        Calendar calendar = Calendar.getInstance();
                        LocalDate localDate2 = eVar.f253603b;
                        calendar.set(localDate.getYear(), localDate.getMonthValue() - 1, localDate.getDayOfMonth(), 0, 0, 0);
                        Intent intentPutExtra = data.putExtra("beginTime", calendar.getTimeInMillis());
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.set(localDate2.getYear(), localDate2.getMonthValue() - 1, localDate2.getDayOfMonth(), 0, 0, 0);
                        Intent intentPutExtra2 = intentPutExtra.putExtra("endTime", calendar2.getTimeInMillis());
                        StringBuilder sb6 = new StringBuilder();
                        f01.c cVar = bVar2.f303320a;
                        int i = R$string.hotels_event_calendar_event_title;
                        HotelsPropertyBrief hotelsPropertyBrief = bookingDetails.f;
                        String str3 = hotelsPropertyBrief.f98006b;
                        sb6.append(cVar.b(new TextLocalisedClause(i, zhm.u.c(str3), null, 12)));
                        Intent intentPutExtra3 = intentPutExtra2.putExtra("title", sb6.toString());
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(cVar.b(new TextLocalisedClause(R$string.hotels_event_calendar_event_title, zhm.u.c(str3), null, 12)));
                        t0 t0Var = t0.f186434a;
                        m70.a.t(t0Var);
                        sb9.append(" ");
                        rei.k kVar = (rei.k) zhm.d0.d0(bookingDetails.i);
                        if (kVar == null || (str = kVar.f253618c.f253600a) == null) {
                            Intrinsics.checkNotNullParameter(t0Var, "<this>");
                            str = "";
                        }
                        sb9.append(str);
                        sb9.append(m70.a.o(t0Var));
                        Address address = hotelsPropertyBrief.d.f98041c;
                        Intrinsics.checkNotNullParameter(address, "<this>");
                        StringBuilder sb10 = new StringBuilder();
                        String str4 = address.f97966a;
                        if (str4 != null) {
                            sb10.append(str4);
                            sb10.append(m70.a.o(t0Var));
                        }
                        String str5 = address.f97967b;
                        if (str5 != null) {
                            sb10.append(str5);
                            sb10.append(m70.a.o(t0Var));
                        }
                        String str6 = address.f;
                        if (str6 != null) {
                            sb10.append(str6);
                            sb10.append(m70.a.o(t0Var));
                        }
                        String str7 = address.d;
                        if (str7 != null) {
                            sb10.append(str7);
                            sb10.append(m70.a.o(t0Var));
                        }
                        sb10.append(address.e);
                        sb9.append(sb10.toString());
                        sb9.append(m70.a.o(t0Var));
                        sb9.append(localDate.toString());
                        sb9.append(m70.a.o(t0Var));
                        sb9.append(localDate2.toString());
                        Intent intentPutExtra4 = intentPutExtra3.putExtra("description", sb9.toString()).putExtra("availability", 0);
                        Intrinsics.checkNotNullExpressionValue(intentPutExtra4, "putExtra(...)");
                        bVar.C1(new BridgeDestination(new IntentCommand(intentPutExtra4, null)));
                    }
                }
                break;
            case 990003132:
                if (str2.equals("CONTACT_PROPERTY_ITEM_ID")) {
                    rei.g gVar = obj3 instanceof rei.g ? (rei.g) obj3 : null;
                    if (gVar != null) {
                        bVar.P2(gVar);
                    }
                }
                break;
            case 1404000601:
                if (str2.equals("DOWNLOAD_PDF_CONFIRMATION")) {
                    bVar.N2();
                }
                break;
            case 1569664231:
                if (str2.equals("MANAGE_BOOKING_ITEM_ID")) {
                    rei.g gVar2 = obj3 instanceof rei.g ? (rei.g) obj3 : null;
                    if (gVar2 != null) {
                        bVar.n2(new h54.o(bVar, gVar2, null == true ? 1 : 0, 18), new whi.b(6));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
