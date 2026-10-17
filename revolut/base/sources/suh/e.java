package suh;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.TimelineQuestionScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.TimelineQuestionScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TimelineQuestionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TimelineQuestionScreen timelineQuestionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = timelineQuestionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Long l2;
        Object next;
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
        Answer answer2 = ((iuh.e) j2Var2.getValue()).f168607b;
        if (answer2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Iterator it8 = d0.I0(((Answer.Timeline) answer2).f96533b.subList(0, iIntValue)).iterator();
        while (true) {
            l2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            Answer.Timeline.Item item2 = (Answer.Timeline.Item) next;
            if (item2.f96536c != null || item2.f96535b != null) {
                break;
            }
        }
        Answer.Timeline.Item item3 = (Answer.Timeline.Item) next;
        if (item3 != null) {
            Long l3 = item3.f96536c;
            if (l3 == null) {
                l3 = item3.f96535b;
            }
            l2 = l3;
        }
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.f96576s;
        String str = ((Question.Timeline) ((iuh.e) j2Var2.getValue()).f168606a).e.f105634b;
        com.revolut.shared.feature.workflow.engine.api.models.workflow.a aVar3 = ((Question.Timeline) ((iuh.e) j2Var2.getValue()).f168606a).e.d;
        Long l4 = item.f96535b;
        Long l5 = ((Question.Timeline) ((iuh.e) j2Var2.getValue()).f168606a).e.e;
        Long l22 = item.f96536c;
        if (l22 == null) {
            l22 = ((Question.Timeline) ((iuh.e) j2Var2.getValue()).f168606a).e.f;
        }
        oki.h.v2(aVar2, new TimelineQuestionScreenContract$ModalStep.StartDatePicker(iIntValue, str, aVar3, l2, l4, l5, l22), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
