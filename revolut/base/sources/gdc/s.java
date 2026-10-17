package gdc;

import com.revolut.feature.revolutpay.shared.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.revolutpay.shared.ui.add_payment_method.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.revolutpay.shared.ui.add_payment_method.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y0 y0VarA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.revolutpay.shared.ui.add_payment_method.c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            gca.l lVar = new gca.l(cVar, null, 1);
            this.u = 1;
            obj2 = cVar.p2(this, lVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        u6c.b bVar = (u6c.b) obj2;
        if (!(bVar instanceof u6c.a)) {
            if (!(bVar instanceof com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.a)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.C2(new b(((com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.a) bVar).f84405a));
            return Unit.f186387a;
        }
        d dVar = cVar.f84712r;
        u6c.i error = ((u6c.a) bVar).f277541a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.equals(u6c.e.f277550a)) {
            y0VarA = d.a(R$string.revolut_pay_payment_methods_add_card_error_region_mismatch);
        } else if (error.equals(u6c.f.f277554a)) {
            y0VarA = d.a(R$string.revolut_pay_payment_methods_add_card_error_duplicate_card);
        } else {
            if (!error.equals(u6c.g.f277555a) && !error.equals(u6c.d.f277549a) && !error.equals(u6c.h.f277556a)) {
                throw new NoWhenBranchMatchedException();
            }
            y0VarA = d.a(R$string.revolut_pay_payment_methods_add_card_error_unsupported_card);
        }
        return cVar.X1(y0VarA);
    }
}
