package w2e;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.store.impl.ui.brand_filters.StoreBrandsFiltersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ StoreBrandsFiltersScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(StoreBrandsFiltersScreen storeBrandsFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.u = storeBrandsFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.u.d();
        l.a1(iVar, iVar.o.b(w4l.i.f294643c), null, null, new h(iVar, null, 1), 3);
        return Unit.f186387a;
    }
}
