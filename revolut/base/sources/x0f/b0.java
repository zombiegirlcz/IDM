package x0f;

import android.os.Parcelable;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.domain.models.externalcards.CrossProfileStatus;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import e0f.f1;
import ip0.y10;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import org.jetbrains.annotations.NotNull;
import wp4.j0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 implements cli.n {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalCardDetailsScreenContract$InputData f301580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3i.b f301581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f301582c;
    public final Object d;

    public b0(n8b.a countryInteractor, ExternalCardDetailsScreenContract$InputData inputData, n3i.b cardsMapper, qxe.a cardTypeExtractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsMapper, "cardsMapper");
        Intrinsics.checkNotNullParameter(cardTypeExtractor, "cardTypeExtractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f301580a = inputData;
        this.f301581b = cardsMapper;
        this.f301582c = featureToggleInteractor;
        this.d = te0.w.y0(new f1(countryInteractor, 2));
    }

    public static CellDetailsDelegate.Model a(dj0.d dVar, boolean z) {
        Custom custom = z ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254) : null;
        return new CellDetailsDelegate.Model("ITEM_AUTO_TOPUP_ACCOUNT", new TextLocalisedClause(R.string.bank_details_revolut_account_title, null, custom, 10), new TextClause(dVar.f115083b.f306286a, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model b(dj0.d dVar, boolean z) {
        Custom custom = z ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254) : null;
        return new CellDetailsDelegate.Model("ITEM_AUTO_TOPUP_AMOUNT", new TextLocalisedClause(R.string.bank_details_autotopup_with_title, null, custom, 10), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static ListSubheaderDelegate.Model d(boolean z) {
        return new ListSubheaderDelegate.Model("ITEM_AUTO_TOPUP_SUBTITLE", (Image) null, (Clause) (z ? new TextLocalisedClause(R$string.topup_card_details_item_autotopup_disabled, null, null, 14) : new TextLocalisedClause(R.string.bank_details_autotopup_header, null, null, 14)), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static CellDetailsDelegate.Model e(dj0.d dVar, boolean z) {
        Custom custom = z ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254) : null;
        return new CellDetailsDelegate.Model("ITEM_AUTO_TOPUP_THRESHOLD", new TextLocalisedClause(R.string.bank_details_balance_below_title, null, custom, 10), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model f(String str) {
        return new CellDetailsDelegate.Model("ITEM_BANK_NAME", new TextLocalisedClause(R.string.bank_details_card_title, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static ListSubheaderDelegate.Model g() {
        return new ListSubheaderDelegate.Model("ITEM_CARD_DETAILS_SUBTITLE", (Image) null, (Clause) new TextLocalisedClause(R.string.bank_details_card_details_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static CellDetailsDelegate.Model h(String str) {
        return new CellDetailsDelegate.Model("ITEM_CARD_TYPE", new TextLocalisedClause(R.string.bank_details_type_title, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model j(String str, boolean z) {
        return new CellDetailsDelegate.Model("ITEM_EXPIRE_DATE", new TextLocalisedClause(R.string.bank_details_expire_date_title, null, null, 14), new TextClause(str, (Style) (z ? new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254) : null), (Integer) null, false, (o9) null, (List) null, 124), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static koi.j k(t61.f fVar, CrossProfileStatus crossProfileStatus) {
        boolean z = crossProfileStatus == CrossProfileStatus.RESTRICTED;
        sa saVar = new sa("ITEM_BLOCKED_RESTRICTIONS", (Clause) new TextClause(fVar.f268135b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new HtmlClause(0, 30, (Integer) null, (Object) null, fVar.f268136c), z ? zhm.u.c(new ActionsView.Item("ITEM_SWITCH_PROFILE_BUTTON", null, false, null, null, new TextLocalisedClause(R$string.topup_card_details_cross_profile_restricted_switch_profile, null, null, 14), null, null, null, null, false, null, null, null, null, 32670)) : f0.f322471a, false, (Image) (z ? new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246) : new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246)), (y10) null, (Object) null, 4048);
        yp0.b.l(saVar, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
        return saVar;
    }

    public static CellDetailsActionDelegate.Model l(String str, boolean z, boolean z3, boolean z4) {
        if (str == null) {
            if (!z3) {
                return new CellDetailsActionDelegate.Model("ITEM_UNAVAILABLE_STATUS", new TextLocalisedClause(R.string.bank_details_card_details_status, null, null, 14), 0, null, new TextLocalisedClause(R$string.topup_card_details_status_unavailable, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), false, false, null, null, 0, 0, 32736);
            }
            if (z4 && z) {
                return new CellDetailsActionDelegate.Model("ITEM_VERIFICATION_STATUS", new TextLocalisedClause(R.string.bank_details_card_details_status, null, null, 14), 0, null, new TextLocalisedClause(R.string.bank_details_card_details_status_verified, null, null, 14), false, false, null, null, 0, 0, 32736);
            }
            if (z4) {
                return new CellDetailsActionDelegate.Model("ITEM_VERIFICATION_STATUS_UNCONFIRMED", new TextLocalisedClause(R.string.bank_details_card_details_status, null, null, 14), 0, null, new TextLocalisedClause(R.string.bank_details_card_details_status_unverified, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), false, false, null, null, 0, 0, 32736);
            }
        }
        return null;
    }

    public static CellDetailsDelegate.Model m(aue.a aVar) {
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ITEM_UNVERIFIED_CARDHOLDER_LIMIT_INDICATOR", new t0((Clause) new TextLocalisedClause(R$string.topup_card_details_limit_title_rolling_limit, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.topup_card_details_limit_remainder, zhm.v.k(new MoneyClause(aVar.f9805c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(aVar.f9804b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static ActionsView.Item n(boolean z) {
        return new ActionsView.Item("UPDATE_CARD_ACTION_ID", null, false, z ? e4.EnabledClickable : e4.DisabledNonClickable, null, new TextLocalisedClause(R$string.topup_card_details_update_expired, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_exclamation_mark, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32662);
    }

    public static ActionsView.Item o(boolean z) {
        return new ActionsView.Item("VERIFY_CARD_ACTION_ID", null, false, z ? e4.EnabledClickable : e4.DisabledNonClickable, null, new TextLocalisedClause(R.string.bank_details_verify_card_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_check_verification, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32662);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f301586a;
        Data data2 = domainState.f301588c;
        Throwable[] elements = {data.getError(), data2.getError()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Throwable th10 = (Throwable) d0.d0(kotlin.collections.d.L(elements));
        boolean z = data.getLoading() || data2.getLoading();
        Object content = data.getContent();
        Object content2 = data2.getContent();
        Data data3 = new Data((content == null || content2 == null) ? null : new Pair(content, content2), th10, z);
        return new r((List) iii.c.f(data3, new wyc.p(24), new wyg.s(12), new wx6.k(this, domainState, 5)), (q) iii.c.f(data3, new wyc.p(25), new wyg.s(13), new j0(this, 15)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final aim.e i(CardholderVerificationStatus cardholderVerificationStatus, aue.a aVar) {
        int i = a0.f301579a[cardholderVerificationStatus.ordinal()];
        ExternalCardDetailsScreenContract$InputData externalCardDetailsScreenContract$InputData = this.f301580a;
        switch (i) {
            case 1:
            case 2:
            case 3:
                return null;
            case 4:
                if (aVar != null) {
                    aim.e eVarB = zhm.u.b();
                    if (aVar.d.k()) {
                        if (externalCardDetailsScreenContract$InputData.d) {
                            sa saVar = new sa("ITEM_CARDHOLDER_VERIFICATION_LIMIT_EXCEEDED_WARNING", (Clause) new TextLocalisedClause(R$string.topup_card_details_limits_banner_limit_exceeded_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.topup_card_details_limits_banner_limit_exceeded_subtitle, null, null, 14), zhm.u.c(new ActionsView.Item("CARDHOLDER_VERIFICATION_VERIFY_ACTION_ID", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.topup_card_details_limits_verify_card, null, null, 14), null, null, null, null, false, null, null, null, null, 32668)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
                            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
                            eVarB.add(saVar);
                        }
                        eVarB.add(m(aVar));
                    } else {
                        eVarB.add(m(aVar));
                        if (externalCardDetailsScreenContract$InputData.d) {
                            sa saVar2 = new sa("ITEM_CARDHOLDER_VERIFICATION_UNKNOWN_WARNING", (Clause) new TextLocalisedClause(R$string.topup_card_details_limits_banner_limit_not_exceeded_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.topup_card_details_limits_banner_limit_not_exceeded_subtitle, null, null, 14), zhm.u.c(new ActionsView.Item("CARDHOLDER_VERIFICATION_VERIFY_ACTION_ID", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.topup_card_details_limits_verify_card, null, null, 14), null, null, null, null, false, null, null, null, null, 32668)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (y10) null, (Object) null, 4048);
                            yp0.b.l(saVar2, 0, 0, 0, 0, null, false, 63);
                            eVarB.add(saVar2);
                        }
                    }
                    return zhm.u.a(eVarB);
                }
                return null;
            case 5:
                if (aVar != null) {
                    aim.e eVarB2 = zhm.u.b();
                    if (externalCardDetailsScreenContract$InputData.d) {
                        sa saVar3 = new sa("ITEM_CARDHOLDER_VERIFICATION_IN_PROGRESS_WARNING", (Clause) new TextLocalisedClause(R$string.topup_card_details_limits_banner_pending_verification_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.topup_card_details_limits_banner_pending_verification_subtitle, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (y10) null, (Object) null, 4056);
                        yp0.b.l(saVar3, 0, 0, 0, 0, null, false, 63);
                        eVarB2.add(saVar3);
                    }
                    eVarB2.add(m(aVar));
                    return zhm.u.a(eVarB2);
                }
                return null;
            case 6:
                aim.e eVarB3 = zhm.u.b();
                if (externalCardDetailsScreenContract$InputData.d) {
                    sa saVar4 = new sa("ITEM_CARDHOLDER_VERIFICATION_FAILED_WARNING", (Clause) new TextLocalisedClause(R$string.topup_card_details_limits_banner_verification_failed_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.topup_card_details_limits_banner_verification_failed_subtitle, null, null, 14), zhm.u.c(new ActionsView.Item("CARDHOLDER_VERIFICATION_PROVIDE_INFO_ACTION_ID", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.topup_card_details_limits_banner_verification_failed_provide_information, null, null, 14), null, null, null, null, false, null, null, null, null, 32668)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_exclamation_mark, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
                    yp0.b.l(saVar4, 0, 0, 0, 0, null, false, 63);
                    eVarB3.add(saVar4);
                }
                return zhm.u.a(eVarB3);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
