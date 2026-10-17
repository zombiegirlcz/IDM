package ht9;

import bp9.e;
import bp9.f;
import bp9.g;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$State;
import hg0.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oq9.i;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b f155333b;

    public /* synthetic */ b(com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b bVar, int i) {
        this.f155332a = i;
        this.f155333b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f155332a) {
            case 0:
                g output = (g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof f) {
                    com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b bVar = this.f155333b;
                    bVar.l2(new n(bVar, (f) output, null, 24), new yi5.b(26));
                } else if (!(output instanceof e)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                bp9.d output2 = (bp9.d) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b bVar2 = this.f155333b;
                PaymentsGroupsBillsEditFlowContract$State paymentsGroupsBillsEditFlowContract$State = (PaymentsGroupsBillsEditFlowContract$State) bVar2.A2().f98429a;
                BillType.CustomBill bill = output2.f17565a;
                PaymentGroup group = paymentsGroupsBillsEditFlowContract$State.f79427a;
                i groupBill = paymentsGroupsBillsEditFlowContract$State.f79428b;
                Intrinsics.checkNotNullParameter(group, "group");
                Intrinsics.checkNotNullParameter(groupBill, "groupBill");
                Intrinsics.checkNotNullParameter(bill, "bill");
                bVar2.L2(new PaymentsGroupsBillsEditFlowContract$State(group, groupBill, bill));
                bVar2.l2(new com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.a(bVar2, null), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
