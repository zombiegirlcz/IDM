package qsf;

import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$State;
import com.revolut.feature.transfer_reasons.impl.flow.refund.TransferReasonsRefundFlowContract$State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xsf.o f248820b;

    public /* synthetic */ c(xsf.o oVar, int i) {
        this.f248819a = i;
        this.f248820b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f248819a) {
            case 0:
                TransferReasonsFlowContract$State update = (TransferReasonsFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return TransferReasonsFlowContract$State.a(update, null, null, this.f248820b.f308475a, null, false, null, 59);
            default:
                TransferReasonsRefundFlowContract$State update2 = (TransferReasonsRefundFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return TransferReasonsRefundFlowContract$State.a(update2, null, null, this.f248820b.f308475a, null, false, 55);
        }
    }
}
