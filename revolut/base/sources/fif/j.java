package fif;

import java.util.Comparator;
import java.util.Map;
import nif.o3;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((o3) ((Map.Entry) obj3).getValue()).f215991l), Long.valueOf(((o3) ((Map.Entry) obj2).getValue()).f215991l));
    }
}
