package v23;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f285630a;
        String str = domainState.f285631b;
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (String str2 : list2) {
            arrayList.add(new InputChecklistDelegate.Model(str2, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str2.equals(str), false, null, iq.RADIO_BUTTON, null, null, str2, null, 0, 0, 0, 523992));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new h(arrayList, !(str == null || d0.W(str)));
    }
}
