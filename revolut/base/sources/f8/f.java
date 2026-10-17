package f8;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.h f132673a = new ao.h(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f132674b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f132675c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    public f(int i) {
        this.e = i;
    }

    public final void a(int i, Class cls) {
        NavigableMap navigableMapF = f(cls);
        Integer num = (Integer) navigableMapF.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapF.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapF.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void b(int i) {
        while (this.f > i) {
            Object objU = this.f132673a.u();
            y8.f.b(objU);
            b bVarD = d(objU.getClass());
            this.f -= bVarD.b() * bVarD.a(objU);
            a(bVarD.a(objU), objU.getClass());
            if (Log.isLoggable(bVarD.c(), 2)) {
                bVarD.c();
                String str = "evicted: " + bVarD.a(objU);
            }
        }
    }

    public final synchronized Object c(int i, Class cls) {
        d dVar;
        int i2;
        try {
            Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) {
                e eVar = this.f132674b;
                h hVarO = (h) ((ArrayDeque) eVar.f22248b).poll();
                if (hVarO == null) {
                    hVarO = eVar.o();
                }
                dVar = (d) hVarO;
                dVar.b(i, cls);
            } else {
                e eVar2 = this.f132674b;
                int iIntValue = num.intValue();
                h hVarO2 = (h) ((ArrayDeque) eVar2.f22248b).poll();
                if (hVarO2 == null) {
                    hVarO2 = eVar2.o();
                }
                dVar = (d) hVarO2;
                dVar.b(iIntValue, cls);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return e(dVar, cls);
    }

    public final b d(Class cls) {
        b bVar;
        HashMap map = this.d;
        b bVar2 = (b) map.get(cls);
        if (bVar2 != null) {
            return bVar2;
        }
        if (cls.equals(int[].class)) {
            bVar = new b(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            bVar = new b(0);
        }
        map.put(cls, bVar);
        return bVar;
    }

    public final Object e(d dVar, Class cls) {
        b bVarD = d(cls);
        Object objF = this.f132673a.f(dVar);
        if (objF != null) {
            this.f -= bVarD.b() * bVarD.a(objF);
            a(bVarD.a(objF), cls);
        }
        if (objF != null) {
            return objF;
        }
        if (Log.isLoggable(bVarD.c(), 2)) {
            bVarD.c();
            String str = "Allocated " + dVar.f132670b + " bytes";
        }
        return bVarD.d(dVar.f132670b);
    }

    public final NavigableMap f(Class cls) {
        HashMap map = this.f132675c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void g(Object obj2) {
        Class<?> cls = obj2.getClass();
        b bVarD = d(cls);
        int iA = bVarD.a(obj2);
        int iB = bVarD.b() * iA;
        if (iB <= this.e / 2) {
            e eVar = this.f132674b;
            h hVarO = (h) ((ArrayDeque) eVar.f22248b).poll();
            if (hVarO == null) {
                hVarO = eVar.o();
            }
            d dVar = (d) hVarO;
            dVar.b(iA, cls);
            this.f132673a.s(dVar, obj2);
            NavigableMap navigableMapF = f(cls);
            Integer num = (Integer) navigableMapF.get(Integer.valueOf(dVar.f132670b));
            Integer numValueOf = Integer.valueOf(dVar.f132670b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapF.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            b(this.e);
        }
    }
}
