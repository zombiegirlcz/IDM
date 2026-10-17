package ptb;

import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlow;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yhm.o;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MainContainerFlow v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wx0.a f239640w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MainContainerFlow mainContainerFlow, wx0.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = mainContainerFlow;
        this.f239640w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, this.f239640w, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        KProperty[] kPropertyArr = MainContainerFlow.T;
        int size = list.size();
        wx0.a aVar2 = this.f239640w;
        if (size > 1) {
            aVar2.setItems(list);
        } else {
            aVar2.setItems(f0.f322471a);
        }
        MainContainerFlow mainContainerFlow = this.v;
        FlowStep flowStepD = ((com.revolut.feature.rev10_main_screen.impl.ui.a) mainContainerFlow.d()).f83444x.d();
        Object obj3 = null;
        MainContainerFlowContract$Step.Tab tab2 = flowStepD instanceof MainContainerFlowContract$Step.Tab ? (MainContainerFlowContract$Step.Tab) flowStepD : null;
        MainScreenTab mainScreenTab = tab2 != null ? tab2.f83436a : null;
        if (mainScreenTab == null || (str = mainScreenTab.f83420a) == null) {
            return Unit.f186387a;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((FloatingBottomBarView.Item) next).f58588a, str)) {
                obj3 = next;
                break;
            }
        }
        if (obj3 == null) {
            ((com.revolut.feature.rev10_main_screen.impl.ui.a) mainContainerFlow.d()).J2(((FloatingBottomBarView.Item) d0.b0(list)).f58588a);
        } else {
            aVar2.b(str);
        }
        return Unit.f186387a;
    }
}
