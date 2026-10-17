package hp3;

import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CorporateEventsHomeScreen f154402w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CorporateEventsHomeScreen corporateEventsHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.f154402w = corporateEventsHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.f154402w, continuation);
        eVar.v = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CalendarRowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CalendarRowDelegate.Model model = (CalendarRowDelegate.Model) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            n nVarR2 = this.f154402w.R2();
            Intrinsics.h(model);
            this.v = null;
            this.u = 1;
            com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR2;
            bVar.getClass();
            Object obj3 = model.u;
            kp3.b bVar2 = obj3 instanceof kp3.b ? (kp3.b) obj3 : null;
            if (bVar2 != null) {
                bVar.C1(new BridgeDestination(h8b.a.a(bVar.u, bVar2, Intrinsics.f(((m) ((j2) bVar.f66146x.f22677a).getValue()).d, "MY_EVENTS_TAB_ID"))));
            }
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
