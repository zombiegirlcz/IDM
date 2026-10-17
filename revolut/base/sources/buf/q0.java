package buf;

import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class q0 extends gim.i implements Function1 {
    public a1 u;
    public a1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f18826x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(a1 a1Var, Continuation continuation) {
        super(1, continuation);
        this.f18826x = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q0(this.f18826x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a1 a1Var;
        a1 a1Var2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f18825w;
        a1 a1Var3 = this.f18826x;
        if (i == 0) {
            yhm.o.b(obj2);
            t tVar = a1Var3.f18772p;
            ManualTransferData manualTransferDataC2 = a1Var3.C2();
            this.u = a1Var3;
            this.v = a1Var3;
            this.f18825w = 1;
            obj2 = tVar.a(manualTransferDataC2, this);
            if (obj2 == aVar) {
                return aVar;
            }
            a1Var = a1Var3;
            a1Var2 = a1Var;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1Var = this.v;
            a1Var2 = this.u;
            yhm.o.b(obj2);
        }
        yji.l.j2(a1Var2, a1Var.e1(new g1j.a((BalanceSelector$InputData) obj2, a1Var3.f18776t)), null, new b0(a1Var3, 4), 1);
        return Unit.f186387a;
    }
}
