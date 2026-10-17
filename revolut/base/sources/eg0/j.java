package eg0;

import com.revolut.core.model.faq.FaqNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements i {
    public static void a(FaqNode faqNode, LinkedHashMap linkedHashMap) {
        if (linkedHashMap.containsKey(faqNode.getF51430a())) {
            return;
        }
        linkedHashMap.put(faqNode.getF51430a(), faqNode);
        if ((faqNode instanceof FaqNode.Article) || (faqNode instanceof FaqNode.Deeplink)) {
            return;
        }
        if (faqNode instanceof FaqNode.Category) {
            Iterator it8 = ((FaqNode.Category) faqNode).d.iterator();
            while (it8.hasNext()) {
                a((FaqNode) it8.next(), linkedHashMap);
            }
        } else {
            if (!(faqNode instanceof FaqNode.Topic)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it9 = ((FaqNode.Topic) faqNode).e.iterator();
            while (it9.hasNext()) {
                a((FaqNode) it9.next(), linkedHashMap);
            }
        }
    }

    public static FaqNode b(FaqNode faqNode, LinkedHashMap linkedHashMap) {
        if ((faqNode instanceof FaqNode.Article) || (faqNode instanceof FaqNode.Deeplink)) {
            return faqNode;
        }
        if (faqNode instanceof FaqNode.Category) {
            FaqNode.Category category = (FaqNode.Category) faqNode;
            List list = (List) linkedHashMap.get(category.f51424a);
            if (list == null) {
                return faqNode;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(b((FaqNode) it8.next(), linkedHashMap));
            }
            return FaqNode.Category.a(category, arrayList);
        }
        if (!(faqNode instanceof FaqNode.Topic)) {
            throw new NoWhenBranchMatchedException();
        }
        FaqNode.Topic topic = (FaqNode.Topic) faqNode;
        List list3 = (List) linkedHashMap.get(topic.f51430a);
        if (list3 == null) {
            return faqNode;
        }
        List list4 = list3;
        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
        Iterator it9 = list4.iterator();
        while (it9.hasNext()) {
            arrayList2.add(b((FaqNode) it9.next(), linkedHashMap));
        }
        return FaqNode.Topic.a(topic, arrayList2);
    }
}
