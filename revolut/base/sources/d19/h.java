package d19;

import com.revolut.feature.licenses.impl.ui.licenses.model.LibraryItem;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((LibraryItem) obj2).e, ((LibraryItem) obj3).e);
    }
}
