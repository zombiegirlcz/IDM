package f0e;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.statements.impl.ui.documents_hub.product_selector.DocumentsHubProductSelectorScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ DocumentsHubProductSelectorScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DocumentsHubProductSelectorScreen documentsHubProductSelectorScreen, Continuation continuation) {
        super(2, continuation);
        this.u = documentsHubProductSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((d) this.u.Q.getValue()).f131111r.a();
        return Unit.f186387a;
    }
}
