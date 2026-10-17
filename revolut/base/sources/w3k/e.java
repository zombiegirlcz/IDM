package w3k;

import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlowContract$State;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlowContract$Step;
import d2k.l;
import d2k.m;
import jq9.v;
import jq9.w;
import k3k.a0;
import k3k.y;
import k3k.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vnl.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c f294421b;

    public /* synthetic */ e(com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar, int i) {
        this.f294420a = i;
        this.f294421b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f294420a) {
            case 0:
                m output = (m) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar = this.f294421b;
                cVar.l2(new i(cVar, output, null, 2), new yi5.b(26));
                return Unit.f186387a;
            case 1:
                a0 output2 = (a0) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                boolean z = output2 instanceof z;
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar2 = this.f294421b;
                if (z) {
                    cVar2.L2(RemittanceFlowContract$State.a((RemittanceFlowContract$State) cVar2.A2().f98429a, null, null, null, null, 13));
                    if (cVar2.f102045t.f101976c == null) {
                        cVar2.E2(RemittanceFlowContract$Step.Destination.f102037a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false);
                    } else {
                        cVar2.I2();
                    }
                } else {
                    if (!(output2 instanceof y)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2.L2(RemittanceFlowContract$State.a((RemittanceFlowContract$State) cVar2.A2().f98429a, null, ((y) output2).f180810a, null, null, 13));
                    cVar2.R2(false);
                }
                return Unit.f186387a;
            case 2:
                s8k.d output3 = (s8k.d) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar3 = this.f294421b;
                aqf.b bVar = cVar3.G;
                Continuation continuation = null;
                bVar.f8426a.k(null);
                if (output3 instanceof s8k.a) {
                    cVar3.R2(true);
                } else if (output3 instanceof s8k.b) {
                    cVar3.l2(new o(cVar3, (s8k.b) output3, continuation, 28), new yi5.b(26));
                } else {
                    if (!(output3 instanceof s8k.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.a(prf.h.Submission);
                    cVar3.l2(new o(cVar3, (s8k.c) output3, continuation, 29), new yi5.b(26));
                }
                return Unit.f186387a;
            case 3:
                b3a.f output4 = (b3a.f) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                boolean z3 = output4 instanceof b3a.c;
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar4 = this.f294421b;
                if (z3) {
                    cVar4.Q2(true);
                } else {
                    Continuation continuation2 = null;
                    if (output4 instanceof b3a.d) {
                        cVar4.E2(RemittanceFlowContract$Step.New.f102038a, false, null, false);
                    } else {
                        if (!(output4 instanceof b3a.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar4.l2(new i(cVar4, ((b3a.e) output4).f12018a, continuation2, 1), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
            case 4:
                el3.c output5 = (el3.c) obj2;
                Intrinsics.checkNotNullParameter(output5, "output");
                if (output5 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar5 = this.f294421b;
                cVar5.l2(new i(cVar5, new jq9.y(output5.f127236a), null, 1), new yi5.b(26));
                return Unit.f186387a;
            case 5:
                dqa.b output6 = (dqa.b) obj2;
                Intrinsics.checkNotNullParameter(output6, "output");
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar6 = this.f294421b;
                cVar6.l2(new i(cVar6, new w(new CardOwnerWithStats(output6.f116929a, 0, 0L)), null, 1), new yi5.b(26));
                return Unit.f186387a;
            default:
                x2j.b output7 = (x2j.b) obj2;
                Intrinsics.checkNotNullParameter(output7, "output");
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar7 = this.f294421b;
                cVar7.l2(new i(cVar7, new v(output7.f302597a), null, 1), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
