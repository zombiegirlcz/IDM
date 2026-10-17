package suh;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.TimelineQuestionScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.TimelineQuestionScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TimelineQuestionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TimelineQuestionScreen timelineQuestionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = timelineQuestionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarG3 = this.v.h3();
        Object obj3 = model.P;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj3).intValue();
        com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.b bVar = (com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.b) hVarG3;
        y yVar = bVar.f96575r;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        Answer answer = ((iuh.e) j2Var.getValue()).f168607b;
        if (answer == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Answer.Timeline.Item item = (Answer.Timeline.Item) ((Answer.Timeline) answer).f96533b.get(iIntValue);
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.f96576s;
        String str = ((Question.Timeline) ((iuh.e) j2Var2.getValue()).f168606a).e.f105635c;
        com.revolut.shared.feature.workflow.engine.api.models.workflow.a aVar3 = ((Question.Timeline) ((iuh.e) j2Var2.getValue()).f168606a).e.d;
        Long l2 = item.f96535b;
        oki.h.v2(aVar2, new TimelineQuestionScreenContract$ModalStep.EndDatePicker(iIntValue, str, aVar3, l2, item.f96536c, l2 == null ? ((Question.Timeline) ((iuh.e) j2Var2.getValue()).f168606a).e.e : l2, ((Question.Timeline) ((iuh.e) j2Var2.getValue()).f168606a).e.f), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
