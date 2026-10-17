package x8i;

import com.revolut.retail.common.ui.model.NewsUiItem;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((NewsUiItem) obj2).f, ((NewsUiItem) obj3).f);
    }
}
