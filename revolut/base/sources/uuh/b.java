package uuh;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.yes_no.YesNoQuestionScreen;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) obj2;
        c cVar = (c) this.receiver;
        int i = YesNoQuestionScreen.U;
        d dVar = (d) cVar;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Question.YesNo yesNo = (Question.YesNo) model.i;
        if (yesNo != null) {
            dVar.I2(new Answer.YesNo(yesNo.f105636a, a0.y(model.f52519a, "Yes", false)));
        }
        return Unit.f186387a;
    }
}
