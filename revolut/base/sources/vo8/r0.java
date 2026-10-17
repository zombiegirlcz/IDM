package vo8;

import android.os.Parcelable;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_settings.api.JuniorSettingsApi$Toggles$BlankCardDeliveryConsent;
import com.revolut.feature.junior_settings.api.JuniorSettingsApi$Toggles$PaymentsPrivacySettingsToParent;
import com.revolut.feature.junior_settings.impl.R$string;
import com.revolut.retail.feature.junior_app_access.api.JuniorAppAccessUiApi$Toggles$JuniorAppAccess;
import ip0.ak0;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements cli.n {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f290912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f290913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f290914c;
    public final Lazy d;

    public r0(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f290912a = featureToggleInteractor;
        final int i = 0;
        this.f290913b = yhm.j.b(new Function0(this) { // from class: vo8.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f290899b;

            {
                this.f290899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f290899b.f290912a).c(JuniorSettingsApi$Toggles$PaymentsPrivacySettingsToParent.f77252c);
                        break;
                    case 1:
                        zC = ((jte.d) this.f290899b.f290912a).c(JuniorSettingsApi$Toggles$BlankCardDeliveryConsent.f77250c);
                        break;
                    default:
                        zC = ((jte.d) this.f290899b.f290912a).c(JuniorAppAccessUiApi$Toggles$JuniorAppAccess.f101741c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.f290914c = yhm.j.b(new Function0(this) { // from class: vo8.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f290899b;

            {
                this.f290899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f290899b.f290912a).c(JuniorSettingsApi$Toggles$PaymentsPrivacySettingsToParent.f77252c);
                        break;
                    case 1:
                        zC = ((jte.d) this.f290899b.f290912a).c(JuniorSettingsApi$Toggles$BlankCardDeliveryConsent.f77250c);
                        break;
                    default:
                        zC = ((jte.d) this.f290899b.f290912a).c(JuniorAppAccessUiApi$Toggles$JuniorAppAccess.f101741c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i3 = 2;
        this.d = yhm.j.b(new Function0(this) { // from class: vo8.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f290899b;

            {
                this.f290899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i3) {
                    case 0:
                        zC = ((jte.d) this.f290899b.f290912a).c(JuniorSettingsApi$Toggles$PaymentsPrivacySettingsToParent.f77252c);
                        break;
                    case 1:
                        zC = ((jte.d) this.f290899b.f290912a).c(JuniorSettingsApi$Toggles$BlankCardDeliveryConsent.f77250c);
                        break;
                    default:
                        zC = ((jte.d) this.f290899b.f290912a).c(JuniorAppAccessUiApi$Toggles$JuniorAppAccess.f101741c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }

    public static List b(l lVar) {
        o oVar = lVar != null ? lVar.f290891b : null;
        if (!(oVar instanceof n)) {
            if ((oVar instanceof m) || oVar == null) {
                return zhm.f0.f322471a;
            }
            throw new NoWhenBranchMatchedException();
        }
        n nVar = (n) oVar;
        ListCellDelegate.Model model = new ListCellDelegate.Model("ID_CONSENT_DISCLAIMER", new j8(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246)), null, new TextLocalisedClause(R$string.rev_u18_account_settings_security_and_privacy_screen_consents_disclaimer, zhm.v.k(new TimeClause(oi0.d.R(nVar.f290895a), new TimeClause.Format.Pretty(com.revolut.core.ui_kit.models.q0.ONLY_DATE), null, null, 12), nVar.f290896b), null, 12), false, null, null, 0, 0, 0, 0, 4068);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(model);
    }

    public static RowDelegate.Model h(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return new RowDelegate.Model("ID_REFERRAL_TOGGLE", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_invite_emoji, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.rev_u18_account_settings_referral_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.rev_u18_youth_account_settings_referral_subtitle, null, null, 14), null, null, 0, new vf(bool.booleanValue(), true), false, null, false, null, null, null, null, null, null, bool, null, 0, 0, 0, 0, 532673496);
    }

    public static RowDelegate.Model i(p pVar, l lVar) {
        xc8.c cVar;
        String str;
        Map map;
        if (pVar.f290903g) {
            cVar = (lVar == null || (map = lVar.f290890a) == null) ? null : (xc8.c) map.get(v6d.a.FIRST_PARTY_NFC_PAYMENTS);
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_u18_account_settings_permissions_and_privacy_screen_first_party_wallet_title, null, null, 14);
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pVar.f290900a.getContent();
        return m("ID_REVOLUT_WALLET_CONSENT", cVar, textLocalisedClause, (juniorBankingProfile == null || (str = juniorBankingProfile.f77099b) == null) ? null : new TextLocalisedClause(R$string.rev_u18_account_settings_permissions_and_privacy_screen_first_party_wallet_subtitle, zhm.u.c(str), null, 12), R$drawable.uikit_icn_24_wallet, false);
    }

    public static List j(p pVar, l lVar) {
        Map map;
        eb8.f fVar;
        eb8.e eVar;
        od0.i iVar = (od0.i) pVar.i.getContent();
        boolean z = ((iVar == null || (fVar = (eb8.f) iVar.f224257a) == null || (eVar = fVar.f124304c) == null) ? null : eVar.f124301c) != null;
        xc8.c cVar = (lVar == null || (map = lVar.f290890a) == null) ? null : (xc8.c) map.get(v6d.a.PAYMENT_LINKS);
        if (!z && (cVar == null || !pVar.f)) {
            return zhm.f0.f322471a;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_u18_account_settings_security_and_privacy_screen_terms_and_condition_label, zhm.u.c(new TextLocalisedClause(R$string.rev_u18_account_settings_security_and_privacy_screen_terms_and_condition, null, new Click(30, (Integer) null, (Object) null, "ID_TERMS_AND_CONDITIONS", false), 10)), null, 12);
        ak0 ak0Var = new ak0(null, null, 3);
        int i = R$attr.uikit_dp8;
        return zhm.u.c(new TextDelegate.Model("ID_TERMS_AND_CONDITIONS_DISCLAIMER", textLocalisedClause, false, ak0Var, null, null, i, i, 0, 0, 1652));
    }

    public static RowDelegate.Model m(String str, xc8.c cVar, TextLocalisedClause textLocalisedClause, Clause clause, int i, boolean z) {
        boolean z3 = false;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
        if (!z && cVar.b()) {
            z3 = true;
        }
        return new RowDelegate.Model(str, image24, textLocalisedClause, null, 0, clause, null, null, 0, new vf(z3, true), false, null, false, z ? RowDelegate.Model.b.a.f53266a : RowDelegate.Model.b.c.f53268a, null, null, null, null, null, cVar, null, 0, 0, 0, 0, 532657112);
    }

    public static List n(RowDelegate.Model model, String str, int i) {
        return yp0.b.i(model, new ListSubheaderDelegate.Model("SUBHEADER_".concat(str), (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG);
    }

    public final RowDelegate.Model a(p pVar, l lVar) {
        Map map;
        xc8.c cVar;
        String str;
        if (!((Boolean) this.f290914c.getValue()).booleanValue() || lVar == null || (map = lVar.f290890a) == null || (cVar = (xc8.c) map.get(v6d.a.BLANK_CARD_DELIVERY)) == null) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_u18_account_settings_security_and_privacy_blank_card_delivery_item_title, null, null, 14);
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pVar.f290900a.getContent();
        return m("ID_BLANK_CARD_DELIVERY_CONSENT", cVar, textLocalisedClause, (juniorBankingProfile == null || (str = juniorBankingProfile.f77099b) == null) ? null : new TextLocalisedClause(R$string.rev_u18_account_settings_security_and_privacy_blank_card_delivery_item_subtitle, zhm.u.c(str), null, 12), R$drawable.uikit_icn_24_card, false);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        p domainState = (p) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f290901b;
        Data data2 = domainState.d;
        Data dataT = t1.t(data, data2);
        return new r(new TextLocalisedClause(g() ? R$string.rev_u18_account_settings_permissions_and_privacy_screen_title : R$string.rev_u18_account_settings_security_and_privacy_screen_title, null, null, 14), (List) iii.c.f(new Data(((data.getContent() != null) || (((l) data2.getContent()) != null)) ? new Pair(data.getContent(), data2.getContent()) : null, dataT.getError(), dataT.getLoading()), new vn8.a(this, 9), new t(3), new vh2.o(this, domainState, 5)));
    }

    public final RowDelegate.Model d(p pVar, l lVar) {
        xc8.c cVar;
        TextLocalisedClause textLocalisedClause;
        String str;
        Map map = lVar != null ? lVar.f290890a : null;
        if (map == null || (cVar = (xc8.c) map.get(v6d.a.FIRST_PARTY_MARKETING)) == null) {
            return null;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(g() ? R$string.rev_u18_account_settings_permissions_and_privacy_screen_revolut_promotions_title : R$string.rev_u18_account_settings_security_and_privacy_screen_personalised_pushes_title, null, null, 14);
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pVar.f290900a.getContent();
        if (juniorBankingProfile == null || (str = juniorBankingProfile.f77099b) == null) {
            textLocalisedClause = null;
        } else {
            textLocalisedClause = new TextLocalisedClause(g() ? R$string.rev_u18_account_settings_permissions_and_privacy_screen_revolut_promotions_subtitle : R$string.rev_u18_account_settings_security_and_privacy_screen_personalised_pushes_subtitle_with_name, zhm.u.c(str), null, 12);
        }
        return m("ID_FIRST_PARTY_CONSENT", cVar, textLocalisedClause2, textLocalisedClause, R$drawable.uikit_icn_24_push, false);
    }

    public final qv0.l e(Data data, Data data2) {
        if (((Boolean) this.d.getValue()).booleanValue()) {
            return null;
        }
        return (qv0.l) iii.c.f(t1.t(data, data2), new vn8.a(11), new t(2), new uw2.n(22));
    }

    public final RowDelegate.Model f(p pVar, l lVar) {
        TextLocalisedClause textLocalisedClause;
        Map map;
        xc8.c cVar;
        xc8.c cVar2 = (lVar == null || (map = lVar.f290890a) == null || (cVar = (xc8.c) map.get(v6d.a.PAYMENT_LINKS)) == null || !pVar.f) ? null : cVar;
        if (cVar2 == null) {
            return null;
        }
        in8.c cVar3 = (in8.c) pVar.f290902c.getContent();
        boolean z = (!pVar.f290904h || cVar3 == null || cVar3.f162683b) ? false : true;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.rev_u18_account_settings_security_and_privacy_screen_payment_links_title, null, null, 14);
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pVar.f290900a.getContent();
        if (juniorBankingProfile != null) {
            textLocalisedClause = new TextLocalisedClause(g() ? z ? R$string.rev_u18_account_settings_permissions_and_privacy_screen_payment_links_subtitle_blocked : R$string.rev_u18_account_settings_permissions_and_privacy_screen_payment_links_subtitle : R$string.rev_u18_account_settings_security_and_privacy_screen_payment_links_subtitle_with_name, zhm.u.c(juniorBankingProfile.f77099b), null, 12);
        } else {
            textLocalisedClause = null;
        }
        return m("ID_PAYMENT_LINKS_CONSENT", cVar2, textLocalisedClause2, textLocalisedClause, R$drawable.uikit_icn_24_link, g() ? z : false);
    }

    public final boolean g() {
        return ((Boolean) this.f290913b.getValue()).booleanValue();
    }

    public final RowDelegate.Model k(p pVar, l lVar) {
        xc8.c cVar;
        Map map = lVar != null ? lVar.f290890a : null;
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pVar.f290900a.getContent();
        String str = juniorBankingProfile != null ? juniorBankingProfile.f77099b : null;
        if (map == null || (cVar = (xc8.c) map.get(v6d.a.THIRD_PARTY_MARKETING)) == null) {
            return null;
        }
        return m("ID_THIRD_PARTY_CONSENT", cVar, new TextLocalisedClause(g() ? R$string.rev_u18_account_settings_permissions_and_privacy_screen_third_party_promotions_title : R$string.rev_u18_account_settings_security_and_privacy_screen_third_party_promotions_title, null, null, 14), g() ? new TextLocalisedClause(R$string.rev_u18_account_settings_permissions_and_privacy_screen_third_party_promotions_subtitle, null, null, 14) : str != null ? new TextLocalisedClause(R$string.rev_u18_account_settings_security_and_privacy_screen_third_party_promotions_subtitle_with_name, zhm.u.c(str), null, 12) : null, R$drawable.uikit_icn_24_eye_show, false);
    }

    public final qv0.l l(p pVar) {
        return (qv0.l) iii.c.f(pVar.i, new vn8.a(10), new t(4), new vjh.c((JuniorBankingProfile) pVar.f290900a.getContent(), this));
    }
}
