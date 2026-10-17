package k3k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ t0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(t0 t0Var, Continuation continuation) {
        super(1, continuation);
        this.v = t0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        t0 t0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            t0Var.J.f194072c = true;
            i iVar = t0Var.f180794r;
            TransferFlowType transferFlowType = ((w) t0Var.t2()).f180804b;
            RemittanceTransferData remittanceTransferDataA2 = t0Var.A2();
            RemittancePaymentsCountryData remittancePaymentsCountryData = ((w) t0Var.t2()).f180803a;
            e3k.d dVar = t0Var.z2().f180807b;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            boolean zContains = dVar instanceof e3k.b ? ((e3k.b) dVar).f122337b.e.contains(kq2.o.DIRECT_DEBIT_TOPUP) : false;
            this.u = 1;
            obj2 = iVar.c(transferFlowType, remittanceTransferDataA2, remittancePaymentsCountryData, zContains, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        c cVar = (c) obj2;
        if (cVar instanceof a) {
            CurrencyChooserFlow currencyChooserFlowA = t0Var.G.a(((a) cVar).f180745a);
            currencyChooserFlowA.l2(new jj2.a(t0Var, 23));
            yji.l.i2(t0Var, currencyChooserFlowA, null, new e0(t0Var, 0), 1);
        } else {
            if (!(cVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewController viewControllerE1 = t0Var.e1(new l1j.d(((b) cVar).f180746a, null));
            viewControllerE1.l2(new jj2.a(t0Var, 23));
            e0 block = new e0(t0Var, 2);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            yji.l.j2(t0Var, viewControllerE1, null, null, 3);
        }
        return Unit.f186387a;
    }
}
