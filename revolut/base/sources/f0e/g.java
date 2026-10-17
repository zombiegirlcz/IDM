package f0e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.impl.ui.documents_hub.product_selector.DocumentsHubProductSelectorScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DocumentsHubProductSelectorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DocumentsHubProductSelectorScreen documentsHubProductSelectorScreen, Continuation continuation) {
        super(2, continuation);
        this.v = documentsHubProductSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.Q.getValue();
        Object obj3 = model.u;
        dVar.getClass();
        String str = obj3 instanceof DocumentsHubProduct ? ((DocumentsHubProduct) obj3).f88259a : null;
        if (str != null) {
            dVar.C2(new b(str));
        }
        return Unit.f186387a;
    }
}
