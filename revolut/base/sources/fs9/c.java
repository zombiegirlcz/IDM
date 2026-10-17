package fs9;

import com.revolut.feature.payments.messaging.data.api.model.GroupChatItem;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((GroupChatItem) obj2).getF79532b(), ((GroupChatItem) obj3).getF79532b());
    }
}
