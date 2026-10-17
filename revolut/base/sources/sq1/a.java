package sq1;

import aii.u;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.pagopa.api.R$string;
import com.revolut.feature.apm.bills.pagopa.api.navigation.PagoPADialogFeatureConfig$PagoPADialogDestination;
import com.revolut.feature.apm.bills.pagopa.api.navigation.PagoPAFlowDestination;
import com.revolut.feature.apm.bills.pagopa.impl.ui.flow.PagoPAFlow;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import dki.g;
import eii.c;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zq1.b;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PagoPAFlowDestination) {
            return new PagoPAFlow((PagoPAFlowDestination.InputData) ((PagoPAFlowDestination) destination).f98300a);
        }
        if (!(destination instanceof PagoPADialogFeatureConfig$PagoPADialogDestination)) {
            return null;
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.pago_pa_name, null, null, 14), new TextLocalisedClause(R$string.pago_pa_actions_options_sheet_subtitle, null, null, 14), null, null, false, 28);
        int i = R$string.pago_pa_actions_scan_code_title;
        int i2 = R$drawable.uikit_icn_24_scan_qr;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        List listK = v.k(b.a(i, companion.i(i2, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), zq1.a.QR), b.a(R$string.pago_pa_actions_manual_input_title, companion.i(R$drawable.uikit_icn_24_document, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), zq1.a.MANUAL));
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new c(aVar, null, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
        de6.b block = new de6.b(this, flowModel, 2);
        Intrinsics.checkNotNullParameter(block, "block");
        rowActionsBottomSheetController.H = block;
        return rowActionsBottomSheetController;
    }
}
