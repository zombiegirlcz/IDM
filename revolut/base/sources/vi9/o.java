package vi9;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import ip0.y10;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class o {
    public static sa a(boolean z, boolean z3) {
        sa saVar = new sa("outstanding-warning", (Clause) new TextLocalisedClause(R$string.pay_later_repayment_outstanding_widget_title, null, null, 14), (Clause) (z ? z3 ? new TextLocalisedClause(R$string.pay_later_repayment_outstanding_x_amount_increased_warning_reported, null, null, 14) : new TextLocalisedClause(R$string.pay_later_repayment_outstanding_x_amount_increased_warning_not_reported, null, null, 14) : z3 ? new TextLocalisedClause(R$string.pay_later_repayment_outstanding_warning_reported, null, null, 14) : new TextLocalisedClause(R$string.pay_later_repayment_outstanding_warning_not_reported, null, null, 14)), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        return saVar;
    }

    public static sa b(boolean z, boolean z3) {
        sa saVar = new sa("overdue-warning", (Clause) new TextLocalisedClause(R$string.pay_later_repayment_overdue_widget_title, null, null, 14), (Clause) (z ? z3 ? new TextLocalisedClause(R$string.pay_later_repayment_overdue_x_amount_increased_warning_reported, null, null, 14) : new TextLocalisedClause(R$string.pay_later_repayment_overdue_x_amount_increased_warning_not_reported, null, null, 14) : z3 ? new TextLocalisedClause(R$string.pay_later_repayment_overdue_warning_reported, null, null, 14) : new TextLocalisedClause(R$string.pay_later_repayment_overdue_warning_not_reported, null, null, 14)), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        return saVar;
    }
}
