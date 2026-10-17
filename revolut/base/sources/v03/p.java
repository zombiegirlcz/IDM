package v03;

import android.text.InputFilter;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f284732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputFilter f284733b;

    public p(InputFilter inputFilter, u80.o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(inputFilter, "inputFilter");
        this.f284732a = amountFormatter;
        this.f284733b = inputFilter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        String strE;
        dj0.d dVar;
        bw0.m mVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        i93.e eVar = domainState.d;
        dj0.d dVar2 = domainState.f284717c;
        i93.l lVar = domainState.e;
        int i = o.f284731a[eVar.ordinal()];
        boolean z = true;
        TextLocalisedClause textLocalisedClause = i != 1 ? i != 2 ? i != 3 ? i != 4 ? new TextLocalisedClause(R.string.card_change_limits_action_set, null, null, 14) : new TextLocalisedClause(R.string.card_change_limits_screen_pos_title, null, null, 14) : new TextLocalisedClause(R.string.card_change_limits_screen_contactless_title, null, null, 14) : new TextLocalisedClause(R.string.card_change_limits_screen_atm_title, null, null, 14) : new TextLocalisedClause(R.string.card_change_limits_screen_ecommerce_title, null, null, 14);
        if (dVar2 == null || (strE = this.f284732a.e(dVar2)) == null) {
            strE = "";
        }
        String str = strE;
        xi0.b bVar = lVar.f159568a;
        dj0.d dVar3 = lVar.f159570c;
        bw0.h hVar = new bw0.h(str, u80.o.b(new u80.g(new dj0.d(0L, bVar), u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), null, true, u.c(this.f284733b), Boolean.TRUE, false, false, bw0.e.None, null, null, null, 31684);
        if (dVar3 == null) {
            mVar = null;
            dVar = dVar3;
        } else {
            boolean z3 = dVar2 != null && dVar2.compareTo(dVar3) > 0;
            dVar = dVar3;
            mVar = new bw0.m(new TextLocalisedClause(R.string.card_change_limits_info_max_amount, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), z3 ? bw0.l.ERROR : bw0.l.INFO, z3 ? new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, false, null, 24);
        }
        List listC = u.c(new CenteredAmountDelegate.Model("AMOUNT_FIELD", null, hVar, null, mVar, null, null, true, false, null, null, 1898));
        if (dVar2 == null || dVar2.k() || (dVar != null && dVar2.compareTo(dVar) > 0)) {
            z = false;
        }
        return new h(textLocalisedClause, listC, (lVar.d || lVar.f159569b == null) ? f0.f322471a : u.c(new TextNavBarMenuItem("DELETE_ITEM", new TextLocalisedClause(R.string.card_change_limits_action_remove, null, null, 14), null, null, 12)), z);
    }
}
