package he1;

import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue_management.CatalogueManagementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CatalogueManagementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CatalogueManagementScreen catalogueManagementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = catalogueManagementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ExpandableCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ExpandableCellDelegate.Model model = (ExpandableCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarH3 = this.v.T2();
        Intrinsics.h(model);
        l lVar = (l) jVarH3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        if (!(obj3 instanceof CatalogueCategory)) {
            throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj3, "Unsupported parcel type: "));
        }
        lVar.x2(new h8b.b(model, obj3, 11));
        return Unit.f186387a;
    }
}
