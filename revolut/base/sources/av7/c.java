package av7;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_list.CoverageListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CoverageListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CoverageListScreen coverageListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = coverageListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ProductSelectionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductSelectionDelegate.Model model = (ProductSelectionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVar = (h) this.v.Y.getValue();
        m mVar = (m) hVar;
        mVar.y2(model.i, model.f52973a);
        return Unit.f186387a;
    }
}
