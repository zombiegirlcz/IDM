package jhj;

import com.revolut.retail.feature.esim.api.model.EsimDataPlanOption;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((EsimDataPlanOption.CountryOption) obj3).f100239b), Integer.valueOf(((EsimDataPlanOption.CountryOption) obj2).f100239b));
    }
}
