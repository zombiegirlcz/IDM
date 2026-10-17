package nij;

import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import java.util.Comparator;
import java.util.List;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(bfj.a.a((EsimDataPlan) d0.b0((List) obj3))), Integer.valueOf(bfj.a.a((EsimDataPlan) d0.b0((List) obj2))));
    }
}
