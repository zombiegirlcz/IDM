package v1a;

import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.bottom_sheet.SplitBillLinkBottomSheetContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.bottom_sheet.SplitBillLinkBottomSheetController;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.SplitBillQrScreen;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.g;
import s1a.f;
import tof.a3;
import u3a.p;
import yki.l;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c f285277b;

    public /* synthetic */ c(com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c cVar, int i) {
        this.f285276a = i;
        this.f285277b = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        dj0.d dVar;
        switch (this.f285276a) {
            case 0:
                com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c cVar = this.f285277b;
                a3 transaction = cVar.f79877r;
                f fVar = cVar.f79876q;
                l FlowCoordinator = (l) obj2;
                SplitBillQrFlowContract$Step step = (SplitBillQrFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof SplitBillQrFlowContract$Step.QrScreen) {
                    SplitBillQrScreen splitBillQrScreen = new SplitBillQrScreen(cVar.o.f79865a);
                    uu9.b block = new uu9.b(cVar, 26);
                    Intrinsics.checkNotNullParameter(block, "block");
                    splitBillQrScreen.H = block;
                    return splitBillQrScreen;
                }
                Integer numValueOf = null;
                if (step instanceof SplitBillQrFlowContract$Step.GenerateNewLink) {
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    SplitBillLinkBottomSheetController splitBillLinkBottomSheetController = new SplitBillLinkBottomSheetController(new SplitBillLinkBottomSheetContract$InputData(transaction.k, null));
                    cVar.a(splitBillLinkBottomSheetController, new c(cVar, 1));
                    return splitBillLinkBottomSheetController;
                }
                if (!(step instanceof SplitBillQrFlowContract$Step.EditSplit)) {
                    throw new NoWhenBranchMatchedException();
                }
                SplitBillQrFlowContract$Step.EditSplit editSplit = (SplitBillQrFlowContract$Step.EditSplit) step;
                dj0.d dVar2 = editSplit.f79867b;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                dj0.d dVar3 = transaction.k;
                if (dVar2 != null) {
                    if (dVar2.f115082a <= 0) {
                        dVar2 = null;
                    }
                    if (dVar2 != null) {
                        numValueOf = Integer.valueOf(kotlin.ranges.f.g((int) (dVar3.a().f115082a / dVar2.f115082a), 2, 30));
                    }
                }
                SplitBillLinkBottomSheetController splitBillLinkBottomSheetController2 = new SplitBillLinkBottomSheetController(new SplitBillLinkBottomSheetContract$InputData(dVar3, numValueOf));
                cVar.a(splitBillLinkBottomSheetController2, new p(cVar, editSplit, 7));
                return splitBillLinkBottomSheetController2;
            default:
                g onResult = (g) obj2;
                s1a.d output = (s1a.d) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof s1a.c) {
                    dVar = ((s1a.c) output).f259118b;
                } else {
                    if (!Intrinsics.f(output, s1a.b.f259117b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = null;
                }
                dj0.d dVar4 = dVar;
                com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c cVar2 = this.f285277b;
                cVar2.l2(new sxe.g(15, cVar2, output, onResult, dVar4, (Continuation) null), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
