package t2e;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreen;
import com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreBrandDetailEarnScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(StoreBrandDetailEarnScreen storeBrandDetailEarnScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeBrandDetailEarnScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a aVar2 = (com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        if (obj3 instanceof m2e.c) {
            oki.h.v2(aVar2.v, new StoreBrandDetailEarnScreenContract$ModalStep.Countries(((m2e.c) obj3).f201959a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (obj3 instanceof m2e.d) {
            aVar2.H2(aVar2.u, new sef.j(model.f51832a, 21));
        }
        return Unit.f186387a;
    }
}
