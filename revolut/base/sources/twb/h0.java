package twb;

import android.os.Parcelable;
import aw0.o9;
import aw0.u0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductTermsAndConditions;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.ck0;
import ip0.pk;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.s5;
import mx0.u5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 implements cli.n {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final svb.a f274981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f274982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uwb.i f274983c;

    public h0(svb.a revPointsGiftcardsFeatureInteractor, uwb.c giftCardHowItWorksMapper, uwb.d selectableVoucherProductsMapper, l80.e dateProvider, gte.a featureToggleInteractor, uwb.i voucherBarcodeCardImageFactory) {
        Intrinsics.checkNotNullParameter(revPointsGiftcardsFeatureInteractor, "revPointsGiftcardsFeatureInteractor");
        Intrinsics.checkNotNullParameter(giftCardHowItWorksMapper, "giftCardHowItWorksMapper");
        Intrinsics.checkNotNullParameter(selectableVoucherProductsMapper, "selectableVoucherProductsMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(voucherBarcodeCardImageFactory, "voucherBarcodeCardImageFactory");
        this.f274981a = revPointsGiftcardsFeatureInteractor;
        this.f274982b = featureToggleInteractor;
        this.f274983c = voucherBarcodeCardImageFactory;
    }

    public static CellDetailsActionDelegate.Model a(String str) {
        return new CellDetailsActionDelegate.Model("SECTION_COPY_CODE_CELL_DETAILS_ID", new TextLocalisedClause(R$string.gift_cards_redeem_code_cell_details, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(g(str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false, u0.LARGE, str, 0, 0, 32096);
    }

    public static List d(String str, dj0.d dVar, dj0.d dVar2, BitmapImage bitmapImage) {
        if (str != null) {
            TextLocalisedClause textLocalisedClause = null;
            MoneyClause moneyClause = dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null;
            if (dVar2 != null && dVar2.f115082a > 0) {
                textLocalisedClause = new TextLocalisedClause(R$string.gift_cards_details_card_available_amount, zhm.u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
            }
            List listC = zhm.u.c(new pk(bitmapImage == null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, true, false, 393214) : bitmapImage, bitmapImage == null, moneyClause, textLocalisedClause));
            if (listC != null) {
                return listC;
            }
        }
        return zhm.f0.f322471a;
    }

    public static CellDetailsActionDelegate.Model e(String str) {
        return new CellDetailsActionDelegate.Model("SECTION_COPY_PIN_CELL_DETAILS_ID", new TextLocalisedClause(R$string.gift_cards_redeem_pin_cell_details, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(g(str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false, u0.LARGE, str, 0, 0, 32096);
    }

    public static TextDelegate.Model f(tvb.e eVar, tvb.c cVar, VoucherProductTermsAndConditions voucherProductTermsAndConditions, String str) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.gift_cards_details_terms_and_conditions_key, null, new Click(28, (Integer) null, (Object) new Pair(voucherProductTermsAndConditions, str), "SECTION_TERMS_CLICKABLE_TEXT_ID", false), 10);
        int i = g0.f274980b[cVar.ordinal()];
        if (i == 1) {
            int i2 = g0.f274979a[eVar.ordinal()];
            if (i2 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.gift_cards_terms_and_conditions_internal_au_nz_label, zhm.u.c(textLocalisedClause2), null, 12);
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = null;
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.gift_cards_terms_and_conditions_epay_au_nz_label, zhm.u.c(textLocalisedClause2), null, 12);
            }
        } else if (i == 2) {
            int i3 = g0.f274979a[eVar.ordinal()];
            if (i3 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.gift_cards_terms_and_conditions_details_screen_internal_israel_label, zhm.u.c(textLocalisedClause2), null, 12);
            } else if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = null;
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.gift_cards_terms_and_conditions_details_screen_epay_israel_label, zhm.u.c(textLocalisedClause2), null, 12);
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = g0.f274979a[eVar.ordinal()];
            if (i5 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.gift_cards_details_terms_and_conditions_internal_global_label, zhm.u.c(textLocalisedClause2), null, 12);
            } else if (i5 != 2) {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = null;
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.gift_cards_details_terms_and_conditions_label, zhm.u.c(textLocalisedClause2), null, 12);
            }
        }
        if (textLocalisedClause == null) {
            return null;
        }
        CompositeClause compositeClause = new CompositeClause(zhm.u.c(textLocalisedClause), null, null, null, 14);
        int i6 = R$attr.uikit_dp16;
        TextDelegate.Model model = new TextDelegate.Model("SECTION_TERMS_TEXT_ID", compositeClause, false, new ck0(yj0.CENTER_HORIZONTAL), null, null, i6, i6, i6, i6, 112);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return model;
    }

    public static String g(String str) {
        return str.length() > 22 ? a0.d.r(kotlin.text.f0.U0(21, str), "…") : str;
    }

    public final List b(tvb.e source, String str, String instructionsText, String brandName, boolean z, boolean z3) {
        List listC;
        List listO;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(instructionsText, "instructionsText");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        int i = uwb.b.f283602a[source.ordinal()];
        if (i == 1) {
            PlainTextDelegate.Model model = new PlainTextDelegate.Model("SECTION_HOW_IT_WORKS_TEXT_ID", (Clause) null, (Clause) new TextClause(instructionsText, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z3 ? new u5(2, new TextLocalisedClause(R.string.common_show_less, null, null, 14)) : new s5(2, new TextLocalisedClause(R.string.common_show_more, null, null, 14)), (UrlImage) null, false, (pa) null, (Object) Boolean.valueOf(z3), (AnalyticsContext) null, 0, 0, 0, 0, 64462);
            yp0.b.l(model, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, null, false, 60);
            listC = zhm.u.c(model);
        } else if (i != 2) {
            listC = zhm.f0.f322471a;
        } else {
            List<uwb.a> listK = zhm.v.k(new uwb.a(zhm.u.c(brandName), "SECTION_HOW_IT_WORKS_FIRST_ITEM_ID", R$string.gift_cards_details_how_it_works_no_code_needed_title, R$string.gift_cards_details_how_it_works_no_code_needed_subtitle, R$drawable.uikit_icn_24_lightning), new uwb.a("SECTION_HOW_IT_WORKS_SECOND_ITEM_ID", R$string.gift_cards_details_how_it_works_applied_after_title, R$string.gift_cards_details_how_it_works_applied_after_subtitle, R$drawable.uikit_icn_24_all_time), new uwb.a("SECTION_HOW_IT_WORKS_THIRD_ITEM_ID", R$string.gift_cards_details_how_it_works_personal_use_title, R$string.gift_cards_details_how_it_works_personal_use_subtitle, R$drawable.uikit_icn_24_user));
            ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
            for (uwb.a aVar : listK) {
                String str2 = aVar.f283599a;
                int i2 = aVar.f283600b;
                int i3 = aVar.f283601c;
                int i5 = aVar.d;
                List list = aVar.e;
                arrayList.add(new RowDelegate.Model(str2, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i5, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(i2, null, null, 14), of.SMALL, 0, !list.isEmpty() ? new TextLocalisedClause(i3, list, null, 12) : new TextLocalisedClause(i3, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868816));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            listC = arrayList;
        }
        if (listC.isEmpty()) {
            listO = zhm.f0.f322471a;
        } else {
            ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("SECTION_HOW_IT_WORKS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.gift_cards_details_how_it_works_subheader_label, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338);
            int i6 = R$attr.uikit_dp0;
            yp0.b.p(model2, i6, i6, i6, i6);
            listO = i2b.a.o(zhm.u.c(model2), listC);
        }
        ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("SECTION_DETAILS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.gift_cards_details_details_subheader_label, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338);
        int i21 = R$attr.uikit_dp0;
        yp0.b.p(model3, i21, i21, i21, i21);
        PlainTextDelegate.Model model4 = new PlainTextDelegate.Model("SECTION_DETAILS_TEXT_ID", (Clause) null, (Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z ? new u5(2, new TextLocalisedClause(R.string.common_show_less, null, null, 14)) : new s5(2, new TextLocalisedClause(R.string.common_show_more, null, null, 14)), (UrlImage) null, false, (pa) null, (Object) Boolean.valueOf(z), (AnalyticsContext) null, 0, 0, 0, 0, 64462);
        yp0.b.l(model4, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, null, false, 60);
        return i2b.a.o(listO, zhm.v.k(model3, model4));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f274986a, new tpl.o(this, domainState), new tp8.l(this, domainState), new tvh.e(this, domainState, 2));
    }
}
