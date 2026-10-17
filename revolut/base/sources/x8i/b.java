package x8i;

import com.revolut.retail.common.ui.model.NewsUiItem;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(((NewsUiItem) obj3).f98610t), Boolean.valueOf(((NewsUiItem) obj2).f98610t));
    }
}
