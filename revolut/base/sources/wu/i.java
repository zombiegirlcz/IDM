package wu;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj3).lastModified()));
    }
}
