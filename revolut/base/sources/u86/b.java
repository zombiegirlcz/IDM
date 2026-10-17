package u86;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature.devicemanagement.impl.ui.flow.DeviceManagementFlow;
import gim.i;
import h86.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeviceManagementFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DeviceManagementFlow deviceManagementFlow, Continuation continuation) {
        super(2, continuation);
        this.v = deviceManagementFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.O.getValue();
        Intrinsics.h(model);
        com.revolut.feature.devicemanagement.impl.ui.flow.b bVar = (com.revolut.feature.devicemanagement.impl.ui.flow.b) dVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51917h;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.devicemanagement.api.model.LogOutAction");
        f fVar = (f) obj3;
        if (fVar instanceof h86.d) {
            throw new IllegalStateException("Not supported");
        }
        if (!(fVar instanceof h86.e)) {
            throw new NoWhenBranchMatchedException();
        }
        bVar.I2(new h86.e(!model.f51915c));
        return Unit.f186387a;
    }
}
