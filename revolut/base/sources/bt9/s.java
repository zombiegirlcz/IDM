package bt9;

import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$InputData;
import dkk.a0;
import efm.d0;
import efm.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import tof.a3;
import tof.r9;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ oq9.h f18475w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, oq9.h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = wVar;
        this.f18475w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.v, this.f18475w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h0 h0VarM;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        oq9.h bill = this.f18475w;
        w wVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            dt9.b bVar = (dt9.b) wVar.f18480w;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(bill, "bill");
            String str = bill.f227827l;
            if (str != null) {
                h0VarM = new ufm.i(com.revolut.domain.interactors.transactions.a.b(bVar.f117400b, new r9(str), null, null, null, null, 30), new a0(new ds4.b(3), 14), 1);
            } else {
                od0.i.Companion.getClass();
                h0VarM = d0.m(od0.i.f224256b);
                Intrinsics.checkNotNullExpressionValue(h0VarM, "just(...)");
            }
            this.u = 1;
            obj2 = nim.a.b(h0VarM, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        a3 a3Var = (a3) ((od0.i) obj2).f224257a;
        if (a3Var != null) {
            return yji.l.i2(wVar, new PaymentsGroupsBillsEditFlow(new PaymentsGroupsBillsEditFlowContract$InputData.EditSplits(wVar.B2().f18465a, bill, new BillType.TransactionBill(a3Var))), null, null, 3);
        }
        wVar.v.getClass();
        return wVar.X1(et9.a.a());
    }
}
