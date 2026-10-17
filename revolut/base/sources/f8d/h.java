package f8d;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.model.faq.FaqMetaData;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause = domainState.f132764a;
        List<FaqMetaData> list = domainState.f132765b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (FaqMetaData faqMetaData : list) {
            arrayList.add(new InputDisclosureDelegate.Model(faqMetaData.f51419a, new TextClause(faqMetaData.f51420b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, l7d.a.b(faqMetaData.f51419a), 988));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new f(clause, arrayList);
    }
}
