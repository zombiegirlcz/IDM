package ug9;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.apm.bills.core.api.model.form.ChoiceV2;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterDropdownField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextClause(domainState.f279985a.f61410b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30);
        RepeaterDropdownField repeaterDropdownField = domainState.f279985a;
        List list = domainState.f279986b;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String f61319a = ((BillInputV2) it8.next()).getF61319a();
            if (f61319a != null) {
                arrayList.add(f61319a);
            }
        }
        Set setI1 = d0.i1(arrayList);
        List list2 = repeaterDropdownField.f;
        ArrayList<ChoiceV2> arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!setI1.contains(((ChoiceV2) obj2).f61366a)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (ChoiceV2 choiceV2 : arrayList2) {
            arrayList3.add(new RowDelegate.Model(choiceV2.f61366a, null, new TextClause(choiceV2.f61367b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new sg9.b(repeaterDropdownField.f61409a, choiceV2), null, 0, 0, 0, 0, 532676602));
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList3, aVar);
    }
}
