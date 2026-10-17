package px9;

import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((MessageItem) obj2).f79532b.getMillis()), Long.valueOf(((MessageItem) obj3).f79532b.getMillis()));
    }
}
