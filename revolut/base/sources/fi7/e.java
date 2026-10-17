package fi7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.instruments.trend.collections.impl.ui.collection.InstrumentsTrendCollectionController;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InstrumentsTrendCollectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InstrumentsTrendCollectionController instrumentsTrendCollectionController, Continuation continuation) {
        super(2, continuation);
        this.v = instrumentsTrendCollectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        qi7.h hVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar2 = (com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        oh7.b bVar = obj3 instanceof oh7.b ? (oh7.b) obj3 : null;
        if (bVar != null && (hVar = bVar.f225321b) != null) {
            vel.f fVar = hVar.f246671a;
            if ((fVar instanceof vel.d) || (fVar instanceof vel.c) || (fVar instanceof vel.b)) {
                aVar2.v.getClass();
                aVar2.C1(g9h.c.a(fVar));
            } else {
                if (!(fVar instanceof vel.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.C1(new AssetDetailsDestination(fVar.a(), null, false, null, null, null, 62));
            }
        }
        return Unit.f186387a;
    }
}
