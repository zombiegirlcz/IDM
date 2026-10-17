package s2k;

import b2k.b;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.IndiaWithdrawalFlowContract$Step;
import gim.i;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            r2k.b bVar = aVar2.o;
            this.u = 1;
            obj2 = bVar.a(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        b2k.b bVar2 = (b2k.b) obj2;
        if (Intrinsics.f(bVar2, b.a.f11960a)) {
            com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a.I2(aVar2);
        } else {
            if (!(bVar2 instanceof b2k.c)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((b2k.c) bVar2).f11961a;
            int size = list.size();
            if (size == 0) {
                com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a.I2(aVar2);
            } else if (size != 1) {
                h.t2(aVar2, aVar2.f102009r, new IndiaWithdrawalFlowContract$Step.Choose(list), false, TransitionAnimation.NONE.f98393a, false, 8);
            } else {
                aVar2.l2(new s09.c(aVar2, (f5j.a) d0.b0(list), null, 4), new yi5.b(26));
                h.D2(aVar2.f102009r);
            }
        }
        return Unit.f186387a;
    }
}
