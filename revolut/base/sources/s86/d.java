package s86;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.devicemanagement.impl.ui.details.DeviceDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeviceDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DeviceDetailsController deviceDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = deviceDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item action = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVar = (g) this.v.Q.getValue();
        Intrinsics.h(action);
        l lVar = (l) gVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.f(action.f58316a, "DEVICE_ACTIONS_LOGOUT_LIST_ID")) {
            lVar.C2(new h((UserDevice) zi0.c.I(((f) ((j2) lVar.f260915s.f22677a).getValue()).f260905a)));
        }
        return Unit.f186387a;
    }
}
