package cqh;

import com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.ScreenerMetaCollectionScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.ScreenerMetaCollectionScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ScreenerMetaCollectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ScreenerMetaCollectionScreen screenerMetaCollectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = screenerMetaCollectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = yVar.f167226b.f58324n;
        b bVar = obj3 instanceof b ? (b) obj3 : null;
        if (bVar != null) {
            oki.h.v2(((com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.a) ((f) this.v.T.getValue())).f96251x, new ScreenerMetaCollectionScreenContract$ModalStep.SelectFilterOption(bVar.f108102a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
