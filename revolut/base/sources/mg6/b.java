package mg6;

import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((OutboundOpenBankingClient.Australia) obj3).e), Integer.valueOf(((OutboundOpenBankingClient.Australia) obj2).e));
    }
}
