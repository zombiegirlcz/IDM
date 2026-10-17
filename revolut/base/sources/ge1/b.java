package ge1;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueEmbeddedScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CatalogueEmbeddedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CatalogueEmbeddedScreen catalogueEmbeddedScreen, Continuation continuation) {
        super(2, continuation);
        this.v = catalogueEmbeddedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.b bVar = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.b) hVarD3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        if (Intrinsics.f(str, "ERROR_STATE_LIST_ID")) {
            bVar.I2();
        } else {
            if (!Intrinsics.f(str, "EMPTY_STATE_LIST_ID")) {
                throw new IllegalStateException(h30.l.r("Unsupported full screen list id ", str));
            }
            bVar.C2(new a.b(null));
        }
        return Unit.f186387a;
    }
}
