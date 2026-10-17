package wth;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.workflow.engine.product_closures.screen.ProductClosuresScreen;
import com.revolut.feature.workflow.engine.product_closures.screen.ProductClosuresScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ProductClosurePrompt;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProductClosuresScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ProductClosuresScreen productClosuresScreen, Continuation continuation) {
        super(2, continuation);
        this.v = productClosuresScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.Q.getValue();
        Intrinsics.h(model);
        com.revolut.feature.workflow.engine.product_closures.screen.a aVar2 = (com.revolut.feature.workflow.engine.product_closures.screen.a) iVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        ProductClosurePrompt productClosurePrompt = obj3 instanceof ProductClosurePrompt ? (ProductClosurePrompt) obj3 : null;
        if (productClosurePrompt == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("RowDelegate.Model parcel should be ProductClosurePrompt");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ProductClosures", null, illegalArgumentException, h0Var);
        } else {
            oki.h.v2(aVar2.f96510r, new ProductClosuresScreenContract$ModalStep.CloseProductGuide(productClosurePrompt), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
