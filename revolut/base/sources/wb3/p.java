package wb3;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.feature.cash_topup.impl.ui.entry.CashTopUpEntryScreenContract$InputData;
import ip0.ak0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements jki.p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashTopUpEntryScreenContract$InputData f296015a;

    public p(CashTopUpEntryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f296015a = inputData;
    }

    public static FullScreenStateDelegate.Model b() {
        return new FullScreenStateDelegate.Model("ILLUSTRATION_ID", null, null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D006", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32758);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        int i;
        RowDelegate.Model model;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i2 = o.f296014a[this.f296015a.f65630a.ordinal()];
        if (i2 == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(b());
            BulletImage bulletImageB = com.revolut.core.ui_kit_core.displayers.image.models.a.b(1, null, null, null, 30);
            ff ffVar = ff.DP_24;
            List listK = v.k(new RowDelegate.Model("1", bulletImageB, ffVar, null, new TextLocalisedClause(R$string.topup_cash_guide_first_step_title, null, null, 14), new TextLocalisedClause(R$string.topup_cash_guide_first_step_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741672), new RowDelegate.Model("2", com.revolut.core.ui_kit_core.displayers.image.models.a.b(2, null, null, null, 30), ffVar, null, new TextLocalisedClause(R$string.topup_cash_guide_second_step_title, null, null, 14), new TextLocalisedClause(R$string.topup_cash_guide_second_step_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741672), new RowDelegate.Model("3", com.revolut.core.ui_kit_core.displayers.image.models.a.b(3, null, null, null, 30), ffVar, null, new TextLocalisedClause(R$string.topup_cash_guide_third_step_title, null, null, 14), new TextLocalisedClause(R$string.topup_cash_guide_third_step_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741672), new RowDelegate.Model("4", com.revolut.core.ui_kit_core.displayers.image.models.a.b(4, null, null, null, 30), ffVar, null, new TextLocalisedClause(R$string.topup_cash_guide_fourth_step_title, null, null, 14), new TextLocalisedClause(R$string.topup_cash_guide_fourth_step_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741672));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            a0.x(listK, arrayList);
            arrayList.add(new TextDelegate.Model("ITEM_ID_CASH_DEPOSIT_TERMS_AND_CONDITIONS", new HtmlLocalisedClause(R$string.topup_cash_guide_terms_and_conditions_footer_description, u.c("TERMS_ID"), (Integer) null, (Object) null, 28), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
            return new i(new TextLocalisedClause(R$string.topup_cash_guide_title, null, null, 14), new TextLocalisedClause(R$string.topup_cash_guide_action, null, null, 14), arrayList);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dj0.d dVar = domainState.f295999a;
        boolean z = domainState.f296000b instanceof f;
        FullScreenStateDelegate.Model modelB = b();
        RowDelegate.Model model2 = new RowDelegate.Model("1", new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(1, null, null, null, 30), false, false, 6), new TextLocalisedClause(R$string.topup_cash_guide_eu_first_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_cash_guide_eu_first_step_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        if (dVar != null) {
            i = 12;
            model = new RowDelegate.Model("2", new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(2, null, null, null, 30), false, false, 6), new TextLocalisedClause(R$string.topup_cash_guide_eu_second_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_cash_guide_eu_second_step_subtitle, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        } else {
            i = 12;
            model = null;
        }
        RowDelegate.Model[] elements = {model2, model, dVar != null ? new RowDelegate.Model("3", new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(3, null, null, null, 30), false, false, 6), new TextLocalisedClause(R$string.topup_cash_guide_eu_third_step_title, u.c(dVar.f115083b.f306286a), null, i), null, 0, new TextLocalisedClause(R$string.topup_cash_guide_eu_third_step_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new i(new TextLocalisedClause(R$string.topup_cash_guide_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), i2b.a.o(i2b.a.q(modelB, listL), z ? u.c(new TextDelegate.Model("ITEM_ID_CASH_DEPOSIT_TERMS_AND_CONDITIONS", new HtmlLocalisedClause(R$string.topup_cash_guide_eu_terms_and_conditions_paysafe, v.k("EU_TERMS_ID", "EU_PRIVACY_POLICY_ID"), (Integer) null, (Object) null, 28), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036)) : f0.f322471a));
    }
}
