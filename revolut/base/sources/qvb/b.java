package qvb;

import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m1c.o1;
import m1c.p1;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final RevPointsTextWithLinks a(o1 o1Var) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(o1Var, "<this>");
        String text = o1Var.getText();
        List links = o1Var.getLinks();
        if (links != null) {
            List<o1.c> list = links;
            arrayList = new ArrayList(w.t(list, 10));
            for (o1.c cVar : list) {
                arrayList.add(new RevPointsTextWithLinks.Link(cVar.getText(), cVar.getUrl(), cVar.getTermsScope()));
            }
        } else {
            arrayList = null;
        }
        return new RevPointsTextWithLinks(text, arrayList);
    }

    public static final RevPointsTextWithLinks b(p1 p1Var) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(p1Var, "<this>");
        String text = p1Var.getText();
        List links = p1Var.getLinks();
        if (links != null) {
            List<p1.a> list = links;
            arrayList = new ArrayList(w.t(list, 10));
            for (p1.a aVar : list) {
                arrayList.add(new RevPointsTextWithLinks.Link(aVar.getText(), aVar.getUrl(), aVar.getTermsScope()));
            }
        } else {
            arrayList = null;
        }
        return new RevPointsTextWithLinks(text, arrayList);
    }

    public static final p1 c(RevPointsTextWithLinks revPointsTextWithLinks) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(revPointsTextWithLinks, "<this>");
        String str = revPointsTextWithLinks.f84047a;
        List list = revPointsTextWithLinks.f84048b;
        if (list != null) {
            List<RevPointsTextWithLinks.Link> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (RevPointsTextWithLinks.Link link : list2) {
                arrayList.add(new p1.a(link.f84049a, link.f84050b, link.f84051c));
            }
        } else {
            arrayList = null;
        }
        return new p1(str, arrayList);
    }
}
