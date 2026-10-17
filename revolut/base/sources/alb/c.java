package alb;

import cli.y;
import com.revolut.feature.retail.savings.impl.core.calculator.presentation.SavingsCalculatorScreen;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SavingsCalculatorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SavingsCalculatorScreen savingsCalculatorScreen, Continuation continuation) {
        super(2, continuation);
        this.v = savingsCalculatorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        cy0.a aVar2 = (cy0.a) pair.f186386b;
        f fVar = (f) this.v.Q.getValue();
        int i = aVar2.f110014a;
        j jVar = (j) fVar;
        y yVar = jVar.f6183r;
        d dVar = (d) ((e) ((j2) yVar.f22677a).getValue()).f6175a.getContent();
        if (dVar != null) {
            List balanceRange = dVar.f6173b;
            Long l2 = (Long) d0.e0(i, balanceRange);
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            ykb.e eVar = jVar.f6182q;
            SavingsProduct savingsProduct = jVar.o.f83211a;
            eVar.getClass();
            dj0.d estimatedReturn = ykb.e.a(jLongValue, savingsProduct);
            SavingsProduct.InterestRate interestRate = dVar.f6174c;
            Intrinsics.checkNotNullParameter(balanceRange, "balanceRange");
            Intrinsics.checkNotNullParameter(interestRate, "interestRate");
            Intrinsics.checkNotNullParameter(estimatedReturn, "estimatedReturn");
            jVar.H2(yVar, new h(new d(i, balanceRange, interestRate, estimatedReturn), 0));
        }
        return Unit.f186387a;
    }
}
