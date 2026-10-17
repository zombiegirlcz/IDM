package xpk;

import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ RateDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RateDetailsScreen rateDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = rateDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        if (obj2 == null) {
            return ((g) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
        throw new ClassCastException();
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarT2 = this.u.T2();
        mVarT2.getClass();
        mVarT2.n2(new l(mVarT2, null, 1), new whi.b(6));
        return Unit.f186387a;
    }
}
