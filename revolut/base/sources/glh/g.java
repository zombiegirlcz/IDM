package glh;

import aw0.k7;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z0h.q1;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f144698a;

    public g(q1 disclaimerMapper) {
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        this.f144698a = disclaimerMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        kel.b bVar = domainState.f144694c;
        Clause clause = domainState.f144692a;
        WealthDisclaimersContract$Disclaimer$Investment wealthDisclaimersContract$Disclaimer$Investment = domainState.f144693b;
        lw0.a aVar = new lw0.a(clause, q1.a(this.f144698a, u.c(wealthDisclaimersContract$Disclaimer$Investment), null), null, null, false, 28);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_title, null, null, 14);
        dj0.d dVar = bVar.e;
        k7 k7Var = k7.ONLY_NEGATIVE;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("WITHDRAWABLE_CASH", textLocalisedClause, new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520);
        if (wealthDisclaimersContract$Disclaimer$Investment.getF95354a() == hel.b.MX) {
            model = null;
        }
        CellDetailsDelegate.Model[] elements = {model, new CellDetailsDelegate.Model("UNSETTLED_CASH", new TextLocalisedClause(R$string.wealth_cash_info_unsettled_title, null, null, 14), new MoneyClause(bVar.f, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520), new CellDetailsDelegate.Model("COMMITTED", new TextLocalisedClause(R$string.wealth_cash_info_committed_title, null, null, 14), new MoneyClause(bVar.f183151g, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listL, aVar);
    }
}
