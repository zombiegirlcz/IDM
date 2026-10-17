package wek;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.pod_nominees.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import uek.e;
import uek.g;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static TextLocalisedClause a(g gVar) {
        ArrayList arrayList = gVar.f279472b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(Long.valueOf(((e) it8.next()).f279467b));
        }
        return new TextLocalisedClause(R$string.pod_nominees_edit_percentage_footer_of, v.k(new TextClause(ch.qos.logback.core.util.a.p(d0.U0(arrayList2), "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("100%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
    }
}
