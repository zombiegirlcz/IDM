package k79;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    @NotNull
    public static final C1037a Companion = new C1037a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f181911a = new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    /* JADX INFO: renamed from: k79.a$a, reason: collision with other inner class name */
    public static final class C1037a {
        private C1037a() {
        }
    }

    public final void a(HtmlClause htmlClause, Clause clause, ArrayList arrayList) {
        if (htmlClause == null && clause == null) {
            return;
        }
        TextClause textClause = this.f181911a;
        if (htmlClause != null) {
            if (!arrayList.isEmpty()) {
                arrayList.add(textClause);
            }
            arrayList.add(htmlClause);
        }
        if (clause != null) {
            if (!arrayList.isEmpty()) {
                arrayList.add(textClause);
            }
            arrayList.add(clause);
        }
    }

    public final CompositeClause b(List list) {
        ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("blocks", list);
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            m79.g gVar = (m79.g) it8.next();
            Clause compositeClause = null;
            if (gVar instanceof m79.f) {
                m79.f fVar = (m79.f) gVar;
                String str = fVar.f203357a;
                HtmlClause htmlClause = (str == null || d0.W(str)) ? null : new HtmlClause(1, 28, (Integer) null, (Object) null, p.a.p("<b>", str, "</b>"));
                String str2 = fVar.f203358b;
                HtmlClause htmlClause2 = (str2 == null || d0.W(str2)) ? null : new HtmlClause(1, 28, (Integer) null, (Object) null, str2);
                m79.b bVar = fVar.f203359c;
                TextClause textClause = bVar != null ? new TextClause(bVar.f203351a, (Style) new Click(28, (Integer) null, (Object) bVar, bVar.f203352b, false), (Integer) null, false, (o9) null, (List) null, 124) : null;
                if (textClause != null && htmlClause2 != null) {
                    compositeClause = new CompositeClause(v.k(htmlClause2, textClause), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                } else if (htmlClause2 != null) {
                    compositeClause = htmlClause2;
                } else if (textClause != null) {
                    compositeClause = textClause;
                }
                a(htmlClause, compositeClause, arrayListY);
            } else if (gVar instanceof m79.c) {
                ArrayList<m79.d> arrayList = ((m79.c) gVar).f203353a;
                ArrayList arrayList2 = new ArrayList();
                for (m79.d dVar : arrayList) {
                    String str3 = dVar.f203355b;
                    String str4 = dVar.f203354a;
                    HtmlClause htmlClause3 = (str3 == null || str4 == null) ? str4 != null ? new HtmlClause(1, 28, (Integer) null, (Object) null, p.a.p("<li><b>", str4, "</b></li>")) : str3 != null ? new HtmlClause(1, 28, (Integer) null, (Object) null, p.a.p("<li>", str3, "</li>")) : null : new HtmlClause(1, 28, (Integer) null, (Object) null, j6.a.s("<li><b>", str4, "</b>\n", str3, "</li>"));
                    if (htmlClause3 != null) {
                        arrayList2.add(htmlClause3);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    a(null, new CompositeClause(arrayList2, this.f181911a, null, null, 12), arrayListY);
                }
            } else {
                if (!(gVar instanceof m79.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                a(null, ((m79.e) gVar).f203356a, arrayListY);
            }
        }
        return new CompositeClause(arrayListY, null, null, null, 14);
    }
}
