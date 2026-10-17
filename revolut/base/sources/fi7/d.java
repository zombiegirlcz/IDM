package fi7;

import cli.y;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.instruments.trend.collections.impl.ui.collection.InstrumentsTrendCollectionController;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InstrumentsTrendCollectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InstrumentsTrendCollectionController instrumentsTrendCollectionController, Continuation continuation) {
        super(2, continuation);
        this.v = instrumentsTrendCollectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar2 = (com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) hVarE3;
        y yVar = aVar2.f74919y;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        k kVar = obj3 instanceof k ? (k) obj3 : null;
        if (kVar != null) {
            LinkedHashMap linkedHashMapZ = r0.z(((j) ((j2) yVar.f22677a).getValue()).f135325c);
            linkedHashMapZ.put(kVar.f135328a, kVar.f135329b);
            aVar2.H2(yVar, new fg8.y(linkedHashMapZ, aVar2, 8));
            j2 j2Var = aVar2.z;
            j2Var.getClass();
            j2Var.g(null, linkedHashMapZ);
            j60.a.v(aVar2.o, false, null, 3);
        }
        return Unit.f186387a;
    }
}
