package vii;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import w4l.k;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f289602a = new LinkedHashMap();

    public final b a(Object obj2, k initialLoadingStrategy) {
        Intrinsics.checkNotNullParameter(initialLoadingStrategy, "initialLoadingStrategy");
        LinkedHashMap linkedHashMap = this.f289602a;
        Object linkedHashMap2 = linkedHashMap.get(obj2);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(obj2, linkedHashMap2);
        }
        Map map = (Map) linkedHashMap2;
        Object bVar = map.get(initialLoadingStrategy);
        if (bVar == null) {
            bVar = new b(initialLoadingStrategy);
            map.put(initialLoadingStrategy, bVar);
        }
        return (b) bVar;
    }

    public final void b(Object obj2) {
        Collection collectionValues;
        Map map = (Map) this.f289602a.get(obj2);
        if (map == null || (collectionValues = map.values()) == null) {
            return;
        }
        Iterator it8 = collectionValues.iterator();
        while (it8.hasNext()) {
            ((b) it8.next()).a();
        }
    }
}
