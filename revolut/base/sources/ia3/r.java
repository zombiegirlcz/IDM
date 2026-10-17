package ia3;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.revolut.feature_fourthline_impl.R;
import h93.f0;
import h93.h0;
import h93.l0;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class r implements m93.f {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DateTimeFormatter f159945b = DateTimeFormatter.ofPattern("MM/yy");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f159946c;
    public static final int d;
    public static final int e;
    public static final int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f159947a;

    static {
        int i = R$attr.uikit_colorRed;
        f159946c = i;
        d = R$attr.uikit_colorTerracotta;
        e = R$attr.uikit_colorOrange;
        f = i;
    }

    public r(u disposableCardPlaceholderMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(disposableCardPlaceholderMapper, "disposableCardPlaceholderMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f159947a = featureToggleInteractor;
    }

    public static TextLocalisedClause c(f0 f0Var) {
        return new TextLocalisedClause(f0Var.H() ? R$string.card_action_fully_activate : R$string.card_action_activate, null, new Custom(Integer.valueOf(e), false, null, false, null, 254), 10);
    }

    public static LayeredImage d(int i, int i2, boolean z) {
        Float fValueOf = Float.valueOf(8.0f);
        return z ? LayeredImage.Companion.f(LayeredImage.INSTANCE, i, i2, R$attr.uikit_colorBackground, null, 2.0f, 2.0f, fValueOf, 8) : LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorBackground), i2, 2.0f, fValueOf, null, 32);
    }

    public static n93.a e(int i, int i2) {
        return new n93.a(v.k(Integer.valueOf(i2), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i2)));
    }

    public static TextLocalisedClause f(int i) {
        return new TextLocalisedClause(i, null, new Custom(Integer.valueOf(d), false, null, false, null, 254), 10);
    }

    public static TextLocalisedClause g(int i) {
        return new TextLocalisedClause(i, null, new Custom(Integer.valueOf(f159946c), false, null, false, null, 254), 10);
    }

    public static boolean h(f0 f0Var, yt8.i iVar) {
        return h0.b(f0Var) && ngm.n.p(iVar);
    }

    public static boolean i(yt8.i iVar, CheckoutOrder checkoutOrder) {
        if (ngm.n.q(iVar)) {
            return true;
        }
        if ((checkoutOrder != null ? checkoutOrder.getF65849c() : null) != pi3.g.WAITING_FOR_PROCESSING) {
            return (checkoutOrder != null ? checkoutOrder.getF65849c() : null) == pi3.g.VERIFICATION_IN_PROGRESS;
        }
        return true;
    }

    public static o k(f0 f0Var, yt8.i iVar) {
        if (!f0Var.K() && (!f0Var.x() || !f0Var.Z())) {
            if (f0Var.x() && f0Var.D()) {
                return i.f159938a;
            }
            if (f0Var.x()) {
                return k.f159940a;
            }
            if (!f0Var.A() && ((ngm.n.p(iVar) || ngm.n.q(iVar)) && !h(f0Var, iVar))) {
                if (f0Var.G()) {
                    return m.f159942a;
                }
                if (Intrinsics.f(f0Var.n(), Boolean.TRUE) || f0Var.a() || s(f0Var) || pi3.g.PAYMENT_REQUIRED == null) {
                    return n.f159943a;
                }
                if (f0Var.F() || f0Var.U() || i(iVar, null)) {
                    return l.f159941a;
                }
                return null;
            }
        }
        return j.f159939a;
    }

    public static boolean s(f0 f0Var) {
        return f0Var.m() && !f0Var.h();
    }

    public final LayeredImage j(f0 card, yt8.i kyc2, CheckoutOrder checkoutOrder) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        if (card.t()) {
            return null;
        }
        if (card.K()) {
            return d(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorRed, true);
        }
        if (Intrinsics.f(card.n(), Boolean.TRUE)) {
            return d(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorOrange, true);
        }
        if (card.x() && card.Z()) {
            return d(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorRed, true);
        }
        if (card.x() && card.D()) {
            return d(R$drawable.uikit_icn_16_lock_closed, R$attr.uikit_colorDeepGrey, true);
        }
        boolean zX = card.x();
        int i = f159946c;
        if (zX) {
            return d(R$drawable.uikit_icn_24_snowflake, i, true);
        }
        if (card.A()) {
            return d(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorRed, true);
        }
        if (card.G()) {
            return d(R$drawable.uikit_icn_24_cross, f, true);
        }
        if (i(kyc2, checkoutOrder)) {
            return d(R$drawable.uikit_icn_16_sand_watch, R$attr.uikit_colorTerracotta, true);
        }
        if ((card.U() && checkoutOrder != null) || !ngm.n.p(kyc2) || h(card, kyc2)) {
            return d(R$drawable.uikit_icn_24_info_sign, i, true);
        }
        boolean zA = card.a();
        int i2 = e;
        if (zA || s(card)) {
            return d(R$drawable.uikit_icn_24_info_sign, i2, true);
        }
        if (card.U()) {
            return d(R$drawable.uikit_icn_16_status_clock_arrows, i2, true);
        }
        return null;
    }

    public final CircleIconBadge l(f0 card, yt8.i kyc2) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        o oVarK = k(card, kyc2);
        if (Intrinsics.f(oVarK, j.f159939a)) {
            return new DangerCircleBadge(dw0.a.Suspicious);
        }
        if (Intrinsics.f(oVarK, i.f159938a)) {
            return new InactiveCircleBadge(dw0.a.Locked);
        }
        if (Intrinsics.f(oVarK, k.f159940a)) {
            return new DangerCircleBadge(dw0.a.Frozen);
        }
        if (Intrinsics.f(oVarK, m.f159942a)) {
            return new DangerCircleBadge(dw0.a.Error);
        }
        if (Intrinsics.f(oVarK, n.f159943a)) {
            return new WarningCircleBadge(dw0.a.Suspicious);
        }
        if (Intrinsics.f(oVarK, l.f159941a)) {
            return new InactiveCircleBadge(dw0.a.Pending);
        }
        return null;
    }

    public final Clause m(f0 card, yt8.i kyc2, CheckoutOrder checkoutOrder) {
        int i;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        if (card.t()) {
            return new TextLocalisedClause(R$string.card_revolut_pay_subtitle, null, null, 14);
        }
        if (card.x()) {
            return card.Z() ? new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.card_state_temporarily_suspended, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10) : card.D() ? new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_card_deactivated_status, null, new Custom(Integer.valueOf(R$attr.uikit_colorDeepGrey), false, null, false, null, 254), 10) : new TextLocalisedClause(R$string.card_state_frozen_title, null, new Custom(Integer.valueOf(f159946c), false, null, false, null, 254), 10);
        }
        if (card.U() && checkoutOrder != null) {
            if (checkoutOrder == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            pi3.g f65849c = checkoutOrder.getF65849c();
            q qVar = Companion;
            pi3.g f65849c2 = checkoutOrder.getF65849c();
            qVar.getClass();
            int i2 = p.f159944a[f65849c2.ordinal()];
            if (i2 == 1) {
                i = R$string.card_checkout_payment_required;
            } else if (i2 == 2) {
                i = R$string.card_checkout_kyc_required;
            } else if (i2 == 3) {
                i = R$string.card_checkout_kyc_in_progress;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.card_checkout_processing;
            }
            return (f65849c == pi3.g.VERIFICATION_IN_PROGRESS || f65849c == pi3.g.WAITING_FOR_PROCESSING) ? f(i) : g(i);
        }
        if (!ngm.n.p(kyc2)) {
            return ngm.n.q(kyc2) ? f(R$string.card_checkout_kyc_in_progress) : g(R.string.card_action_verify_identity);
        }
        if (!s(card) && !card.a()) {
            if (card.c() && !h0.e(card)) {
                return new TextLocalisedClause(R$string.card_home_item_track_card_title, null, null, 14);
            }
            if (card.G()) {
                return new TextLocalisedClause(R$string.card_action_design_rejected, null, new Custom(Integer.valueOf(f), false, null, false, null, 254), 10);
            }
            if (card.F()) {
                return new TextLocalisedClause(R$string.card_action_design_in_review, null, null, 14);
            }
            if (card.E()) {
                return new TextLocalisedClause(R$string.card_home_item_track_card_title, null, null, 14);
            }
            if (h(card, kyc2)) {
                return g(R$string.card_state_dailyLimit_title);
            }
            if (ifk.b.m(card)) {
                return new TextLocalisedClause(R$string.card_disposable_placeholder_subtitle, null, null, 14);
            }
            if (card.Y() && card.l() == null) {
                return new TextLocalisedClause(R$string.card_action_ready_to_use, null, null, 14);
            }
            LocalDate localDateI = card.i();
            if (localDateI == null) {
                return null;
            }
            String strK = card.k();
            StringBuilder sb6 = new StringBuilder();
            if (strK != null) {
                a0.d.C(sb6, "··", strK, ", ");
            }
            String string = localDateI.toString("MM/YY");
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            TextClause textClause = new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String string2 = sb6.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return new CompositeClause(v.k(new TextClause(string2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause), null, null, null, 14);
        }
        return c(card);
    }

    public final Clause n(f0 card, String str, Boolean bool, boolean z) {
        Boolean bool2;
        Intrinsics.checkNotNullParameter(card, "card");
        if (ifk.b.m(card)) {
            return new TextLocalisedClause(R$string.card_disposable_placeholder_name_short, null, null, 14);
        }
        if (card.t()) {
            return new TextLocalisedClause(R$string.card_revolut_pay_title, null, null, 14);
        }
        Custom custom = (h0.f(card) && z) ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone10), false, null, false, null, 254) : null;
        if (card.b0() && str != null) {
            String label = card.getLabel();
            return label != null ? new TextClause(label, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124) : new CompositeClause(v.k(new TextClause(str, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124), v04.b.J(card, null, custom, null, 12)), new DotDividerClause(), null, null, 12);
        }
        String label2 = card.getLabel();
        if (card.v() != l0.BRAZIL_LOCAL) {
            bool2 = null;
        } else {
            bool2 = ((jte.d) this.f159947a).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c) ? bool : Boolean.TRUE;
        }
        return v04.b.J(card, label2, custom, bool2, 4);
    }

    public final LayeredImage o(f0 card, yt8.i kyc2) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        o oVarK = k(card, kyc2);
        if (Intrinsics.f(oVarK, j.f159939a)) {
            return d(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorRed, false);
        }
        if (Intrinsics.f(oVarK, i.f159938a)) {
            return d(R$drawable.uikit_icn_16_lock_closed, R$attr.uikit_colorDeepGrey, false);
        }
        if (Intrinsics.f(oVarK, k.f159940a)) {
            return d(R$drawable.uikit_icn_24_snowflake, R$attr.uikit_colorRed, false);
        }
        if (Intrinsics.f(oVarK, m.f159942a)) {
            return d(R$drawable.uikit_icn_24_cross, R$attr.uikit_colorRed, false);
        }
        if (Intrinsics.f(oVarK, n.f159943a)) {
            return d(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorOrange, false);
        }
        if (Intrinsics.f(oVarK, l.f159941a)) {
            return d(R$drawable.uikit_icn_16_status_clock_arrows, R$attr.uikit_colorDeepGrey, false);
        }
        return null;
    }

    public final n93.a p(f0 card, yt8.i kyc2) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        if (card.K()) {
            return e(R$attr.uikit_colorRed, R$attr.uikit_colorRed_20);
        }
        if (card.x() && card.Z()) {
            return e(R$attr.uikit_colorRed, R$attr.uikit_colorRed_20);
        }
        if ((!card.x() || !card.D()) && !card.x() && !card.A()) {
            if ((ngm.n.p(kyc2) || ngm.n.q(kyc2)) && !h(card, kyc2) && !card.G()) {
                if (Intrinsics.f(card.n(), Boolean.TRUE)) {
                    return e(R$attr.uikit_colorOrange, R$attr.uikit_colorOrange_20);
                }
                if (card.a() || s(card)) {
                    return e(R$attr.uikit_colorOrange, R$attr.uikit_colorOrange_20);
                }
                if (pi3.g.PAYMENT_REQUIRED == null) {
                    return e(R$attr.uikit_colorOrange, R$attr.uikit_colorOrange_20);
                }
                return null;
            }
            return e(R$attr.uikit_colorRed, R$attr.uikit_colorRed_20);
        }
        return e(R$attr.uikit_colorRed, R$attr.uikit_colorRed_20);
    }

    public final Clause q(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        String strK = card.k();
        if (ifk.b.m(card)) {
            return new TextLocalisedClause(R$string.home_feed_widget_cards_disposable_generate, null, null, 14);
        }
        if (strK == null) {
            return null;
        }
        String strConcat = "··".concat(strK);
        Intrinsics.checkNotNullExpressionValue(strConcat, "toString(...)");
        return new TextClause(strConcat, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final Clause r(f0 card, boolean z, boolean z3, String str, Boolean bool) {
        TextLocalisedClause textLocalisedClause;
        int i;
        Boolean bool2 = bool;
        Intrinsics.checkNotNullParameter(card, "card");
        Custom custom = (h0.f(card) && z3) ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone10), false, null, false, null, 254) : null;
        boolean zM = ifk.b.m(card);
        gte.a aVar = this.f159947a;
        if (!zM || !z) {
            if ((card.b0() || card.d0()) && str != null) {
                String label = card.getLabel();
                return label != null ? new TextClause(label, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new CompositeClause(v.k(new TextClause(str, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124), v04.b.J(card, null, custom, null, 12)), new DotDividerClause(), null, null, 12);
            }
            String label2 = card.getLabel();
            if (card.v() != l0.BRAZIL_LOCAL) {
                bool2 = null;
            } else if (!((jte.d) aVar).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c)) {
                bool2 = Boolean.TRUE;
            }
            return v04.b.G(card, label2, custom, true, bool2);
        }
        l0 l0VarV = card.v();
        if (((jte.d) aVar).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c)) {
            l0 l0Var = l0.BRAZIL_LOCAL;
            if (l0VarV == l0Var && Intrinsics.f(bool2, Boolean.TRUE)) {
                i = R$string.card_name_prefix_combo;
            } else if (l0VarV == l0Var && Intrinsics.f(bool2, Boolean.FALSE)) {
                i = R$string.card_name_prefix_local;
            } else {
                if (l0VarV != l0.BRAZIL_GLOBAL) {
                    textLocalisedClause = null;
                    Clause[] elements = {textLocalisedClause, new TextLocalisedClause(R$string.card_disposable_placeholder_name_short, null, null, 14)};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause(), null, null, 12);
                }
                i = R$string.card_name_prefix_global;
            }
        } else {
            i = R$string.card_name_prefix_local;
        }
        textLocalisedClause = new TextLocalisedClause(i, null, custom, 10);
        Clause[] elements2 = {textLocalisedClause, new TextLocalisedClause(R$string.card_disposable_placeholder_name_short, null, null, 14)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements2), new DotDividerClause(), null, null, 12);
    }
}
