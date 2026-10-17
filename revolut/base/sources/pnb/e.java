package pnb;

import com.revolut.feature.retail.savings.api.documents.models.TaxForm;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((TaxForm) obj3).f83139c), Integer.valueOf(((TaxForm) obj2).f83139c));
    }
}
