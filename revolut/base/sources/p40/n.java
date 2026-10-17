package p40;

import android.os.Parcelable;
import aw0.a5;
import aw0.c7;
import aw0.e5;
import aw0.f5;
import aw0.k1;
import aw0.n6;
import aw0.o9;
import aw0.s5;
import aw0.t5;
import aw0.x4;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HybridTileDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.a7;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.ud;
import com.revolut.core.ui_kit.delegates.vd;
import com.revolut.core.ui_kit.delegates.wd;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.delegates.x6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.swish.impl.domain.SwishPaymentLimits;
import com.revolut.feature.apm.swish.impl.ui.home.domain.AreaContent;
import com.revolut.feature.cards.models.delivery.CardDeliveryRecipient;
import com.revolut.feature.external_accounts.api.model.ExternalAccountModel;
import com.revolut.feature.feedback.api.domain.FeedbackConfig;
import com.revolut.feature.feedback.api.domain.FeedbackTag;
import com.revolut.feature.feedback.api.domain.TagsFeedback;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.salary_switch.impl.models.v2.CounterpartiesResult;
import com.revolut.feature.salary_switch.impl.models.v2.PayrollSwitchCounterparty;
import com.revolut.feature.store.core.api.model.StoreContentEntry;
import com.revolut.feature.store.core.api.model.StoreProductStatusResponse;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoom;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomUnit;
import com.revolut.feature_travel_hotels_models.property.room.MaxOccupancy;
import com.revolut.feature_travel_hotels_models.property.room.UnitBedConfiguration;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassAdmission;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import ip0.ck0;
import ip0.iq;
import ip0.kn;
import ip0.r80;
import ip0.t80;
import ip0.v7;
import ip0.wo;
import ip0.yj0;
import ip0.yt;
import ip0.z;
import ip0.zj;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kl7.i0;
import kl7.j0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jmrtd.cbeff.ISO781611;
import pyc.c0;
import q6h.j;
import tof.a3;
import wp5.y;
import yp0.e0;
import zhm.d0;
import zhm.f0;
import zhm.t0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class n implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f232789b;

    public /* synthetic */ n(Object obj2, int i) {
        this.f232788a = i;
        this.f232789b = obj2;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        char c2;
        List list;
        Object objK;
        int i;
        int i2;
        cgi.s sVar;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.b) this.f232789b;
        List availableRooms = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(availableRooms, "availableRooms");
        HotelsPropertyRoom room = (HotelsPropertyRoom) d0.d0(availableRooms);
        if (room != null) {
            List list2 = room.f98103j;
            ((rdg.b) bVar.f93988b).getClass();
            Intrinsics.checkNotNullParameter(room, "room");
            if (ue0.e.n(list2)) {
                objK = f0.f322471a;
            } else {
                MaxOccupancy maxOccupancy = room.i;
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("SLEEPS_TITLE_ITEM_ID", (Image) null, (Clause) (maxOccupancy != null ? new TextLocalisedClause(R$string.hotels_property_details_rooms_title, zhm.u.c(Integer.valueOf(maxOccupancy.f98109a)), null, 12) : new TextLocalisedClause(R$string.hotels_property_details_rooms_title_without_count, null, null, 14)), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                if (list2 != null) {
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(w.t(list3, 10));
                    int i3 = 0;
                    for (Object obj5 : list3) {
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        HotelsPropertyRoomUnit hotelsPropertyRoomUnit = (HotelsPropertyRoomUnit) obj5;
                        String strN = a0.d.n("SLEEPS_ROOM_UNIT_ITEM_ID_", i3);
                        LayeredImage.Companion companion = LayeredImage.INSTANCE;
                        UnitBedConfiguration unitBedConfiguration = (UnitBedConfiguration) d0.d0(hotelsPropertyRoomUnit.f98108b);
                        if (unitBedConfiguration == null || (sVar = unitBedConfiguration.f98123a) == null) {
                            i = R$drawable.uikit_icn_24_medical_bed;
                        } else {
                            switch (rdg.c.f253453a[sVar.ordinal()]) {
                                case 1:
                                    i = R$drawable.uikit_icn_24_medical_bed;
                                    break;
                                case 2:
                                    i = R$drawable.uikit_icn_24_medical_bed;
                                    break;
                                case 3:
                                    i = R$drawable.uikit_icn_24_lounges;
                                    break;
                                case 4:
                                    i = R$drawable.uikit_icn_24_medical_bed;
                                    break;
                                case 5:
                                    i = R$drawable.uikit_icn_24_medical_bed;
                                    break;
                                case 6:
                                    i = R$drawable.uikit_icn_24_medical_bed;
                                    break;
                                case 7:
                                    i = R$drawable.uikit_icn_24_medical_bed;
                                    break;
                                case 8:
                                    i = R$drawable.uikit_icn_24_medical_bed;
                                    break;
                                case 9:
                                    i = R$drawable.uikit_icn_24_medical_bed;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                        LayeredImage layeredImageB = LayeredImage.Companion.b(companion, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
                        TextClause textClause = new TextClause(hotelsPropertyRoomUnit.f98107a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        ArrayList<UnitBedConfiguration> arrayList2 = hotelsPropertyRoomUnit.f98108b;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                        for (UnitBedConfiguration unitBedConfiguration2 : arrayList2) {
                            cgi.s sVar2 = unitBedConfiguration2.f98123a;
                            int i6 = unitBedConfiguration2.f98124b;
                            switch (rdg.c.f253453a[sVar2.ordinal()]) {
                                case 1:
                                    i2 = R$plurals.hotels_property_details_room_bed_type_king_bed;
                                    break;
                                case 2:
                                    i2 = R$plurals.hotels_property_details_room_bed_type_queen_bed;
                                    break;
                                case 3:
                                    i2 = R$plurals.hotels_property_details_room_bed_type_sleep_sofa_futon;
                                    break;
                                case 4:
                                    i2 = R$plurals.hotels_property_details_room_bed_type_twin_single_bed;
                                    break;
                                case 5:
                                    i2 = R$plurals.hotels_property_details_room_bed_type_bunk_bed;
                                    break;
                                case 6:
                                    i2 = R$plurals.hotels_property_details_room_bed_type_double_bed;
                                    break;
                                case 7:
                                    i2 = R$plurals.hotels_property_details_room_bed_type_child_bed;
                                    break;
                                case 8:
                                    i2 = R$plurals.hotels_property_details_room_bed_type_murphy_bed;
                                    break;
                                case 9:
                                    i2 = R$plurals.hotels_property_details_room_bed_type_generic_bed;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            arrayList3.add(new TextLocalisedQuantityClause(i2, Integer.valueOf(i6), zhm.u.c(Integer.valueOf(i6)), (Style) null, 24));
                        }
                        ActionCardDelegate.Model model2 = new ActionCardDelegate.Model(strN, textClause, layeredImageB, null, new com.revolut.core.ui_kit.delegates.f(new CompositeClause(arrayList3, rdg.b.f253452a, null, null, 12), com.revolut.core.ui_kit.delegates.e.SMALL), hotelsPropertyRoomUnit, null, false, 16088);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        arrayList.add(model2);
                        i3 = i5;
                    }
                    c2 = 0;
                    list = arrayList;
                } else {
                    c2 = 0;
                    list = f0.f322471a;
                }
                hg hgVar = new hg("SLEEPS_SCROLLER_ITEM_ID", list, 2, x4.b.f10603a, null, gg.a.f54220a, true, false, null, null, 0, 0, 0, 0, 32656);
                int i21 = R$attr.uikit_dp0;
                yp0.b.p(hgVar, i21, R$attr.uikit_dp16, i21, i21);
                qv0.i[] iVarArr = new qv0.i[2];
                iVarArr[c2] = model;
                iVarArr[1] = hgVar;
                objK = zhm.v.k(iVarArr);
            }
            if (objK != null) {
                return objK;
            }
        }
        return f0.f322471a;
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        pe2.n nVar = (pe2.n) this.f232789b;
        AreaContent content = (AreaContent) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        SwishPaymentLimits swishPaymentLimits = content.f62929b;
        boolean z = false;
        int i = 6;
        boolean z3 = false;
        eVarB.addAll(yp0.b.g(zhm.v.k(new RowDelegate.Model("ID_P2P_LIMIT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_area_section_transaction_limits_p2p_title, null, null, 14), null, 0, new MoneyClause(swishPaymentLimits.f62898a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ID_P2M_LIMIT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_merchant, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, i), new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_area_section_transaction_limits_p2b_title, null, null, 14), null, 0, new MoneyClause(swishPaymentLimits.f62899b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872)), new ListSubheaderDelegate.Model("ID_TRANSACTION_LIMIT_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_area_section_transaction_limits_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        String str = content.f62928a;
        eVarB.addAll(yp0.b.i(new RowDelegate.Model("ID_LINKED_NUMBER", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_smartphone, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, i), new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_details_linked_phone_number_title, null, null, 14), null, 0, new TextClause(z80.b.b(nVar.f235325a, str, null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new ListSubheaderDelegate.Model("ID_DETAILS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_area_section_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        RowDelegate.Model model = new RowDelegate.Model("ID_GET_HELP", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_question, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, i), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_action_get_help, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        return zhm.u.a(eVarB);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        List listC;
        List listC2;
        pf2.p pVar = (pf2.p) this.f232789b;
        a12.j jVar = pVar.f235422a;
        pf2.c content = (pf2.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        a12.l lVar = content.f235410b;
        if (lVar != null) {
            eVarB.add(((s12.f) jVar).e(lVar));
        }
        List counterparties = content.f235411c;
        if (counterparties != null) {
            mf2.b bVar = pVar.d;
            Intrinsics.checkNotNullParameter(counterparties, "counterparties");
            if (counterparties.isEmpty()) {
                listC2 = zhm.u.c(new ReferralContactDelegate.Model("UpiAreaCounterpartiesBlockMapper_newContact", new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4095), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_action_new_contact_alternative, null, null, 14), null, null, null, false, null, null, 524248));
            } else {
                List<PaymentCounterpartyInfo> list = counterparties;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (PaymentCounterpartyInfo paymentCounterpartyInfo : list) {
                    do9.d dVar = (do9.d) bVar.f204831a;
                    Intrinsics.checkNotNullParameter(paymentCounterpartyInfo, "paymentCounterpartyInfo");
                    arrayList.add(new ReferralContactDelegate.Model(paymentCounterpartyInfo.f79060a, do9.d.b(paymentCounterpartyInfo), new TextClause(paymentCounterpartyInfo.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new RawCutoutImageBadge(dVar.a(paymentCounterpartyInfo, null)), null, false, null, paymentCounterpartyInfo, 393176));
                }
                listC2 = arrayList;
            }
            eVarB.addAll(zhm.u.c(new ContactsWidgetDelegate.Model("UpiAreaCounterpartiesBlockMapper_widget", listC2, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_area_recents_title, null, null, 14), false, null, null, 56)));
        }
        whf.p pVar2 = content.f235409a;
        if (pVar2 != null) {
            List list2 = pVar2.f297646a;
            if (list2.isEmpty()) {
                TextDelegate.Model model = new TextDelegate.Model("LIST_ID_TRANSACTIONS_EMPTY", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_recipient_details_transactions_empty, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                listC = zhm.u.c(model);
            } else {
                listC = zhm.u.c(RowsWidgetDelegate.Model.Companion.a(RowsWidgetDelegate.Model.INSTANCE, "ApmAreaTransactionsMapper_header", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_area_transactions_title, null, null, 14), ((anf.k) pVar.f235424c).q(list2, pVar2.f297647b, new thf.f(false, 3)), true, list2.size() >= 3 ? new n3(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_area_transactions_see_all, null, null, 14), null) : null, 96));
            }
            eVarB.addAll(listC);
        }
        CircleBadgeModel circleBadgeModel = null;
        ProgressStyle progressStyle = null;
        boolean z = false;
        NewBadgeContent newBadgeContent = null;
        eVarB.add(RowsWidgetDelegate.Model.Companion.d(RowsWidgetDelegate.Model.INSTANCE, "UPI_AREA_MORE_FROM_UPI_WIDGET_ID", new BaseDynamicWidgetDelegate.BigHeaderModel("UPI_AREA_MORE_FROM_UPI_WIDGET_HEADER_ID", new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_more_block_title, null, null, 14), null, false, null, 48), zhm.u.c(new RowDelegate.Model("UPI_SUBSCRIPTIONS_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_calendar_recurring, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), circleBadgeModel, progressStyle, z, newBadgeContent, false, 60), new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_more_subscriptions_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_more_subscriptions_subtitle, null, null, 14), null, null, 0, pVar.f235423b.f235413a, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848)), null, null, null, null, SyslogConstants.LOG_CLOCK));
        eVarB.addAll(((s12.f) jVar).b(zhm.u.c(pf2.a.Help)));
        return zhm.u.a(eVarB);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        Object obj5;
        hel.b bVar = (hel.b) this.f232789b;
        List reports = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(reports, "reports");
        Object obj6 = null;
        if (reports.isEmpty()) {
            return zhm.u.c(new FullScreenStateDelegate.Model("EMPTY_STATE_ID", new TextLocalisedClause(com.revolut.shared.feature.wealth.statements.impl.R$string.wealth_statements_empty, null, null, 14), null, new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, new ImageTransformations(null, null, null, null, null, 104, 104, 31), (Clause) null, 182)), null, null, false, null, null, false, 0, 0, 32756));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj7 : reports) {
            Integer numValueOf = Integer.valueOf(((wbl.j) obj7).f296269b.getYear());
            Object objU = linkedHashMap.get(numValueOf);
            if (objU == null) {
                objU = v7.u(linkedHashMap, numValueOf);
            }
            ((List) objU).add(obj7);
        }
        List<Pair> listP0 = d0.P0(t0.C(linkedHashMap), new pfl.b());
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (Pair pair : listP0) {
            int iIntValue = ((Number) pair.f186385a).intValue();
            List list = (List) pair.f186386b;
            String strValueOf = String.valueOf(iIntValue);
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDate localDateOf = LocalDate.of(iIntValue, Month.JANUARY, 1);
            Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
            TimeClause timeClauseB = com.revolut.core.ui_kit.models.j.b(jVar, localDateOf, LocalDateClause$DateFormat.Year.f57813a);
            int i2 = 1;
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(strValueOf, (Image) null, (Clause) timeClauseB, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            List<wbl.j> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, i));
            for (wbl.j jVar2 : list2) {
                long epochDay = jVar2.f296268a.toEpochDay();
                LocalDate localDate = jVar2.f296269b;
                String str = epochDay + "_" + localDate.toEpochDay();
                LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorLightBlue_10, 12.0f, Float.valueOf(20.0f), null, 32);
                if ((bVar == null ? -1 : pfl.a.f235712a[bVar.ordinal()]) == i2) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.shared.feature.wealth.statements.impl.R$string.wealth_reports_us_report_item_title, zhm.u.c(Integer.valueOf(localDate.getYear())), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
                    obj5 = null;
                } else {
                    obj5 = null;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.shared.feature.wealth.statements.impl.R$string.wealth_reports_cost_and_charges_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                }
                RowDelegate.Model model2 = new RowDelegate.Model(str, layeredImageB, null, null, textLocalisedClause, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, false, null, null, null, null, null, new mfl.j(jVar2), null, 0, 0, 0, 0, 1056962540);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                arrayList2.add(model2);
                obj6 = obj5;
                i2 = 1;
            }
            arrayList.add(i2b.a.q(model, arrayList2));
            obj6 = obj6;
            i = 10;
        }
        return w.u(arrayList);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        ArrayList arrayListD;
        String str;
        qv0.i iVarA;
        String str2;
        x6 x6Var;
        pmh.q qVar = (pmh.q) this.f232789b;
        pmh.f content = (pmh.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        LinkedHashMap linkedHashMap = content.f237575a;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            jel.w wVar = (jel.w) entry.getKey();
            List list = (List) entry.getValue();
            String strP = p.a.p("all-funds-subheader-", wVar.name(), "-list-id");
            int[] iArr = pmh.p.f237584a;
            switch (iArr[wVar.ordinal()]) {
                case 1:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_venture_capital, null, null, 14);
                    break;
                case 2:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_multi_asset, null, null, 14);
                    break;
                case 3:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_private_equity, null, null, 14);
                    break;
                case 4:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_private_credit, null, null, 14);
                    break;
                case 5:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_infrastructure, null, null, 14);
                    break;
                case 6:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_real_estate, null, null, 14);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Iterator it9 = it8;
            int i = 14;
            String str3 = "-list-id";
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(strP, (Image) null, (Clause) textLocalisedClause, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, false, (Clause) null, false, (Object) new pmh.c(wVar), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 260066);
            if (iArr[wVar.ordinal()] == 1) {
                List<nel.n> list2 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (nel.n nVar : list2) {
                    nel.k kVarJ = ifk.b.j(nVar);
                    if (kVarJ == null || (str2 = kVarJ.f214583c) == null) {
                        str = str3;
                        iVarA = qVar.a(nVar);
                    } else {
                        String strP2 = p.a.p("all-funds-instrument-", nVar.f214596b, str3);
                        TextClause textClause = new TextClause(nVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str4 = nVar.o;
                        if (str4 == null) {
                            m70.a.c(kotlin.jvm.internal.t0.f186434a);
                            str4 = "";
                        }
                        TextClause textClause2 = new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        UrlImage urlImage = new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                        wo woVar = wo.LANDSCAPE;
                        a7 a7Var = new a7(new TextClause(kVarJ.f214581a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), nbh.a.b(nVar));
                        if (kVarJ.f214582b) {
                            TagViewData.Companion companion = TagViewData.INSTANCE;
                            str = str3;
                            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_discover_section_private_markets_badge_exclusive, null, null, i);
                            Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_star_filled);
                            int i2 = R$attr.uikit_colorWhite_20;
                            int i3 = R$attr.uikit_colorWhite;
                            companion.getClass();
                            x6Var = new x6(zhm.u.c(TagViewData.Companion.b(i2, i3, textLocalisedClause2, numValueOf)));
                        } else {
                            str = str3;
                            x6Var = null;
                        }
                        iVarA = new HybridTileDelegate.Model(strP2, textClause, textClause2, null, urlImage, woVar, a7Var, x6Var, null, null, new pmh.d(nVar), 3848);
                    }
                    qv0.i iVar = iVarA;
                    yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(iVar);
                    str3 = str;
                    i = 14;
                }
                arrayListD = ue0.e.J(model, arrayList2);
            } else {
                List list3 = list;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(qVar.a((nel.n) it10.next()));
                }
                e0 e0Var = e0.OUTSIDE_BOX;
                int i5 = R$attr.uikit_dp8;
                int i6 = R$attr.uikit_dp16;
                arrayListD = !arrayList3.isEmpty() ? yp0.b.d(arrayList3, model, e0Var, i5, i5, i6, i6) : arrayList3;
            }
            arrayList.add(arrayListD);
            it8 = it9;
        }
        return w.u(arrayList);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        pn6.f fVar = (pn6.f) this.f232789b;
        List accounts = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        List<ExternalAccountModel> list = accounts;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ExternalAccountModel externalAccountModel : list) {
            arrayList.add(new InputChecklistDelegate.Model(externalAccountModel.f72210a, new TextClause(externalAccountModel.f72211b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(fVar.f237669b, externalAccountModel.f72210a), false, null, iq.RADIO_BUTTON, null, null, null, null, 0, 0, 0, 524248));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new pn6.i(arrayList, fVar.f237669b != null);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        poc.a aVar = (poc.a) this.f232789b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Template template = (Template) pair.f186385a;
        RiskMetrics riskMetrics = (RiskMetrics) pair.f186386b;
        yoc.f fVar = yoc.f.AVERAGE_ANNUAL_RETURN;
        aVar.getClass();
        CellDetailsDelegate.Model modelA = aVar.f237957a.a(nnc.d.a(riskMetrics, fVar));
        nnc.a aVarA = nnc.d.a(riskMetrics, yoc.f.DIVIDEND_YIELD);
        nnc.b bVar = aVar.f237957a;
        return yp0.b.g(zhm.v.k(modelA, bVar.a(aVarA), bVar.a(nnc.d.a(riskMetrics, yoc.f.MAX_DRAWDOWN)), bVar.a(nnc.d.a(riskMetrics, yoc.f.STANDARD_DEVIATION))), new ListSubheaderDelegate.Model("RISK_METRICS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_risk_metrics, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, false, (Clause) new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), true, (Object) new poc.c(template), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259874), null, 0, 0, 126);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        poe.f fVar = (poe.f) this.f232789b;
        List rationales = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rationales, "rationales");
        List<zme.h> list = rationales;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (zme.h hVar : list) {
            arrayList.add(new InputChecklistDelegate.Model(hVar.f323494a.name(), new TextClause(hVar.f323495b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(fVar.f237965b, hVar), false, null, iq.RADIO_BUTTON, null, null, hVar, null, 0, 0, 0, 523992));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new poe.i(arrayList, fVar.f237965b != null);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        Iterable iterable;
        Collection collectionK;
        InputTextDelegate.Model model;
        LargeActionButtonDelegate.Model model2;
        pp6.b bVar = (pp6.b) this.f232789b;
        FeedbackConfig feedbackConfig = (FeedbackConfig) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(feedbackConfig, "feedbackConfig");
        r80 r80Var = new r80(pp6.l.a(com.revolut.core.ui_kit_core.R$string.uikit_widget_rating_poor, R$drawable.uikit_icn_24_social_dislike), pp6.l.a(com.revolut.core.ui_kit_core.R$string.uikit_widget_rating_ok, R$drawable.uikit_icn_24_social_like), pp6.l.a(com.revolut.core.ui_kit_core.R$string.uikit_widget_rating_great, R$drawable.uikit_icn_24_double_thumbs));
        yo6.e eVar = bVar.f238280c;
        t80 t80Var = new t80("RATE_ITEM_LIST_ID", null, r80Var, eVar != null ? Integer.valueOf(eVar.c()) : null, false, null, 1010);
        TagsFeedback tagsFeedback = feedbackConfig.d;
        Set set = bVar.d;
        if (eVar == null) {
            collectionK = f0.f322471a;
        } else {
            int[] iArr = pp6.m.f238291a;
            int i = iArr[eVar.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_bottom_sheet_negative_filter_title, null, null, 14);
            } else if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_bottom_sheet_new_neutral_filter_title, null, null, 14);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_bottom_sheet_great_filter_title, null, null, 14);
            }
            ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("RATE_SUB_HEADER_ID", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            int i2 = iArr[eVar.ordinal()];
            if (i2 == 1) {
                iterable = tagsFeedback.f73137c;
            } else if (i2 == 2) {
                iterable = tagsFeedback.f73136b;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iterable = tagsFeedback.f73135a;
            }
            Iterable<FeedbackTag> iterable2 = iterable;
            ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
            for (FeedbackTag feedbackTag : iterable2) {
                arrayList.add(new ActionsView.Item(feedbackTag.f73133a, set.contains(feedbackTag) ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, null, null, new TextClause(feedbackTag.f73134b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, false, null, null, feedbackTag, null, 24476));
            }
            collectionK = zhm.v.k(model3, new z("FEEDBACK_EXTENSION_ACTIONS_LIST_ID", arrayList, null, mx0.l.FLEXBOX, R$attr.uikit_dp0, 0, 100));
        }
        if (eVar != null) {
            CharSequence value = bVar.f238279b;
            Intrinsics.checkNotNullParameter(value, "value");
            model = new InputTextDelegate.Model("FEEDBACK_EXTENSION_INPUT_LIST_ID", new TextClause(value.toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_bottom_sheet_input_placeholder, null, null, 14), null, null, null, false, 280, false, false, 0, false, 0, false, false, true, null, false, false, 0, false, false, null, -1090551820, 131071);
            yp0.b.r(model, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 12);
        } else {
            model = null;
        }
        if (eVar != null) {
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_bottom_sheet_submit, null, null, 14);
            int i3 = R$attr.uikit_dp8;
            int i5 = R$attr.uikit_dp16;
            model2 = new LargeActionButtonDelegate.Model("FEEDBACK_EXTENSION_BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause2, false, null, null, i3, i5, i5, i5, 496);
        } else {
            model2 = null;
        }
        aim.e eVarB = zhm.u.b();
        List listC = zhm.u.c(t80Var);
        yp0.b.k(listC, 0, R$attr.uikit_dp16, 0, 0, 29);
        eVarB.addAll(listC);
        eVarB.addAll(collectionK);
        if (model != null) {
            eVarB.add(model);
        }
        if (model2 != null) {
            eVarB.add(model2);
        }
        aim.e eVarA = zhm.u.a(eVarB);
        TextClause textClause = new TextClause(feedbackConfig.f73131b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = feedbackConfig.f73132c;
        return new pp6.c(eVarA, new lw0.a(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28));
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        char c2;
        s5 s5Var;
        qv0.i knVar;
        j0 j0Var = (j0) this.f232789b;
        List items = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(items, "<this>");
        if (items.isEmpty()) {
            knVar = xl7.l.c();
            c2 = 0;
        } else {
            List list = items;
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                Integer num = ((i0) it8.next()).f185338b;
                if (num != null) {
                    arrayList.add(num);
                }
            }
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            Iterator it9 = arrayList.iterator();
            double dIntValue = 0.0d;
            int i = 0;
            while (it9.hasNext()) {
                dIntValue += (double) ((Number) it9.next()).intValue();
                i++;
                if (i < 0) {
                    zhm.v.r();
                    throw null;
                }
            }
            int i2 = (int) (i == 0 ? Double.NaN : dIntValue / ((double) i));
            LinkedHashMap headers = new LinkedHashMap();
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it10 = list.iterator();
            while (true) {
                boolean zHasNext = it10.hasNext();
                float fIntValue = BitmapDescriptorFactory.HUE_RED;
                if (!zHasNext) {
                    break;
                }
                i0 i0Var = (i0) it10.next();
                Intrinsics.checkNotNullParameter(i0Var, "<this>");
                Intrinsics.checkNotNullParameter(headers, "headers");
                headers.put(i0Var.f185337a, new k1(new TextClause(String.valueOf(i0Var.f185338b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(i0Var.f185337a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28));
                String str = i0Var.f185337a;
                TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Integer num2 = i0Var.f185338b;
                if (num2 != null) {
                    fIntValue = num2.intValue();
                }
                arrayList2.add(new e5(str, textClause, zhm.u.c(new f5(fIntValue, R$attr.uikit_colorAccent)), R$attr.uikit_colorTransparent, 112));
            }
            c2 = 0;
            if (items.isEmpty()) {
                s5Var = null;
            } else {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_score_history_tooltip, zhm.u.c(Integer.valueOf(i2)), null, 12);
                int i3 = R$attr.uikit_colorAccent;
                s5Var = new s5(i2, textLocalisedClause, i3, Integer.valueOf(i3));
            }
            knVar = new kn(arrayList2, s5Var, new t5(zhm.v.k(new a5(BitmapDescriptorFactory.HUE_RED, new TextClause("0", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new a5(100.0f, new TextClause("100", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)))), new k1(new TextClause(String.valueOf(i2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_score_history_description, null, null, 14), null, 28), headers);
        }
        FixedTabsDelegate.Model modelB = pq7.q.b(j0Var);
        qv0.i[] iVarArr = new qv0.i[2];
        iVarArr[c2] = knVar;
        iVarArr[1] = modelB;
        return yp0.b.g(zhm.v.k(iVarArr), new ListSubheaderDelegate.Model("DRIVING_SCORE_HISTORY_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_score_history_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, R$attr.uikit_dp16, 0, 122);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        pqc.g gVar = (pqc.g) this.f232789b;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((CounterpartiesResult) obj2, "<unused var>");
        List<PayrollSwitchCounterparty> list = gVar.f238719b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (PayrollSwitchCounterparty payrollSwitchCounterparty : list) {
            String strQ = j6.a.q("BANK_ROW_ID_", payrollSwitchCounterparty.f85249b);
            Intrinsics.checkNotNullParameter(payrollSwitchCounterparty, "<this>");
            Image contactImage = new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, payrollSwitchCounterparty.f85249b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
            String str = payrollSwitchCounterparty.d;
            if (str != null) {
                contactImage = new UrlImage(str, (String) null, (UrlImageDrawable) new UrlImageDrawable.ImagePlaceholder(contactImage), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
            }
            arrayList.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(contactImage, null, null, false, null, false, 62), new TextClause(payrollSwitchCounterparty.f85249b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 2, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, payrollSwitchCounterparty, null, 0, 0, 0, 0, 532676584));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        List list2 = (List) ue0.e.M(arrayList);
        if (list2 == null) {
            List listC = zhm.u.c(new FullScreenStateDelegate.Model("BANK_LIST_EMPTY_STATE_ID", new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_bank_list_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_bank_list_empty_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D241", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_bank_list_empty_state_action_bank_not_present, null, null, 14), null, h4.ACCENT), null, false, null, null, null, YearClass.CLASS_2016));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_bank;
        int i2 = R$attr.uikit_colorAccentNeutral;
        CircleBadgeModel circleBadgeModel = null;
        ProgressStyle progressStyle = null;
        boolean z = false;
        NewBadgeContent newBadgeContent = null;
        RowDelegate.Model model = new RowDelegate.Model("BANK_NOT_PRESENT_ROW_ID", new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2)), circleBadgeModel, progressStyle, z, newBadgeContent, false, 62), new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_bank_list_action_bank_not_present, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return d0.F0(model, list2);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        List listC;
        QRCodeDelegate.Model.a wdVar;
        pui.f fVar = (pui.f) this.f232789b;
        AsftPass pass = (AsftPass) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pass, "pass");
        bti.n nVar = pass.f98714b;
        List list = pass.f98726t;
        int i = 14;
        int i2 = 1;
        if (nVar == bti.n.CREATED) {
            ud udVar = new ud(new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_pass_details_pass_pending_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_pass_details_pass_pending_subtitle, null, null, 14));
            int i3 = R$attr.uikit_dp0;
            QRCodeDelegate.Model model = new QRCodeDelegate.Model("list_id_qr_code_blurred", null, udVar, null, null, i3, i3, i3, i3, 50170);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC = zhm.u.c(model);
        } else {
            if (list == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            int i5 = 0;
            for (Object obj5 : list2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    zhm.v.s();
                    throw null;
                }
                AsftPassAdmission asftPassAdmission = (AsftPassAdmission) obj5;
                int i21 = pui.e.f239900a[asftPassAdmission.f98727a.ordinal()];
                if (i21 == i2) {
                    String str = asftPassAdmission.f98729c;
                    fkg.a aVar = fVar.f239903c;
                    c90.c cVar = fVar.f239902b;
                    wdVar = new wd(new QrCodeImage(fkg.a.l(aVar, str, new h90.a(kli.a.k(cVar.f22265a, 220.0f), kli.a.k(cVar.f22265a, 220.0f)), i80.c.M, i80.b.QR_CODE, null, 32).f159408a, pui.f.d, (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28));
                } else if (i21 == 2) {
                    wdVar = new wd(new UrlImage(asftPassAdmission.f98729c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286));
                } else if (i21 == 3) {
                    wdVar = new vd(new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_pass_details_pass_empty_title, null, null, i), new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_pass_details_pass_empty_caption, null, null, i));
                } else {
                    if (i21 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wdVar = null;
                }
                arrayList.add(wdVar == null ? fVar.a(pass, asftPassAdmission, i5, new wd(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", new ImageTransformations(null, null, null, null, null, 104, 104, 31), null, null, 28))) : fVar.a(pass, asftPassAdmission, i5, wdVar));
                i5 = i6;
                i = 14;
                i2 = 1;
            }
            listC = arrayList;
        }
        return pui.f.b(listC, (list != null ? list.size() : 0) > 1);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        RowDelegate.Model.MainImage.Image24 image24;
        RowDelegate.Model.MainImage.Image24 image242;
        pvb.b bVar = (pvb.b) this.f232789b;
        StoreProductStatusResponse content = (StoreProductStatusResponse) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Data data = bVar.f240044b;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.rev_points.exclusive_store.api.R$string.exclusive_store_product_status_title, null, null, 14), null, new lw0.b(pvb.f.a(), null), null, false, 26);
        ArrayList arrayList = content.f88643c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            StoreContentEntry storeContentEntry = (StoreContentEntry) obj5;
            String strN = a0.d.n("ENTRY_CONTENT_ITEM_ID", i);
            int i3 = pvb.g.f240050a[storeContentEntry.f88627a.ordinal()];
            int i5 = 6;
            if (i3 == 1) {
                image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i5);
            } else if (i3 == 2) {
                image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_trophy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i5);
            } else if (i3 == 3) {
                image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i5);
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                image242 = null;
                arrayList2.add(new RowDelegate.Model(strN, image242, new TextClause(storeContentEntry.f88628b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                i = i2;
            }
            image242 = image24;
            arrayList2.add(new RowDelegate.Model(strN, image242, new TextClause(storeContentEntry.f88628b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        od0.i iVar = (od0.i) data.getContent();
        if (iVar != null) {
            Boolean bool = (Boolean) iVar.g();
            textLocalisedClause = new TextLocalisedClause(bool != null ? bool.booleanValue() : false ? com.revolut.feature.rev_points.exclusive_store.api.R$string.exclusive_store_common_actions_gotIt : com.revolut.feature.rev_points.exclusive_store.api.R$string.exclusive_store_product_status_action_button_title, null, null, 14);
        } else {
            textLocalisedClause = null;
        }
        return new cii.b(new aw0.e(false, null, null, new n6(textLocalisedClause, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), arrayList2, aVar);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        c0 c0Var = (c0) this.f232789b;
        List instructions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        ((pyc.n) c0Var.k).getClass();
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        List list = instructions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            kxc.b bVar = (kxc.b) obj5;
            String str = bVar.f190554b;
            arrayList.add(new ListCellDelegate.Model(str, new j8(new ResourceImage(bVar.f190553a.a(), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), yt.TOP), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, i == 0 ? R$attr.uikit_dp32 : R$attr.uikit_dp16, 0, 0, 0, 3832));
            i = i2;
        }
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.selfserve.core.R$string.cnp_selfie_instructions_footer_button, null, null, 14);
        int i3 = R$attr.uikit_dp16;
        int i5 = R$attr.uikit_dp32;
        return new rp0.y(d0.F0(new LargeActionButtonDelegate.Model("ACTION_DIALOG_BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i5, i5, i3, i3, 496), arrayList), new rp0.t(new TextLocalisedClause(com.revolut.feature.selfserve.core.R$string.instructions_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.selfserve.core.R$string.instructions_caption, null, null, 14), null, 28), null, null, null, null, 1020);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        String str;
        String string;
        q23.q qVar = (q23.q) this.f232789b;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((do3.n) obj2, "<unused var>");
        CardDeliveryRecipient cardDeliveryRecipient = qVar.f241517l;
        do3.n nVar = (do3.n) qVar.i.getContent();
        if (cardDeliveryRecipient != null) {
            string = com.google.android.gms.internal.mlkit_vision_face.a.o(cardDeliveryRecipient.f65526a, " ", cardDeliveryRecipient.f65527b);
        } else {
            if (nVar == null) {
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                str = "";
                return new RowDelegate.Model("DELIVERY_TO_LIST_ID", null, new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.card_delivery_address_verification_delivery_to_label, null, null, 14), null, 0, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.card_delivery_address_verification_delivery_to_change_button, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867802);
            }
            String str2 = nVar.f116410c;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = nVar.e;
            string = kotlin.text.d0.F0(str2 + " " + (str3 != null ? str3 : "")).toString();
        }
        str = string;
        return new RowDelegate.Model("DELIVERY_TO_LIST_ID", null, new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.card_delivery_address_verification_delivery_to_label, null, null, 14), null, 0, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.card_delivery_address_verification_delivery_to_change_button, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867802);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object q(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p40.n.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        q42.l lVar = (q42.l) this.f232789b;
        q42.f content = (q42.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        whf.p content2 = content.f241997a;
        if (content2 == null) {
            return f0.f322471a;
        }
        List list = content2.f297646a;
        if (list.size() == 0) {
            List listC = zhm.u.c(new FullScreenStateDelegate.Model("ID_EMPTY_PLACEHOLDER", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_recipient_details_transactions_empty, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D006", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31716));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        xh2.b bVar = ((sh2.v) lVar.f242002a).f263420b;
        Intrinsics.checkNotNullParameter(content2, "content");
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (v13.d.i((a3) obj5) != null) {
                arrayList.add(obj5);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj6 : arrayList) {
            q02.a chargeback = v13.d.i((a3) obj6);
            if (chargeback != null) {
                Intrinsics.checkNotNullParameter(chargeback, "chargeback");
                int i = s12.r.f259055a[chargeback.f241055a.ordinal()];
                if (i == 1 || i == 2) {
                    arrayList2.add(obj6);
                }
            }
            arrayList3.add(obj6);
        }
        whf.p pVarA = whf.p.a(arrayList2, content2);
        whf.p pVarA2 = whf.p.a(arrayList3, content2);
        ArrayList arrayListA = bVar.a(pVarA);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        ArrayList arrayListA2 = bVar.a(pVarA2);
        yp0.b.k(arrayListA2, 0, 0, 0, 0, 31);
        aim.e eVarB = zhm.u.b();
        if (!arrayListA.isEmpty()) {
            eVarB.add(new ListSubheaderDelegate.Model("ID_ACTIVE_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_transaction_chargeback_section_active, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450));
            eVarB.addAll(arrayListA);
        }
        if (!arrayListA2.isEmpty()) {
            eVarB.add(new ListSubheaderDelegate.Model("ID_INACTIVE_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_transaction_chargeback_section_closed, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450));
            eVarB.addAll(arrayListA2);
        }
        return zhm.u.a(eVarB);
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        q4b.e eVar = (q4b.e) this.f232789b;
        q4b.d spreadBreakdown = (q4b.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(spreadBreakdown, "spreadBreakdown");
        lw0.a aVarA = q4b.h.a(eVar.f242121b);
        boolean z = eVar.f242121b;
        List listK = zhm.v.k(q4b.h.b(com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_cfd_spread_ask, spreadBreakdown.f242117a, "cfd-spread-breakdown-ask-price"), q4b.h.b(com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_cfd_spread_bid, spreadBreakdown.f242118b, "cfd-spread-breakdown-bid-price"), q4b.h.b(z ? com.revolut.feature.retail.cfd.impl.R$string.wealth_cfd_order_confirmation_opening_spread_title : com.revolut.feature.retail.cfd.impl.R$string.wealth_cfd_order_confirmation_closing_spread_title, spreadBreakdown.f242119c, "cfd-spread-breakdown-spread"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(null, listK, aVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p40.n.t(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        del.a aVar;
        RowDelegate.Model.c.b bVar;
        ej0.b bVar2;
        ej0.b bVar3;
        List list;
        Object obj5;
        del.b bVar4 = (del.b) this.f232789b;
        List rates = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        j.a aVar2 = q6h.j.Companion;
        Intrinsics.checkNotNullParameter(rates, "rates");
        if (rates.isEmpty()) {
            return q6h.j.a(true);
        }
        aim.e eVarB = zhm.u.b();
        List list2 = rates;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (true) {
            int i = 0;
            if (!it8.hasNext()) {
                break;
            }
            i6h.b bVar5 = (i6h.b) it8.next();
            if (bVar4 == null || (list = bVar4.e) == null) {
                aVar = null;
            } else {
                int size = list.size();
                while (true) {
                    if (i >= size) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i);
                    if (Intrinsics.f(((del.a) obj5).e.f183173a.f183145a, bVar5.f159008a)) {
                        break;
                    }
                    i++;
                }
                aVar = (del.a) obj5;
            }
            String str = bVar5.f159008a;
            BigDecimal bigDecimal = bVar5.e;
            String strQ = j6.a.q("rate_item_", str);
            TextClause textClause = aVar != null ? new TextClause(aVar.e.f183173a.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(bVar5.f159010c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new InstrumentImage(bVar5.f159009b, 30, null, null), null, null, false, null, false, 60);
            CompositeClause compositeClause = (aVar == null || (bVar3 = aVar.f113705b) == null) ? null : new CompositeClause(zhm.v.k(new TextLocalisedClause(com.revolut.feature.wealth.gia.margin_trading.impl.R$string.wealth_trading_margin_required_minimum_table_market_value, null, null, 14), new MoneyClause(mif.a.Q(bVar3), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new DotDividerClause((Integer) null), null, null, 12);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.gia.margin_trading.impl.R$string.wealth_trading_margin_required_minimum_table_maintenance, null, null, 14);
            BigDecimal bigDecimalMultiply = bigDecimal.multiply(q6h.j.f242602a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            del.b bVar6 = bVar4;
            CompositeClause[] elements = {compositeClause, new CompositeClause(zhm.v.k(textLocalisedClause, new PercentageClause(bigDecimalMultiply, (PercentageClause.Format) null, (Style) null, 6)), new DotDividerClause((Integer) null), null, null, 12)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            CompositeClause compositeClause2 = new CompositeClause(kotlin.collections.d.L(elements), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            if (aVar == null || (bVar2 = aVar.f113705b) == null) {
                bVar = null;
            } else {
                BigDecimal bigDecimalMultiply2 = bVar2.f126703a.multiply(bigDecimal);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                bVar = new RowDelegate.Model.c.b(new MoneyClause(mif.a.Q(ej0.b.b(bVar2, bigDecimalMultiply2, null, 2)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
            }
            arrayList.add(new RowDelegate.Model(strQ, image40, textClause, null, 0, compositeClause2, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
            bVar4 = bVar6;
        }
        eVarB.addAll(arrayList);
        if (zBooleanValue) {
            eVarB.addAll(q6h.j.a(false));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p40.n.v(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        o7j.j jVar = (o7j.j) this.f232789b;
        o7j.o validationResult = (o7j.o) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        return Boolean.valueOf((validationResult instanceof o7j.n) && Intrinsics.f(((o7j.n) validationResult).f222870b, jVar.f222863a.f99921a));
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0924  */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r47, java.lang.Object r48, java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 3466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p40.n.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ n(Object obj2, Object obj3, int i) {
        this.f232788a = i;
        this.f232789b = obj3;
    }

    public /* synthetic */ n(pn6.f fVar, pn6.m mVar) {
        this.f232788a = 12;
        this.f232789b = fVar;
    }
}
