package jnc;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreen;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreenContract$ModalStep;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ ProjectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ProjectionScreen projectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = projectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Template template;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.robo.impl.ui.screen.projection.a aVar2 = (com.revolut.feature.robo.impl.ui.screen.projection.a) this.u.d();
        Data data = ((e) ((j2) aVar2.f85191x.f22677a).getValue()).e;
        if (data != null && (template = (Template) data.getContent()) != null) {
            oki.h.v2(aVar2.f85192y, new ProjectionScreenContract$ModalStep.Strategy(template), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
