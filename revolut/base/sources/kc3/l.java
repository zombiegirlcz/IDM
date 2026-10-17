package kc3;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.impl.R$string;
import ip0.ak0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        RowDelegate.Model model;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listC = u.c(new FullScreenStateDelegate.Model("ILLUSTRATION_ID", null, null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D006", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32758));
        RowDelegate.Model model2 = new RowDelegate.Model("INSTRUCTION_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_map_point, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.topup_cash_guide_eu_revamped_first_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_cash_guide_eu_revamped_first_step_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        dj0.d dVar = domainState.f182651a;
        dj0.d dVar2 = domainState.f182652b;
        if (dVar == null || dVar2 == null) {
            i = 14;
            model = null;
        } else {
            i = 14;
            model = new RowDelegate.Model("INSTRUCTION_2", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.topup_cash_guide_eu_revamped_second_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_cash_guide_eu_revamped_second_step_subtitle, v.k(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        }
        RowDelegate.Model[] elements = {model2, model, new RowDelegate.Model("INSTRUCTION_3", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_scan_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.topup_cash_guide_eu_revamped_third_step_title, null, null, i), null, 0, new TextLocalisedClause(R$string.topup_cash_guide_eu_revamped_third_step_subtitle, null, null, i), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new i(w.u(v.k(listC, listL, v.l(domainState.f182653c != null ? new TextDelegate.Model("ITEM_ID_CASH_DEPOSIT_TERMS_AND_CONDITIONS", new HtmlLocalisedClause(R$string.topup_cash_guide_eu_terms_and_conditions_paysafe, v.k("TERMS_ID", "PRIVACY_POLICY_ID"), (Integer) null, (Object) null, 28), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036) : null))));
    }
}
