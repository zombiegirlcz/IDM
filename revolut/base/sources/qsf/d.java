package qsf;

import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$State;
import com.revolut.feature.transfer_reasons.impl.flow.refund.TransferReasonsRefundFlowContract$State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dtf.f f248822b;

    public /* synthetic */ d(dtf.f fVar, int i) {
        this.f248821a = i;
        this.f248822b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f248821a) {
            case 0:
                TransferReasonsFlowContract$State update = (TransferReasonsFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return TransferReasonsFlowContract$State.a(update, null, null, null, this.f248822b.f117446a, true, null, 39);
            default:
                TransferReasonsRefundFlowContract$State update2 = (TransferReasonsRefundFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return TransferReasonsRefundFlowContract$State.a(update2, null, null, null, this.f248822b.f117446a, true, 15);
        }
    }
}
