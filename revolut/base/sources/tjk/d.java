package tjk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutHyperText;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public static TextClause a(PricingPlanLayoutHyperText hyperText) {
        Style custom;
        Intrinsics.checkNotNullParameter(hyperText, "hyperText");
        String strD = a0.D(hyperText.f102836a, "%", "%%", false);
        ArrayList arrayList = new ArrayList();
        String strF = strD;
        int i = 1;
        for (PricingPlanLayoutHyperText.Descriptor descriptor : d0.P0(hyperText.f102837b, new c())) {
            String strD2 = a0.D(descriptor.getF102840a(), "%", "%%", false);
            if (kotlin.text.d0.J(strF, strD2, false)) {
                strF = a0.F(strF, strD2, j6.a.l(i, "%", "$s"), false);
                String f102840a = descriptor.getF102840a();
                if (descriptor instanceof PricingPlanLayoutHyperText.Descriptor.Clickable) {
                    custom = new Click(28, (Integer) null, (Object) ((PricingPlanLayoutHyperText.Descriptor.Clickable) descriptor).f102839b, String.valueOf(i), false);
                } else {
                    if (!(descriptor instanceof PricingPlanLayoutHyperText.Descriptor.Strikethrough)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    custom = new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                }
                arrayList.add(new TextClause(f102840a, custom, (Integer) null, false, (o9) null, (List) null, 124));
                i++;
            }
        }
        return arrayList.isEmpty() ? new TextClause(hyperText.f102836a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(strF, (Style) null, (Integer) null, false, (o9) null, (List) arrayList, 94);
    }
}
