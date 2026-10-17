package y5g;

import android.os.Parcelable;
import aw0.o9;
import bu7.b0;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.cashback.api.models.CashbackSource;
import com.revolut.feature.insurance_embedded.impl.R$string;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentMethod;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentOption;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentOptions;
import com.revolut.feature.revolutpay.shared.R$plurals;
import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.ck0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.f2;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import ms0.h4;
import ms0.j4;
import nkm.y;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import q6c.o;
import vf0.x;
import yp0.e0;
import zhm.a0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zjh.r;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311087a;

    public /* synthetic */ l(int i) {
        this.f311087a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) throws Throwable {
        RowDelegate.Model model;
        b0 insuranceDetails = (b0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        aim.e eVarB = u.b();
        bu7.c cVar = insuranceDetails.f18701n;
        bu7.u uVar = insuranceDetails.f18700m;
        Throwable th10 = null;
        int i = 1;
        if (cVar != null) {
            ComplexImage.Regular regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D129", null, null, null, 30));
            TextClause textClause = new TextClause(cVar.f18702a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(cVar.f18703b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = cVar.f18704c;
            BannerDelegate.Model model2 = new BannerDelegate.Model("ID_BANNER", regular, textClause, textClause2, !(str == null || d0.W(str)), false, cVar.f18704c, null, null, null, null, 65408);
            yp0.b.l(model2, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
            eVarB.add(model2);
        }
        String str2 = insuranceDetails.d;
        int i2 = 4;
        if (str2 != null) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.embedded_insurance_travel_details_title_summary_policy_number, null, null, 14);
            Intrinsics.checkNotNullParameter(str2, "<this>");
            knd.a transform = new knd.a(25);
            Intrinsics.checkNotNullParameter(str2, "<this>");
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(str2, "<this>");
            Intrinsics.checkNotNullParameter(transform, "transform");
            kli.a.g(4, 4);
            eVarB.addAll(yp0.b.i(new CounterTextDelegate.Model("ID_POLICY_NUMBER", textLocalisedClause, new t4(new TextClause(y.u(y.x(zhm.d0.Q(kotlin.ranges.f.n(4, d0.O(str2))), new k79.b(str2, transform, 29)), " ", null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, false, null, null, 0, 0, 0, 0, 2040), new ListSubheaderDelegate.Model("ID_INSURER_NAME", (Image) null, (Clause) new TextClause(insuranceDetails.i.f18747a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG));
        }
        List list = insuranceDetails.f18698j;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj5 : list) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                Throwable th11 = th10;
                v.s();
                throw th11;
            }
            bu7.j jVar = (bu7.j) obj5;
            aim.e eVarB2 = u.b();
            List<bu7.g> list2 = jVar.f18720c;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (bu7.g gVar : list2) {
                Throwable th12 = th10;
                int i6 = yv7.m.f317137a[gVar.f18713a.ordinal()];
                if (i6 == i) {
                    model = new RowDelegate.Model(a0.d.n("ID_CONTACT_PHONE_", i3), xu7.c.a(R$drawable.uikit_icn_24_call), new TextClause(gVar.f18715c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, gVar, null, 0, 0, 0, 0, 532676600);
                } else if (i6 == 2) {
                    model = new RowDelegate.Model(a0.d.n("ID_CONTACT_EMAIL_", i3), xu7.c.a(R$drawable.uikit_icn_24_envelope), new TextClause(gVar.f18715c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, gVar, null, 0, 0, 0, 0, 532676600);
                } else if (i6 == 3) {
                    model = new RowDelegate.Model(a0.d.n("ID_CONTACT_WEB_PAGE_", i3), xu7.c.a(R$drawable.uikit_icn_24_link_external), new TextClause(gVar.f18715c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, gVar, null, 0, 0, 0, 0, 532676600);
                } else {
                    if (i6 != i2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    model = new RowDelegate.Model(a0.d.n("ID_CONTACT_HIDDEN_PHONE_", i3), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_exclamation_triangle, R$attr.uikit_colorRed, R$attr.uikit_colorRed_10), null, null, false, null, false, 62), new TextClause(gVar.f18715c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, gVar, null, 0, 0, 0, 0, 532675576);
                }
                arrayList2.add(model);
                th10 = th12;
                i = 1;
                i2 = 4;
            }
            Throwable th13 = th10;
            a0.x(arrayList2, eVarB2);
            String str3 = jVar.f18719b;
            if (str3 != null) {
                eVarB2.add(new TextDelegate.Model(a0.d.n("ID_CONTACT_DETAILS_", i3), new TextClause(str3, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036));
            }
            a0.x(yp0.b.g(u.a(eVarB2), new ListSubheaderDelegate.Model(a0.d.n("ID_CONTACT_SUBHEADER_", i3), (Image) null, (Clause) new TextClause(jVar.f18718a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG), arrayList);
            th10 = th13;
            i3 = i5;
            i = 1;
            i2 = 4;
        }
        eVarB.addAll(arrayList);
        aim.e eVarA = u.a(eVarB);
        String str4 = uVar.f18738a;
        return new yv7.h(eVarA, !(str4 == null || str4.length() == 0) || uVar.f18739b);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        List list = (List) obj2;
        ((Boolean) obj3).getClass();
        ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("content", list);
        ArrayList otherAmenitiesNames = new ArrayList();
        List<svi.d> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (svi.d dVar : list2) {
            arrayList.add(new Pair(dVar.f265891a, wxi.a.a(dVar.f265892b)));
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            i = 6;
            z = false;
            if (!it8.hasNext()) {
                break;
            }
            Pair pair = (Pair) it8.next();
            String amenityName = (String) pair.f186385a;
            Integer num = (Integer) pair.f186386b;
            if (num != null) {
                Intrinsics.checkNotNullParameter(amenityName, "amenityName");
                arrayListY.add(new RowDelegate.Model("amenityRowItem" + amenityName + "Id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(num.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextClause(amenityName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
            } else {
                otherAmenitiesNames.add(amenityName);
            }
        }
        if (!otherAmenitiesNames.isEmpty()) {
            Intrinsics.checkNotNullParameter(otherAmenitiesNames, "otherAmenitiesNames");
            arrayListY.add(new RowDelegate.Model("otherAmenitiesRowItemId", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_more_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_lounge_details_amenities_more, null, null, 14), null, 0, new TextClause(zhm.d0.k0(otherAmenitiesNames, m70.a.o(t0.f186434a), null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, Integer.MAX_VALUE, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568));
        }
        yp0.b.k(arrayListY, 0, R$attr.uikit_dp24, 0, 0, 29);
        return new ywi.f(arrayListY);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        w2 noteDetails = (w2) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(noteDetails, "noteDetails");
        aim.e eVarB = u.b();
        int i = 0;
        for (Object obj5 : noteDetails.f173594p) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            f2 f2Var = (f2) obj5;
            TextClause textClauseA = z4e.k.a(f2Var.f173443a);
            TextClause textClauseA2 = z4e.k.a(f2Var.f173444b);
            if (textClauseA != null && textClauseA2 != null) {
                eVarB.add(new RowDelegate.Model(a0.d.n("performance_tracker_", i), null, textClauseA, null, 0, textClauseA2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874));
            }
            i = i2;
        }
        if (!eVarB.isEmpty()) {
            h4 h4Var = h4.SEMIACCENT;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_performance_tracker_see_details, null, null, 14);
            int i3 = R$attr.uikit_dp16;
            eVarB.add(new SmallActionButtonDelegate.Model("SEE_DETAILS_BUTTON_LIST_ID", h4Var, null, null, textLocalisedClause, null, j4.f208300a, null, null, 0, i3, i3, i3, 3928));
        }
        aim.e eVarA = u.a(eVarB);
        e0 e0Var = e0.OUTSIDE_BOX;
        int i5 = R$attr.uikit_dp8;
        int i6 = R$attr.uikit_dp16;
        return !eVarA.isEmpty() ? yp0.b.d(eVarA, new ListSubheaderDelegate.Model("performance_tracker_header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_performance_tracker_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i5, i5, i6, i6) : eVarA;
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        ra3.b content = (ra3.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        eVarB.addAll(z8d.i.b(content.f252779a, new ListSubheaderDelegate.Model("TO_BE_DELIVERED_SUBTITLE_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_all_cards_group_to_be_delivered_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)));
        eVarB.addAll(z8d.i.b(content.f252780b, new ListSubheaderDelegate.Model("SINGLE_USE_VIRTUAL_SUBTITLE_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_all_cards_group_single_use_virtual_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)));
        eVarB.addAll(z8d.i.b(content.f252781c, new ListSubheaderDelegate.Model("MULTI_USE_VIRTUAL_SUBTITLE_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_all_cards_group_multi_use_virtual_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)));
        eVarB.addAll(z8d.i.b(content.d, new ListSubheaderDelegate.Model("PHYSICAL_SUBTITLE_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_all_cards_group_physical_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)));
        return yp0.b.g(u.a(eVarB), new ListSubheaderDelegate.Model("ALL_CARDS_SUBTITLE_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_all_cards_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) throws Throwable {
        TextLocalisedClause textLocalisedClause;
        List tradingProfileWithAgeEligibility = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(tradingProfileWithAgeEligibility, "tradingProfileWithAgeEligibility");
        aim.e eVarB = u.b();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = tradingProfileWithAgeEligibility.iterator();
        while (true) {
            RowDelegate.Model model = null;
            if (!it8.hasNext()) {
                eVarB.addAll(arrayList);
                eVarB.add(new RowDelegate.Model("ADD_NEW_BANKING_CHILD_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_add_contact, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_selector_item_create_new_account, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                aim.e eVarA = u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            }
            za8.h hVar = (za8.h) it8.next();
            com.revolut.feature.junior_profile.api.models.c cVar = hVar.f320578a;
            u98.a aVar = hVar.f320579b;
            com.revolut.feature.junior_profile.api.models.f fVar = (com.revolut.feature.junior_profile.api.models.f) zhm.d0.d0(uc0.b.o(cVar.f77119j));
            String strA = fVar != null ? fVar.a() : null;
            if (strA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Junior profile with TRADING service not found in JuniorTradingAccountPickerStateMapper");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                int i = za8.m.f320585a[aVar.ordinal()];
                if (i == 1) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_selector_validation_too_old, null, null, 14);
                } else if (i == 2) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_selector_validation_too_young, null, null, 14);
                } else if (i != 3) {
                    if (i == 4) {
                        hx7.e.n(new IllegalStateException("Invalid FUTURE_DATE AgeEligibility to a kid with RegId: ".concat(strA)));
                    } else if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = null;
                } else {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_selector_validation_age_difference, null, null, 14);
                }
                boolean z = textLocalisedClause == null && aVar != u98.a.FUTURE_DATE;
                model = new RowDelegate.Model(strA, new RowDelegate.Model.MainImage.Image40(new ContactImage(strA, (String) null, (String) null, (String) null, (String) null, tz4.d.m(cVar), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_selector_item_placeholder, u.c(new TextClause(cVar.f77115b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, textLocalisedClause, null, null, 0, null, z, null, false, z ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, strA, null, 0, 0, 0, 0, 532658136);
            }
            if (model != null) {
                arrayList.add(model);
            }
        }
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        x xVar = (x) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(xVar, "<destruct>");
        CashbackBySources cashbackBySources = (CashbackBySources) xVar.f288487a;
        ed3.c cVar = (ed3.c) xVar.f288488b;
        ed3.c cVar2 = (ed3.c) xVar.f288489c;
        od0.i iVar = (od0.i) xVar.d;
        String str = (String) xVar.e;
        hha.d dVar = (hha.d) xVar.f;
        uc3.f fVar = (uc3.f) xVar.f288490g;
        ArrayList<CashbackSource> arrayListH = s.h(cashbackBySources, cVar, cVar2);
        ArrayList arrayList = new ArrayList();
        for (CashbackSource cashbackSource : arrayListH) {
            RowDelegate.Model modelB = cd3.b.b(cashbackSource.f65689b, cashbackSource.f65688a, iVar, str, dVar, fVar);
            if (modelB != null) {
                arrayList.add(modelB);
            }
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r42v2 */
    private final Object h(Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        q6c.h orderDetails = (q6c.h) pair.f186385a;
        o oVar = (o) pair.f186386b;
        RowDelegate.Model model = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_details_title, null, null, 14);
        aim.e eVarB = u.b();
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        TextClause textClause = new TextClause(orderDetails.f242544m.f242536c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ArrayList<q6c.d> arrayList = orderDetails.e;
        int size = arrayList.size();
        Integer numValueOf = Integer.valueOf(size);
        if (size <= 0) {
            numValueOf = null;
        }
        TextLocalisedQuantityClause textLocalisedQuantityClause = numValueOf != null ? new TextLocalisedQuantityClause(R$plurals.revolut_pay_order_summary_details_items_count, Integer.valueOf(numValueOf.intValue()), (List) null, (Style) null, 28) : null;
        String str = orderDetails.f242544m.f242534a;
        RowDelegate.Model model2 = new RowDelegate.Model("MERCHANT_ROW_ID", new RowDelegate.Model.MainImage.Image40(str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902) : LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_merchant, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), null, null, false, null, false, 62), textClause, null, 0, textLocalisedQuantityClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        aim.e eVarB2 = u.b();
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        ArrayList arrayList2 = new ArrayList();
        for (q6c.d lineItem : arrayList) {
            xi0.b currency = orderDetails.f242543l;
            Intrinsics.checkNotNullParameter(lineItem, "lineItem");
            Intrinsics.checkNotNullParameter(currency, "currency");
            q6c.c cVar = lineItem.d;
            int i = cVar == null ? -1 : zdc.b.f321442a[cVar.ordinal()];
            if (i == 1 || i == 2) {
                String str2 = lineItem.f242532l;
                String str3 = lineItem.f242526a;
                String str4 = str2 == null ? str3 : str2;
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(zdc.a.a((String) zhm.d0.d0(lineItem.f242531j), str3), null, null, false, zdc.a.b(lineItem.f242528c), false, 44);
                TextClause textClause2 = new TextClause(lineItem.f242526a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str5 = lineItem.k;
                model = new RowDelegate.Model(str4, image40, textClause2, null, 0, str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : model, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(lineItem.f242527b, currency), new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
            }
            if (model != null) {
                arrayList2.add(model);
            }
            model = null;
        }
        eVarB2.addAll(arrayList2);
        dj0.d orderDiscount = oVar.f242556c;
        dj0.d subtotal = oVar.d;
        dj0.d total = oVar.f242558h;
        dj0.d dVar = oVar.f242557g;
        dj0.d tip = oVar.f;
        dj0.d total2 = oVar.e;
        if (orderDiscount != null) {
            Intrinsics.checkNotNullParameter(orderDiscount, "orderDiscount");
            eVarB2.add(new CellDetailsDelegate.Model("ID_ORDER_DISCOUNT_CELL", new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_details_amounts_discount, null, null, 14), new MoneyClause(orderDiscount.l(), new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        if (!subtotal.equals(total2)) {
            Intrinsics.checkNotNullParameter(subtotal, "subtotal");
            eVarB2.add(new CellDetailsDelegate.Model("ID_SUBTOTAL_AMOUNT_CELL", new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_details_amounts_subtotal, null, null, 14), new MoneyClause(subtotal, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        dj0.d tax = oVar.f242555b;
        if (tax != null) {
            Intrinsics.checkNotNullParameter(tax, "tax");
            eVarB2.add(new CellDetailsDelegate.Model("ID_TAX_CELL", new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_details_amounts_tax, null, null, 14), new MoneyClause(tax, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        dj0.d serviceCharge = oVar.f242554a;
        if (serviceCharge != null) {
            Intrinsics.checkNotNullParameter(serviceCharge, "serviceCharge");
            eVarB2.add(new CellDetailsDelegate.Model("ID_SERVICE_CHARGE_CELL", new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_details_amounts_service_charge, null, null, 14), new MoneyClause(serviceCharge, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        Intrinsics.checkNotNullParameter(total2, "total");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_details_amounts_order_total, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 7);
        o9 o9Var = o9.NON_SENSITIVE;
        eVarB2.add(new CellDetailsDelegate.Model("ID_ORDER_TOTAL_CELL", textLocalisedClause2, new MoneyClause(total2, defaults, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9Var), 0, null, null, null, null, null, false, 0, 0, 32760));
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        if (tip != null || dVar != null) {
            aim.e eVarB3 = u.b();
            if (tip != null) {
                Intrinsics.checkNotNullParameter(tip, "tip");
                eVarB3.add(new CellDetailsDelegate.Model("ID_TIP_CELL", new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_details_amounts_tip, null, null, 14), new MoneyClause(tip, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9Var, 4), 0, null, null, null, null, null, false, 0, 0, 32760));
            }
            if (dVar != null) {
                if (total.equals(dVar)) {
                    eVarB3.add(zdc.d.a(dVar, true));
                } else {
                    eVarB3.add(zdc.d.a(dVar, false));
                    Intrinsics.checkNotNullParameter(total, "total");
                    eVarB3.add(new CellDetailsDelegate.Model("ID_TOTAL_CHARGE_CELL", new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_details_amounts_total_charge, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new MoneyClause(total, new MoneyClause.Format.Defaults(null, null, false, false, 7), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9Var), 0, null, null, j2.H3, null, null, false, 0, 0, 32696));
                }
            }
            aim.e eVarA2 = u.a(eVarB3);
            yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
            eVarB.addAll(eVarA2);
        }
        return new zdc.h(textLocalisedClause, u.a(eVarB));
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        int i;
        TextLocalisedClause textLocalisedClause;
        int i2;
        PayLaterPaymentOptions content = (PayLaterPaymentOptions) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList<PayLaterPaymentOption> arrayList = content.f78819a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (PayLaterPaymentOption payLaterPaymentOption : arrayList) {
            PayLaterPaymentMethod payLaterPaymentMethod = payLaterPaymentOption.f78816a;
            String strQ = j6.a.q("payment_option_card_", payLaterPaymentMethod.name());
            int[] iArr = zj9.i.f322773a;
            int i3 = iArr[payLaterPaymentMethod.ordinal()];
            if (i3 == 1) {
                i = com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_payment_method_debit_card;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_payment_method_single_use_card;
            }
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
            int i5 = zj9.i.f322774b[payLaterPaymentOption.f78817b.ordinal()];
            if (i5 == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_30_days, null, null, 14);
            } else if (i5 == 2) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_months, u.c(3), null, 12);
            } else if (i5 == 3) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_months, u.c(6), null, 12);
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_months, u.c(12), null, 12);
            }
            int i6 = iArr[payLaterPaymentMethod.ordinal()];
            if (i6 == 1) {
                i2 = R$drawable.uikit_icn_24_card;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$drawable.uikit_icn_24_smartphone;
            }
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.j(i2, new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(R$attr.uikit_colorGreyTone5)), null, null, false, null, false, 62);
            yy0.i iVar = yy0.l.Companion;
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            iVar.getClass();
            RowDelegate.Model model = new RowDelegate.Model(strQ, image40, textLocalisedClause2, null, 0, textLocalisedClause, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, payLaterPaymentOption, null, 0, 0, 0, 0, 532675544);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
        }
        return arrayList2;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        List listC;
        CombinedBuyingPowerConverted combinedBuyingPowerConverted;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        dkh.c cVar = (dkh.c) pair.f186385a;
        TradingAccount tradingAccount = (TradingAccount) pair.f186386b;
        List listA = cVar.a();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        Iterator it8 = listA.iterator();
        while (true) {
            listC = null;
            if (!it8.hasNext()) {
                break;
            }
            kel.c cVar2 = (kel.c) it8.next();
            dj0.d dVar = cVar2.f183154b;
            kel.b bVar = cVar2.f183153a;
            dj0.d dVar2 = bVar.f183149b;
            kel.a aVar = bVar.f183148a;
            String str = aVar.e;
            String strQ = j6.a.q("STOCKS_CASH_HOLDING_ITEM_ID_", aVar.f183145a);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 60);
            xi0.b.Companion.getClass();
            arrayList.add(new RowDelegate.Model(strQ, image40, new CurrencyClause(xi0.a.a(str), null, null, 6), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), (dVar == null || dVar.equals(dVar2)) ? null : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, false, 124), false, null, false, null, null, null, null, null, null, new zjh.l(bVar, tradingAccount), null, 0, 0, 0, 0, 532675576));
        }
        dkh.b bVar2 = cVar instanceof dkh.b ? (dkh.b) cVar : null;
        if (bVar2 != null && (combinedBuyingPowerConverted = bVar2.f115520a) != null) {
            CombinedBuyingPowerConverted.MarginBorrowingLimit marginBorrowingLimit = combinedBuyingPowerConverted.f95658a;
            RowDelegate.Model model = marginBorrowingLimit == null ? null : new RowDelegate.Model("GIA_MARGIN_BORROWINGLIMIT_ITEM_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_credit_bag, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, Float.valueOf(24.0f), null, 32), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_cash_balance_margin_borrowingLimitItem_title, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(marginBorrowingLimit.getF95665a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, new zjh.m(marginBorrowingLimit), null, 0, 0, 0, 0, 532675576);
            if (model != null) {
                listC = u.c(model);
            }
        }
        if (listC == null) {
            listC = f0.f322471a;
        }
        ArrayList arrayListE0 = zhm.d0.E0(listC, arrayList);
        yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
        return arrayListE0;
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        dj0.d dVarM;
        CompositeClause compositeClause;
        Clause textLocalisedClause;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        dkh.c cVar = (dkh.c) pair.f186385a;
        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair.f186386b;
        if (cVar instanceof dkh.a) {
            List list = ((dkh.a) cVar).f115519a;
            dj0.d.Companion.getClass();
            dVarM = dj0.d.e;
            int i = 0;
            for (Object obj5 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                dVarM = i == 0 ? pyd.c.M(((kel.c) obj5).f183154b) : pyd.c.O(dVarM, pyd.c.M(((kel.c) obj5).f183154b));
                i = i2;
            }
        } else {
            if (!(cVar instanceof dkh.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dVarM = ((dkh.b) cVar).f115520a.e;
        }
        MoneyClause moneyClause = new MoneyClause(dVarM, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        Float fValueOf = Float.valueOf(16.0f);
        List listA = cVar.a();
        dj0.d.Companion.getClass();
        dj0.d dVarM2 = dj0.d.e;
        int i3 = 0;
        for (Object obj6 : listA) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            dVarM2 = i3 == 0 ? pyd.c.M(((kel.c) obj6).f) : pyd.c.O(dVarM2, pyd.c.M(((kel.c) obj6).f));
            i3 = i5;
        }
        if (dVarM2.f115082a <= 0) {
            compositeClause = null;
        } else if (cVar instanceof dkh.a) {
            int i6 = com.revolut.retail.wealth.resources.R$string.trading_cash_balance_pockets_title_available_to_invest_text;
            List list2 = ((dkh.a) cVar).f115519a;
            dj0.d.Companion.getClass();
            dj0.d dVarM3 = dj0.d.e;
            int i21 = 0;
            for (Object obj7 : list2) {
                int i22 = i21 + 1;
                if (i21 < 0) {
                    v.s();
                    throw null;
                }
                dVarM3 = i21 == 0 ? pyd.c.M(((kel.c) obj7).f183155c) : pyd.c.O(dVarM3, pyd.c.M(((kel.c) obj7).f183155c));
                i21 = i22;
            }
            List listK = v.k(new TextLocalisedClause(i6, u.c(new MoneyClause(dVarM3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16));
            Intrinsics.checkNotNullParameter(t0.f186434a, "<this>");
            compositeClause = new CompositeClause(listK, new TextClause("\u2002", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(28, (Integer) null, (Object) new zjh.k(list2), "CASH_BALANCE_NAV_BAR_AVAILABLE_TO_INVEST", false), null, 8);
        } else {
            if (!(cVar instanceof dkh.b)) {
                throw new NoWhenBranchMatchedException();
            }
            compositeClause = null;
        }
        if (cVar instanceof dkh.a) {
            textLocalisedClause = zjh.b0.a(tradingLegalEntityInformation);
        } else {
            if (!(cVar instanceof dkh.b)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = ((dkh.b) cVar).f115520a.f95658a != null ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_cash_balance_buying_power_title, null, null, 14) : zjh.b0.a(tradingLegalEntityInformation);
        }
        if (compositeClause != null) {
            textLocalisedClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new DotDividerClause((Integer) null), compositeClause));
        }
        return new r(moneyClause, textLocalisedClause, LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cash, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 16.0f, Float.valueOf(24.0f), null, 32));
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        zkk.i billingPicker = (zkk.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(billingPicker, "billingPicker");
        String str = billingPicker.f323068c;
        if (str != null) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0a81  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 3438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5g.l.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ l(Object obj2, int i) {
        this.f311087a = i;
    }
}
