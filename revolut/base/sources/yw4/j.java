package yw4;

import java.util.Comparator;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        h hVar = (h) obj2;
        h hVar2 = (h) obj3;
        if (hVar == null || hVar2 == null) {
            return 0;
        }
        return hVar.ordinal() - hVar2.ordinal();
    }
}
