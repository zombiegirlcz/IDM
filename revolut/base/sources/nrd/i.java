package nrd;

import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import aw0.n6;
import aw0.o9;
import aw0.r2;
import aw0.s8;
import aw0.v1;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.material.internal.ViewUtils;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.a8;
import com.revolut.core.ui_kit.delegates.d8;
import com.revolut.core.ui_kit.delegates.f8;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.AuthorisationFrequency;
import com.revolut.feature.apm.core.models.payments_authorisations.ExecutionType;
import com.revolut.feature.apm.core.models.payments_authorisations.Identification;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.insurance_embedded.impl.data.model.LegalNotice;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreenContract$InputData;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsAvailableRewardItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsAvailableRewards;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.models.TransportLocation;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAddress;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBrief;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader;
import com.revolut.retail.feature.pricing_plans.ui.api.models.StudentHubScreenConfig;
import com.youTransactor.uCube.rpc.Constants;
import e7l.q;
import gu7.q3;
import ip0.gn0;
import ip0.q6;
import ip0.qd0;
import ip0.ql;
import ip0.vd0;
import ip0.yt;
import ip0.zj;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.d0;
import mx0.v5;
import o08.k;
import o42.m;
import oog.n;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import ox0.b0;
import ozc.g0;
import rp0.t;
import rp0.y;
import svi.s;
import whf.l;
import whf.p;
import yhm.o;
import yp0.r;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zw7.c0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f218621b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f218620a = i;
        this.f218621b = obj2;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model model;
        nwf.e eVar = (nwf.e) this.f218621b;
        nwf.f content = (nwf.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        String str = eVar.f219860a;
        LocationDomain locationDomain = eVar.f219861b;
        if (content.f219863a.isEmpty()) {
            FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("WIDGET_EMPTY_ID", new TextLocalisedClause(R$string.transport_hub_location_search_widget_empty_title, null, null, 14), !d0.W(str) ? new TextLocalisedClause(R$string.transport_hub_location_search_widget_empty_subtitle, u.c(str), null, 12) : null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.transport_hub_tab_transit_widget_no_location_action, null, null, 14), false, null, null, false, 0, 0, 31680);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            return u.c(model2);
        }
        if (d0.W(str) && locationDomain == null) {
            model = new RowDelegate.Model("WIDGET_CURRENT_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_location_arrow, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.transport_hub_location_search_widget_current_location, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        List<TransportLocation> list = content.f219863a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TransportLocation transportLocation : list) {
            String strQ = j6.a.q("ALL_ITEM_ID_", transportLocation.getId());
            TextClause textClause = new TextClause(transportLocation.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String provider = transportLocation.getProvider();
            arrayList.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_location_pin, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), textClause, null, 0, provider != null ? new TextClause(provider, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, transportLocation, null, 0, 0, 0, 0, 532676568));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        aim.e eVarB = u.b();
        if (model != null) {
            eVarB.add(model);
        }
        eVarB.addAll(arrayList);
        return u.a(eVarB);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        s sVar = (s) this.f218621b;
        List list = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj5 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            s sVar2 = (s) obj5;
            boolean zF = Intrinsics.f(sVar2, sVar);
            String strN = a0.d.n("ID_SUGGESTION_", i);
            String string = sVar2.f265981a;
            if (string == null) {
                string = d0.F0(sVar2.f265982b + " " + sVar2.f265983c).toString();
            }
            arrayList.add(new SuggestionsBarDelegate.Suggestion(strN, new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, zF ? new SuggestionViewStyle.Accent((Object) null) : new SuggestionViewStyle.Semiaccent((Object) null), false, sVar2, null, 364));
            i = i2;
        }
        return nyi.a.a(arrayList);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        Clause textLocalisedClause;
        k kVar = (k) this.f218621b;
        zw7.d0 pet = (zw7.d0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pet, "content");
        kVar.o.getClass();
        Intrinsics.checkNotNullParameter(pet, "pet");
        s0 s0Var = new s0(4);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_details_cells_pet_type_title, null, null, 14);
        c0 petType = pet.f325765b;
        zw7.e eVar = pet.f;
        Intrinsics.checkNotNullParameter(petType, "petType");
        int i = yx7.c.f317585a[petType.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_models_pet_pet_type_dog, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_models_pet_pet_type_cat, null, null, 14);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            m70.a.c(t0.f186434a);
            textLocalisedClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        List listK = v.k(new CellDetailsDelegate.Model("PET_TYE_CELL_LIST_ID", textLocalisedClause2, textLocalisedClause, 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("PET_NAME_CELL_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_details_cells_name_title, null, null, 14), new TextClause(pet.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("PET_GENDER_CELL_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_details_cells_sex_title, null, null, 14), yx7.d.b(pet.f325765b, pet.e), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("PET_DOB_CELL_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_details_cells_birthday_title, null, null, 14), new TimeClause(jli.b.b(pet.f325767g), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        s0Var.b((CellDetailsDelegate.Model[]) listK.toArray(new CellDetailsDelegate.Model[0]));
        List listK2 = v.k(new CellDetailsDelegate.Model("PET_BREED_TYPE_CELL_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_details_cells_breed_type_title, null, null, 14), yx7.d.a(eVar.f325775c), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("PET_BREED_CELL_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_details_cells_breed_title, null, null, 14), new TextClause(eVar.f325774b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        s0Var.b((CellDetailsDelegate.Model[]) listK2.toArray(new CellDetailsDelegate.Model[0]));
        List listK3 = v.k(new CellDetailsDelegate.Model("PET_AMOUNT_CELL_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_details_cells_paid_amount_title, null, null, 14), new TextClause(pet.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("PET_STERILIZED_CELL_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_details_cells_sterilized_title, null, null, 14), pet.f325768h ? new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14) : new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK3, 0, R$attr.uikit_dp24, 0, 0, 29);
        s0Var.b((CellDetailsDelegate.Model[]) listK3.toArray(new CellDetailsDelegate.Model[0]));
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("PET_DETAILS_SUPPORT_CHAT_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_details_details_contact_support_cell_title, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        s0Var.a(model);
        ArrayList arrayList = s0Var.f186433a;
        return new Pair(pet, v.k(arrayList.toArray(new koi.j[arrayList.size()])));
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0c7a  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0cff  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0346  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r60, java.lang.Object r61, java.lang.Object r62) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nrd.i.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        o22.a aVar = (o22.a) this.f218621b;
        o22.b content = (o22.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        AliasType aliasType = aVar.f221416a;
        Object obj5 = null;
        if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            wi0.b bVar = content.f221419a;
            String str = aVar.f221418c;
            String str2 = content.f221420b;
            boolean z = aVar.e;
            fj0.b.Companion.getClass();
            Serializable serializableB = fj0.a.b(str2);
            o.b(serializableB);
            com.revolut.core.ui_kit.delegates.ka kaVar = new com.revolut.core.ui_kit.delegates.ka("ID_ITEM_PHONE", str, new Pair(serializableB, bVar), null, null, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_new_contact_field_phone_number_hint, null, null, 14), false, z, 7864);
            int i = R$attr.uikit_dp0;
            yp0.b.l(kaVar, 0, 0, i, i, null, false, 51);
            obj5 = kaVar;
        } else if (Intrinsics.f(aliasType, AliasType.EMAIL.f61894b) || Intrinsics.f(aliasType, AliasType.REVTAG_EMAIL.f61896b)) {
            String str3 = aVar.d;
            InputTextDelegate.Model model = new InputTextDelegate.Model("ID_ITEM_EMAIL", !d0.W(str3) ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_new_contact_field_email_hint, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            obj5 = model;
        } else if (!Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b) && !Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b) && !Intrinsics.f(aliasType, AliasType.ALPHANUMERIC.f61892b)) {
            throw new NoWhenBranchMatchedException();
        }
        return v.l(obj5);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        Collection collectionJ;
        List list;
        m mVar = (m) this.f218621b;
        o42.f content = (o42.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int size = content.f221980a.size();
        p pVar = content.f221981b;
        if (size + ((pVar == null || (list = pVar.f297646a) == null) ? 0 : list.size()) == 0) {
            List listC = u.c(new FullScreenStateDelegate.Model("ID_EMPTY_PLACEHOLDER", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_recipient_details_transactions_empty, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D006", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31716));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        List list2 = content.f221980a;
        if (list2.isEmpty()) {
            collectionJ = f0.f322471a;
        } else {
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_MONEY_REQUESTS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_area_transfers_list_money_requests_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450);
            List list3 = list2;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList.add(((s12.g) mVar.f221988a).a((MoneyRequest) it8.next()));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            collectionJ = ue0.e.J(model, arrayList);
        }
        ArrayList arrayListC = pVar != null ? ((anf.w) mVar.f221989b).c(pVar, new l(0), new whf.i(false)) : null;
        aim.e eVarB = u.b();
        eVarB.addAll(collectionJ);
        if (arrayListC != null) {
            eVarB.addAll(arrayListC);
        }
        return u.a(eVarB);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        List listC;
        o44.e eVar = (o44.e) this.f218621b;
        o44.d content = (o44.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        String str = eVar.f221994a;
        boolean z = content.f221992b;
        List list = content.f221991a;
        boolean z3 = content.f221993c;
        if (!z && z3) {
            listC = o44.j.c();
        } else if (!z && !z3) {
            listC = u.c(new FullScreenStateDelegate.Model("ID_INVALID_POSTCODE", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_plugin_search_error_invalid_postal_code_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_plugin_search_error_invalid_postal_code_description, null, null, 14), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, null, false, null, null, false, 0, 0, 32752));
        } else if (list.isEmpty()) {
            listC = u.c(o44.j.b("ID_SEARCH_RESULT_EMPTY_LIST", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_plugin_search_hint_no_results, u.c(str), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), null));
        } else {
            List<gv3.b> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (gv3.b bVar : list2) {
                String str2 = bVar.f147045a;
                String str3 = bVar.d;
                String str4 = bVar.f147047c;
                Regex regex = jli.g.f175847a;
                String strConcat = "";
                String strConcat2 = d0.W(str4) ? "" : ", ".concat(str4);
                String str5 = bVar.e;
                if (!d0.W(str5)) {
                    strConcat = ", ".concat(str5);
                }
                arrayList.add(o44.j.b(str2, new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(str3, strConcat2, strConcat), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), bVar));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            listC = arrayList;
        }
        return new o44.i(listC);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        o7b.e eVar = (o7b.e) this.f218621b;
        CobrandedCardsAvailableRewards rewards = (CobrandedCardsAvailableRewards) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        String str = eVar.f222739b;
        ArrayList arrayList = rewards.f82292c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            CobrandedCardsAvailableRewardItem cobrandedCardsAvailableRewardItem = (CobrandedCardsAvailableRewardItem) obj5;
            arrayList2.add(new SingleChoiceDelegate.Model(a0.d.n("reward_selection_item_", i), new TextClause(cobrandedCardsAvailableRewardItem.f82288a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(cobrandedCardsAvailableRewardItem.f82289b, str), null, cobrandedCardsAvailableRewardItem.f82289b, YearClass.CLASS_2008));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        TagViewData tagViewDataA;
        aw0.i eVar;
        Clause compositeClause;
        occ.a aVar = (occ.a) this.f218621b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        occ.f fVar = (occ.f) pair.f186385a;
        List list = (List) pair.f186386b;
        PromotedMerchant promotedMerchant = aVar.f224206a;
        boolean z = fVar instanceof occ.d;
        q6 q6Var = (z && (tagViewDataA = ncc.b.a(promotedMerchant)) != null) ? new q6("REWARD_LIST_ID", new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_reward_title, null, null, 14), tagViewDataA, null, null, 0, 0, 2040) : null;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("AVAILABLE_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_availability_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_available_online, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760);
        aim.e eVarB = u.b();
        eVarB.add(new CellDetailsDelegate.Model("INSTRUCTIONS_TITLE_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_instructions_title, null, null, 14), (Image) null, 0, false, 30), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj5 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            ucc.e eVar2 = (ucc.e) obj5;
            String strN = a0.d.n("INSTRUCTION_LIST_ID_", i);
            TextClause textClause = new TextClause(eVar2.f279024a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            ucc.d dVar = eVar2.f279025b;
            if (dVar == null) {
                compositeClause = textClause;
            } else {
                if (occ.o.f224219a[dVar.f279022a.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                compositeClause = new CompositeClause(v.k(textClause, new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(dVar.f279023b, (Style) new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "CLICK_ID_WHAT_IS_REVOLUT_PAY", false), (Integer) null, false, (o9) null, (List) null, 124)), null, null, null, 14);
            }
            arrayList.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i2, Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 24), false, false, 4), compositeClause, of.SMALL, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868848));
            i = i2;
        }
        eVarB.addAll(arrayList);
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        Object[] elements = {q6Var, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = zhm.d0.E0(eVarA, listL);
        lw0.a aVar2 = new lw0.a(new TextClause(promotedMerchant.f84690a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new lw0.b(dcc.a.a(promotedMerchant.f84691b), null), null, false, 26);
        String str = promotedMerchant.f84690a;
        if (fVar instanceof occ.c) {
            eVar = new aw0.e(false, new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_tc_apply, u.c(new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_revolut_pay_tc, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_REVOLUT_PAY_TERMS", false), 10)), null, 12), b0.BELOW_BUTTONS, new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_take_me_to_merchant_button, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1020), null, null, 49);
        } else if (fVar instanceof occ.e) {
            eVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_take_me_to_merchant_button, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_join_rev_points_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_revolut_pay_and_rev_points_tc_apply, v.k(new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_revolut_pay_tc, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_REVOLUT_PAY_TERMS", false), 10), new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_rev_points_tc, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_REV_POINTS_TERMS", false), 10)), null, 12), b0.BELOW_BUTTONS, null, 97);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = new aw0.e(false, new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_revolut_pay_and_rev_points_tc_apply, v.k(new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_revolut_pay_tc, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_REVOLUT_PAY_TERMS", false), 10), new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_rev_points_tc, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_REV_POINTS_TERMS", false), 10)), null, 12), b0.BELOW_BUTTONS, new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.promoted_merchants.impl.R$string.revolut_pay_promoted_merchants_checkout_shop_with_revolut_pay_button, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1020), null, null, 49);
        }
        return new cii.b(eVar, arrayListE0, aVar2);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        Clause timeClause;
        PaymentMethodDetails.Creditor creditor;
        Identification identification;
        String str;
        og2.o oVar = (og2.o) this.f218621b;
        ApmPaymentAuthorisationSummary pendingPayment = (ApmPaymentAuthorisationSummary) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pendingPayment, "pendingPayment");
        aim.e eVarB = u.b();
        ExecutionType executionType = pendingPayment.f62003r;
        ExecutionType executionType2 = pendingPayment.f62003r;
        ExecutionType executionType3 = ExecutionType.RECURRING;
        boolean z = executionType == executionType3;
        PaymentMethodDetails paymentMethodDetails = pendingPayment.f61995g;
        LocalDateTime localDateTime = pendingPayment.f61999m;
        eVarB.add(new gn0("TWO_LOGOS_HEADER_LIST_ID", new CdnImage(z ? "autopay_logo" : "logo", "mobile/payments/upi", null, new ImageTransformations(null, null, null, null, null, null, 40, 63), null, null, Constants.TAG_F4)));
        RowDelegate.Model model = null;
        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
        if (lValueOf == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jLongValue = lValueOf.longValue();
        eVarB.add(new np0.b("APM_TIMER_ID", jLongValue - oi0.d.R(((l80.f) oVar.f225007a).f()), jLongValue, executionType2 == executionType3 ? new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_payment_confirmation_title_subscription, null, null, 14) : new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_payment_confirmation_title, null, null, 14)));
        boolean z3 = paymentMethodDetails instanceof PaymentMethodDetails.Upi;
        PaymentMethodDetails.Upi upi2 = z3 ? (PaymentMethodDetails.Upi) paymentMethodDetails : null;
        PaymentMethodDetails.Creditor creditor2 = upi2 != null ? upi2.f62071c : null;
        if (creditor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str2 = creditor2.f62030a;
        if (str2 == null) {
            str2 = "";
        }
        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (executionType2 == executionType3) {
            int i = com.revolut.feature.apm.upi.api.R$string.apm_recurring_payments_frequency_next_on_format;
            AuthorisationFrequency authorisationFrequency = pendingPayment.o;
            TextLocalisedClause textLocalisedClauseA = authorisationFrequency != null ? t12.b.a(authorisationFrequency) : null;
            LocalDateTime localDateTime2 = pendingPayment.e;
            Clause[] elements = {textLocalisedClauseA, new TimeClause(localDateTime2 != null ? oi0.d.R(localDateTime2) : 0L, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            timeClause = new TextLocalisedClause(i, kotlin.collections.d.L(elements), null, 12);
        } else {
            timeClause = new TimeClause(localDateTime != null ? oi0.d.R(localDateTime) : 0L, new TimeClause.Format.Pretty(q0.ONLY_TIME), null, null, 12);
        }
        dj0.d dVar = pendingPayment.f;
        RowDelegate.Model.c.b bVar = dVar != null ? new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126) : null;
        String str3 = creditor2.d;
        RowDelegate.Model model2 = new RowDelegate.Model("PAYMENT_ITEM_LIST_ID", new RowDelegate.Model.MainImage.Image40(str3 != null ? new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cart, R$attr.uikit_colorWhite, R$attr.uikit_colorPink), null, null, false, null, false, 60), textClause, null, 0, timeClause, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        PaymentMethodDetails.Upi upi3 = z3 ? (PaymentMethodDetails.Upi) paymentMethodDetails : null;
        if (upi3 != null && (creditor = upi3.f62071c) != null && (identification = creditor.f62031b) != null && (str = identification.f62023b) != null) {
            RowDelegate.Model model3 = new RowDelegate.Model("UPI_ID_LIST_ID", null, new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_payment_confirmation_upi_id, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TextClause(str, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            model = model3;
        }
        if (model != null) {
            eVarB.add(model);
        }
        return new og2.i(u.a(eVarB), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nrd.i.l(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        omh.g gVar = (omh.g) this.f218621b;
        omh.c content = (omh.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return yp0.b.g(gVar.f226853a.c(null, content.f226849a), omh.g.a(Integer.valueOf(content.f226849a.size())), null, 0, 0, 126);
    }

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    private final Object n(Object obj2, Object obj3, Object obj4) {
        int i;
        ?? r06;
        ona.j jVar = (ona.j) this.f218621b;
        e7l.f config = (e7l.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        if (config == null) {
            return jVar.b();
        }
        List list = config.i0;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (obj5 instanceof q) {
                arrayList.add(obj5);
            }
        }
        q qVar = (q) zhm.d0.d0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list) {
            if (obj6 instanceof e7l.o) {
                arrayList2.add(obj6);
            }
        }
        e7l.o oVar = (e7l.o) zhm.d0.d0(arrayList2);
        if (qVar == null && oVar == null) {
            return jVar.b();
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add((RowDelegate.Model) jVar.f226932b.getValue());
        if (qVar != null) {
            r06 = 0;
            i = 14;
            arrayList3.add(new RowDelegate.Model("ID_REPORT_FEEDBACK", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_megaphone, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profileHome_settings_item_feedback_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, qVar, null, 0, 0, 0, 0, 532676600));
        } else {
            i = 14;
            r06 = 0;
        }
        ArrayList arrayList4 = new ArrayList();
        if (oVar != null) {
            arrayList4.add(new RowDelegate.Model("ID_BLOG", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profileHome_settings_item_blog_title, r06, r06, i), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, oVar, null, 0, 0, 0, 0, 532676600));
        }
        arrayList4.add((RowDelegate.Model) jVar.f226933c.getValue());
        arrayList4.add((RowDelegate.Model) jVar.d.getValue());
        aim.e eVarB = u.b();
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList3);
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList4);
        RowDelegate.Model model = (RowDelegate.Model) jVar.f226931a.getValue();
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        return u.a(eVarB);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        NavBarWithContainerBackground videoBackground;
        onk.a aVar = (onk.a) this.f218621b;
        StudentHubScreenConfig config = (StudentHubScreenConfig) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        PlanHubScreenHeader planHubScreenHeader = config.f102858a;
        if (!(planHubScreenHeader instanceof PlanHubScreenHeader.Standard)) {
            throw new NoWhenBranchMatchedException();
        }
        PlanHubScreenHeader.Standard header = (PlanHubScreenHeader.Standard) planHubScreenHeader;
        imk.c cVar = aVar.f226951a;
        Clause clauseD = imk.c.d(header);
        TextClause textClauseC = imk.c.c(header);
        Clause clauseA = cVar.a(header);
        Intrinsics.checkNotNullParameter(header, "header");
        PlanHubScreenHeader.Standard.Background background = header.f;
        if (background instanceof PlanHubScreenHeader.Standard.Background.Image) {
            PlanHubScreenHeader.Standard.Background.Image image = (PlanHubScreenHeader.Standard.Background.Image) background;
            String str = image.f102677a;
            String str2 = image.f102678b;
            videoBackground = new NavBarWithContainerBackground.ImageBackground(new UrlImage(str, str2 == null ? str : str2, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523772), (s8) null, (Color.SolidRes) null, 14);
        } else if (background instanceof PlanHubScreenHeader.Standard.Background.Video) {
            PlanHubScreenHeader.Standard.Background.Video video = (PlanHubScreenHeader.Standard.Background.Video) background;
            String str3 = video.f102679a;
            String str4 = video.f102680b;
            videoBackground = new NavBarWithContainerBackground.VideoBackground(new UrlVideo(str3, str4 == null ? str3 : str4, false, oz0.b.CENTER_CROP, false, (oz0.c) null, 116), (Image) null, (VideoShutter) null, (s8) null, 30);
        } else {
            if (!(background instanceof PlanHubScreenHeader.Standard.Background.AnimatedBackground) && background != null) {
                throw new NoWhenBranchMatchedException();
            }
            videoBackground = null;
        }
        return new onk.e(clauseD, textClauseC, clauseA, videoBackground, cVar.b(header));
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        CompositeClause compositeClause;
        ZonedDateTime endDate;
        Object next;
        Object objPrevious;
        ood.s0 s0Var = (ood.s0) this.f218621b;
        ood.i content = (ood.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(content instanceof ood.h)) {
            if (!(content instanceof ood.g)) {
                throw new NoWhenBranchMatchedException();
            }
            rod.e eVar = s0Var.f227079b;
            fod.c tripAnalytics = ((ood.g) content).f227040c;
            rod.g gVar = eVar.f255975b;
            Intrinsics.checkNotNullParameter(tripAnalytics, "tripAnalytics");
            Trip trip = tripAnalytics.f136925a;
            boolean zA = trip.a();
            wi0.b bVar = trip.d;
            ZonedDateTime startDate = trip.f99264b;
            if (zA) {
                if (startDate == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int i = com.revolut.feature.spending_analytics.api.R$string.trips_list_subtitle_from;
                com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                LocalDate localDate = startDate.toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                compositeClause = new CompositeClause(v.k(new TextLocalisedClause(i, u.c(com.revolut.core.ui_kit.models.j.b(jVar, localDate, new LocalDateClause$DateFormat.DayAndMonth(0))), null, 12), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_subtitle_current_trip, null, null, 14)), new DotDividerClause((Integer) null), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
            } else if (startDate == null || (endDate = trip.f99265c) == null) {
                compositeClause = null;
            } else {
                if (startDate == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (endDate == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Intrinsics.checkNotNullParameter(startDate, "startDate");
                Intrinsics.checkNotNullParameter(endDate, "endDate");
                compositeClause = new CompositeClause(v.k(mzi.b.a(eVar.d, new Interval(pu7.a.I(startDate), pu7.a.I(endDate), DateTimeZone.UTC), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), false, g0m.a.f139502a, 28), rod.g.e(startDate, endDate)), new DotDividerClause((Integer) null), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
            }
            return new cr0.g(new TextClause(gVar.b(bVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), compositeClause, new com.revolut.core.ui_kit.views.f(new CountryImage(bVar.f297794a, (Integer) null, (ez0.e) null, 14)), 16);
        }
        rod.j jVar2 = s0Var.f227078a;
        ood.h tripData = (ood.h) content;
        Intrinsics.checkNotNullParameter(tripData, "tripData");
        wi0.b bVar2 = tripData.f227044c;
        if (bVar2 == null) {
            return null;
        }
        List list = tripData.f227042a;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (Intrinsics.f(((fod.c) obj5).f136925a.d, bVar2)) {
                arrayList.add(obj5);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((fod.c) it8.next()).f136925a);
        }
        ArrayList arrayListS = t61.a.s("allTrips", arrayList2);
        for (Object obj6 : arrayList2) {
            if (Intrinsics.f(((Trip) obj6).d, bVar2)) {
                arrayListS.add(obj6);
            }
        }
        Iterator it9 = arrayListS.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            Trip trip2 = (Trip) next;
            if (trip2.f99264b != null && trip2.f99265c != null) {
                break;
            }
        }
        Trip trip3 = (Trip) next;
        ZonedDateTime zonedDateTime = trip3 != null ? trip3.f99264b : null;
        ListIterator listIterator = arrayListS.listIterator(arrayListS.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            Trip trip4 = (Trip) objPrevious;
            if (trip4.f99264b != null && trip4.f99265c != null) {
                break;
            }
        }
        Trip trip5 = (Trip) objPrevious;
        ZonedDateTime zonedDateTime2 = trip5 != null ? trip5.f99264b : null;
        Clause textClause = (zonedDateTime == null || zonedDateTime2 == null) ? zonedDateTime != null ? new TextClause(String.valueOf(zonedDateTime.getYear()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null : zonedDateTime.getYear() != zonedDateTime2.getYear() ? new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_item_date_range_placeholder, v.k(Integer.valueOf(zonedDateTime2.getYear()), Integer.valueOf(zonedDateTime.getYear())), null, 12) : new TextClause(String.valueOf(zonedDateTime.getYear()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        return new cr0.g(new TextClause(jVar2.f255979a.b(bVar2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause != null ? new CompositeClause(v.k(new TextLocalisedQuantityClause(R$plurals.trips_list_subtitle_trips_count, Integer.valueOf(arrayListS.size()), u.c(Integer.valueOf(arrayListS.size())), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), textClause), new DotDividerClause((Integer) null), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8) : null, new com.revolut.core.ui_kit.views.f(new CountryImage(bVar2.f297794a, (Integer) null, (ez0.e) null, 14)), 16);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        InputTextDelegate.Model modelE;
        oog.g gVar = (oog.g) this.f218621b;
        wi0.b countryCode = (wi0.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("COUNTRY_LIST_ID", new CountryClause(countryCode, null), new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.user_migration_place_of_birth_country_placeholder, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        String str = gVar.f227103b;
        oog.h hVar = gVar.f227104c;
        InputTextDelegate.Model model = new InputTextDelegate.Model("CITY_LIST_ID", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.user_migration_place_of_birth_city_placeholder, null, null, 14), null, null, null, null, false, null, false, false, 0, true, 0, false, false, true, null, false, false, 0, false, false, null, -1090519048, 131071);
        int i = n.f227111a[hVar.ordinal()];
        if (i == 1) {
            modelE = InputTextDelegate.Model.e(model, null, null, -33554433);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            modelE = r.a(InputTextDelegate.Model.e(model, null, null, -536870913));
        }
        InputTextDelegate.Model model2 = modelE;
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new oog.j(v.k(modelA, model2), !d0.W(gVar.f227103b), true);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        kxk.o oVar = (kxk.o) this.f218621b;
        or4.d content = (or4.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        eVarB.addAll(((er4.b) oVar.f190611b).a(content.f228055a));
        eVarB.addAll(((or4.j) oVar.f190612c).a(content.f228056b, content.f228057c, false));
        return u.a(eVarB);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object s(Object obj2, Object obj3, Object obj4) {
        Iterable iterableG;
        os9.e eVar = (os9.e) this.f218621b;
        os9.k data = (os9.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        nq9.c cVar = eVar.f229265a;
        ArrayList arrayListJ = oc.c.j(data.f229270a);
        do3.n user = data.f229271b;
        Intrinsics.checkNotNullParameter(arrayListJ, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        List listP0 = zhm.d0.P0(arrayListJ, new mqk.g(user, 1, false));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : listP0) {
            if (((oq9.o) obj5) instanceof oq9.l) {
                arrayList.add(obj5);
            } else {
                arrayList2.add(obj5);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((tr9.e) cVar).f((oq9.o) it8.next(), user));
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        if (arrayList2.isEmpty()) {
            iterableG = f0.f322471a;
        } else {
            ArrayList arrayList4 = new ArrayList(w.t(arrayList2, 10));
            Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                arrayList4.add(((tr9.e) cVar).f((oq9.o) it9.next(), user));
            }
            iterableG = yp0.b.g(arrayList4, new ListSubheaderDelegate.Model("PENDING_MEMBERS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.group_details_members_section_non_revolut, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        return new os9.q(zhm.d0.E0(iterableG, arrayList3), u.c((PlusActionNavBarMenuItem) eVar.f229266b.getValue()));
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        oxd.p pVar = (oxd.p) this.f218621b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayListA = xte.a.a(pVar.f230781a, content, null, 6);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        return arrayListA;
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        oyi.b bVar = (oyi.b) this.f218621b;
        svi.u breakdown = (svi.u) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        aim.e eVarB = u.b();
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_bottom_sheet_refund_amount, null, null, 14), (Image) null, 0, false, 30);
        dj0.d dVar = breakdown.f265998a;
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var = o9.NON_SENSITIVE;
        eVarB.add(new CellDetailsDelegate.Model("LIST_ID_CELL_DETAILS_ITEM_REFUND_AMOUNT", t0Var, new MoneyClause(dVar, defaults, null, o9Var, 4), null, null, null, null, 0, null, false, false, null, null, 32760));
        String str = breakdown.f265999b;
        if (str != null) {
            eVarB.add(new CellDetailsActionDelegate.Model("LIST_ID_CELL_DETAILS_ITEM_REFUND_POINTS", new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_bottom_sheet_refund_points_amount, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), nub.a.r(new BigDecimal(str), null, o9Var, 3), null, false, false, null, null, null, 0, 0, 0, 0, 4194276));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        boolean z = bVar.f231040b;
        aim.e eVarB2 = u.b();
        eVarB2.add(new RowDelegate.Model("LIST_ID_ROW_ITEM_VALIDITY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_circle_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_bottom_sheet_availability_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_bottom_sheet_availability_subtitle_template, u.c(new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_bottom_sheet_availability_subtitle_lounges, null, new Click(30, (Integer) null, (Object) null, "AVAILABLE_LOUNGES_ID", false), 10)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        if (z) {
            eVarB2.add(new RowDelegate.Model("LIST_ID_ROW_ITEM_REASSIGN", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_bottom_sheet_assignation_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_bottom_sheet_assignation_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
        aim.e eVarA2 = u.a(eVarB2);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        return new cii.b(qyi.b.a(bVar.f231040b), zhm.d0.E0(eVarA2, eVarA), at.r.b());
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        g0 g0Var = (g0) this.f218621b;
        List instructions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        ((ozc.k) g0Var.f231272m).getClass();
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        List list = instructions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
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
        return new y(zhm.d0.F0(new LargeActionButtonDelegate.Model("ACTION_DIALOG_BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i5, i5, i3, i3, 496), arrayList), new t(new TextLocalisedClause(com.revolut.feature.selfserve.core.R$string.instructions_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.selfserve.core.R$string.instructions_caption, null, null, 14), null, 28), null, null, null, null, 1020);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object w(Object obj2, Object obj3, Object obj4) {
        r1g.c cVar = (r1g.c) this.f218621b;
        List bookings = (List) obj2;
        ((Boolean) obj3).getClass();
        Throwable th10 = (Throwable) obj4;
        Intrinsics.checkNotNullParameter(bookings, "content");
        if (th10 != null && bookings.isEmpty()) {
            return cVar.a();
        }
        Integer num = null;
        if (bookings.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_STATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_bookings_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_bookings_empty_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_bookings_empty_state_action_title, null, null, 14), false, null, null, false, 0, 0, 32704);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return u.c(model);
        }
        Intrinsics.checkNotNullParameter(bookings, "bookings");
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : bookings) {
            TravelExperiencesBooking travelExperiencesBooking = (TravelExperiencesBooking) obj5;
            iyf.c[] elements = {iyf.c.CONFIRMED, iyf.c.PENDING};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (kotlin.collections.d.y0(elements).contains(travelExperiencesBooking.f92747b) && travelExperiencesBooking.d.isAfter(((l80.f) cVar.f251006a).g())) {
                arrayList.add(obj5);
            }
        }
        List listP0 = zhm.d0.P0(arrayList, new r1g.b());
        s0 s0Var = new s0(2);
        List<TravelExperiencesBooking> list = listP0;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (TravelExperiencesBooking travelExperiencesBooking2 : list) {
            String str = travelExperiencesBooking2.f92746a;
            TravelExperienceBrief travelExperienceBrief = travelExperiencesBooking2.f;
            TextClause textClause = new TextClause(travelExperienceBrief.f92805b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TravelExperienceAddress travelExperienceAddress = travelExperienceBrief.d;
            String str2 = travelExperienceAddress != null ? travelExperienceAddress.d : num;
            Object textClause2 = str2 != 0 ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : num;
            Object dotDividerClause = new DotDividerClause(num);
            if (str2 == 0) {
                dotDividerClause = num;
            }
            Object[] elements2 = {textClause2, dotDividerClause, new TimeClause(travelExperiencesBooking2.d.getMillis(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements2), null, null, null, 14);
            String str3 = (String) zhm.d0.d0(travelExperienceBrief.f92806c);
            if (str3 == null) {
                str3 = "";
            }
            u8 u8Var = new u8(str, textClause, compositeClause, null, new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, null, v1.DARK, null, false, false, false, travelExperiencesBooking2, 65000);
            yp0.b.l(u8Var, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(u8Var);
            num = null;
        }
        s0Var.b(arrayList2.toArray(new qv0.i[0]));
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("PAST_AND_CANCELLED_ITEM_ID", new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_button_past_and_cancelled, null, null, 14), 0, true, null, null, null, 2036);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        s0Var.a(listP0.size() < bookings.size() ? model2 : null);
        ArrayList arrayList3 = s0Var.f186433a;
        return v.m(arrayList3.toArray(new qv0.i[arrayList3.size()]));
    }

    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r12v16, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        List listU;
        DateTime dateTimeWithTimeAtStartOfDay;
        int i;
        String str;
        ?? r102;
        TimeClause timeClauseA;
        int i2;
        String str2;
        int i3;
        boolean z;
        String str3;
        qv0.i model;
        RowDelegate.Model model2;
        Clause compositeClause;
        d8 d8Var;
        LinearProgressWithAmountDelegate.Model.b aVar;
        List listC;
        String str4;
        int i5;
        int i6;
        int i21 = this.f218620a;
        Object obj5 = this.f218621b;
        switch (i21) {
            case 0:
                a aVar2 = (a) obj5;
                List categories = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(categories, "categories");
                vzi.b bVar = aVar2.f218610b;
                List<CustomAssetCategoryDefinition> list = categories;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (CustomAssetCategoryDefinition customAssetCategoryDefinition : list) {
                    vzi.b category = customAssetCategoryDefinition.f99224a;
                    boolean z3 = bVar == category;
                    String str5 = "category_" + category.name();
                    Intrinsics.checkNotNullParameter(category, "category");
                    switch (rrd.a.f256811a[category.ordinal()]) {
                        case 1:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_add_other_asset_property, null, null, 14);
                            break;
                        case 2:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_add_other_asset_vehicles, null, null, 14);
                            break;
                        case 3:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_category_fine_art_and_antique, null, null, 14);
                            break;
                        case 4:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_add_other_asset_collectibles, null, null, 14);
                            break;
                        case 5:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_add_other_asset_watches, null, null, 14);
                            break;
                        case 6:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_add_other_asset_jewellery, null, null, 14);
                            break;
                        case 7:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_add_other_asset_others, null, null, 14);
                            break;
                        case 8:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_add_other_asset_others, null, null, 14);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(new SelectableDelegate.Model(str5, new RowDelegate.Model(str5, new RowDelegate.Model.MainImage.Image40(rrd.b.a(category, true), null, null, false, null, false, 60), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), z3 ? qd0.SELECTED : qd0.UNSELECTED, SelectableDelegate.b.C0424b.f53319a, vd0.RADIO, false, null, customAssetCategoryDefinition.f99224a, null, false, 32480));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new c(arrayList, aVar2.f218610b != null);
            case 1:
                kxk.o oVar = (kxk.o) obj5;
                List transactions = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                com.revolut.feature.payments.groups.impl.mappers.transactions.a aVar3 = (com.revolut.feature.payments.groups.impl.mappers.transactions.a) oVar.f190612c;
                do3.n user = ((GroupTransactionsScreenContract$InputData) oVar.f190611b).f79361a;
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                if (transactions.isEmpty()) {
                    listU = u.c(new FullScreenStateDelegate.Model("ID_EMPTY_PLACEHOLDER", new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_transactions_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_transactions_empty_state, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D006", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712));
                    yp0.b.k(listU, 0, 0, 0, 0, 31);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj6 : transactions) {
                        GroupTransactionItem groupTransactionItem = (GroupTransactionItem) obj6;
                        Intrinsics.checkNotNullParameter(groupTransactionItem, "<this>");
                        if (groupTransactionItem instanceof GroupTransactionItem.Bill) {
                            dateTimeWithTimeAtStartOfDay = ((GroupTransactionItem.Bill) groupTransactionItem).f79326a.b().withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                        } else {
                            if (!(groupTransactionItem instanceof GroupTransactionItem.Settlement)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dateTimeWithTimeAtStartOfDay = ((GroupTransactionItem.Settlement) groupTransactionItem).f79327a.c().withTimeAtStartOfDay();
                            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                        }
                        Object arrayList2 = linkedHashMap.get(dateTimeWithTimeAtStartOfDay);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(dateTimeWithTimeAtStartOfDay, arrayList2);
                        }
                        ((List) arrayList2).add(obj6);
                    }
                    ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        DateTime dateTime = (DateTime) entry.getKey();
                        List list2 = (List) entry.getValue();
                        ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("ID_SECTION_HEADER_" + dateTime, (Image) null, (Clause) new TimeClause(dateTime.getMillis(), TimeClause.Format.DateLong.f57962b, null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                        List listP0 = zhm.d0.P0(list2, new xr9.c());
                        ArrayList arrayList4 = new ArrayList(w.t(listP0, 10));
                        Iterator it8 = listP0.iterator();
                        while (it8.hasNext()) {
                            arrayList4.add(aVar3.a((GroupTransactionItem) it8.next(), user));
                        }
                        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                        arrayList3.add(new Pair(i2b.a.q(model3, arrayList4), dateTime));
                    }
                    List listP02 = zhm.d0.P0(arrayList3, new xr9.b());
                    ArrayList arrayList5 = new ArrayList(w.t(listP02, 10));
                    Iterator it9 = listP02.iterator();
                    while (it9.hasNext()) {
                        arrayList5.add((List) ((Pair) it9.next()).f186385a);
                    }
                    listU = w.u(arrayList5);
                }
                return new ns9.g(listU);
            case 2:
                nsc.o oVar2 = (nsc.o) obj5;
                List data = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                aim.e eVarB = u.b();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj7 : data) {
                    Boolean boolValueOf = Boolean.valueOf(nsc.a.a((RecipientPaymentsSettings) obj7));
                    Object arrayList6 = linkedHashMap2.get(boolValueOf);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap2.put(boolValueOf, arrayList6);
                    }
                    ((List) arrayList6).add(obj7);
                }
                List list3 = (List) linkedHashMap2.get(Boolean.TRUE);
                if (list3 != null) {
                    List list4 = list3;
                    ArrayList arrayList7 = new ArrayList(w.t(list4, 10));
                    int i22 = 0;
                    for (Object obj8 : list4) {
                        int i32 = i22 + 1;
                        if (i22 < 0) {
                            v.s();
                            throw null;
                        }
                        arrayList7.add(oVar2.a("TRUSTED_ENTITIES_CELL_LIST_ID", i22, (RecipientPaymentsSettings) obj8, false));
                        i22 = i32;
                    }
                    i = 0;
                    yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                    eVarB.addAll(arrayList7);
                } else {
                    i = 0;
                }
                List list5 = (List) linkedHashMap2.get(Boolean.FALSE);
                if (list5 != null) {
                    if (!list5.isEmpty()) {
                        eVarB.add(new ListSubheaderDelegate.Model("DELETED_TRUSTED_ENTITIES_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_trusted_entities_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                    }
                    List list6 = list5;
                    ArrayList arrayList8 = new ArrayList(w.t(list6, 10));
                    int i33 = i;
                    for (Object obj9 : list6) {
                        int i43 = i33 + 1;
                        if (i33 < 0) {
                            v.s();
                            throw null;
                        }
                        RowDelegate.Model modelA = oVar2.a("DELETED_ENTITIES_CELL_LIST_ID", i33, (RecipientPaymentsSettings) obj9, true);
                        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                        arrayList8.add(modelA);
                        i33 = i43;
                    }
                    eVarB.addAll(arrayList8);
                }
                return u.a(eVarB);
            case 3:
                nv4.i iVar = (nv4.i) obj5;
                nv4.f content = (nv4.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                int i59 = nv4.y.f219480a[iVar.f219465b.ordinal()];
                if (i59 == 1) {
                    str = "id_credit_card_statement_export_tabs_pdf";
                } else {
                    if (i59 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "id_credit_card_statement_export_tabs_excel";
                }
                EnumEntries<nv4.h> enumEntriesA = nv4.h.a();
                ArrayList arrayList9 = new ArrayList(w.t(enumEntriesA, 10));
                for (nv4.h hVar : enumEntriesA) {
                    int[] iArr = nv4.y.f219480a;
                    int i66 = iArr[hVar.ordinal()];
                    if (i66 != 1) {
                        i2 = 2;
                        if (i66 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = "id_credit_card_statement_export_tabs_excel";
                    } else {
                        i2 = 2;
                        str2 = "id_credit_card_statement_export_tabs_pdf";
                    }
                    int i74 = iArr[hVar.ordinal()];
                    if (i74 == 1) {
                        i3 = com.revolut.feature.credit.core.R$string.statement_format_pdf;
                    } else {
                        if (i74 != i2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = com.revolut.feature.statements.R$string.statement_format_csv;
                    }
                    arrayList9.add(new FixedTabs.Item(str2, new TextLocalisedClause(i3, null, null, 14), (AnalyticsContext) null, 12));
                }
                FixedTabsDelegate.Model model4 = new FixedTabsDelegate.Model("id_credit_card_statement_export_tabs", arrayList9, str, false, null, SyslogConstants.LOG_CLOCK);
                LocalDate localDate = iVar.f219464a;
                if (localDate != null) {
                    com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                    LocalDateClause$DateFormat.MonthAndYear monthAndYear = new LocalDateClause$DateFormat.MonthAndYear(ka.SHORT);
                    jVar.getClass();
                    r102 = 0;
                    timeClauseA = com.revolut.core.ui_kit.models.j.a(localDate, monthAndYear, null);
                } else {
                    r102 = 0;
                    timeClauseA = null;
                }
                InputTextDelegate.Model model5 = new InputTextDelegate.Model("id_credit_card_statement_export_calendar", timeClauseA, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_statement_month, r102, r102, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, localDate, null, null, 0, 0, 0, 0, -33558536, 65023);
                yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                List listK = v.k(model4, model5);
                boolean loading = iVar.f219466c.getLoading();
                wi0.b countryCode = content.f219460a;
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                wi0.b.Companion.getClass();
                TextLocalisedClause textLocalisedClause2 = Intrinsics.f(countryCode, wi0.b.f297756l) ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_export_footer_au, null, null, 14) : Intrinsics.f(countryCode, wi0.b.l2) ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_export_footer_nz, null, null, 14) : Intrinsics.f(countryCode, wi0.b.p0) ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_export_footer_gb, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_export_footer, null, null, 14);
                return new nv4.p(listK, content.f219461b.isEmpty() ? new nv4.n(textLocalisedClause2) : loading ? new nv4.m(textLocalisedClause2) : new nv4.k(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_export_action_view_statement, null, null, 14), textLocalisedClause2));
            case 4:
                Float fValueOf = Float.valueOf(24.0f);
                nv6.t tVar = (nv6.t) obj5;
                nv6.k cashbackDetails = (nv6.k) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(cashbackDetails, "cashbackDetails");
                qv0.i[] elements = new qv0.i[5];
                boolean z4 = cashbackDetails.f219520h;
                rr6.g boosterInfo = cashbackDetails.f219517b;
                rr6.m currentRate = cashbackDetails.f219518c;
                rr6.j cashbackInfo = cashbackDetails.f219516a;
                if (z4) {
                    jr6.g gVar = tVar.f219537a;
                    rr6.o oVar3 = (rr6.o) cashbackDetails.f.g();
                    BigDecimal value = oVar3 != null ? oVar3.getValue() : null;
                    boolean z6 = cashbackDetails.e;
                    jr6.c copyMode = new jr6.c();
                    jr6.b bVar2 = jr6.g.Companion;
                    Intrinsics.checkNotNullParameter("LIST_ID_CASHBACK_DETAILS_PROGRESS_ITEM", "listId");
                    Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
                    Intrinsics.checkNotNullParameter(boosterInfo, "boosterInfo");
                    Intrinsics.checkNotNullParameter(currentRate, "currentRate");
                    Intrinsics.checkNotNullParameter(copyMode, "copyMode");
                    str3 = "boosterInfo";
                    jr6.f fVarA = ((qv6.a) gVar).a(cashbackInfo, boosterInfo, currentRate, value, z6, copyMode);
                    PercentageClause percentageClause = fVarA.f177940a;
                    TextLocalisedClause textLocalisedClause3 = fVarA.f177941b;
                    ?? r122 = fVarA.f177942c;
                    List list7 = fVarA.d;
                    ArrayList arrayList10 = new ArrayList(w.t(list7, 10));
                    Iterator it10 = list7.iterator();
                    while (it10.hasNext()) {
                        arrayList10.add(new f8(((jr6.e) it10.next()).f177939a));
                    }
                    d8 d8Var2 = new d8(arrayList10);
                    int i92 = R$attr.uikit_colorProgressNeutral;
                    LinearProgressWithAmountDelegate.Model.b.C0410b c0410b = new LinearProgressWithAmountDelegate.Model.b.C0410b(i92);
                    if (z6) {
                        d8Var = d8Var2;
                        aVar = new LinearProgressWithAmountDelegate.Model.b.C0410b(i92);
                        z = z4;
                    } else {
                        d8Var = d8Var2;
                        z = z4;
                        aVar = new LinearProgressWithAmountDelegate.Model.b.a(v.k(Integer.valueOf(R$attr.uikit_colorPink), Integer.valueOf(R$attr.uikit_colorBlue)));
                    }
                    model = new LinearProgressWithAmountDelegate.Model("LIST_ID_CASHBACK_DETAILS_PROGRESS_ITEM", percentageClause, textLocalisedClause3, r122, d8Var, new LinearProgressWithAmountDelegate.Model.e(c0410b, aVar), new a8(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cashback, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 16.0f, fValueOf, null, 32)), ViewUtils.EDGE_TO_EDGE_FLAGS);
                } else {
                    z = z4;
                    str3 = "boosterInfo";
                    jr6.b bVar3 = jr6.g.Companion;
                    Intrinsics.checkNotNullParameter("LIST_ID_CASHBACK_DETAILS_PROGRESS_ITEM", "listId");
                    Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
                    Intrinsics.checkNotNullParameter(currentRate, "currentRate");
                    model = new HeaderDelegate.Model("LIST_ID_CASHBACK_DETAILS_PROGRESS_ITEM", new ql(6, null, LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cashback, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 16.0f, fValueOf, null, 32)), new r2(new PercentageClause(currentRate.f256723c, (PercentageClause.Format) null, (Style) null, 6), null), null, pv6.a.a(cashbackInfo.f256715b), null, null, HeaderDelegate.a.c.f52422a, null, null, null, 127960);
                }
                elements[0] = model;
                elements[1] = new PlainTextDelegate.Model("LIST_ID_CASHBACK_DETAILS_SOURCES_HEADER_ITEM", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_main_sources_header_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
                rr6.n planInfo = cashbackDetails.d;
                rr6.c boosterState = boosterInfo.d;
                Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
                Intrinsics.checkNotNullParameter(planInfo, "planInfo");
                Intrinsics.checkNotNullParameter(currentRate, "currentRate");
                Intrinsics.checkNotNullParameter(boosterState, "boosterState");
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_main_sources_plan_title, null, null, 14);
                CompositeClause compositeClause2 = new CompositeClause(v.k(wv6.a.a(planInfo.f256725b), new PercentageClause(currentRate.f256721a, (PercentageClause.Format) null, (Style) null, 6)), new DotDividerClause((Integer) null), null, null, 12);
                rr6.c.Companion.getClass();
                RowDelegate.Model.c.b bVar4 = rr6.c.unlockedBoosterStates.contains(boosterState) ? new RowDelegate.Model.c.b(new MoneyClause(cashbackInfo.f256715b.f256729a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126) : null;
                int i96 = R$drawable.uikit_icn_24_premium;
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                elements[2] = new RowDelegate.Model("LIST_ID_CASHBACK_DETAILS_PLAN_ITEM", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, i96, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorAccent, 10.0f, fValueOf, null, 32), null, null, false, null, false, 62), textLocalisedClause4, null, 0, compositeClause2, null, null, 0, bVar4, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
                if (z) {
                    Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
                    Intrinsics.checkNotNullParameter(boosterInfo, str3);
                    Intrinsics.checkNotNullParameter(currentRate, "currentRate");
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_details_main_sources_booster_title, null, null, 14);
                    if (rr6.c.lockedBoosterStates.contains(boosterState)) {
                        compositeClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_booster_tier_title_locked, null, null, 14);
                    } else {
                        Intrinsics.checkNotNullParameter(boosterInfo, str3);
                        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
                        int i99 = com.revolut.feature.freelancer.impl.R$string.freelancer_cashback_booster_tier_title_number;
                        rr6.d dVar = boosterInfo.f256706a.f256704a;
                        String strValueOf = dVar != null ? String.valueOf(dVar.f256699a.f256711a) : null;
                        if (strValueOf == null) {
                            strValueOf = "";
                        }
                        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(i99, u.c(strValueOf), null, 12);
                        BigDecimal bigDecimal = currentRate.f256722b;
                        Object[] elements2 = {textLocalisedClause6, bigDecimal != null ? new PercentageClause(bigDecimal, (PercentageClause.Format) null, (Style) null, 6) : null};
                        Intrinsics.checkNotNullParameter(elements2, "elements");
                        compositeClause = new CompositeClause(kotlin.collections.d.L(elements2), new DotDividerClause((Integer) null), null, null, 12);
                    }
                    model2 = new RowDelegate.Model("LIST_ID_CASHBACK_DETAILS_BOOSTER_ITEM", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_price_tag, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorAccent, 10.0f, fValueOf, null, 32), null, null, false, null, false, 62), textLocalisedClause5, null, 0, compositeClause, null, null, 0, rr6.c.unlockedBoosterStates.contains(boosterState) ? new RowDelegate.Model.c.b(new MoneyClause(cashbackInfo.f256715b.f256730b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
                } else {
                    model2 = null;
                }
                elements[3] = model2;
                elements[4] = (z && boosterState == rr6.c.FIRST_TIME_USER) ? new PlainTextDelegate.Model("LIST_ID_CASHBACK_DETAILS_LEARN_MORE_ITEM", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_settlement_unlock_breakdown_info_action, null, new Click(10, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "LIST_ID_CASHBACK_DETAILS_LEARN_MORE_ITEM", false), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, R$attr.uikit_dp72, 0, 45038) : null;
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                return zhm.d0.E0(tVar.f219538b.b(cashbackDetails.f219519g, 2), listL);
            case 5:
                boolean z11 = false;
                nv7.m mVar = (nv7.m) obj5;
                com.revolut.feature.insurance_embedded.impl.data.model.g cfacCoverageSelectionLayout = (com.revolut.feature.insurance_embedded.impl.data.model.g) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(cfacCoverageSelectionLayout, "cfacCoverageSelectionLayout");
                aim.e eVarB2 = u.b();
                xv7.e eVar = mVar.f219558b;
                List coverages = cfacCoverageSelectionLayout.e;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(coverages, "coverages");
                List<com.revolut.feature.insurance_embedded.impl.data.model.f> list8 = coverages;
                ArrayList arrayList11 = new ArrayList(w.t(list8, 10));
                for (com.revolut.feature.insurance_embedded.impl.data.model.f fVar : list8) {
                    String strQ = j6.a.q("COVERAGE_ITEM_ID_", fVar.f75986b);
                    String str6 = fVar.f75985a;
                    RowDelegate.Model.MainImage.Image24 image24A = str6 != null ? xu7.d.a(eVar.f309217a, str6, Integer.valueOf(R$attr.uikit_colorForeground)) : null;
                    TextClause textClause = new TextClause(fVar.f75986b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str7 = fVar.f75987c;
                    arrayList11.add(new RowDelegate.Model(strQ, image24A, textClause, null, 0, str7 != null ? sr7.c.a(str7, null) : null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z11), true, null, false, null, null, null, null, null, null, fVar.d, null, 0, 0, 0, 0, 532673496));
                    z11 = false;
                }
                yp0.b.k(arrayList11, 0, 0, 0, 0, 31);
                eVarB2.addAll(arrayList11);
                LegalNotice legalNotice = cfacCoverageSelectionLayout.d;
                if (legalNotice != null) {
                    eVarB2.add(xv7.m.a(legalNotice));
                }
                aim.e eVarA = u.a(eVarB2);
                TextClause textClause2 = new TextClause(cfacCoverageSelectionLayout.f75989a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str8 = cfacCoverageSelectionLayout.f75990b;
                TextClause textClause3 = str8 != null ? new TextClause(str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                q3 q3Var = cfacCoverageSelectionLayout.f75991c;
                if (q3Var == null || (str4 = q3Var.f146813a) == null || (listC = u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MENU_ITEM_BUTTON_ID", new ResourceImage(mVar.f219557a.a(str4), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124))) == null) {
                    listC = f0.f322471a;
                }
                return new nv7.j(eVarA, new nv7.h(textClause2, textClause3, listC));
            case 6:
                return a(obj2, obj3, obj4);
            case 7:
                return b(obj2, obj3, obj4);
            case 8:
                return c(obj2, obj3, obj4);
            case 9:
                return d(obj2, obj3, obj4);
            case 10:
                return e(obj2, obj3, obj4);
            case 11:
                return g(obj2, obj3, obj4);
            case 12:
                return h(obj2, obj3, obj4);
            case 13:
                return i(obj2, obj3, obj4);
            case 14:
                n8i.v topupData = (n8i.v) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(topupData, "topupData");
                return ((hu4.c) ((o8i.f) obj5).f223036a).a(topupData.f213475b, topupData.f213474a, topupData.e, topupData.f213476c);
            case 15:
                return j(obj2, obj3, obj4);
            case 16:
                return k(obj2, obj3, obj4);
            case 17:
                return l(obj2, obj3, obj4);
            case 18:
                return m(obj2, obj3, obj4);
            case 19:
                return n(obj2, obj3, obj4);
            case 20:
                return o(obj2, obj3, obj4);
            case 21:
                return p(obj2, obj3, obj4);
            case 22:
                return q(obj2, obj3, obj4);
            case 23:
                return r(obj2, obj3, obj4);
            case 24:
                return s(obj2, obj3, obj4);
            case 25:
                return t(obj2, obj3, obj4);
            case 26:
                return u(obj2, obj3, obj4);
            case 27:
                return v(obj2, obj3, obj4);
            case 28:
                return w(obj2, obj3, obj4);
            default:
                p3b.e eVar2 = (p3b.e) obj5;
                p3b.d exposureBreakdown = (p3b.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(exposureBreakdown, "exposureBreakdown");
                TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_margin_cfd_order_confirmation_exposure, null, null, 14);
                bfl.g gVar2 = eVar2.f232710b;
                e2b.a aVar4 = eVar2.f232711c;
                CfdExposureBreakdownTarget cfdExposureBreakdownTarget = eVar2.d;
                boolean z12 = cfdExposureBreakdownTarget instanceof CfdExposureBreakdownTarget.Order;
                CfdExposureBreakdownTarget.PositionsGroup positionsGroup = CfdExposureBreakdownTarget.PositionsGroup.f82102a;
                if (z12) {
                    int i100 = p3b.g.f232716b[aVar4.ordinal()];
                    if (i100 == 1) {
                        int i101 = p3b.g.f232715a[gVar2.ordinal()];
                        if (i101 == 1) {
                            i5 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_exposure_description_ask;
                        } else {
                            if (i101 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i5 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_exposure_description_bid;
                        }
                    } else if (i100 == 2) {
                        i5 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_exposure_description_limit_price;
                    } else {
                        if (i100 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i5 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_exposure_description_stop_price;
                    }
                } else {
                    if (!(cfdExposureBreakdownTarget instanceof CfdExposureBreakdownTarget.Position) && !Intrinsics.f(cfdExposureBreakdownTarget, positionsGroup)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_exposure_description_mid;
                }
                lw0.a aVar5 = new lw0.a(textLocalisedClause7, new TextLocalisedClause(i5, null, null, 14), null, null, false, 28);
                bfl.g gVar3 = eVar2.f232710b;
                dj0.d dVar2 = exposureBreakdown.f232706a;
                if (z12) {
                    int i102 = p3b.g.f232716b[aVar4.ordinal()];
                    if (i102 == 1) {
                        int i103 = p3b.g.f232715a[gVar3.ordinal()];
                        if (i103 == 1) {
                            i6 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_ask_price;
                        } else {
                            if (i103 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i6 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_bid_price;
                        }
                    } else if (i102 == 2) {
                        i6 = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_limit_price;
                    } else {
                        if (i102 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i6 = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_stop_price;
                    }
                } else {
                    if (!(cfdExposureBreakdownTarget instanceof CfdExposureBreakdownTarget.Position) && !Intrinsics.f(cfdExposureBreakdownTarget, positionsGroup)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_mid_price;
                }
                CellDetailsDelegate.Model model6 = new CellDetailsDelegate.Model("cfd-exposure-breakdown-price", new TextLocalisedClause(i6, null, null, 14), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
                CellDetailsDelegate.Model model7 = new CellDetailsDelegate.Model("cfd-exposure-breakdown-units", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_list_units, null, null, 14), (Image) null, 0, false, 30), new NumberClause(exposureBreakdown.f232707b, new NumberClause.Format.AllDigitsAfterDot(null, null, 3), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
                CellDetailsDelegate.Model model8 = new CellDetailsDelegate.Model("cfd-exposure-breakdown-exposure-value", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_margin_cfd_order_confirmation_exposure, null, null, 14), new MoneyClause(exposureBreakdown.f232708c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
                List listK2 = v.k(model6, model7);
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                yp0.b.l(model8, 0, 0, 0, 0, null, false, 63);
                return new cii.b(null, zhm.d0.F0(model8, listK2), aVar5);
        }
    }

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f218620a = i;
        this.f218621b = obj3;
    }

    public /* synthetic */ i(o22.a aVar, o22.p pVar) {
        this.f218620a = 10;
        this.f218621b = aVar;
    }
}
