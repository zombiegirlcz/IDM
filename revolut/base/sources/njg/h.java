package njg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.list.TrustedMerchantsListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ TrustedMerchantsListController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TrustedMerchantsListController trustedMerchantsListController, Continuation continuation) {
        super(2, continuation);
        this.u = trustedMerchantsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a aVar2 = (com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a) ((a) this.u.T.getValue());
        aVar2.getClass();
        aVar2.A1(new l(aVar2, null, 4), new yi5.b(25));
        return Unit.f186387a;
    }
}
