package iuh;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Dialog;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements m {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final CompositeClause a(Question question) {
        String str;
        Intrinsics.checkNotNullParameter(question, "question");
        String f105638c = question.getF105638c();
        TextClause textClause = f105638c != null ? new TextClause(f105638c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null;
        Dialog d = question.getD();
        TextClause textClause2 = (d == null || (str = d.f105585a) == null) ? null : new TextClause(str, (Style) new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) question.getD(), "hidden_dialog_id", false), (Integer) null, false, (o9) null, (List) null, 124);
        if (textClause == null && textClause2 == null) {
            return null;
        }
        TextClause[] elements = {textClause, textClause2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
    }
}
