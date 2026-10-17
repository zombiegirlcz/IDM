package xjh;

import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        f.Companion.getClass();
        return cim.b.b(Integer.valueOf(c.a((WealthAction) obj2)), Integer.valueOf(c.a((WealthAction) obj3)));
    }
}
