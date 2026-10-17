package v90;

import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptItem;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.backend_flow.domain.models.ImageItem;
import com.revolut.feature.backend_flow.domain.models.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import q90.c0;
import q90.h4;
import q90.m4;
import q90.t1;
import q90.u1;
import u90.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t90.a f286949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f286950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d0 itemsMapperProvider, t90.a actionMapper, o transitionMapper) {
        super(itemsMapperProvider);
        Intrinsics.checkNotNullParameter(itemsMapperProvider, "itemsMapperProvider");
        Intrinsics.checkNotNullParameter(actionMapper, "actionMapper");
        Intrinsics.checkNotNullParameter(transitionMapper, "transitionMapper");
        this.f286949b = actionMapper;
        this.f286950c = transitionMapper;
    }

    @Override // v90.a
    public final BackendScreen a(m4 m4Var) {
        ArrayList arrayList;
        q90.d0 screen = (q90.d0) m4Var;
        Intrinsics.checkNotNullParameter(screen, "screen");
        String id10 = screen.getId();
        String previousViewId = screen.getPreviousViewId();
        String title = screen.getTitle();
        t1 subtitleHtml = screen.getSubtitleHtml();
        ArrayList arrayList2 = null;
        HtmlStringItem htmlStringItem = subtitleHtml != null ? (HtmlStringItem) c(subtitleHtml, f0.f322471a) : null;
        u1 image = screen.getImage();
        ImageItem imageItem = image != null ? (ImageItem) c(image, f0.f322471a) : null;
        List<c0> items = screen.getItems();
        ArrayList arrayList3 = new ArrayList(w.t(items, 10));
        for (c0 c0Var : items) {
            arrayList3.add(new BottomPromptItem(t90.e.a(c0Var.getIcon(), null), (HtmlStringItem) c(c0Var.getTextHtml(), f0.f322471a), c0Var.getVisible()));
        }
        List componentItems = screen.getComponentItems();
        if (componentItems == null) {
            componentItems = f0.f322471a;
        }
        List listD = d(componentItems);
        List next = screen.getNext();
        if (next != null) {
            List list = next;
            ArrayList arrayList4 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList4.add(this.f286950c.k((h4) it8.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        List actions = screen.getActions();
        if (actions != null) {
            List<q90.a> list2 = actions;
            arrayList2 = new ArrayList(w.t(list2, 10));
            for (q90.a aVar : list2) {
                this.f286949b.getClass();
                arrayList2.add(t90.a.a(aVar));
            }
        }
        return new BottomPromptScreen(id10, title, htmlStringItem, imageItem, arrayList3, listD, arrayList, arrayList2, previousViewId, screen.getAnalyticsName());
    }

    @Override // v90.a
    public final m4 b(BackendScreen backendScreen) {
        ArrayList arrayList;
        BottomPromptScreen screen = (BottomPromptScreen) backendScreen;
        Intrinsics.checkNotNullParameter(screen, "screen");
        String str = screen.f63326a;
        String str2 = screen.i;
        String str3 = screen.f63327b;
        HtmlStringItem htmlStringItem = screen.f63328c;
        ArrayList arrayList2 = null;
        t1 t1Var = htmlStringItem != null ? (t1) e(htmlStringItem) : null;
        ImageItem imageItem = screen.d;
        u1 u1Var = imageItem != null ? (u1) e(imageItem) : null;
        ArrayList<BottomPromptItem> arrayList3 = screen.e;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        for (BottomPromptItem bottomPromptItem : arrayList3) {
            arrayList4.add(new c0(t90.e.b(bottomPromptItem.f63323a), (t1) e(bottomPromptItem.f63324b), bottomPromptItem.f63325c));
        }
        List list = screen.f;
        ArrayList arrayList5 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList5.add(e((BackendItem) it8.next()));
        }
        List list2 = screen.f63329g;
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList.add(this.f286950c.m((Transition) it9.next()));
            }
        } else {
            arrayList = null;
        }
        List list4 = screen.f63330h;
        if (list4 != null) {
            List<Action> list5 = list4;
            arrayList2 = new ArrayList(w.t(list5, 10));
            for (Action action : list5) {
                this.f286949b.getClass();
                arrayList2.add(t90.a.b(action));
            }
        }
        return new q90.d0(str, str2, str3, t1Var, u1Var, arrayList4, arrayList5, arrayList, arrayList2, screen.f63331j);
    }
}
