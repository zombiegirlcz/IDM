package w86;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.devicemanagement.impl.ui.list.DeviceListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeviceListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DeviceListController deviceListController, Continuation continuation) {
        super(2, continuation);
        this.v = deviceListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh clickData = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.R.getValue();
        Intrinsics.h(clickData);
        k kVar = (k) fVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj3 = ((RowDelegate.Model) clickData.f54884b).u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.devicemanagement.api.model.UserDevice");
        kVar.C2(new h((UserDevice) obj3));
        return Unit.f186387a;
    }
}
