package t2a;

import cli.y;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.TransfersPersonalisationFlow;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.TransfersPersonalisationFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import yhm.r;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransfersPersonalisationFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TransfersPersonalisationFlow transfersPersonalisationFlow, Continuation continuation) {
        super(2, continuation);
        this.v = transfersPersonalisationFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((BasicNavBar.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVar;
        BasicNavBar.b click = (BasicNavBar.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.Q.getValue();
        Intrinsics.h(click);
        com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.a aVar2 = (com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.a) dVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(click, "click");
        if (!(click instanceof com.revolut.core.ui_kit.views.navbar.e)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((com.revolut.core.ui_kit.views.navbar.e) click).f59525a;
        y yVar = aVar2.o;
        if (!Intrinsics.f(((f) ((j2) yVar.f22677a).getValue()).f267521a, str)) {
            e eVar = e.GIF;
            if (Intrinsics.f(str, eVar.getId())) {
                rVar = new r(TransfersPersonalisationFlowContract$Step.Gif.f79963a, eVar.getId(), TransitionAnimation.SLIDE_END_TO_START.f98395a);
            } else {
                e eVar2 = e.STYLE;
                if (Intrinsics.f(str, eVar2.getId())) {
                    rVar = new r(TransfersPersonalisationFlowContract$Step.Style.f79964a, eVar2.getId(), TransitionAnimation.SLIDE_START_TO_END.f98396a);
                }
            }
            TransfersPersonalisationFlowContract$Step transfersPersonalisationFlowContract$Step = (TransfersPersonalisationFlowContract$Step) rVar.f314201a;
            String str2 = (String) rVar.f314202b;
            TransitionAnimation transitionAnimation = (TransitionAnimation) rVar.f314203c;
            aVar2.H2(yVar, new sef.j(str2, 20));
            oki.h.t2(aVar2, aVar2.f79965p, transfersPersonalisationFlowContract$Step, false, transitionAnimation, false, 8);
        }
        return Unit.f186387a;
    }
}
