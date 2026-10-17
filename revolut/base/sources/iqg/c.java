package iqg;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.SpareChangeScreen;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SpareChangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SpareChangeScreen spareChangeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = spareChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarD3 = this.v.R2();
        ActionsView.Item item = yVar.f167226b;
        String id10 = item.f58316a;
        Object obj3 = item.f58324n;
        com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar = (com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b) iVarD3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj3 instanceof Integer) {
            bVar.H2(bVar.f94751t, new ib6.j(obj3, 3));
        }
        return Unit.f186387a;
    }
}
