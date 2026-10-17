package rnf;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((File) obj3).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }
}
