package fi7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.instruments.trend.collections.impl.ui.collection.InstrumentsTrendCollectionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InstrumentsTrendCollectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InstrumentsTrendCollectionController instrumentsTrendCollectionController, Continuation continuation) {
        super(2, continuation);
        this.v = instrumentsTrendCollectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar2 = (com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.k instanceof g) {
            aVar2.f74918x.b(Unit.f186387a);
        }
        return Unit.f186387a;
    }
}
