package he1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue_management.CatalogueManagementScreen;
import he1.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CatalogueManagementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CatalogueManagementScreen catalogueManagementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = catalogueManagementScreen;
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
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarH3 = this.v.T2();
        Intrinsics.h(model);
        l lVar = (l) jVarH3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof CatalogueCategory) {
            lVar.v2(new g.b((CatalogueCategory) obj3));
        } else if (obj3 instanceof CatalogueProduct) {
            lVar.v2(new i((CatalogueProduct) obj3));
        }
        return Unit.f186387a;
    }
}
