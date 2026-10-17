package ozb;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    public static abstract class a {
        private a() {
        }

        public abstract String a();
    }

    public final Clause a(RevPointsTextWithLinks textWithLinks) {
        Click click;
        Intrinsics.checkNotNullParameter(textWithLinks, "textWithLinks");
        String str = textWithLinks.f84047a;
        List list = textWithLinks.f84048b;
        if (ue0.e.n(list)) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        try {
            ArrayList<a> arrayList = new ArrayList();
            int size = list.size();
            int length = 0;
            for (int i = 0; i < size; i++) {
                RevPointsTextWithLinks.Link link = (RevPointsTextWithLinks.Link) list.get(i);
                int iT = d0.T(str, link.f84049a, length, false, 4);
                if (iT >= 0) {
                    if (iT > length) {
                        String strSubstring = str.substring(length, iT);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        arrayList.add(new d(strSubstring));
                    }
                    arrayList.add(new c(link));
                    length = link.f84049a.length() + iT;
                }
                if (i == v.j(list) && length < str.length()) {
                    String strSubstring2 = str.substring(length, str.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    arrayList.add(new d(strSubstring2));
                }
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (a aVar : arrayList) {
                String strA = aVar.a();
                if (aVar instanceof d) {
                    click = null;
                } else {
                    if (!(aVar instanceof c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    click = new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) new fub.b(((c) aVar).f231255a.f84050b), ((c) aVar).f231255a.f84050b, false);
                }
                arrayList2.add(new TextClause(strA, (Style) click, (Integer) null, false, (o9) null, (List) null, 124));
            }
            return new CompositeClause(arrayList2, null, null, null, 14);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            String str2 = ((RevPointsTextWithLinks.Link) zhm.d0.b0(list)).f84050b;
            return new TextClause(str, (Style) new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) new fub.b(str2), str2, false), (Integer) null, false, (o9) null, (List) null, 124);
        }
    }
}
