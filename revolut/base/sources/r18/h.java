package r18;

import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.SelectAssetsDescriptor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ m u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Continuation continuation) {
        super(1, continuation);
        this.u = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        SelectAssetsDescriptor selectAssetsDescriptorA = q18.j.a();
        m mVar = this.u;
        yji.n.P2(mVar, mVar.o2(selectAssetsDescriptorA), null, null, 3);
        return Unit.f186387a;
    }
}
