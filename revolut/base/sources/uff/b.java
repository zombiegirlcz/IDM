package uff;

import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.TroubleshooterAction;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.TroubleshooterSubContent;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.TroubleshooterSubContentItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import sff.c;
import sff.e;
import sff.f;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static ArrayList a(List items) {
        Iterator it8;
        c cVar;
        String str;
        TroubleshooterSubContent troubleshooterSubContent;
        Iterator it9;
        String str2;
        TroubleshooterAction troubleshooterAction;
        Intrinsics.checkNotNullParameter(items, "items");
        List list = items;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            c cVar2 = (c) it10.next();
            String id10 = cVar2.getId();
            String title = cVar2.getTitle();
            String key = cVar2.getKey();
            List<sff.a> actions = cVar2.getActions();
            ArrayList arrayList2 = new ArrayList(w.t(actions, i));
            for (sff.a aVar : actions) {
                arrayList2.add(new TroubleshooterAction(aVar.getKey(), aVar.getTitle(), aVar.getDeeplink()));
            }
            String subtitle = cVar2.getSubtitle();
            sff.a help = cVar2.getHelp();
            TroubleshooterAction troubleshooterAction2 = help != null ? new TroubleshooterAction(help.getKey(), help.getTitle(), help.getDeeplink()) : null;
            String image = cVar2.getImage();
            String content = cVar2.getContent();
            e subContents = cVar2.getSubContents();
            if (subContents != null) {
                String upperCase = subContents.getStyle().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                mff.b bVar = Intrinsics.f(upperCase, "NUMBERED") ? mff.b.NUMBERED : Intrinsics.f(upperCase, "PARAGRAPH") ? mff.b.PARAGRAPH : mff.b.UNKNOWN;
                List items2 = subContents.getItems();
                ArrayList arrayList3 = new ArrayList(w.t(items2, i));
                Iterator it11 = items2.iterator();
                while (it11.hasNext()) {
                    f fVar = (f) it11.next();
                    String title2 = fVar.getTitle();
                    Iterator it12 = it10;
                    String content2 = fVar.getContent();
                    sff.a action = fVar.getAction();
                    c cVar3 = cVar2;
                    if (action != null) {
                        it9 = it11;
                        str2 = id10;
                        troubleshooterAction = new TroubleshooterAction(action.getKey(), action.getTitle(), action.getDeeplink());
                    } else {
                        it9 = it11;
                        str2 = id10;
                        troubleshooterAction = null;
                    }
                    arrayList3.add(new TroubleshooterSubContentItem(title2, content2, troubleshooterAction));
                    it10 = it12;
                    cVar2 = cVar3;
                    it11 = it9;
                    id10 = str2;
                }
                it8 = it10;
                cVar = cVar2;
                str = id10;
                troubleshooterSubContent = new TroubleshooterSubContent(bVar, arrayList3);
            } else {
                it8 = it10;
                cVar = cVar2;
                str = id10;
                troubleshooterSubContent = null;
            }
            sff.b contentLink = cVar.getContentLink();
            arrayList.add(new Troubleshooter(str, title, key, subtitle, content, image, arrayList2, troubleshooterSubContent, troubleshooterAction2, contentLink != null ? contentLink.getDeeplink() : null));
            it10 = it8;
            i = 10;
        }
        return arrayList;
    }
}
