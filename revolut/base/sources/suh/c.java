package suh;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.TimelineQuestionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TimelineQuestionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TimelineQuestionScreen timelineQuestionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = timelineQuestionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarG3 = this.v.h3();
        Object obj3 = model.f52715m;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Int");
        ((com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.b) hVarG3).N2(((Integer) obj3).intValue());
        return Unit.f186387a;
    }
}
