package l0a;

import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((P2PChatItem) obj2).getF79532b().getMillis()), Long.valueOf(((P2PChatItem) obj3).getF79532b().getMillis()));
    }
}
