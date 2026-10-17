package ouh;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import iuh.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends j {
    @Override // iuh.j
    public final List a(iuh.e domainState) {
        TextClause textClause;
        Answer.MultiText.Item item;
        String str;
        List list;
        Object next;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList<Question.MultiText.Item> arrayList = ((Question.MultiText) domainState.f168606a).e;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (Question.MultiText.Item item2 : arrayList) {
            Answer.MultiText multiText = (Answer.MultiText) domainState.f168607b;
            if (multiText == null || (list = multiText.f96523b) == null) {
                textClause = null;
                item = null;
            } else {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((Answer.MultiText.Item) next).f96524a, item2.f105621a)) {
                        break;
                    }
                }
                item = (Answer.MultiText.Item) next;
                textClause = null;
            }
            String str2 = item2.f105621a;
            TextClause textClause2 = (item == null || (str = item.f96525b) == null) ? textClause : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str3 = item2.f105622b;
            TextClause textClause3 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : textClause;
            String str4 = item2.f105623c;
            TextClause textClause4 = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : textClause;
            Integer num = item2.d;
            InputTextDelegate.Model model = new InputTextDelegate.Model(str2, textClause2, textClause3, null, textClause4, null, null, num != null, num, false, false, 0, false, 0, false, false, false, null, false, false, 0, false, false, item2, -16826504, 130559);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
        }
        return arrayList2;
    }
}
