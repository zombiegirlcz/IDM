package a85;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.mapper.LoanRepaymentBreakdownExplainerFactory$ExplainerDialog;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class b {
    public static CellDetailsDelegate.Model a(dj0.d dVar) {
        if (dVar == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("BREAKAGE_FEE", new t0((Clause) new TextLocalisedClause(R$string.loan_management_schedule_breakage_fee, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), sx4.f.b(3, null, null, dVar), null, new LoanRepaymentBreakdownExplainerFactory$ExplainerDialog.BreakageFee(null), null, null, 0, null, false, false, null, null, 32696);
    }
}
