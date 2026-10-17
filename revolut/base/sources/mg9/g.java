package mg9;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.apm.bills.core.api.model.form.ChoiceV2;
import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextClause(domainState.f205195a.f61380b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30);
        DropdownField dropdownField = domainState.f205195a;
        List<ChoiceV2> list = dropdownField.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ChoiceV2 choiceV2 : list) {
            String str = choiceV2.f61366a;
            TextClause textClause = new TextClause(choiceV2.f61367b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = choiceV2.f61368c;
            arrayList.add(new RowDelegate.Model(str, null, textClause, null, 0, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new sg9.b(dropdownField.f61379a, choiceV2), null, 0, 0, 0, 0, 532676570));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }
}
