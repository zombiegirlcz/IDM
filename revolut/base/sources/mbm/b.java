package mbm;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f204242a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f204243b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f204244c;

    public final void b(Object obj2) {
        List list;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f204242a;
        if (!copyOnWriteArrayList.isEmpty()) {
            int size = copyOnWriteArrayList.size();
            for (int i = 0; i < size; i++) {
                ((a) copyOnWriteArrayList.get(i)).a(obj2);
            }
        }
        ConcurrentHashMap concurrentHashMap = this.f204243b;
        if (concurrentHashMap.isEmpty() || (list = (List) concurrentHashMap.get(obj2.getClass().getName())) == null || list.isEmpty()) {
            return;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((a) list.get(i2)).a(obj2);
        }
    }

    public final synchronized void c(String str, a aVar) {
        this.f204243b.compute(str, new m9l.c(aVar, 1));
        this.f204244c = true;
    }
}
