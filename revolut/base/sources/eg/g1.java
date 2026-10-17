package eg;

import android.os.Message;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((Message) obj2).getWhen()), Long.valueOf(((Message) obj3).getWhen()));
    }
}
