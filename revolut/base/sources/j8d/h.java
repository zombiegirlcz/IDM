package j8d;

import aw0.o9;
import com.revolut.core.model.faq.FaqAction;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements p {
    @Override // jki.p
    public final m a(i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.help_center_screen_faq_list_topic_title, null, null, 14);
        aim.e eVarB = u.b();
        List<FaqAction> list = domainState.f172168a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (FaqAction faqAction : list) {
            String str = faqAction.f51416a;
            arrayList.add(new CellDetailsChevronDelegate.Model(str, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, false, faqAction, null, null, 2028));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        return new f(u.a(eVarB), textLocalisedClause);
    }
}
