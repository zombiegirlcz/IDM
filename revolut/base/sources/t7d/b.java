package t7d;

import com.revolut.core.model.faq.FaqNode;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.model.faq.PigeonNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final void a(FaqNodeBase faqNodeBase, ArrayList arrayList) {
        arrayList.add(faqNodeBase);
        int iJ = v.j(arrayList);
        if (d(faqNodeBase)) {
            arrayList.add(faqNodeBase);
        } else if (e(faqNodeBase)) {
            Iterator it8 = c(faqNodeBase).iterator();
            while (it8.hasNext()) {
                a((FaqNodeBase) it8.next(), arrayList);
            }
        }
        int iJ2 = v.j(arrayList);
        if (iJ2 == iJ) {
            Intrinsics.h(arrayList.remove(iJ));
            return;
        }
        int i = iJ + 1;
        if (iJ2 == i) {
            arrayList.set(iJ, arrayList.get(iJ2));
            Intrinsics.h(arrayList.remove(iJ2));
        } else {
            if (i > iJ2) {
                return;
            }
            while (true) {
                arrayList.remove(iJ2);
                if (iJ2 == i) {
                    return;
                } else {
                    iJ2--;
                }
            }
        }
    }

    public static final List b(ArrayList arrayList, List list) {
        arrayList.clear();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            FaqNodeBase faqNodeBase = (FaqNodeBase) it8.next();
            if (d(faqNodeBase)) {
                arrayList.add(faqNodeBase);
            } else if (e(faqNodeBase)) {
                a(faqNodeBase, arrayList);
            }
        }
        return arrayList.size() != 1 ? arrayList : b(arrayList, list);
    }

    public static final List c(FaqNodeBase faqNodeBase) {
        if (faqNodeBase instanceof FaqNode.Category) {
            return ((FaqNode.Category) faqNodeBase).d;
        }
        if (faqNodeBase instanceof FaqNode.Topic) {
            return ((FaqNode.Topic) faqNodeBase).e;
        }
        if (!(faqNodeBase instanceof PigeonNode)) {
            if ((faqNodeBase instanceof FaqNode.Article) || (faqNodeBase instanceof FaqNode.Deeplink)) {
                return f0.f322471a;
            }
            throw new NoWhenBranchMatchedException();
        }
        PigeonNode pigeonNode = (PigeonNode) faqNodeBase;
        int i = a.f268627a[pigeonNode.f51436c.ordinal()];
        if (i == 1) {
            return pigeonNode.f51438h;
        }
        if (i == 2 || i == 3) {
            return f0.f322471a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean d(FaqNodeBase faqNodeBase) {
        if ((faqNodeBase instanceof FaqNode.Deeplink) || (faqNodeBase instanceof FaqNode.Article)) {
            return true;
        }
        if (!(faqNodeBase instanceof PigeonNode)) {
            if ((faqNodeBase instanceof FaqNode.Category) || (faqNodeBase instanceof FaqNode.Topic)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i = a.f268627a[((PigeonNode) faqNodeBase).f51436c.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean e(FaqNodeBase faqNodeBase) {
        if ((faqNodeBase instanceof FaqNode.Category) || (faqNodeBase instanceof FaqNode.Topic)) {
            return true;
        }
        if (!(faqNodeBase instanceof PigeonNode)) {
            if ((faqNodeBase instanceof FaqNode.Article) || (faqNodeBase instanceof FaqNode.Deeplink)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i = a.f268627a[((PigeonNode) faqNodeBase).f51436c.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
