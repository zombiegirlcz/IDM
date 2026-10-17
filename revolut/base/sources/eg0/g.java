package eg0;

import com.revolut.core.model.faq.FaqNode;
import java.util.Comparator;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((FaqNode.Article) obj2).d, ((FaqNode.Article) obj3).d);
    }
}
