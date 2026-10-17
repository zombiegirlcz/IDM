package juh;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import ip0.iq;
import iuh.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends j {
    @Override // iuh.j
    public final List a(iuh.e domainState) {
        iq iqVar;
        boolean zF;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Question.Choice choice = (Question.Choice) domainState.f168606a;
        Answer.Selection selection = (Answer.Selection) domainState.f168607b;
        List<Question.Choice.Option> listC = choice.c();
        ArrayList arrayList = new ArrayList(w.t(listC, 10));
        for (Question.Choice.Option option : listC) {
            String str = option.f105602a;
            TextClause textClause = new TextClause(option.f105603b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = option.f105604c;
            InputChecklistDelegate.a.b bVar = new InputChecklistDelegate.a.b(str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
            if (choice instanceof Question.Choice.MultiChoice) {
                iqVar = iq.CHECK_BUTTON;
            } else {
                if (!(choice instanceof Question.Choice.SingleChoice)) {
                    throw new NoWhenBranchMatchedException();
                }
                iqVar = iq.RADIO_BUTTON;
            }
            iq iqVar2 = iqVar;
            if (selection instanceof Answer.Selection.MultiChoice) {
                zF = ((Answer.Selection.MultiChoice) selection).f96527b.contains(str);
            } else if (selection instanceof Answer.Selection.SingleChoice) {
                zF = Intrinsics.f(((Answer.Selection.SingleChoice) selection).f96529b, str);
            } else {
                if (selection != null) {
                    throw new NoWhenBranchMatchedException();
                }
                zF = false;
            }
            arrayList.add(new InputChecklistDelegate.Model(str, textClause, zF, false, bVar, iqVar2, null, null, option, null, 0, 0, 0, 523976));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
