package juh;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.choice.ChoiceQuestionScreen;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import gim.i;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChoiceQuestionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ChoiceQuestionScreen choiceQuestionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = choiceQuestionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Answer multiChoice;
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.S.getValue();
        Intrinsics.h(model);
        c cVar = (c) bVar;
        y yVar = cVar.f168616p;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        Question.Choice.Option option = obj3 instanceof Question.Choice.Option ? (Question.Choice.Option) obj3 : null;
        if (option != null) {
            String str = option.f105602a;
            Question.Choice choice = (Question.Choice) ((iuh.e) ((j2) yVar.f22677a).getValue()).f168606a;
            if (choice instanceof Question.Choice.SingleChoice) {
                multiChoice = new Answer.Selection.SingleChoice(((Question.Choice.SingleChoice) choice).f105605a, str);
            } else {
                if (!(choice instanceof Question.Choice.MultiChoice)) {
                    throw new NoWhenBranchMatchedException();
                }
                Answer.Selection.MultiChoice multiChoice2 = (Answer.Selection.MultiChoice) ((iuh.e) ((j2) yVar.f22677a).getValue()).f168607b;
                if (multiChoice2 == null) {
                    multiChoice2 = new Answer.Selection.MultiChoice(((Question.Choice.MultiChoice) choice).f105599a, f0.f322471a);
                }
                ArrayList optionIds = d0.f1(multiChoice2.f96527b);
                if (optionIds.contains(str)) {
                    optionIds.remove(str);
                } else {
                    optionIds.add(str);
                }
                String questionId = multiChoice2.f96526a;
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(optionIds, "optionIds");
                multiChoice = new Answer.Selection.MultiChoice(questionId, optionIds);
            }
            cVar.I2(multiChoice);
        }
        return Unit.f186387a;
    }
}
