package btd;

import aw0.n6;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetContract$Variant;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.a;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SmartEstimationBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(SmartEstimationBottomSheetController smartEstimationBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = smartEstimationBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z;
        int i = this.u;
        SmartEstimationBottomSheetController smartEstimationBottomSheetController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.b) ((b) smartEstimationBottomSheetController.U.getValue());
                SmartEstimationBottomSheetContract$Variant smartEstimationBottomSheetContract$Variant = bVar.o.f18558a;
                if (smartEstimationBottomSheetContract$Variant instanceof SmartEstimationBottomSheetContract$Variant.FreeInfo) {
                    z = true;
                } else if (smartEstimationBottomSheetContract$Variant instanceof SmartEstimationBottomSheetContract$Variant.OutOfAssets) {
                    z = ((SmartEstimationBottomSheetContract$Variant.OutOfAssets) smartEstimationBottomSheetContract$Variant).f88035c;
                } else if (smartEstimationBottomSheetContract$Variant instanceof SmartEstimationBottomSheetContract$Variant.Remaining) {
                    z = ((SmartEstimationBottomSheetContract$Variant.Remaining) smartEstimationBottomSheetContract$Variant).d;
                } else {
                    if (!(smartEstimationBottomSheetContract$Variant instanceof SmartEstimationBottomSheetContract$Variant.Deferred)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = ((SmartEstimationBottomSheetContract$Variant.Deferred) smartEstimationBottomSheetContract$Variant).f88031c;
                }
                if (z) {
                    bVar.C2(a.C0551a.f88039a);
                } else {
                    bVar.B2();
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.b) ((b) smartEstimationBottomSheetController.U.getValue())).B2();
                return Unit.f186387a;
        }
    }
}
