package wrd;

import com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((ValueHistoryEntry) obj3).f99233a, ((ValueHistoryEntry) obj2).f99233a);
    }
}
