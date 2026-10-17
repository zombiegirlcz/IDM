package u86;

import com.revolut.feature.devicemanagement.impl.ui.flow.DeviceManagementFlow;
import gim.i;
import h86.f;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u2i.g;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DeviceManagementFlow f278124w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DeviceManagementFlow deviceManagementFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f278124w = deviceManagementFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f278124w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f278124w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        DeviceManagementFlow deviceManagementFlow = this.f278124w;
        switch (i) {
            case 0:
                um0 model = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVar = (d) deviceManagementFlow.O.getValue();
                Intrinsics.h(model);
                com.revolut.feature.devicemanagement.impl.ui.flow.b bVar = (com.revolut.feature.devicemanagement.impl.ui.flow.b) dVar;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f166695a, "DEVICE_TWIN_BUTTONS_LIST_ID")) {
                    j60.a.v(bVar.f71941r, false, null, 3);
                }
                break;
            default:
                um0 model2 = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVar2 = (d) deviceManagementFlow.O.getValue();
                Intrinsics.h(model2);
                com.revolut.feature.devicemanagement.impl.ui.flow.b bVar2 = (com.revolut.feature.devicemanagement.impl.ui.flow.b) dVar2;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                if (Intrinsics.f(model2.f166695a, "DEVICE_TWIN_BUTTONS_LIST_ID")) {
                    Object obj3 = model2.d;
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.devicemanagement.api.model.LogOutAction");
                    bVar2.l2(new g(bVar2, (f) obj3, continuation, 2), new yi5.b(26));
                    j60.a.v(bVar2.f71941r, false, null, 3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
