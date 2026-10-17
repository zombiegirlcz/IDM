package c55;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.mapper.LoanStampDutyParcel;
import com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 implements m35.k {
    public final CellDetailsDelegate.Model a(LoanStampDuty stampDuty) {
        Intrinsics.checkNotNullParameter(stampDuty, "stampDuty");
        return new CellDetailsDelegate.Model("ID_STAMP_DUTY", new TextLocalisedClause(R$string.loan_management_details_stamp_duty, null, null, 14), sx4.f.b(3, null, null, stampDuty.d), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new LoanStampDutyParcel(stampDuty), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008);
    }
}
