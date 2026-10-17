package dfj;

import com.revolut.retail.feature.esim.api.model.EsimProfileSummary;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class w2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(((EsimProfileSummary) obj3).e), Boolean.valueOf(((EsimProfileSummary) obj2).e));
    }
}
