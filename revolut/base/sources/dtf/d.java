package dtf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreen;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferReasonsAmountAllocationScreen f117442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f117443b;

    public d(TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen, RowDelegate.Model model) {
        this.f117442a = transferReasonsAmountAllocationScreen;
        this.f117443b = model;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public final void k(String extractedValue, String formattedAmount, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedAmount, "formattedValue");
        i iVar = (i) ((g) this.f117442a.O.getValue());
        iVar.getClass();
        RowDelegate.Model model = this.f117443b;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
        if (a0.H(model.f53228a, "AMOUNT_CELL_INPUT_ID_", false)) {
            Object obj2 = model.u;
            TransferReasonNode transferReasonNode = obj2 instanceof TransferReasonNode ? (TransferReasonNode) obj2 : null;
            if (transferReasonNode == null) {
                return;
            }
            iVar.H2(iVar.f117451q, new doe.c(transferReasonNode, iVar.f117450p.p(formattedAmount, iVar.o.f92387a.f115083b), 8));
        }
    }
}
