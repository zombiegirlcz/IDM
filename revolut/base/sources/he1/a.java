package he1;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue_management.CatalogueManagementScreen;
import he1.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CatalogueManagementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CatalogueManagementScreen catalogueManagementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = catalogueManagementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarH3 = this.v.T2();
        Intrinsics.h(model);
        l lVar = (l) jVarH3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        if (Intrinsics.f(str, "ERROR_STATE_LIST_ID")) {
            lVar.y2();
        } else {
            if (!Intrinsics.f(str, "EMPTY_STATE_LIST_ID")) {
                throw new IllegalStateException(h30.l.r("Unsupported full screen list id ", str));
            }
            lVar.v2(new g.b(null));
        }
        return Unit.f186387a;
    }
}
