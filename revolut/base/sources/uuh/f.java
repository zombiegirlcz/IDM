package uuh;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import ip0.iq;
import iuh.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends j {

    @NotNull
    public static final e Companion = new e();

    @Override // iuh.j
    public final List a(iuh.e domainState) {
        InputChecklistDelegate.Model model;
        boolean z;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Question.YesNo yesNo = (Question.YesNo) domainState.f168606a;
        Answer.YesNo yesNo2 = (Answer.YesNo) domainState.f168607b;
        String strR = a0.d.r(yesNo.f105636a, "Yes");
        TextClause textClause = new TextClause(yesNo.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        iq iqVar = iq.RADIO_BUTTON;
        InputChecklistDelegate.Model model2 = new InputChecklistDelegate.Model(strR, textClause, yesNo2 != null && yesNo2.f96538b, false, null, iqVar, null, null, yesNo, null, 0, 0, 0, 523992);
        String strR2 = a0.d.r(yesNo.f105636a, "No");
        TextClause textClause2 = new TextClause(yesNo.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (yesNo2 == null || yesNo2.f96538b) {
            model = model2;
            z = false;
        } else {
            z = true;
            model = model2;
        }
        List listK = v.k(model, new InputChecklistDelegate.Model(strR2, textClause2, z, false, null, iqVar, null, null, yesNo, null, 0, 0, 0, 523992));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }
}
