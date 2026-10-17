package csk;

import aw0.o9;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class j {
    public final ActionsView.Item a(uqk.e selectedPeriod) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        mx0.d dVar = mx0.d.SEMIBLACK;
        int i = i.f108516a[selectedPeriod.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_stock_details_statements_annual, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_stock_details_statements_quarterly, null, null, 14);
        }
        return new ActionsView.Item("PERIOD_ACTION_ITEM_ID", dVar, false, null, null, textLocalisedClause, new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, selectedPeriod, null, 24476);
    }

    public final y b(uqk.e selectedPeriod) {
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_stock_details_statements_annual, null, null, 14);
        uqk.e eVar = uqk.e.ANNUALLY;
        SingleChoiceDelegate.Model model = new SingleChoiceDelegate.Model("ANNUAL_PERIOD_ID", textLocalisedClause, selectedPeriod == eVar, null, eVar, YearClass.CLASS_2008);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_stock_details_statements_quarterly, null, null, 14);
        uqk.e eVar2 = uqk.e.QUARTERLY;
        List listK = v.k(model, new SingleChoiceDelegate.Model("QUARTERLY_PERIOD_ID", textLocalisedClause2, selectedPeriod == eVar2, null, eVar2, YearClass.CLASS_2008));
        yp0.b.k(listK, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, 28);
        return new y(listK, null, rp0.l.WINDOW, null, null, null, "PERIOD_CHOOSER_DIALOG_DELEGATES_KEY", null, null, null, 3834);
    }

    public final Clause c(esk.b subPeriod) {
        Intrinsics.checkNotNullParameter(subPeriod, "subPeriod");
        Integer num = subPeriod.f128996b;
        int i = subPeriod.f128995a;
        return num == null ? new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.wealth_stock_details_statements_quarter, v.k(num, Integer.valueOf(i % 100)), null, 12);
    }
}
