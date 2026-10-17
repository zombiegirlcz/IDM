package qoa;

import anf.p;
import aw0.o9;
import aw0.v4;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.PlanWidgetDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.sb;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.ub;
import com.revolut.core.ui_kit.delegates.zb;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.profile.api.ProfileApi$Toggles$RevampedProfileScreen;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.pb0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import pwa.n;
import pwa.o;
import qbg.j;
import qjj.g;
import qv0.i;
import yik.h;
import yna.a;
import yna.k;
import yna.l;
import yna.m;
import yna.q;
import yna.r;
import yna.s;
import yna.t;
import yna.w;
import yna.y;
import yna.z;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f248092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f248093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aoa.e f248094c;

    public e(f planItemMapper, gte.a featureToggleInteractor, aoa.e pricingPlanCellMapper) {
        Intrinsics.checkNotNullParameter(planItemMapper, "planItemMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanCellMapper, "pricingPlanCellMapper");
        this.f248092a = planItemMapper;
        this.f248093b = featureToggleInteractor;
        this.f248094c = pricingPlanCellMapper;
    }

    public static RowDelegate.Model b(e eVar, String str, TextLocalisedClause textLocalisedClause, Clause clause, int i, RowDelegate.Model.c.a aVar, n nVar, int i2) {
        Clause clause2 = (i2 & 4) != 0 ? null : clause;
        RowDelegate.Model.c.a aVar2 = (i2 & 16) != 0 ? null : aVar;
        n nVar2 = (i2 & 32) != 0 ? null : nVar;
        eVar.getClass();
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textLocalisedClause, null, 0, clause2, null, null, 0, aVar2, false, null, false, null, null, null, null, null, null, nVar2, null, 0, 0, 0, 0, 532675544);
    }

    public static Clause d(dj0.d dVar, o oVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (oVar != o.REVPOINTS) {
            return new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 59), null, o9.NON_SENSITIVE, 4);
        }
        o9 sensitivity = o9.NON_SENSITIVE;
        nub.c cVar = nub.a.f219272a;
        nub.e format = new nub.e(0);
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        if (!Intrinsics.f(dVar.f115083b.f306286a, "PTS")) {
            return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 8);
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar.f115082a, 6);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return nub.a.d(bigDecimalValueOf, null, format, sensitivity);
    }

    public final Clause a(Data data) {
        Clause clause = (Clause) iii.c.f(data, new qnd.c(4), new g(15), new j(new qnd.c(this, 3), 9));
        return clause == null ? new TextLocalisedClause(R$string.profile_action_invite_fallback_subtitle, null, null, 14) : clause;
    }

    public final List c(a.AbstractC1757a cell) {
        TextLocalisedClause textLocalisedClause;
        tla.c cVar;
        i model;
        Clause clauseA;
        f fVar = this.f248092a;
        h hVar = fVar.f248096b;
        Intrinsics.checkNotNullParameter(cell, "cell");
        Clause clauseA2 = null;
        if (cell instanceof a.AbstractC1757a.p) {
            return u.c(b(this, "ID_REFERRAL_CODE", new TextLocalisedClause(com.revolut.feature.referrals.code.api.R$string.referrals_referral_code_invited_by_friend, null, null, 14), null, R$drawable.uikit_icn_24_invite_emoji, null, null, 52));
        }
        boolean z = cell instanceof yna.f;
        gte.a aVar = this.f248093b;
        if (z) {
            return u.c(b(this, "ID_HELP", new TextLocalisedClause(((jte.d) aVar).c(ChatApi$Toggles.SupportNewInbox.f50985c) ? R.string.common_faq : R.string.common_help, null, null, 14), null, R$drawable.uikit_icn_24_question, e(((yna.f) cell).f315335a), null, 36));
        }
        if (cell instanceof a.AbstractC1757a.C1758a) {
            return u.c(b(this, "ID_ABOUT_US", new TextLocalisedClause(R.string.settings_about, null, null, 14), null, R$drawable.uikit_icn_24_logo_revolut, null, null, 52));
        }
        if (cell instanceof a.AbstractC1757a.c) {
            return u.c(b(this, "ID_APPEARANCE", new TextLocalisedClause(R$string.profileHome_settings_section_appSettings_title, null, null, 14), null, R$drawable.uikit_icn_24_gear, null, null, 52));
        }
        if (cell instanceof yna.j) {
            w data = ((yna.j) cell).f315352a;
            if (((jte.d) aVar).c(ProfileApi$Toggles$RevampedProfileScreen.f81321c)) {
                Intrinsics.checkNotNullParameter(data, "data");
                Data data2 = data.f315379a;
                aoa.e eVar = this.f248094c;
                return (List) iii.c.f(data2, new p(eVar, 12), new an4.g(eVar), new a15.n(eVar, data, 20));
            }
            PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) data.f315379a.getContent();
            hha.d plan = pricingPlanSubscription != null ? pricingPlanSubscription.f81129a : null;
            if (plan != null) {
                Intrinsics.checkNotNullParameter(plan, "plan");
                clauseA2 = fgk.b.a(hVar, plan);
            }
            Clause clause = clauseA2;
            return clause == null ? u.c(new pb0("ID_PLAN")) : u.c(new RowDelegate.Model("ID_PLAN", new RowDelegate.Model.MainImage.Image40(f.a(plan), null, null, false, null, false, 60), clause, null, 0, fVar.b(data), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        }
        if (cell instanceof k) {
            PricingPlanSubscription pricingPlanSubscription2 = (PricingPlanSubscription) ((k) cell).f315356a.f315379a.getContent();
            hha.d plan2 = pricingPlanSubscription2 != null ? pricingPlanSubscription2.f81129a : null;
            if (plan2 == null) {
                return u.c(new pb0("ID_PLAN_CELL"));
            }
            Intrinsics.checkNotNullParameter(plan2, "plan");
            return u.c(new RowDelegate.Model("ID_PLAN_CELL", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_premium, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), fgk.b.a(hVar, plan2), null, 0, new TextLocalisedClause(R$string.profileHome_settings_section_plan_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        }
        if (cell instanceof yna.d) {
            r5b.j plan3 = ((yna.d) cell).f315325a;
            Intrinsics.checkNotNullParameter(plan3, "plan");
            return u.c(new PlanWidgetDelegate.Model("ID_COBRANDED_PLAN", new TextClause(plan3.f251573a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(plan3.f251574b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), sb.e, new ub(aoa.e.a(plan3.f251575c), zb.LEGACY), null, null, null, null, null, 14304));
        }
        if (cell instanceof yna.c) {
            r5b.j jVar = ((yna.c) cell).f315305a;
            return u.c(new RowDelegate.Model("ID_COBRANDED_PLAN", new RowDelegate.Model.MainImage.Image24(new UrlImage(jVar.d, null, null, null, 0L, null, Integer.valueOf(R$drawable.uikit_icn_24_hotel), null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507774), false, false, 6), new TextClause(jVar.f251573a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(jVar.f251574b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        }
        if (cell instanceof a.AbstractC1757a.k) {
            return u.c(b(this, "ID_LOG_OUT", new TextLocalisedClause(R.string.profile_logout_new, null, null, 14), null, R$drawable.uikit_icn_24_logout_door, null, null, 52));
        }
        if (cell instanceof a.AbstractC1757a.g) {
            return u.c(b(this, "ID_DOCUMENTS", new TextLocalisedClause(R$string.profile_documents_and_statements_title, null, null, 14), null, R$drawable.uikit_icn_24_document, null, null, 52));
        }
        if (cell instanceof yna.o) {
            return u.c(b(this, "ID_SECURITY_HUB", new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_title, null, null, 14), null, R$drawable.uikit_icn_24_secure_seal, e(((yna.o) cell).f315364a), null, 36));
        }
        if (cell instanceof a.AbstractC1757a.n) {
            return u.c(b(this, "ID_PRIVACY", new TextLocalisedClause(R.string.disclosure_privacy_title, null, null, 14), null, R$drawable.uikit_icn_24_eye_show, null, null, 52));
        }
        if (cell instanceof a.AbstractC1757a.e) {
            return u.c(b(this, "ID_BENEFICIARIES", new TextLocalisedClause(R$string.profileHome_settings_item_account_pod_nominees_title, null, null, 14), null, R$drawable.uikit_icn_24_people, null, null, 52));
        }
        if (cell instanceof a.AbstractC1757a.s) {
            return u.c(b(this, "ID_WALLET_LIMITS", new TextLocalisedClause(R$string.profileHome_settings_item_limits_title, null, null, 14), null, R$drawable.uikit_icn_24_limit, null, null, 52));
        }
        if (!(cell instanceof yna.e) && !(cell instanceof a.AbstractC1757a.h)) {
            if (cell instanceof a.AbstractC1757a.o) {
                return u.c(b(this, "PUBLIC_EXPERIMENTS_ID", new TextLocalisedClause(R$string.profile_new_features_title, null, null, 14), null, R$drawable.uikit_icn_24_lab, null, null, 52));
            }
            if (cell instanceof t) {
                List<s> list = ((t) cell).f315374a;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (s sVar : list) {
                    if (sVar instanceof q) {
                        w wVar = ((q) sVar).f315368a;
                        PricingPlanSubscription pricingPlanSubscription3 = (PricingPlanSubscription) wVar.f315379a.getContent();
                        hha.d plan4 = pricingPlanSubscription3 != null ? pricingPlanSubscription3.f81129a : null;
                        if (plan4 != null) {
                            Intrinsics.checkNotNullParameter(plan4, "plan");
                            clauseA = fgk.b.a(hVar, plan4);
                        } else {
                            clauseA = null;
                        }
                        model = clauseA != null ? new ActionCardDelegate.Model("ID_PLAN", clauseA, f.a(plan4), null, new com.revolut.core.ui_kit.delegates.f(fVar.b(wVar), com.revolut.core.ui_kit.delegates.e.CAPTION), null, null, false, 8152) : new ip0.f("ID_PLAN");
                        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    } else {
                        if (!(sVar instanceof r)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ActionCardDelegate.Model model2 = new ActionCardDelegate.Model("ID_INVITE_FRIENDS", new TextLocalisedClause(R$string.profile_action_invite, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D194", null, null, null, 30), null, new com.revolut.core.ui_kit.delegates.f(a(((r) sVar).f315370a), com.revolut.core.ui_kit.delegates.e.CAPTION), n.STANDARD, null, false, 16088);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        model = model2;
                    }
                    arrayList.add(model);
                }
                return !arrayList.isEmpty() ? u.c(new hg("ID_TILE_SCROLLER", arrayList, 2, new v4(136.0f), null, null, false, false, null, null, 0, R$attr.uikit_dp8, 0, 0, 28400)) : f0.f322471a;
            }
            if (cell instanceof yna.g) {
                return u.c(b(this, "ID_INBOX", new TextLocalisedClause(R$string.profile_inbox_title, null, null, 14), null, R$drawable.uikit_icn_24_megaphone, e(((yna.g) cell).f315338a), null, 36));
            }
            if (cell instanceof yna.i) {
                return u.c(b(this, "ID_NEW_SUPPORT_INBOX", new TextLocalisedClause(R$string.profile_new_inbox_title, null, null, 14), null, R$drawable.uikit_icn_24_chat, e(((yna.i) cell).f315346a), null, 36));
            }
            if (cell instanceof yna.h) {
                return u.c(b(this, "ID_INVITE_FRIENDS", new TextLocalisedClause(R$string.profile_action_invite, null, null, 14), a(((yna.h) cell).f315342a), R$drawable.uikit_icn_24_envelope, null, n.STANDARD, 16));
            }
            if (cell instanceof a.AbstractC1757a.j) {
                return u.c(b(this, "ID_LEARN", new TextLocalisedClause(R$string.profileHome_settings_item_learn_title, null, null, 14), null, R$drawable.uikit_icn_24_lightbulb, null, null, 52));
            }
            if (cell instanceof a.AbstractC1757a.d) {
                return u.c(b(this, "ID_APPEARANCE", new TextLocalisedClause(R$string.profile_appearance_title, null, null, 14), null, R$drawable.uikit_icn_24_palette, null, null, 52));
            }
            if (cell instanceof a.AbstractC1757a.b) {
                return u.c(b(this, "ID_ACCESSIBILITY", new TextLocalisedClause(com.revolut.feature.accessibility_settings.api.R$string.accessibility_screen_title, null, null, 14), null, R$drawable.uikit_icn_24_accessibility, null, null, 52));
            }
            if (cell instanceof a.AbstractC1757a.l) {
                return u.c(b(this, "ID_NOTIFICATION_SETTINGS", new TextLocalisedClause(R$string.profile_notification_settings_title, null, null, 14), null, R$drawable.uikit_icn_24_bell, null, null, 52));
            }
            if (cell instanceof a.AbstractC1757a.q) {
                return u.c(new RowDelegate.Model("ID_BUG_REPORT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bug, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(com.revolut.feature.bugreport.api.R$string.profile_bug_reporting_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
            }
            if (cell instanceof a.AbstractC1757a.f) {
                return u.c(b(this, "ID_ITEM_ID_DEBUG_SCREEN", new TextLocalisedClause(R$string.profile_debug_title, null, null, 14), null, R$drawable.uikit_icn_24_settings, null, null, 52));
            }
            if (cell instanceof a.AbstractC1757a.m) {
                return u.c(b(this, "ID_REVOLUT_RETAIL_APP", new TextLocalisedClause(R$string.profileHome_settings_item_invest_open_retail_app_title, null, null, 14), null, R$drawable.uikit_icn_24_link_external, null, null, 52));
            }
            if (cell instanceof a.AbstractC1757a.r) {
                return u.c(b(this, "ID_REVOLUT_ID", new TextLocalisedClause(R$string.profile_revolut_id_title, null, null, 14), null, R$drawable.uikit_icn_24_revolut_id, null, null, 52));
            }
            if (cell instanceof yna.b) {
                Data data3 = ((yna.b) cell).f315302a;
                if (data3 != null && (cVar = (tla.c) data3.getContent()) != null) {
                    return u.c(b(this, "ID_ACCOUNT_DETAILS", new TextLocalisedClause(R$string.profileHome_settings_item_account_details_title, null, null, 14), null, cVar.f272044b ? R$drawable.uikit_icn_24_coins : R$drawable.uikit_icn_24_bank, null, null, 52));
                }
                return f0.f322471a;
            }
            if (cell instanceof a.AbstractC1757a.i) {
                return u.c(b(this, "ID_GENERAL_SETTINGS", new TextLocalisedClause(R.string.profile_section_general_settings, null, null, 14), null, R$drawable.uikit_icn_24_gear, null, null, 52));
            }
            if (cell instanceof m) {
                return u.c(new RowDelegate.Model("ID_RESTRICTIONS", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_exclamation_mark, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusDanger), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextClause(((m) cell).f315360a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 532675544));
            }
            if (!(cell instanceof l) && !(cell instanceof yna.u)) {
                if (cell instanceof yna.n) {
                    return u.c(b(this, "ID_REWARDS_HUB", new TextLocalisedClause(R$string.profile_rewards_title, null, null, 14), null, R$drawable.uikit_icn_24_present, e(((yna.n) cell).f315362a), null, 36));
                }
                if (!(cell instanceof yna.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.profile_student_title, null, null, 14);
                int i = d.f248091a[((yna.p) cell).f315366a.f116432a.ordinal()];
                if (i == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.profile_student_subtitle_explore, null, null, 14);
                } else {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.profile_student_subtitle_verify_email, null, null, 14);
                }
                return u.c(b(this, "ID_STUDENT", textLocalisedClause2, textLocalisedClause, R$drawable.uikit_icn_24_student, null, null, 48));
            }
            return f0.f322471a;
        }
        return f0.f322471a;
    }

    public final RowDelegate.Model.c.a e(z zVar) {
        if (!(zVar instanceof y)) {
            return null;
        }
        int i = ((y) zVar).f315385a;
        String strValueOf = i > 9 ? "9+" : String.valueOf(i);
        ProfileApi$Toggles$RevampedProfileScreen profileApi$Toggles$RevampedProfileScreen = ProfileApi$Toggles$RevampedProfileScreen.f81321c;
        gte.a aVar = this.f248093b;
        int i2 = ((jte.d) aVar).c(profileApi$Toggles$RevampedProfileScreen) ? R$attr.uikit_colorOnAccentNeutral : R$attr.uikit_colorWhite;
        int i3 = ((jte.d) aVar).c(profileApi$Toggles$RevampedProfileScreen) ? R$attr.uikit_colorAccentNeutral : R$attr.uikit_colorRed;
        return new RowDelegate.Model.c.a(new TagViewData(null, new TextClause(strValueOf, (Style) new Custom(Integer.valueOf(i2), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), i3, null, i3, null, 1000), null, false, 6);
    }
}
