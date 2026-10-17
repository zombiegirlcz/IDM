package zd3;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import com.revolut.feature.cashback.impl.ui.yourcashback.split_by_source.SplitBySourceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SplitBySourceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SplitBySourceScreen splitBySourceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = splitBySourceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.V.getValue();
        Intrinsics.h(model);
        i iVar = (i) eVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof cd3.d) {
            cd3.d dVar = (cd3.d) obj3;
            iVar.v2(new d(new YourCashbackFlowContract$Step.Product(dVar.f23167a, false), dVar.f23168b));
        }
        return Unit.f186387a;
    }
}
