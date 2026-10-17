package tl6;

import com.revolut.domain.models.openbanking.OpenBankingConsent;
import java.util.Comparator;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        OpenBankingConsent.Australia australia = (OpenBankingConsent.Australia) obj3;
        DateTime dateTime = australia.f60379h;
        if (dateTime == null) {
            dateTime = australia.f60377c;
        }
        OpenBankingConsent.Australia australia2 = (OpenBankingConsent.Australia) obj2;
        DateTime dateTime2 = australia2.f60379h;
        if (dateTime2 == null) {
            dateTime2 = australia2.f60377c;
        }
        return cim.b.b(dateTime, dateTime2);
    }
}
