package ryd;

import com.revolut.feature.statements.api.models.ProductItemStatementPeriod;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((ProductItemStatementPeriod) obj2).getItemId(), ((ProductItemStatementPeriod) obj3).getItemId());
    }
}
