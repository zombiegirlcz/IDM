package btf;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoFieldOption;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(domainState.f18570a, null, null, null, false, 30);
        List list = domainState.f18571b;
        String str = domainState.f18572c;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            AdditionalInfoFieldOption additionalInfoFieldOption = (AdditionalInfoFieldOption) it8.next();
            String str2 = additionalInfoFieldOption.f92411a;
            Iterator it9 = it8;
            arrayList.add(new SelectableDelegate.Model(j6.a.q("DROPDOWN_SELECTION_LIST_ID_", str2), new RowDelegate.Model(j6.a.q("DROPDOWN_SELECTION_INNER_ID_", str2), null, new TextClause(additionalInfoFieldOption.f92412b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, additionalInfoFieldOption, null, 0, 0, 0, 0, 532676602), Intrinsics.f(str2, str) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, additionalInfoFieldOption, null, false, 32488));
            it8 = it9;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }
}
