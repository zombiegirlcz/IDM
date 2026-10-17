package quh;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import iuh.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends j {
    @Override // iuh.j
    public final List a(iuh.e domainState) {
        String str;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Question.Text text = (Question.Text) domainState.f168606a;
        String str2 = text.f105624a;
        Answer.Text text2 = (Answer.Text) domainState.f168607b;
        TextClause textClause = (text2 == null || (str = text2.f96531b) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str3 = text.e;
        TextClause textClause2 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str4 = text.f;
        TextClause textClause3 = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        Integer num = text.f105627g;
        List listC = u.c(new InputTextDelegate.Model(str2, textClause, textClause2, null, textClause3, null, null, num != null, num, false, false, 0, false, 0, false, false, false, null, false, false, 0, false, false, text, -16826504, 130559));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
