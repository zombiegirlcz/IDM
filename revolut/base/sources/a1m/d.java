package a1m;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z0m.u;

/* JADX INFO: loaded from: classes23.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f652a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f653b = new WeakHashMap();

    public static final synchronized void a(String notificationType, u observer) {
        try {
            Intrinsics.checkNotNullParameter(notificationType, "notificationType");
            Intrinsics.checkNotNullParameter(observer, "observer");
            c cVar = new c(observer);
            cVar.f651a = true;
            c cVar2 = (c) f653b.put(observer, cVar);
            if (cVar2 != null) {
                synchronized (cVar2) {
                    cVar2.f651a = false;
                    cVar2.clear();
                }
            }
            HashMap map = f652a;
            List linkedList = (List) map.get(notificationType);
            if (linkedList == null) {
                linkedList = new LinkedList();
                map.put(notificationType, linkedList);
            }
            linkedList.add(cVar);
        } catch (Throwable th10) {
            throw th10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final synchronized void b(String notificationType, HashMap data) {
        boolean z;
        try {
            Intrinsics.checkNotNullParameter(notificationType, "notificationType");
            Intrinsics.checkNotNullParameter(data, "data");
            List list = (List) f652a.get(notificationType);
            if (list != null && !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    c cVar = (c) it8.next();
                    synchronized (cVar) {
                        z = cVar.f651a && cVar.get() != 0;
                    }
                    if (z) {
                        HashMap map = new HashMap(data);
                        u uVar = (u) cVar.get();
                        if (uVar != null) {
                            uVar.a(map);
                        }
                    } else {
                        synchronized (d.class) {
                            it8.remove();
                            Unit unit = Unit.f186387a;
                        }
                    }
                }
                list.isEmpty();
            }
        } finally {
        }
    }

    public static final synchronized void c(u observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        c cVar = (c) f653b.remove(observer);
        if (cVar != null) {
            synchronized (cVar) {
                cVar.f651a = false;
                cVar.clear();
            }
        }
    }
}
