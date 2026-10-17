package ppf;

import aw0.k7;
import aw0.o9;
import bw0.m;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ehe.n;
import i1l.f;
import i1l.g;
import i1l.i;
import i1l.j;
import i1l.k;
import i1l.l;
import ip0.jh0;
import ip0.lh0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import nrf.e;
import org.jetbrains.annotations.NotNull;
import yof.h;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements yof.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ldd.b f238599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f238600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f238601c;

    public c(ldd.b focusRequesterDelegate) {
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        this.f238599a = focusRequesterDelegate;
        this.f238600b = n.w(11);
        p0 p0Var = o0.f186429a;
        KClass[] elements = {p0Var.b(l.class), p0Var.b(i1l.c.class), p0Var.b(g.class), p0Var.b(f.class), p0Var.b(k.class), p0Var.b(j.class)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f238601c = kotlin.collections.d.y0(elements);
    }

    public final Clause b(dj0.d amount, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        MoneyClause moneyClause = new MoneyClause(amount, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, o9.NON_SENSITIVE, 4);
        return z ? new TextLocalisedClause(R$string.payments_core_fees_amount_including, u.c(moneyClause), null, 12) : moneyClause;
    }

    public final m c(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new m(error.a(), bw0.l.ERROR, e(true), this.f238601c.contains(o0.f186429a.b(error.getClass())) || ((error instanceof i) && ((i) error).f157652a != null), null, 16);
    }

    public final m d() {
        Clause[] elements = {new TextLocalisedClause(R.string.transaction_no_fees, null, null, 14), null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new m(new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), bw0.l.INFO, null, false, null, 28);
    }

    public final ResourceImage e(boolean z) {
        return z ? new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246) : new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public final List f() {
        return v.k(new pb0("ITEM_LOADING_ID1"), new pb0("ITEM_LOADING_ID2"), new pb0("ITEM_LOADING_ID3"));
    }

    public final nh g(String str, Set suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        if (suggestions.isEmpty()) {
            return null;
        }
        Set<String> set = suggestions;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (String str2 : set) {
            arrayList.add(new SuggestionsBarDelegate.Suggestion(j6.a.q("SUGGESTION_ID_", str2), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, Intrinsics.f(str, str2) ? lh0.ACCENT : lh0.SEMIACCENT, null, false, str2, null, 372));
        }
        jh0 jh0Var = jh0.FLEXBOX;
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp12;
        return new nh("ITEM_SUGGESTIONS_ID", arrayList, jh0Var, i, i, i2, i2, i2, 16);
    }

    public final Clause h(dj0.d transferAmount, e charges, boolean z) {
        Intrinsics.checkNotNullParameter(transferAmount, "transferAmount");
        Intrinsics.checkNotNullParameter(charges, "charges");
        if (transferAmount.k()) {
            return null;
        }
        boolean zK = charges.f218634b.f218636a.k();
        boolean zK2 = charges.f218635c.f218641a.k();
        return i(transferAmount, (zK || zK2) ? !zK ? yof.e.f315675a : !zK2 ? h.f315678a : yof.g.f315677a : yof.f.f315676a, z);
    }

    public final Clause i(dj0.d transferAmount, yof.i transferExpenses, boolean z) {
        Intrinsics.checkNotNullParameter(transferAmount, "transferAmount");
        Intrinsics.checkNotNullParameter(transferExpenses, "transferExpenses");
        if (transferAmount.k()) {
            return null;
        }
        MoneyClause moneyClauseB = sx4.f.b(3, null, null, transferAmount);
        if (transferExpenses instanceof yof.g) {
            return z ? moneyClauseB : new TextLocalisedClause(R$string.money_transfers_amount_input_no_fees, null, null, 14);
        }
        if (transferExpenses instanceof h) {
            return new TextLocalisedClause(R$string.money_transfers_amount_input_include_taxes_format, u.c(moneyClauseB), null, 12);
        }
        if (transferExpenses instanceof yof.e) {
            return new TextLocalisedClause(R$string.money_transfers_amount_input_include_fee_format, u.c(moneyClauseB), null, 12);
        }
        if (transferExpenses instanceof yof.f) {
            return new TextLocalisedClause(R$string.money_transfers_amount_input_include_taxes_and_fees_format, u.c(moneyClauseB), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextLocalisedClause j(dj0.d dVar, xi0.b bVar) {
        if (dVar == null || bVar == null || dVar.f115082a == 0) {
            return null;
        }
        return Intrinsics.f(dVar.f115083b, bVar) ? new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_amount_hint_excluding_fee, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, o9.NON_SENSITIVE, 4)), null, 12) : new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_amount_hint_excluding_no_amount, null, null, 14);
    }
}
