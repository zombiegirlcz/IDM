package q43;

import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.card_payment_method.api.declaration.SelectedPaymentMethodResultContract$SelectedCardBindingStrategy;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import x33.e;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(o0 o0Var, Continuation continuation) {
        super(1, continuation);
        this.v = o0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i93.d dVar;
        aii.r aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o0 o0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            SelectPaymentMethodInputData.UseCase useCase = o0Var.f242034q.f65244a;
            if (useCase instanceof SelectPaymentMethodInputData.UseCase.OrderNewCard) {
                x33.e eVarB = ((s) o0Var.t2()).b();
                Set setI1 = zhm.d0.i1(eVarB.a());
                if (eVarB instanceof e.a) {
                    dVar = i93.d.ALL_CRYPTO;
                } else if (eVarB instanceof e.b) {
                    dVar = i93.d.ALL_FIAT;
                } else {
                    if (!(eVarB instanceof x33.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = i93.d.POCKETS;
                }
                aVar = new b43.a(new SelectedPaymentMethodResultContract$SelectedCardBindingStrategy(dVar, setI1));
                o0Var.v2(aVar);
                return Unit.f186387a;
            }
            if (!(useCase instanceof SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings) useCase).f65248a.f150110a;
            this.u = 1;
            obj2 = o0.z2(o0Var, str, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aVar = (b43.b) obj2;
        o0Var.v2(aVar);
        return Unit.f186387a;
    }
}
