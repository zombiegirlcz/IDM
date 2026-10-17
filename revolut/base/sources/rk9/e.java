package rk9;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelSummaryContent;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.SummaryController;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.SummaryControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) obj2;
        h hVar = (h) this.receiver;
        KProperty[] kPropertyArr = SummaryController.T;
        com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a aVar = (com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a) hVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.o;
        RightToCancelSummaryContent.Info info = obj4 instanceof RightToCancelSummaryContent.Info ? (RightToCancelSummaryContent.Info) obj4 : null;
        if (info != null) {
            oki.h.v2(aVar.f78932r, new SummaryControllerContract$ModalStep.Info(info), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
