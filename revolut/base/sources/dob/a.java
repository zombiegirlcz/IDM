package dob;

import android.os.Parcelable;
import aw0.db;
import aw0.eb;
import aw0.fb;
import aw0.k;
import aw0.k7;
import aw0.o9;
import aw0.p6;
import aw0.s0;
import aw0.y4;
import ba6.l;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.ga;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.ha;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.hj;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.lj;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.yi;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedGenderClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.donations.impl.R$plurals;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPricing;
import com.revolut.feature.travel.experiences.models.TravelExperiencesSummary;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.sso.impl.domain.models.ClaimToManage;
import com.youTransactor.uCube.rpc.Constants;
import do3.n;
import dyf.d;
import ec6.i;
import eh1.j;
import ggk.g1;
import ggk.x0;
import ip0.ah0;
import ip0.ck0;
import ip0.e10;
import ip0.eo0;
import ip0.g10;
import ip0.go0;
import ip0.yj0;
import ip0.zj;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.o0;
import kl7.b2;
import kl7.c2;
import kl7.y1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.s4;
import mx0.v5;
import org.jmrtd.cbeff.ISO781611;
import yhm.r;
import yp0.e0;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116475a;

    public /* synthetic */ a(int i) {
        this.f116475a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        Clause textClause;
        BigTileDelegate.Model model;
        List spotlightItems = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(spotlightItems, "spotlightItems");
        if (spotlightItems.isEmpty()) {
            return f0.f322471a;
        }
        List<i> list = spotlightItems;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (i iVar : list) {
            if (iVar instanceof ec6.h) {
                l lVar = ((ec6.h) iVar).f124450a;
                model = new BigTileDelegate.Model(j6.a.q("CHARITY_BIG_TILE_ITEM_ID", lVar.f13938a), new TextClause(lVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new UrlImage(lVar.f, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), null, new UrlImage(lVar.f13941g, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), new s4(u.c(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_profile, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorTeal, 6.0f, null, null, 48)), new TextLocalisedQuantityClause(R$plurals.donations_overview_charities_donor_count, Integer.valueOf((int) lVar.f13946n), (List) null, (Style) null, 28), 3, 24), null, null, new k(6, new TextClause(lVar.f13939b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false), true, false, null, lVar, null, null, null, 66976968);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            } else {
                if (!(iVar instanceof ec6.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                ba6.f fVar = ((ec6.g) iVar).f124449a;
                String strQ = j6.a.q("CHARITY_COLLECTION_BIG_TILE_ITEM_ID", fVar.f13931a);
                UrlImage urlImage = new UrlImage(fVar.d, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                k kVar = new k(6, new TextLocalisedClause(R$string.donations_overview_charities_spotlight_collection, null, null, 14), null, false);
                TextClause textClause2 = new TextClause(fVar.f13932b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                ArrayList arrayList2 = fVar.e;
                List listV0 = d0.V0(arrayList2, 2);
                ArrayList arrayList3 = new ArrayList(w.t(listV0, i));
                Iterator it8 = listV0.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(new UrlImage(((l) it8.next()).f, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) bb6.a.f14169a, false, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(0.5f), Integer.valueOf(R$attr.uikit_colorGreyTone10), false, 12), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 515578));
                }
                int size = arrayList2.size();
                if (size != 0) {
                    textClause = size != 1 ? new TextLocalisedQuantityClause(R$plurals.donations_overview_charities_spotlight_charities_list, Integer.valueOf(arrayList2.size() - 1), v.k(((l) d0.b0(arrayList2)).f13939b, Integer.valueOf(arrayList2.size() - 1)), (Style) null, 24) : new TextClause(((l) d0.b0(arrayList2)).f13939b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                } else {
                    m70.a.c(t0.f186434a);
                    textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                model = new BigTileDelegate.Model(strQ, textClause2, null, null, urlImage, new s4(arrayList3, textClause, 3, 24), null, null, kVar, true, false, null, fVar, null, null, null, 66976968);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            }
            arrayList.add(model);
            i = 10;
        }
        hg hgVar = new hg("GLOBAL_CHARITIES_CAROUSEL_ID", arrayList, 1, new y4(new aw0.d0(343, 284)), null, new gg.c(0), true, false, null, null, 0, 0, 0, 0, 32656);
        int i2 = R$attr.uikit_dp0;
        yp0.b.p(hgVar, i2, R$attr.uikit_dp16, i2, i2);
        return u.c(hgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.revolut.core.ui_kit.models.CurrencyClause$Format, com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private final Object b(Object obj2, Object obj3, Object obj4) {
        Iterator it8;
        TextLocalisedClause textLocalisedClause;
        Iterator it9;
        r rVar = (r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        List list = (List) rVar.f314201a;
        ig8.f fVar = (ig8.f) rVar.f314202b;
        String strI = te0.w.I((n) rVar.f314203c);
        ?? r87 = 0;
        int i = 12;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_migration_asset_details_v2_title, u.c(new TextClause(fVar.f161087b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        int i2 = 14;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_migration_asset_details_v2_subtitle, null, null, 14);
        UserNamePlaceholder.Default r122 = new UserNamePlaceholder.Default(strI, UserNamePlaceholder.PlaceholderSize.Default.f60052a);
        int i3 = 6;
        eh8.e eVar = new eh8.e(textLocalisedClause2, textLocalisedClause3, new PairedImage(new UserAvatarImage(r122, null, null, 6), new ContactImage(fVar.f161086a, (String) null, (String) null, (String) null, (String) null, com.google.android.gms.internal.mlkit_vision_face.a.o(fVar.f161087b, " ", fVar.f161088c), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062), R$attr.uikit_colorWidgetBackground, null));
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_migration_asset_details_v2_confirm_button, null, null, 14);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : list) {
            xi0.b bVar = ((tg8.b) obj5).f271106a.f115083b;
            Object arrayList = linkedHashMap.get(bVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bVar, arrayList);
            }
            ((List) arrayList).add(obj5);
        }
        aim.e eVarB = u.b();
        Iterator it10 = linkedHashMap.entrySet().iterator();
        while (it10.hasNext()) {
            Map.Entry entry = (Map.Entry) it10.next();
            xi0.b bVar2 = (xi0.b) entry.getKey();
            List list2 = (List) entry.getValue();
            Iterator it11 = list2.iterator();
            long j2 = 0;
            while (it11.hasNext()) {
                j2 += ((tg8.b) it11.next()).f271106a.f115082a;
            }
            String str = bVar2.f306286a;
            String strQ = j6.a.q("header_", str);
            CurrencyClause currencyClause = new CurrencyClause(bVar2, r87, r87, i3);
            TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(com.revolut.feature.junior_graduation.impl.R$plurals.junior_graduation_migration_asset_details_v2_accounts, Integer.valueOf(list2.size()), v1.c.v(list2), (Style) null, 24);
            RowDelegate.Model model = new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str, (ImageTransformations) r87, (TextLocalisedClause) r87, i2), null, null, false, null, false, 62), currencyClause, null, 0, textLocalisedQuantityClause, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(j2, bVar2), new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            Iterator it12 = list3.iterator();
            int i5 = 0;
            ?? r810 = r87;
            while (it12.hasNext()) {
                Object next = it12.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.s();
                    throw null;
                }
                tg8.b bVar3 = (tg8.b) next;
                int i21 = eh8.l.f125764a[bVar3.f271107b.ordinal()];
                if (i21 == 1) {
                    it8 = it10;
                    ?? r56 = r810;
                    it9 = it12;
                    i = 12;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_migration_asset_details_v2_account_main, u.c(new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, r56, 4)), r56, 12);
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    it8 = it10;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_migration_asset_details_v2_account_pocket, u.c(new TextClause(bVar3.f271108c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, i);
                    it9 = it12;
                }
                arrayList2.add(new CellDetailsDelegate.Model(j6.a.m(i5, "account_", "_", str), new aw0.t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), new MoneyClause(bVar3.f271106a, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
                i5 = i6;
                it10 = it8;
                it12 = it9;
                r810 = 0;
            }
            aim.e eVarE = i26.l.e(model, arrayList2);
            yp0.b.k(eVarE, 0, 0, 0, 0, 31);
            eVarB.addAll(eVarE);
            it10 = it10;
            i3 = 6;
            i2 = 14;
            r87 = r810;
        }
        return new eh8.i(eVar, textLocalisedClause4, u.a(eVarB));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int i = 14;
        if (content.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("LIST_ID_NO_PASSKEYS", new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_passkeys_management_empty_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D367", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32740));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        List<ClaimToManage.WebAuthn> list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ClaimToManage.WebAuthn webAuthn : list) {
            i = 14;
            arrayList.add(new RowDelegate.Model(j6.a.q("LIST_ID_PASSKEY.", webAuthn.f106141a), new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_passkey, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 62), new TextClause(webAuthn.f106142b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new CompositeClause(v.k(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_passkeys_management_item_subtitle, null, null, i), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(webAuthn.f106143c.toInstant().toEpochMilli(), new TimeClause.Format.Pretty(0), null, null, 12)), null, null, null, 14), null, null, 0, new pf(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_passkeys_management_buttons_delete, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, webAuthn, null, 0, 0, 0, 0, 532673496));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        int i;
        CellDetailsDelegate.Model model;
        Pair pair;
        SavingsProduct.Provider.LegalInfo legalInfo;
        String str;
        SavingsProductData productData = (SavingsProductData) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(productData, "productData");
        aim.e eVarB = u.b();
        PlainTextDelegate.Model model2 = new PlainTextDelegate.Model("PLAIN_TEXT_DELEGATE_INFO_LIST_ID", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.vaults_mmf_information_fund_information_fidelity_mmf_explanation, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        SavingsProduct savingsProduct = productData.f86683a;
        SavingsProduct.Provider provider = savingsProduct.e;
        if (provider == null || (legalInfo = provider.f86669g) == null || (str = legalInfo.f86670a) == null) {
            i = 14;
            model = null;
        } else {
            i = 14;
            model = new CellDetailsDelegate.Model("CELL_DETAILS_LIST_ID", new TextLocalisedClause(com.revolut.feature.vaults.R$string.mmf_info_sheets_fund_manager_cells_fund_isin, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        boolean z = false;
        Object[] elements = {model2, model, new RowDelegate.Model("ROW_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.vaults_mmf_information_fund_information_key_information_document, null, null, i), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground_30), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        eVarB.addAll(yp0.b.g(kotlin.collections.d.L(elements), new ListSubheaderDelegate.Model("SUBHEADER_COMPANY_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.vaults_mmf_information_fund_information_fidelity_mmf_title, null, null, i), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, R$attr.uikit_dp0, 0, 122));
        String str2 = savingsProduct.f86618b.f306286a;
        xi0.b.Companion.getClass();
        if (Intrinsics.f(str2, xi0.b.f306272g.f306286a)) {
            pair = new Pair(41, 59);
        } else if (Intrinsics.f(str2, xi0.b.f306273h.f306286a)) {
            pair = new Pair(50, 50);
        } else if (Intrinsics.f(str2, xi0.b.i.f306286a)) {
            pair = new Pair(55, 45);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Unsupported currency ", str2, " - productID -", savingsProduct.f86617a));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            pair = null;
        }
        if (pair != null) {
            int iIntValue = ((Number) pair.f186385a).intValue();
            int iIntValue2 = ((Number) pair.f186386b).intValue();
            List listK = v.k(new g10(iIntValue, new Color.Solid(R$attr.uikit_colorAccentNeutral)), new g10(iIntValue2, new Color.Solid(R$attr.uikit_colorOrange)));
            int i2 = R$attr.uikit_colorAccentNeutral;
            fb fbVar = new fb(new p6(i2, Integer.valueOf(i2)), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.vaults_mmf_information_fund_information_funds_holdings_chart_bank_deposits_and_cash, u.c(iIntValue + "%"), new Custom(Integer.valueOf(R$attr.uikit_colorForeground_50), false, db.EMPHASIS2, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), 8));
            int i3 = R$attr.uikit_colorOrange;
            eVarB.addAll(yp0.b.g(v.k(new e10(listK, new eb(v.k(fbVar, new fb(new p6(i3, Integer.valueOf(i3)), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.vaults_mmf_information_fund_information_funds_holdings_chart_bonds_and_fixed_income, u.c(iIntValue2 + "%"), new Custom(Integer.valueOf(R$attr.uikit_colorForeground_50), false, null, false, null, 254), 8))))), new TextDelegate.Model("TEXT_DELEGATE_HOLDINGS_LIST_ID", new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.vaults_mmf_information_fund_information_funds_holdings_explanation, null, null, i), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908)), new ListSubheaderDelegate.Model("SUBHEADER_HOLDINGS_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.vaults_mmf_information_fund_information_funds_holdings_title, null, null, i), (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "FUND_HOLDINGS_LEARN_MORE_CLICK_ID", false), 10), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z, z, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450), null, 0, 0, 126));
        }
        return new epb.g(u.a(eVarB));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [com.revolut.core.ui_kit.models.CompositeClause] */
    /* JADX WARN: Type inference failed for: r9v14, types: [com.revolut.core.ui_kit.models.CompositeClause] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        boolean z;
        String str;
        LayeredImage layeredImage;
        Clause textLocalisedClause2;
        int i;
        LayeredImage layeredImageF;
        RevPoints revPoints;
        dj0.d dVar;
        dj0.d dVarH;
        Iterable iterableC;
        Object next;
        Object next2;
        String str2;
        int i2 = 3;
        int i3 = 6;
        int i5 = 2;
        int i6 = 10;
        int i21 = 14;
        int i22 = 0;
        Object obj5 = null;
        switch (this.f116475a) {
            case 0:
                List content = (List) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content, "content");
                return d0.i1(content);
            case 1:
                List content2 = (List) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content2, "content");
                return d0.i1(content2);
            case 2:
                List content3 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                return d0.i1(w.u(content3));
            case 3:
                c2 documentsBatch = (c2) obj2;
                ((Boolean) obj3).getClass();
                Throwable th10 = (Throwable) obj4;
                Intrinsics.checkNotNullParameter(documentsBatch, "documentsBatch");
                if (th10 != null) {
                    return dr7.k.c(iii.c.b(null, null, 6, false));
                }
                b2 b2Var = documentsBatch.f185302c;
                ArrayList arrayList = documentsBatch.f185301b;
                if (b2Var.a()) {
                    Integer numValueOf = Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST);
                    return new dr7.i(new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_documents_in_review_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_documents_in_review_caption, null, null, 14), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_documents_in_review_footer_primary_button_title, null, null, 14), u.c(new FullScreenStateDelegate.Model("FULL_SCREEN_STATE_ID", null, null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D028", new ImageTransformations(null, null, null, null, null, numValueOf, numValueOf, 31), null, null, 28)), zj.REGULAR, null, false, null, null, false, 0, 0, 31718)), true, true);
                }
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_requested_documents_header_title, null, null, 14);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_requested_documents_header_subtitle, u.c(Integer.valueOf(documentsBatch.f185300a)), null, 12);
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_requested_documents_footer_primary_button_title, null, null, 14);
                if (arrayList.isEmpty()) {
                    textLocalisedClause = textLocalisedClause4;
                    z = false;
                } else {
                    if (!arrayList.isEmpty()) {
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            if (((RequestedDocument) it8.next()).f75305h != y1.UPLOADED) {
                                textLocalisedClause = textLocalisedClause4;
                                z = false;
                            }
                        }
                    }
                    textLocalisedClause = textLocalisedClause4;
                    z = true;
                }
                ?? linkedHashMap = new LinkedHashMap();
                for (Object obj6 : arrayList) {
                    String str3 = ((RequestedDocument) obj6).f75303c;
                    ?? O = linkedHashMap.get(str3);
                    if (O == null) {
                        O = v0.a.o(linkedHashMap, str3);
                    }
                    ((List) O).add(obj6);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str4 = (String) entry.getKey();
                    List<RequestedDocument> list = (List) entry.getValue();
                    ArrayList arrayList3 = new ArrayList(w.t(list, i6));
                    for (RequestedDocument requestedDocument : list) {
                        String str5 = requestedDocument.f75301a;
                        TextClause textClause = new TextClause(requestedDocument.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str6 = requestedDocument.f75304g;
                        if (str6 == null) {
                            textLocalisedClause2 = new TextClause(requestedDocument.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            str = str5;
                            layeredImage = null;
                        } else {
                            str = str5;
                            layeredImage = null;
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_requested_documents_cells_document_rejected_subtitle, null, null, i21);
                        }
                        Clause clause = textLocalisedClause2;
                        int i32 = dr7.l.f117102a[requestedDocument.f75302b.ordinal()];
                        if (i32 == 1) {
                            i = R$drawable.uikit_icn_24_national_id;
                        } else if (i32 == 2) {
                            i = R$drawable.uikit_icn_24_check_verification;
                        } else {
                            if (i32 != 3 && i32 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R$drawable.uikit_icn_24_document;
                        }
                        int i33 = dr7.l.f117103b[requestedDocument.f75305h.ordinal()];
                        if (i33 != 1) {
                            if (i33 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            LayeredImage.Companion companion = LayeredImage.INSTANCE;
                            int i43 = R$drawable.uikit_icn_24_check;
                            int i59 = R$attr.uikit_colorBackground;
                            layeredImageF = LayeredImage.Companion.f(companion, i43, R$attr.uikit_colorGreen, i59, Integer.valueOf(i59), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 112);
                        } else if (str6 != null) {
                            LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                            int i66 = R$drawable.uikit_icn_16_exclamation_mark;
                            int i74 = R$attr.uikit_colorOrange;
                            int i92 = R$attr.uikit_colorBackground;
                            layeredImageF = LayeredImage.Companion.f(companion2, i66, i92, i92, Integer.valueOf(i74), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 112);
                        } else {
                            layeredImageF = layeredImage;
                        }
                        arrayList3.add(new RowDelegate.Model(str, xl7.n.k(i, false, layeredImageF, 11), textClause, null, 0, clause, null, null, Integer.MAX_VALUE, xl7.n.c(), false, null, false, null, null, null, null, null, null, requestedDocument, null, 0, 0, 0, 0, 532675288));
                        i21 = 14;
                    }
                    a0.x(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model(str4, (Image) null, (Clause) new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList2);
                    i6 = 10;
                    i21 = 14;
                }
                return new dr7.i(textLocalisedClause3, textLocalisedClause, textLocalisedClause5, d0.F0(dr7.k.b(), arrayList2), z, false);
            case 4:
                ((Boolean) obj3).getClass();
                return Boolean.valueOf(((InvestOrder) obj2).getI() == o0.PARTIALLY_FILLED);
            case 5:
                xzg.k content4 = (xzg.k) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                return new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.cryptocommodity_invest_collections_amount_screen_header_title, u.c(content4.e()), null, 12);
            case 6:
                x3g.i content5 = (x3g.i) obj2;
                ((Boolean) obj3).getClass();
                d.a aVar = dyf.d.Companion;
                Intrinsics.checkNotNullParameter(content5, "content");
                List list2 = content5.f302752b;
                if (list2.isEmpty()) {
                    return f0.f322471a;
                }
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("DISCOVER_MORE_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.common.api.R$string.travel_common_discover_more_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                List list3 = list2;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                int i96 = 0;
                for (Object obj7 : list3) {
                    int i99 = i96 + 1;
                    if (i96 < 0) {
                        ?? r322 = obj5;
                        v.s();
                        throw r322;
                    }
                    TravelExperiencesSummary travelExperiencesSummary = (TravelExperiencesSummary) obj7;
                    String str7 = travelExperiencesSummary.f93201a;
                    TravelExperiencesPricing travelExperiencesPricing = travelExperiencesSummary.f;
                    String str8 = (String) d0.d0(travelExperiencesSummary.f93203c);
                    if (str8 == null) {
                        str8 = "";
                    }
                    Object obj8 = obj5;
                    zi ziVar = new zi(new UrlImage(str8, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), go0.PROGRESSIVE_BLUR);
                    TextClause textClause2 = new TextClause(travelExperiencesSummary.f93202b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    hj hjVar = new hj(i5);
                    dj0.d dVar2 = travelExperiencesPricing.f93199b;
                    TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesPricing.d;
                    dj0.d dVar3 = (travelExperiencesPointsOption == null || (dVar = travelExperiencesPointsOption.f93196b) == null || (dVarH = pyd.c.H(dVar2, dVar)) == null) ? dVar2 : dVarH;
                    MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                    o9 o9Var = o9.NON_SENSITIVE;
                    yi yiVar = new yi((travelExperiencesPointsOption == null || (revPoints = travelExperiencesPointsOption.f93195a) == null) ? obj8 : nub.a.l(revPoints, o9Var, null, null, BitmapDescriptorFactory.HUE_RED, 54), new MoneyClause(dVar3, defaults, null, o9Var, 4));
                    List list4 = dyf.d.f121101a;
                    VoucherSmallTileDelegate.Model model2 = new VoucherSmallTileDelegate.Model(str7, ziVar, textClause2, hjVar, null, null, null, yiVar, null, null, null, false, new eo0((aw0.d0) list4.get(i96 % list4.size())), null, travelExperiencesSummary, 245488);
                    int i100 = R$attr.uikit_dp0;
                    yp0.b.l(model2, i100, i100, i100, i100, null, false, 48);
                    arrayList4.add(new ah0(str7, model2, false));
                    i96 = i99;
                    obj5 = obj8;
                    i5 = 2;
                }
                return i2b.a.q(model, arrayList4);
            case 7:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(null, "banner");
                new ListSubheaderDelegate.Model("REV_POINTS_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.common.api.R$string.travel_common_rev_points_banner_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                throw null;
            case 8:
                List travelBookingList = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(travelBookingList, "bookings");
                List list5 = travelBookingList;
                if (list5.isEmpty()) {
                    return f0.f322471a;
                }
                List listC = u.c(new ListSubheaderDelegate.Model("UPCOMING_BOOKINGS_SUB_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.common.api.R$string.travel_common_upcoming_bookings_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.common.api.R$string.travel_common_upcoming_bookings_button_see_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(0 == true ? 1 : 0, 0 == true ? 1 : 0, z, i2), false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57258));
                Intrinsics.checkNotNullParameter(travelBookingList, "travelBookingList");
                if (list5.isEmpty()) {
                    iterableC = f0.f322471a;
                } else {
                    List list6 = travelBookingList;
                    ArrayList arrayList5 = new ArrayList(w.t(list6, 10));
                    Iterator it9 = list6.iterator();
                    while (it9.hasNext()) {
                        arrayList5.add(dyf.c.a((hxf.a) it9.next()));
                    }
                    dyf.b.Companion.getClass();
                    iterableC = u.c(new hg("BOOKING_LIST_ITEM_ID", arrayList5, 1, new y4(dyf.a.f121100b), null, null, false, false, null, null, 0, 0, 0, 0, 32752));
                }
                return d0.E0(iterableC, listC);
            case 9:
                List templates = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(templates, "templates");
                List<InvoiceTemplate> list7 = templates;
                ArrayList arrayList6 = new ArrayList(w.t(list7, 10));
                for (InvoiceTemplate invoiceTemplate : list7) {
                    arrayList6.add(new RowDelegate.Model(invoiceTemplate.f86397a, new RowDelegate.Model.MainImage.Image40(new UserAvatarImage(new UserNamePlaceholder.Default(invoiceTemplate.f86399c, 0), null, null, 6), null, null, false, null, false, 62), new TextClause(invoiceTemplate.f86399c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, invoiceTemplate, null, 0, 0, 0, 0, 532676600));
                }
                yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
                return arrayList6;
            case 10:
                List content6 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content6, "content");
                if (content6.isEmpty()) {
                    return dzd.h.a();
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it10 = content6.iterator();
                while (it10.hasNext()) {
                    int iIntValue = ((Number) it10.next()).intValue();
                    RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), 0 == true ? 1 : 0, 0 == true ? 1 : 0, i3);
                    a0.x(yp0.b.g(v.k(new RowDelegate.Model(a0.d.n("SUMMARISED_ANNUAL_REPORT_PREFIX_", iIntValue), image24, new TextLocalisedClause(com.revolut.feature.statements.R$string.statements_group_bank_id_screen_item_summarised_report_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, Integer.valueOf(iIntValue), null, 0, 0, 0, 0, 532676600), new RowDelegate.Model(a0.d.n("DETAILED_ANNUAL_REPORT_PREFIX_", iIntValue), image24, new TextLocalisedClause(com.revolut.feature.statements.R$string.statements_group_bank_id_screen_item_detailed_report_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, Integer.valueOf(iIntValue), null, 0, 0, 0, 0, 532676600)), new ListSubheaderDelegate.Model(a0.d.n("ANNUAL_REPORT_YEAR_HEADER_", iIntValue), (Image) null, (Clause) new TextClause(String.valueOf(iIntValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList7);
                }
                return arrayList7;
            case 11:
                List extensionItems = (List) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(extensionItems, "extensionItems");
                return extensionItems;
            case 12:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj3).booleanValue();
                if (zBooleanValue) {
                    Optional optionalOf = Optional.of(new t68.c(qf1.f.JUNIOR_ACCOUNT.getId(), f0.f322471a, null, null));
                    Intrinsics.h(optionalOf);
                    return optionalOf;
                }
                Optional optionalEmpty = Optional.empty();
                Intrinsics.h(optionalEmpty);
                return optionalEmpty;
            case 13:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ((Boolean) obj3).getClass();
                return e8d.a.a(zBooleanValue2 ? new s0(new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_need_more_help_action_v2_chat, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_chat, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), 10) : new s0(new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_need_more_help_action_chat, null, null, 14), (ResourceImage) null, 14));
            case 14:
                List actions = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(actions, "actions");
                if (actions.isEmpty()) {
                    return f0.f322471a;
                }
                List list8 = actions;
                ArrayList arrayList8 = new ArrayList(w.t(list8, 10));
                Iterator it11 = list8.iterator();
                while (it11.hasNext()) {
                    arrayList8.add(p9d.f.a("TRANSACTION_ACTION_LIGHT_ITEM_ID", (FaqNodeBase) it11.next()));
                }
                return yp0.b.g(arrayList8, new ListSubheaderDelegate.Model("ACTIONS_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_actions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124);
            case 15:
                File content7 = (File) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content7, "content");
                String absolutePath = content7.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                return u.c(new ga("PDF_PREVIEW_ID", new ha(absolutePath)));
            case 16:
                String content8 = (String) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content8, "content");
                return u.c(new kj("EMAIL_PREVIEW_ID", new lj(content8, "utf-8"), null, Constants.TAG_FC_SPEED_MODE));
            case 17:
                List brokersList = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(brokersList, "brokersList");
                List list9 = brokersList;
                ArrayList arrayList9 = new ArrayList(w.t(list9, 10));
                int i101 = 0;
                for (Object obj9 : list9) {
                    int i102 = i101 + 1;
                    if (i101 < 0) {
                        v.s();
                        throw null;
                    }
                    TransferBroker transferBroker = (TransferBroker) obj9;
                    arrayList9.add(new RowDelegate.Model(a0.d.n("BROKER_LIST_ID_", i101), new RowDelegate.Model.MainImage.Image40(new UrlImage(transferBroker.f91501b, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), null, null, false, null, false, 62), new TextClause(transferBroker.f91500a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, new eaf.e(transferBroker), null, 0, 0, 0, 0, 532674552));
                    i101 = i102;
                }
                yp0.b.k(arrayList9, 0, 0, 0, 0, 31);
                return arrayList9;
            case 18:
                return a(obj2, obj3, obj4);
            case 19:
                List dividends = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(dividends, "dividends");
                dj0.d.Companion.getClass();
                dj0.d dVar4 = dj0.d.e;
                dj0.d dVarO = dVar4;
                for (Object obj10 : dividends) {
                    int i103 = i22 + 1;
                    if (i22 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO = i22 == 0 ? ((mwg.g) obj10).d : pyd.c.O(dVarO, ((mwg.g) obj10).d);
                    i22 = i103;
                }
                CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("FUND_INVESTMENT_DETAILS_DIVIDEND_EARNINGS", new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_investment_details_dividend_earnings, null, null, 14), new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, ScaleMode.TradingPrecise.f51443a, false, false, 5), null, o9.SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
                if (dVarO.f(dj0.d.e)) {
                    return model3;
                }
                return null;
            case 20:
                hdh.e actions2 = (hdh.e) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(actions2, "actions");
                List list10 = actions2.f151437a;
                ArrayList arrayList10 = new ArrayList();
                for (Object obj11 : list10) {
                    if (obj11 instanceof hdh.c) {
                        arrayList10.add(obj11);
                    }
                }
                hdh.c cVar = (hdh.c) d0.d0(arrayList10);
                if (cVar == null) {
                    return null;
                }
                boolean z3 = cVar.f151435b;
                boolean z4 = cVar.f151436c;
                if (z3 || z4) {
                    return (z3 || !z4) ? (!z3 || z4) ? new aw0.g(com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.c.a(), com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.c.b(LargeActionButton.ButtonStyle.f58726b), (Clause) null, (aw0.f) null, 25) : new aw0.e(false, null, null, com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.c.a(), null, null, 55) : new aw0.e(false, null, null, com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.c.b(LargeActionButton.ButtonStyle.f58725a), null, null, 55);
                }
                return null;
            case 21:
                List cardOtpDataList = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(cardOtpDataList, "cardOtpDataList");
                List list11 = cardOtpDataList;
                ArrayList arrayList11 = new ArrayList(w.t(list11, 10));
                Iterator it12 = list11.iterator();
                while (it12.hasNext()) {
                    arrayList11.add(((j) it12.next()).f125693b.e);
                }
                Iterator it13 = arrayList11.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next = it13.next();
                        if (((String) next) != null) {
                        }
                    } else {
                        next = null;
                    }
                }
                String str9 = (String) next;
                return str9 != null ? new TextLocalisedClause(com.revolut.feature.add_card_to_google_pay_shared.impl.R$string.x_pay_otp_verification_title_with_requestor_name, u.c(str9), null, 12) : new TextLocalisedClause(com.revolut.feature.add_card_to_google_pay_shared.impl.R$string.x_pay_otp_verification_title, null, null, 14);
            case 22:
                return b(obj2, obj3, obj4);
            case 23:
                List content9 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content9, "content");
                od0.h hVar = od0.i.Companion;
                Iterator it14 = content9.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        Object next3 = it14.next();
                        if (((CheckoutOrder) next3).e != null) {
                            obj5 = next3;
                        }
                    }
                }
                hVar.getClass();
                return od0.h.a(obj5);
            case 24:
                g1 layout = (g1) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(layout, "layout");
                PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions = layout.k;
                if (plansDashboardLayout$PlanPageLayout$BillingOptions == null) {
                    return null;
                }
                ArrayList arrayList12 = plansDashboardLayout$PlanPageLayout$BillingOptions.d;
                Iterator it15 = arrayList12.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next2 = it15.next();
                        if (((PlansDashboardLayout$PlanPageLayout$BillingOptionItem) next2).f102750g) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) next2;
                if (plansDashboardLayout$PlanPageLayout$BillingOptionItem == null && (plansDashboardLayout$PlanPageLayout$BillingOptionItem = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) d0.d0(arrayList12)) == null) {
                    return null;
                }
                return com.revolut.retail.feature.pricing_plans.ui.impl.footer.e.a(layout.f143718a, plansDashboardLayout$PlanPageLayout$BillingOptionItem.e);
            case 25:
                g1 layout2 = (g1) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(layout2, "layout");
                x0 x0Var = layout2.f143723j;
                PlansDashboardLayout$Button plansDashboardLayout$Button = x0Var.f143797b;
                if (plansDashboardLayout$Button == null) {
                    plansDashboardLayout$Button = x0Var.f143796a;
                }
                if (plansDashboardLayout$Button == null || (str2 = plansDashboardLayout$Button.f102734c) == null) {
                    return null;
                }
                return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 26:
                hha.d pricingPlan = (hha.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                return dok.g.d(pricingPlan, null);
            case 27:
                return c(obj2, obj3, obj4);
            case 28:
                return d(obj2, obj3, obj4);
            default:
                JuniorBankingProfile juniorProfile = (JuniorBankingProfile) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
                ListSubheaderDelegate.Model model4 = new ListSubheaderDelegate.Model("LIST_ID_SUBHEADER_OPEN_TASKS", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_section_open_title, u.c(0), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                FullScreenStateDelegate.Model model5 = new FullScreenStateDelegate.Model("LIST_ID_EMPTY_STATE", new TextLocalisedGenderClause(juniorProfile.d, com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_empty_state_title, u.c(new TextClause(juniorProfile.f77099b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126))), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D069", null, null, null, 30)), null, new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_empty_state_action, null, null, 14), false, null, null, false, 0, 0, 32724);
                yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                return v.k(model4, model5);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f116475a = i;
    }
}
