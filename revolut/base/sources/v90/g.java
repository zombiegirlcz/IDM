package v90;

import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.backend_flow.domain.models.ImageItem;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import q90.c3;
import q90.h4;
import q90.m4;
import q90.t1;
import q90.u1;
import u90.a0;
import u90.y;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f286956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f286957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f286958c;

    public g(t90.a actionMapper, y htmlItemMapper, a0 imageItemMapper, o transitionMapper) {
        Intrinsics.checkNotNullParameter(actionMapper, "actionMapper");
        Intrinsics.checkNotNullParameter(htmlItemMapper, "htmlItemMapper");
        Intrinsics.checkNotNullParameter(imageItemMapper, "imageItemMapper");
        Intrinsics.checkNotNullParameter(transitionMapper, "transitionMapper");
        this.f286956a = htmlItemMapper;
        this.f286957b = imageItemMapper;
        this.f286958c = transitionMapper;
    }

    @Override // v90.a
    public final BackendScreen a(m4 m4Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        xl2.a0 a0Var;
        c3 screen = (c3) m4Var;
        Intrinsics.checkNotNullParameter(screen, "screen");
        String id10 = screen.getId();
        String previousViewId = screen.getPreviousViewId();
        String title = screen.getTitle();
        t1 subtitleHtml = screen.getSubtitleHtml();
        f0 f0Var = f0.f322471a;
        HtmlStringItem htmlStringItem = (HtmlStringItem) this.f286956a.a(subtitleHtml, f0Var);
        u1 image = screen.getImage();
        ImageItem imageItem = image != null ? (ImageItem) this.f286957b.a(image, f0Var) : null;
        List next = screen.getNext();
        if (next != null) {
            List list = next;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(this.f286958c.k((h4) it8.next()));
            }
        } else {
            arrayList = null;
        }
        List actions = screen.getActions();
        if (actions != null) {
            List list2 = actions;
            arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(t90.a.a((q90.a) it9.next()));
            }
        } else {
            arrayList2 = null;
        }
        String actionsOrientation = screen.getActionsOrientation();
        if (actionsOrientation != null) {
            for (xl2.a0 a0Var2 : xl2.a0.values()) {
                if (kotlin.text.a0.z(a0Var2.name(), actionsOrientation, true)) {
                    a0Var = a0Var2;
                    break;
                }
            }
            a0Var = null;
        } else {
            a0Var = null;
        }
        return new PromptScreen(id10, title, htmlStringItem, imageItem, arrayList, a0Var, arrayList2, previousViewId, screen.getAnalyticsName());
    }

    @Override // v90.a
    public final m4 b(BackendScreen backendScreen) {
        ArrayList arrayList;
        ArrayList arrayList2;
        PromptScreen screen = (PromptScreen) backendScreen;
        Intrinsics.checkNotNullParameter(screen, "screen");
        String str = screen.f63585a;
        String str2 = screen.f63589h;
        String str3 = screen.f63586b;
        t1 t1VarC = y.c(screen.f63587c);
        ImageItem imageItem = screen.d;
        u1 u1VarC = imageItem != null ? a0.c(imageItem) : null;
        List list = screen.e;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(this.f286958c.m((Transition) it8.next()));
            }
        } else {
            arrayList = null;
        }
        List list3 = screen.f63588g;
        if (list3 != null) {
            List list4 = list3;
            arrayList2 = new ArrayList(w.t(list4, 10));
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                arrayList2.add(t90.a.b((Action) it9.next()));
            }
        } else {
            arrayList2 = null;
        }
        xl2.a0 a0Var = screen.f;
        return new c3(str, str2, str3, t1VarC, u1VarC, arrayList, arrayList2, a0Var != null ? a0Var.name() : null, screen.i);
    }
}
