package v90;

import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.backend_flow.domain.models.InfoListItemSubitem;
import com.revolut.feature.backend_flow.domain.models.InfoMessageItem;
import com.revolut.feature.backend_flow.domain.models.InfoMessageItemDetails;
import com.revolut.feature.backend_flow.domain.models.SecondaryDescription;
import com.revolut.feature.backend_flow.domain.models.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import q90.a2;
import q90.d3;
import q90.h4;
import q90.m4;
import q90.q1;
import q90.t1;
import q90.x1;
import q90.z1;
import u90.c0;
import u90.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t90.a f286951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f286952c;
    public final c0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d0 itemsMapperProvider, t90.a actionMapper, o transitionMapper, c0 infoListItemSubitemMapper) {
        super(itemsMapperProvider);
        Intrinsics.checkNotNullParameter(itemsMapperProvider, "itemsMapperProvider");
        Intrinsics.checkNotNullParameter(actionMapper, "actionMapper");
        Intrinsics.checkNotNullParameter(transitionMapper, "transitionMapper");
        Intrinsics.checkNotNullParameter(infoListItemSubitemMapper, "infoListItemSubitemMapper");
        this.f286951b = actionMapper;
        this.f286952c = transitionMapper;
        this.d = infoListItemSubitemMapper;
    }

    @Override // v90.a
    public final BackendScreen a(m4 m4Var) {
        ArrayList arrayList;
        SecondaryDescription secondaryDescription;
        Action actionA;
        ArrayList arrayList2;
        q1 q1Var;
        List list;
        String str;
        InfoMessageItem infoMessageItem;
        ArrayList arrayList3;
        q1 screen = (q1) m4Var;
        Intrinsics.checkNotNullParameter(screen, "screen");
        String id10 = screen.getId();
        String previousViewId = screen.getPreviousViewId();
        String nextText = screen.getNextText();
        List next = screen.getNext();
        if (next != null) {
            List list2 = next;
            ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList4.add(this.f286952c.k((h4) it8.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        String title = screen.getTitle();
        String subtitle = screen.getSubtitle();
        d3 secondaryDescription2 = screen.getSecondaryDescription();
        if (secondaryDescription2 != null) {
            String id11 = secondaryDescription2.getId();
            String title2 = secondaryDescription2.getTitle();
            String subtitle2 = secondaryDescription2.getSubtitle();
            t1 subtitleHtml = secondaryDescription2.getSubtitleHtml();
            HtmlStringItem htmlStringItem = subtitleHtml != null ? (HtmlStringItem) c(subtitleHtml, f0.f322471a) : null;
            String label = secondaryDescription2.getLabel();
            String buttonTitle = secondaryDescription2.getButtonTitle();
            List items = secondaryDescription2.getItems();
            if (items != null) {
                List list3 = items;
                ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList5.add(this.d.a((x1) it9.next(), null));
                }
                arrayList3 = arrayList5;
            } else {
                arrayList3 = null;
            }
            secondaryDescription = new SecondaryDescription(id11, label, title2, subtitle2, htmlStringItem, arrayList3, buttonTitle);
        } else {
            secondaryDescription = null;
        }
        t1 subtitleHtml2 = screen.getSubtitleHtml();
        HtmlStringItem htmlStringItem2 = subtitleHtml2 != null ? (HtmlStringItem) c(subtitleHtml2, f0.f322471a) : null;
        Boolean required = screen.getRequired();
        List listD = d(screen.getItems());
        q90.a headerAction = screen.getHeaderAction();
        t90.a aVar = this.f286951b;
        if (headerAction != null) {
            aVar.getClass();
            actionA = t90.a.a(headerAction);
        } else {
            actionA = null;
        }
        List actions = screen.getActions();
        if (actions != null) {
            List<q90.a> list4 = actions;
            ArrayList arrayList6 = new ArrayList(w.t(list4, 10));
            for (q90.a aVar2 : list4) {
                aVar.getClass();
                arrayList6.add(t90.a.a(aVar2));
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        Boolean disableScrollToBottom = screen.getDisableScrollToBottom();
        t1 footer = screen.getFooter();
        HtmlStringItem htmlStringItem3 = footer != null ? (HtmlStringItem) c(footer, f0.f322471a) : null;
        a2 infoMessage = screen.getInfoMessage();
        if (infoMessage != null) {
            String title3 = infoMessage.getTitle();
            z1 details = infoMessage.getDetails();
            q1Var = screen;
            list = listD;
            str = id10;
            infoMessageItem = new InfoMessageItem(title3, new InfoMessageItemDetails(details.getTitle(), details.getDescription(), details.getButtonTitle()));
        } else {
            q1Var = screen;
            list = listD;
            str = id10;
            infoMessageItem = null;
        }
        return new FormScreen(str, list, nextText, actionA, arrayList2, disableScrollToBottom, arrayList, required, title, subtitle, htmlStringItem2, secondaryDescription, htmlStringItem3, infoMessageItem, previousViewId, q1Var.getAnalyticsName());
    }

    @Override // v90.a
    public final m4 b(BackendScreen backendScreen) {
        String str;
        d3 d3Var;
        q90.a aVarB;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        String str4;
        a2 a2Var;
        ArrayList arrayList3;
        FormScreen screen = (FormScreen) backendScreen;
        Intrinsics.checkNotNullParameter(screen, "screen");
        String str5 = screen.f63467a;
        String str6 = screen.o;
        String str7 = screen.i;
        String str8 = screen.f63472j;
        HtmlStringItem htmlStringItem = screen.k;
        t1 t1Var = htmlStringItem != null ? (t1) e(htmlStringItem) : null;
        SecondaryDescription secondaryDescription = screen.f63473l;
        if (secondaryDescription != null) {
            String str9 = secondaryDescription.f63600a;
            String str10 = secondaryDescription.f63602c;
            String str11 = secondaryDescription.d;
            HtmlStringItem htmlStringItem2 = secondaryDescription.e;
            t1 t1Var2 = htmlStringItem2 != null ? (t1) e(htmlStringItem2) : null;
            String str12 = secondaryDescription.f63601b;
            String str13 = secondaryDescription.f63603g;
            List list = secondaryDescription.f;
            if (list != null) {
                List list2 = list;
                str = str5;
                ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(this.d.b((InfoListItemSubitem) it8.next()));
                }
                arrayList3 = arrayList4;
            } else {
                str = str5;
                arrayList3 = null;
            }
            d3Var = new d3(str9, str10, str11, t1Var2, str12, str13, arrayList3);
        } else {
            str = str5;
            d3Var = null;
        }
        List list3 = screen.f63468b;
        ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            arrayList5.add(e((BackendItem) it9.next()));
        }
        Action action = screen.d;
        t90.a aVar = this.f286951b;
        if (action != null) {
            aVar.getClass();
            aVarB = t90.a.b(action);
        } else {
            aVarB = null;
        }
        List list4 = screen.e;
        if (list4 != null) {
            List<Action> list5 = list4;
            ArrayList arrayList6 = new ArrayList(w.t(list5, 10));
            for (Action action2 : list5) {
                aVar.getClass();
                arrayList6.add(t90.a.b(action2));
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        Boolean bool = screen.f;
        List list6 = screen.f63470g;
        if (list6 != null) {
            List list7 = list6;
            ArrayList arrayList7 = new ArrayList(w.t(list7, 10));
            Iterator it10 = list7.iterator();
            while (it10.hasNext()) {
                arrayList7.add(this.f286952c.m((Transition) it10.next()));
            }
            arrayList2 = arrayList7;
        } else {
            arrayList2 = null;
        }
        Boolean bool2 = screen.f63471h;
        String str14 = screen.f63469c;
        HtmlStringItem htmlStringItem3 = screen.f63474m;
        t1 t1Var3 = htmlStringItem3 != null ? (t1) e(htmlStringItem3) : null;
        InfoMessageItem infoMessageItem = screen.f63475n;
        if (infoMessageItem != null) {
            String str15 = infoMessageItem.f63509a;
            InfoMessageItemDetails infoMessageItemDetails = infoMessageItem.f63510b;
            str2 = str14;
            str3 = str6;
            str4 = str7;
            a2Var = new a2(str15, new z1(infoMessageItemDetails.f63511a, infoMessageItemDetails.f63512b, infoMessageItemDetails.f63513c));
        } else {
            str2 = str14;
            str3 = str6;
            str4 = str7;
            a2Var = null;
        }
        return new q1(str, str3, str4, str8, t1Var, d3Var, bool2, arrayList5, aVarB, arrayList, bool, arrayList2, str2, t1Var3, a2Var, screen.f63476p);
    }
}
