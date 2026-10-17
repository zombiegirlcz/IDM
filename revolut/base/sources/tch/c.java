package tch;

import android.net.Uri;
import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import aw0.v8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.gallery_picker.PersonalisationGalleryTileModel;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.x4;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UriVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocuments;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState;
import com.revolut.feature.payments.transfers.personalisation.api.navigation.StyleScreenInput;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery.TransferPersonalisationGallerySelectorContract$InputData;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import com.revolut.feature.store.api.model.StoreCampaignInstalmentOption;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import com.revolut.feature.store.api.model.StoreInstructionList;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import gu7.f1;
import gu7.g1;
import gu7.m0;
import ip0.ck0;
import ip0.ej;
import ip0.i10;
import ip0.k10;
import ip0.ut;
import ip0.yj0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mx0.s5;
import mx0.u5;
import mx0.v5;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import tof.a3;
import wtc.l0;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f269816b;

    public /* synthetic */ c(int i, Object obj2, boolean z, Object obj3) {
        this.f269815a = i;
        this.f269816b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x048a A[LOOP:1: B:61:0x0484->B:63:0x048a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 1265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tch.c.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        tuc.s sVar = (tuc.s) this.f269816b;
        l0 transactionsContent = (l0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionsContent, "content");
        uuc.b bVar = sVar.f274589b;
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        List list = transactionsContent.f299882a;
        k71.q qVar = transactionsContent.f299883b;
        if (list.isEmpty()) {
            return zhm.u.c(new k10("CARD_TRANSACTIONS_PLACEHOLDER", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D257", null, null, null, 30), new i10(new TextLocalisedClause(R$string.card_transactions_empty, null, null, 14))));
        }
        aim.e eVarB = zhm.u.b();
        ArrayList arrayListQ = ((anf.k) bVar.f283205a).q(zhm.d0.V0(list, 3), qVar, new thf.f(false, 3));
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListQ, 10));
        int i = 0;
        for (Object obj5 : arrayListQ) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            arrayList.add(RowDelegate.Model.x((RowDelegate.Model) obj5, a0.d.n("CARD_TRANSACTION_LIST_ID@", i), null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -2, 15));
            i = i2;
        }
        eVarB.addAll(arrayList);
        if (list.size() > 3) {
            eVarB.add(new LargeActionButtonDelegate.Model("CARD_TRANSACTIONS_SEE_ALL_LIST_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.card_transactions_see_all, null, null, 14), false, null, null, null, null, 1000));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        aim.e eVarB2 = zhm.u.b();
        eVarB2.addAll(eVarA);
        return zhm.u.a(eVarB2);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        CounterTextDelegate.Model modelA;
        tv7.l lVar = (tv7.l) this.f269816b;
        m0 contacts = (m0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        Float fValueOf = Float.valueOf(16.0f);
        String str = contacts.f146790a;
        if (str != null) {
            modelA = CounterTextDelegate.Model.Companion.a(CounterTextDelegate.Model.INSTANCE, "POLICY_NUMBER_ID", new x4(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_contacts_policy_number, null, null, 14), new ImageClause(R$drawable.uikit_icn_16_copy, (Integer) null, fValueOf, fValueOf, 18)))), sr7.c.a(str, null), null, null, new g1(new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_contacts_policy_number, null, null, 14), str), 0, 0, 3992);
            yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        } else {
            modelA = null;
        }
        List listL = zhm.v.l(modelA);
        Iterable iterable = contacts.f146791b;
        if (iterable == null) {
            iterable = zhm.f0.f322471a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable2, 10));
        Iterator it8 = iterable2.iterator();
        while (it8.hasNext()) {
            arrayList.add(lVar.f274730a.a((f1) it8.next()));
        }
        return new tv7.i(contacts.f146792c != null ? new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_details_make_a_claim, null, null, 14) : null, zhm.d0.E0(zhm.w.u(arrayList), listL), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r41, java.lang.Object r42, java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tch.c.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        PlainTextDelegate.Model model;
        tz6.h hVar = (tz6.h) this.f269816b;
        ggc.l reward = (ggc.l) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(reward, "reward");
        boolean z = hVar.f275877b;
        aim.e eVarB = zhm.u.b();
        String str = reward.d.d;
        if (str == null) {
            model = null;
        } else {
            model = new PlainTextDelegate.Model("ITEM_ID_DESCRIPTION", (Clause) null, (Clause) new HtmlClause(0, 30, (Integer) null, (Object) null, str), z ? new u5(5, new TextLocalisedClause(R.string.common_show_less, null, null, 14)) : new s5(5, new TextLocalisedClause(R.string.common_show_more, null, null, 14)), (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65486);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        }
        if (model != null) {
            eVarB.add(model);
        }
        List list = reward.f143646l;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            arrayList.add(new ut(a0.d.n("ITEM_ID_RULE", i2), new TextClause((String) obj5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i2, false, null, null, 1016));
            i = i2;
        }
        int i3 = R$attr.uikit_dp0;
        int i5 = R$attr.uikit_dp16;
        yp0.e0 e0Var = yp0.e0.OUTSIDE_BOX;
        int i6 = R$attr.uikit_dp16;
        if (!arrayList.isEmpty()) {
            arrayList = yp0.b.d(arrayList, new ListSubheaderDelegate.Model("ITEM_ID_RULE_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_perks_perk_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i3, i5, i6, i6);
        }
        eVarB.addAll(arrayList);
        eVarB.add(new TextDelegate.Model("ITEM_ID_TERMS_AND_CONS", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_perks_perk_footer_title, zhm.u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_terms_and_conditions, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "ITEM_ID_TERMS_AND_CONS_LINK", false), 10)), null, 12), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp16, 0, 0, 0, 1908));
        return zhm.u.a(eVarB);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        Clause clauseM;
        u07.n nVar = (u07.n) this.f269816b;
        u07.j taxSettingsInfo = (u07.j) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(taxSettingsInfo, "taxSettingsInfo");
        String str = taxSettingsInfo.f276082a;
        FreelancerTaxProfile freelancerTaxProfile = taxSettingsInfo.f276083b;
        RowDelegate.Model modelA = l07.a.a(str);
        RowDelegate.Model modelB = (!((et6.l0) nVar.f276091a).b("FREELANCER_POCKETS.vat_reminder") || freelancerTaxProfile == null) ? null : l07.a.b(Boolean.valueOf(freelancerTaxProfile.d));
        LinkedHashSet linkedHashSet = taxSettingsInfo.f276084c;
        wi0.b bVar = taxSettingsInfo.d;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar_date, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_settings_taxes_item_tax_dates_title, null, null, 14);
        if (linkedHashSet.isEmpty()) {
            clauseM = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_settings_taxes_item_tax_dates_none, null, null, 14);
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                TextLocalisedClause textLocalisedClauseA = t07.b.a((ds6.j) it8.next(), bVar);
                if (textLocalisedClauseA != null) {
                    arrayList.add(textLocalisedClauseA);
                }
            }
            clauseM = yoj.b.m(new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList);
        }
        qv0.i[] elements = {modelA, modelB, new RowDelegate.Model("LIST_ID_TAX_DATES", image24, textLocalisedClause, null, 0, clauseM, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        Collection collectionG;
        String strB;
        u0d.b bVar = (u0d.b) this.f269816b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        j0d.q qVar = (j0d.q) pair.f186385a;
        List highlights = (List) pair.f186386b;
        String str = qVar.f170015c.f170011b;
        s0d.k kVar = new s0d.k(new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_accept_details_header_title, zhm.u.c(str), null, 12), new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_accept_details_header_subtitle, zhm.v.k(str, "18"), null, 12));
        aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_accept_details_footer_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "LIST_ID_PRIMARY_BUTTON", false, null, qVar.f170013a, 492), new n6(new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_accept_details_footer_action_decline, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, qVar.f170013a, 508), null, null, null, 121);
        aim.e eVarB = zhm.u.b();
        u0d.f fVar = bVar.f276165b;
        j0d.p teen = qVar.f170015c;
        Intrinsics.checkNotNullParameter(teen, "teen");
        String str2 = teen.f170010a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_accept_details_item_teen_info_title, zhm.u.c(teen.f170011b + " " + teen.f170012c), null, 12);
        String str3 = teen.d;
        RowDelegate.Model model = new RowDelegate.Model(str2, new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, teen.f170010a, (String) null, (String) null, (String) null, (String) null, true, (StylableContactImage$ContactStyle) new StylableContactImage$Style(R$attr.uikit_colorAccentNeutral_10, R$attr.uikit_colorWhite_80), (ImageTransformations) null, (TextLocalisedClause) null, 3323), null, null, false, null, false, 62), textLocalisedClause, null, 0, (str3 == null || (strB = z80.b.b(fVar.f276168a, str3, null, null, 6)) == null) ? null : new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_accept_details_item_teen_info_subtitle, zhm.u.c(strB), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        u0d.e eVar = bVar.f276166c;
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        List<j0d.k> list = highlights;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (j0d.k kVar2 : list) {
            String str4 = kVar2.f170005a;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_accept_details_item_highlight_title, zhm.u.c(str4), null, 12);
            String str5 = kVar2.f170006b;
            TextLocalisedClause textLocalisedClause3 = str5 != null ? new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_accept_details_item_highlight_subtitle, zhm.u.c(str5), null, 12) : null;
            String str6 = kVar2.f170007c;
            Integer numValueOf = str6 != null ? Integer.valueOf(eVar.f276167a.a(str6)) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            arrayList.add(new RowDelegate.Model(str4, numValueOf != null ? new RowDelegate.Model.MainImage.Image24(new ResourceImage(numValueOf.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6) : null, textLocalisedClause2, null, 0, textLocalisedClause3, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
        eVarB.addAll(yp0.b.g(arrayList, u0d.e.a(), null, 0, 0, 126));
        List list2 = qVar.f170017h;
        if (list2 == null || ((List) ue0.e.M(list2)) == null) {
            collectionG = zhm.f0.f322471a;
        } else {
            List<j0d.e> list3 = list2;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
            for (j0d.e eVar2 : list3) {
                arrayList2.add(new RowDelegate.Model(j6.a.q("LIST_ID_DOCUMENTS_TITLE_", eVar2.f169999a), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_accept_details_item_document_title, zhm.u.c(eVar2.f170000b), null, 12), null, 0, null, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, null, false, null, null, null, null, null, null, eVar2.f169999a, null, 0, 0, 0, 0, 532675576));
            }
            collectionG = yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("LIST_ID_DOCUMENTS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_accept_details_section_documents_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        eVarB.addAll(collectionG);
        return new s0d.l(kVar, hVar, zhm.u.a(eVarB));
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        ProfileCardModel.Loaded loaded;
        List listC;
        u1a.n nVar = (u1a.n) this.f269816b;
        SplitBillQrState splitBillQrState = (SplitBillQrState) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(splitBillQrState, "qrState");
        u1a.b bVar = nVar.f276381a;
        boolean z = splitBillQrState instanceof SplitBillQrState.Shareable;
        if (z) {
            Intrinsics.checkNotNullParameter(splitBillQrState, "splitBillQrState");
            i80.a aVarL = fkg.a.l(bVar.f276366a, ((SplitBillQrState.Shareable) splitBillQrState).f79952a.f79940b, new h90.a(33, 33), i80.c.H, i80.b.QR_CODE, null, 36);
            loaded = new ProfileCardModel.Loaded(null, new com.revolut.core.ui_kit.models.g0(new QrCodeImage(aVarL.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(900, mif.a.w(aVarL, 36), new QrCodeAppearance.Layer.Image(u1a.b.f276365b, false)), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28)), new com.revolut.core.ui_kit.models.r(new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_with_anyone_qr_screen_share_link_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10)), new com.revolut.core.ui_kit.models.a0(new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_with_anyone_qr_screen_share, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share_android, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), com.revolut.core.ui_kit.models.z.COMPACT, 4), null, 113);
        } else {
            if (!(splitBillQrState instanceof SplitBillQrState.Expired)) {
                throw new NoWhenBranchMatchedException();
            }
            loaded = new ProfileCardModel.Loaded(null, new com.revolut.core.ui_kit.models.f0(R$drawable.uikit_icn_24_exclamation_mark_outline), new com.revolut.core.ui_kit.models.q(null, new com.revolut.core.ui_kit.models.v(new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_link_qr_expired_description, null, null, 14)), null, null, 25), new com.revolut.core.ui_kit.models.a0(new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_link_qr_expired_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_refresh, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), com.revolut.core.ui_kit.models.z.COMPACT, 4), null, 113);
        }
        if (z) {
            listC = ((SplitBillQrState.Shareable) splitBillQrState).f79954c.isEmpty() ? zhm.u.c(new IconNavBarMenuItem("EDIT_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_with_anyone_qr_screen_edit_content_description, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)) : zhm.f0.f322471a;
        } else {
            if (!(splitBillQrState instanceof SplitBillQrState.Expired)) {
                throw new NoWhenBranchMatchedException();
            }
            listC = zhm.f0.f322471a;
        }
        thf.d dVar = nVar.f276382b;
        RowDelegate.Model model = new RowDelegate.Model("ROW_TRANSACTION_ID", new RowDelegate.Model.MainImage.Image40(((bnf.o) dVar).o(splitBillQrState.getF79953b()), thf.d.d(dVar, splitBillQrState.getF79953b()), null, false, 28), new TextClause(thf.m.a(nVar.f276383c, splitBillQrState.getF79953b(), r0.g(), null, null, null, null, null, Constants.TAG_FC_SPEED_MODE), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, !splitBillQrState.getF79954c().isEmpty() ? new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_with_anyone_qr_screen_transaction_details_payments_received, zhm.u.c(Integer.valueOf(splitBillQrState.getF79954c().size())), null, 12) : new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_with_anyone_qr_screen_transaction_detail_no_payment_subtitle, null, null, 14), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(splitBillQrState.getF79953b().k.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        yp0.b.m(model);
        return new u1a.k(loaded, listC, zhm.u.c(model));
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        int i;
        UriVideo uriVideo;
        u2a.a aVar = (u2a.a) ((qee.s) this.f269816b).f245144b;
        List personalisations = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(personalisations, "personalisations");
        List list = personalisations;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                Intrinsics.checkNotNullParameter(personalisations, "personalisations");
                TransferPersonalisationGallerySelectorContract$InputData transferPersonalisationGallerySelectorContract$InputData = aVar.f276583a;
                if (transferPersonalisationGallerySelectorContract$InputData.f79966a.d != null) {
                    Iterator it9 = personalisations.iterator();
                    i = 0;
                    while (it9.hasNext()) {
                        if (Intrinsics.f(((P2pPersonalisation) it9.next()).f79969a, transferPersonalisationGallerySelectorContract$InputData.f79966a.d)) {
                            break;
                        }
                        i++;
                    }
                    i = -1;
                } else if (personalisations.isEmpty()) {
                    i = -1;
                } else {
                    int size = personalisations.size();
                    int iSqrt = (int) Math.sqrt(size);
                    if (iSqrt < 1) {
                        iSqrt = 1;
                    }
                    i = (iSqrt / 2) + (((((size + iSqrt) - 1) / iSqrt) / 2) * iSqrt);
                }
                return new u2a.e(arrayList, i > -1 ? Integer.valueOf(i) : null);
            }
            P2pPersonalisation personalisation = (P2pPersonalisation) it8.next();
            Intrinsics.checkNotNullParameter(personalisation, "personalisation");
            P2pPersonalisation.Content content = personalisation.f79970b;
            String str = personalisation.f79969a;
            TransferPersonalisationGallerySelectorContract$InputData transferPersonalisationGallerySelectorContract$InputData2 = aVar.f276583a;
            boolean zF = Intrinsics.f(str, transferPersonalisationGallerySelectorContract$InputData2.f79966a.d);
            StyleScreenInput styleScreenInput = transferPersonalisationGallerySelectorContract$InputData2.f79966a;
            UrlImage urlImage = new UrlImage(content.getF79976c(), null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774);
            if (content instanceof P2pPersonalisation.Content.Video) {
                uriVideo = new UriVideo(((f80.b) aVar.f276585c).f(((P2pPersonalisation.Content.Video) content).f79975b), (Uri) null, false, oz0.b.CENTER_CROP, (Boolean) null, (oz0.c) null, LDSFile.EF_DG4_TAG);
            } else {
                if (!(content instanceof P2pPersonalisation.Content.Image)) {
                    throw new NoWhenBranchMatchedException();
                }
                uriVideo = null;
            }
            f2a.a aVarA = f2a.b.a(aVar.f276584b, personalisation, styleScreenInput.f79957a.k(), 2);
            arrayList.add(new PersonalisationGalleryTileModel(str, new v8(urlImage, uriVideo, new MoneyClause(styleScreenInput.f79957a, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.SolidInt(aVarA.f131491c), false, false, 254), null, 8), aVarA.f131490b, new bv0.b(styleScreenInput.f79959c, styleScreenInput.f79958b), zF), personalisation));
            it8 = it8;
        }
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        List list;
        List listN;
        u2e.e eVar = (u2e.e) this.f269816b;
        StoreCampaignOffer msiCampaign = (StoreCampaignOffer) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(msiCampaign, "msiCampaign");
        StoreMegaOffer storeMegaOffer = (StoreMegaOffer) eVar.f276606a.getContent();
        String str = storeMegaOffer != null ? storeMegaOffer.f88552j : null;
        aim.e eVarB = zhm.u.b();
        RowDelegate.Model modelA = o2e.b.a("STORE_BRAND_DETAIL_MSI_BANNER_ID", new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_banner_earn_msi_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_banner_earn_msi_subtitle, null, null, 14), R$drawable.uikit_icn_24_time_and_money, msiCampaign, str);
        int i = R$attr.uikit_dp0;
        yp0.b.l(modelA, i, i, 0, 0, null, false, 60);
        eVarB.add(modelA);
        StoreCampaignInstalmentOption storeCampaignInstalmentOption = msiCampaign.A;
        CellDetailsDelegate.Model model = (storeCampaignInstalmentOption == null || (list = storeCampaignInstalmentOption.f88444c) == null || (listN = c6d.b.N(list)) == null) ? null : new CellDetailsDelegate.Model("STORE_BRAND_DETAIL_MSI_INSTALLMENTS_LIST_ID", new t0((Clause) new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_campaign_info_installments_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_campaign_info_installments_description, zhm.u.c(zhm.d0.k0(listN, ",", null, null, 0, null, 62)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        CellDetailsDelegate.Model model2 = storeCampaignInstalmentOption != null ? new CellDetailsDelegate.Model("STORE_BRAND_DETAIL_MSI_MIN_AMOUNT_LIST_ID", new t0((Clause) new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_campaign_info_min_amount_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(storeCampaignInstalmentOption.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null;
        String str2 = msiCampaign.f88452j;
        Object[] elements = {model, model2, str2 != null ? new PlainTextDelegate.Model("STORE_BRAND_DETAIL_MSI_DESCRIPTION_LIST_ID", (Clause) null, (Clause) new TextClause(str2, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 61422) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        int i2 = R$attr.uikit_dp16;
        yp0.b.k(listL, i2, i2, 0, 0, 28);
        eVarB.addAll(listL);
        StoreInstructionList storeInstructionList = msiCampaign.B;
        eVarB.addAll(o2e.d.a("STORE_BRAND_DETAIL_MSI_INSTRUCTIONS_SUBHEADER_ID", "STORE_BRAND_DETAIL_MSI_INSTRUCTION_", storeInstructionList != null ? storeInstructionList.f88528a : null));
        ej ejVarA = o2e.a.a(eVar.f276608c);
        if (ejVarA != null) {
            eVarB.add(ejVarA);
        }
        return new u2e.h(zhm.u.a(eVarB));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tch.c.l(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r39, java.lang.Object r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tch.c.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        Collection collectionA;
        LoanDocuments loanDocuments;
        u65.c cVar = (u65.c) this.f269816b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        LoanDetails loanDetails = (LoanDetails) pair.f186385a;
        ux4.b bVar = (ux4.b) pair.f186386b;
        od0.i iVar = cVar.f277486c;
        aim.e eVarB = zhm.u.b();
        if (loanDetails.f70144a.f.f241820c != q35.g.Disabled) {
            eVarB.addAll(yp0.b.i(new RowDelegate.Model("MORTGAGE_STATEMENT_LIST_ID", u65.j.d(), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_documents_section_statements_mortgage, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, loanDetails.f70144a.f.f241820c, null, 0, 0, 0, 0, 532676600), new ListSubheaderDelegate.Model("STATEMENTS_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_documents_section_statements_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        }
        List list = bVar.f283864a;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            ux4.d dVar = (ux4.d) obj5;
            if (dVar.f283870j == ux4.f.PDF && dVar.f == ux4.h.ORIGINAL) {
                arrayList.add(obj5);
            }
        }
        eVarB.addAll(u65.j.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_documents_section_agreements_title, null, null, 14), arrayList));
        Data data = (Data) iVar.f224257a;
        if (data == null || (loanDocuments = (LoanDocuments) data.getContent()) == null) {
            collectionA = zhm.f0.f322471a;
        } else {
            aim.e eVarB2 = zhm.u.b();
            if (!loanDocuments.f70157b.isEmpty()) {
                eVarB2.addAll(yp0.b.i(new RowDelegate.Model("PAYMENT_RECEIPTS_LIST_ID", u65.j.d(), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_documents_section_payment_receipts, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 532676600), new ListSubheaderDelegate.Model("MORTGAGE_DISBURSAL_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_documents_section_disbursal_mortgage_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
            }
            eVarB2.addAll(u65.j.b(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_documents_section_certificates_title, null, null, 14), loanDocuments.f70158c));
            eVarB2.addAll(u65.j.b(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_documents_section_permissions_title, null, null, 14), loanDocuments.d));
            collectionA = zhm.u.a(eVarB2);
        }
        eVarB.addAll(collectionA);
        List list2 = bVar.f283864a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list2) {
            ux4.d dVar2 = (ux4.d) obj6;
            if (dVar2.f283870j == ux4.f.PDF && dVar2.f == ux4.h.FORBEARANCE) {
                arrayList2.add(obj6);
            }
        }
        eVarB.addAll(u65.j.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_documents_section_forbearance_title, null, null, 14), arrayList2));
        return zhm.u.a(eVarB);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        u6b.e eVar = (u6b.e) this.f269816b;
        r5b.e linkAccountInfo = (r5b.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
        return w6b.e.a(linkAccountInfo.d, eVar.f277527a, eVar.f277528b, eVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0131  */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r37, java.lang.Object r38, java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tch.c.p(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.MoneyClause$Format, com.revolut.core.ui_kit.models.Style] */
    private final Object q(Object obj2, Object obj3, Object obj4) {
        int iG;
        ?? r142;
        TextLocalisedClause textLocalisedClause;
        int i;
        Collection collectionA;
        u95.h hVar = (u95.h) this.f269816b;
        f95.c overdraftDetails = (f95.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(overdraftDetails, "overdraftDetails");
        ux4.b bVar = (ux4.b) hVar.f278391b.getContent();
        aim.e eVarB = zhm.u.b();
        aim.e eVarB2 = zhm.u.b();
        dj0.d dVar = overdraftDetails.f132826g;
        dj0.d dVar2 = overdraftDetails.f132827h;
        long j2 = dVar2.f115082a;
        if (j2 <= 0) {
            iG = 0;
        } else {
            long j3 = dVar.f115082a;
            iG = j3 >= j2 ? 100 : kotlin.ranges.f.g((int) ((j3 / j2) * 100), 0, 100);
        }
        u95.o oVar = (overdraftDetails.e || overdraftDetails.f) ? u95.o.RESTRICTED : overdraftDetails.d ? u95.o.LIMIT_EXCEEDED : overdraftDetails.f132825c ? u95.o.WARNING_THRESHOLD : u95.o.NORMAL;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.overdraft_details_section_main_spend_title, null, null, 14);
        int i2 = u95.p.f278395a[oVar.ordinal()];
        if (i2 == 1) {
            r142 = 0;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.overdraft_details_section_main_spend_subtitle_restricted, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        } else if (i2 == 2) {
            r142 = 0;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.overdraft_details_section_main_spend_subtitle_limitExceeded, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = null;
            r142 = 0;
        }
        RowDelegate.Model.c.b bVar2 = new RowDelegate.Model.c.b(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.overdraft_details_section_main_spend_value, zhm.v.k(sx4.f.b(3, r142, r142, dVar), sx4.f.b(3, r142, r142, dVar2)), r142, 12), null, null, false, 126);
        ProgressStyle.Companion companion = ProgressStyle.INSTANCE;
        int[] iArr = u95.n.f278394a;
        int i3 = iArr[oVar.ordinal()];
        int i5 = (i3 == 1 || i3 == 2) ? 100 : iG;
        int i6 = iArr[oVar.ordinal()];
        if (i6 == 1 || i6 == 2) {
            i = R$attr.uikit_colorRed;
        } else if (i6 == 3) {
            i = R$attr.uikit_colorOrange;
        } else {
            if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorBlue;
        }
        int i21 = R$attr.uikit_colorSegmentedBackground;
        companion.getClass();
        AccountCellItemDelegate.Model model = new AccountCellItemDelegate.Model("ID_OVERDRAFT_HEADER", false, (Image) new LayeredImage(zhm.v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_56_oval_background, Integer.valueOf(R$attr.uikit_colorSegmentedBackground), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_draw_parallel_channel, (Integer) null, 16.0f, 16.0f, 16.0f, 16.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 66)), (Float) null, (Float) null, 14), (Clause) textLocalisedClause2, (com.revolut.core.ui_kit.delegates.c) null, false, (Clause) textLocalisedClause, bVar2, ProgressStyle.Companion.b(i5, i, i21), (Object) null, (Parcelable) null, 130608);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB2.add(model);
        aim.e eVarB3 = zhm.u.b();
        dj0.d dVar3 = overdraftDetails.f132828j;
        LocalDate localDate = overdraftDetails.f132829l;
        if (localDate != null) {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.overdraft_details_section_main_payOverdraftBy_title, null, null, 14);
            int i22 = com.revolut.feature.credit.core.R$string.credit_common_non_interactive_template;
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDateClause$DateFormat.DayAndMonth dayAndMonth = new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT);
            jVar.getClass();
            eVarB3.add(new CellDetailsDelegate.Model("ID_PAY_OVERDRAFT_BY", textLocalisedClause3, new TextLocalisedClause(i22, zhm.u.c(com.revolut.core.ui_kit.models.j.a(localDate, dayAndMonth, null)), null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        int i32 = com.revolut.feature.credit.core.R$string.overdraft_details_section_main_monthCharges_title;
        com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        eVarB3.add(new CellDetailsDelegate.Model("ID_CHARGES", new TextLocalisedClause(i32, zhm.u.c(com.revolut.core.ui_kit.models.j.b(jVar2, localDateNow, new LocalDateClause$DateFormat.Month(ka.FULL))), null, 12), sx4.f.b(3, null, null, dVar3), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520));
        LocalDate localDate2 = overdraftDetails.k;
        if (localDate2 != null) {
            eVarB3.add(new CellDetailsDelegate.Model("ID_INTEREST_CHARGED_ON", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.overdraft_details_section_main_interestChargedOn_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_non_interactive_template, zhm.u.c(com.revolut.core.ui_kit.models.j.a(localDate2, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT), null)), null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        eVarB3.add(new CellDetailsDelegate.Model("ID_APR", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.overdraft_details_section_main_apr_title, null, null, 14), new TextClause(overdraftDetails.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520));
        aim.e eVarA = zhm.u.a(eVarB3);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB2.addAll(eVarA);
        aim.e eVarA2 = zhm.u.a(eVarB2);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA2);
        RowDelegate.Model model2 = new RowDelegate.Model("ID_INCREASE_LIMIT", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_arrow_rates, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.overdraft_details_section_increase_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.overdraft_details_section_increase_subtitle, null, null, 14), null, null, 0, new tf(6, u95.m.a(), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        if (bVar != null) {
            List list = bVar.f283864a;
            ArrayList<ux4.d> arrayList = new ArrayList();
            for (Object obj5 : list) {
                if (((ux4.d) obj5).f283870j == ux4.f.PDF) {
                    arrayList.add(obj5);
                }
            }
            if (arrayList.isEmpty()) {
                collectionA = zhm.f0.f322471a;
            } else {
                aim.e eVarB4 = zhm.u.b();
                eVarB4.add(new ListSubheaderDelegate.Model("ID_DOCUMENTS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.overdraft_details_section_documents_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (ux4.d dVar4 : arrayList) {
                    arrayList2.add(new RowDelegate.Model(j6.a.q("ID_DOCUMENT_", dVar4.f283865a), new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_document, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_non_interactive_template, zhm.u.c(dVar4.f283867c), null, 12), null, 0, null, null, null, 0, new tf(6, u95.m.a(), false), false, null, false, null, null, null, null, null, null, dVar4, null, 0, 0, 0, 0, 532675576));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB4.addAll(arrayList2);
                collectionA = zhm.u.a(eVarB4);
            }
            eVarB.addAll(collectionA);
        }
        RowDelegate.Model model3 = new RowDelegate.Model("ID_GET_HELP", null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.overdraft_details_section_help_title, null, null, 14), null, 0, null, null, null, 0, new tf(6, u95.m.a(), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
        yp0.b.l(model3, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        eVarB.add(model3);
        return zhm.u.a(eVarB);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        uc5.f fVar = (uc5.f) this.f269816b;
        List transactions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        List<a3> list = transactions;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (a3 a3Var : list) {
            thf.g gVar = fVar.f278993b;
            k71.q.Companion.getClass();
            RowDelegate.Model modelP = ((anf.k) gVar).p(a3Var, k71.p.a(), new thf.f(false, 3));
            LocalDateTime localDateTimePlusDays = LocalDateTime.ofInstant(Instant.ofEpochMilli(a3Var.f272591g.getMillis()), ZoneId.systemDefault()).plusDays(fVar.f278992a.f278989a.f88082b.f88087b.f88062c);
            if (localDateTimePlusDays.compareTo((ChronoLocalDateTime<?>) ((l80.f) fVar.f278994c).f()) < 0) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.crypto.asset_details.api.R$string.transaction_staking_unstake_subtitle_soon, null, null, 14);
            } else {
                int i = com.revolut.retail.feature.crypto.asset_details.api.R$string.transaction_staking_unstake_subtitle_on;
                com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                LocalDate localDate = localDateTimePlusDays.toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                LocalDateClause$DateFormat.INSTANCE.getClass();
                textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(com.revolut.core.ui_kit.models.j.b(jVar, localDate, LocalDateClause$DateFormat.Companion.f57815b)), null, 12);
            }
            arrayList.add(RowDelegate.Model.x(modelP, null, null, null, textLocalisedClause, null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15));
        }
        yp0.b.k(arrayList, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 28);
        return arrayList;
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        ud2.s sVar = (ud2.s) this.f269816b;
        Alias alias = (Alias) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(alias, "alias");
        String strB = z80.b.b(sVar.f279087a, alias.f61879b, null, null, 6);
        return new PromptMarketingContentDelegate.Model("PROMPT_ID_SPIN_DEREGISTER", new TextLocalisedClause(com.revolut.feature.apm.spin.api.R$string.spin_deregister_request_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.spin.api.R$string.spin_deregister_request_description, zhm.u.c(strB), null, 12), new PromptMarketingContentDelegate.Model.Content.MediaContent(new CdnImage("logo_full", "mobile/payments/spin", null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), false, 8), null, null, null, null, null, ISO781611.SMT_TAG), null, null, Constants.TAG_F4), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.apm.spin.api.R$string.spin_deregister_request_action_decline, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, "DECLINE_BUTTON_LOADING_TAG", 22), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.apm.spin.api.R$string.spin_deregister_request_action_approve, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f, false, "ACCEPT_BUTTON_LOADING_TAG", 22), null, null, null, null, null, null, null, null, null, null, 2095536);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        ud3.i0 i0Var = (ud3.i0) this.f269816b;
        whf.p transactionsContent = (whf.p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        List list = transactionsContent.f297646a;
        if (list.isEmpty()) {
            return zhm.f0.f322471a;
        }
        boolean z = list.size() > 3;
        aim.e eVarB = zhm.u.b();
        eVarB.add(new ListSubheaderDelegate.Model("ID_TRANSACTIONS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_box_transactions_title, null, null, 14), (ResourceImage) null, false, false, (Clause) (z ? new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_transactions_action_see_all, null, null, 14) : null), true, (Object) null, (AnalyticsContext) null, 0, R$attr.uikit_dp8, 0, 0, (String) null, 245562));
        ArrayList arrayListQ = ((anf.k) i0Var.f279112a).q(zhm.d0.V0(list, 3), transactionsContent.f297647b, new thf.f(false, 3));
        yp0.b.k(arrayListQ, 0, R$attr.uikit_dp16, 0, 0, 29);
        eVarB.addAll(arrayListQ);
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0b8f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r77, java.lang.Object r78, java.lang.Object r79) {
        /*
            Method dump skipped, instruction units count: 3674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tch.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f269815a = i;
        this.f269816b = obj2;
    }

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f269815a = i;
        this.f269816b = obj3;
    }
}
