package eu2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.call_security_info.impl.ui.call_detection.CallDetectionScreen;
import com.revolut.feature.call_security_info.impl.ui.call_detection.CallDetectionScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ CallDetectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CallDetectionScreen callDetectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = callDetectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.call_security_info.impl.ui.call_detection.b bVar = (com.revolut.feature.call_security_info.impl.ui.call_detection.b) ((e) this.u.P.getValue());
        d dVar = (d) ((j2) bVar.f64376t.f22677a).getValue();
        boolean z = dVar.f129478b;
        boolean z3 = dVar.f129477a;
        if (!z && z3) {
            bVar.n2(new h(bVar, null, 0), new whi.b(6));
        } else if (!z && !z3) {
            oki.h.v2(bVar.f64375s, CallDetectionScreenContract$Step.RequestPhonePermission.f64371a, ModalDestination.Style.POPUP.f98311a);
        } else if (z && z3) {
            bVar.n2(new h(bVar, null, 1), new whi.b(6));
        } else if (z && !z3) {
            bVar.n2(new com.revolut.feature.call_security_info.impl.ui.call_detection.a(bVar, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
