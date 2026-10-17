package gs2;

import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class w implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((kr2.e) obj3).e.getEpochSecond()), Long.valueOf(((kr2.e) obj2).e.getEpochSecond()));
    }
}
