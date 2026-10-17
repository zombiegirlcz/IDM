package fd0;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f133852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f133853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f133854c;
    public int d;
    public int e;

    public d(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f133854c = i;
        this.f133852a = new LinkedHashMap(0, 0.75f, true);
    }

    public Object a(Object obj2) {
        return null;
    }

    public void b(Object obj2, Object obj3, Object obj4) {
    }

    public final Object c(Object obj2) {
        Object objPut;
        if (obj2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj3 = this.f133852a.get(obj2);
                if (obj3 != null) {
                    this.d++;
                    return obj3;
                }
                this.e++;
                Object objA = a(obj2);
                if (objA == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        objPut = this.f133852a.put(obj2, objA);
                        if (objPut != null) {
                            this.f133852a.put(obj2, objPut);
                        } else {
                            this.f133853b += f(obj2, objA);
                        }
                    } finally {
                    }
                }
                if (objPut != null) {
                    b(obj2, objA, objPut);
                    return objPut;
                }
                i(this.f133854c);
                return objA;
            } finally {
            }
        }
    }

    public final void d(Object obj2, Object obj3) {
        Object objPut;
        if (obj2 == null || obj3 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f133853b += f(obj2, obj3);
                objPut = this.f133852a.put(obj2, obj3);
                if (objPut != null) {
                    this.f133853b -= f(obj2, objPut);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (objPut != null) {
            b(obj2, objPut, obj3);
        }
        i(this.f133854c);
    }

    public final Object e(Object obj2) {
        Object objRemove;
        if (obj2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                objRemove = this.f133852a.remove(obj2);
                if (objRemove != null) {
                    this.f133853b -= f(obj2, objRemove);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (objRemove != null) {
            b(obj2, objRemove, null);
        }
        return objRemove;
    }

    public final int f(Object obj2, Object obj3) {
        int iG = g(obj2, obj3);
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException("Negative size: " + obj2 + "=" + obj3);
    }

    public int g(Object obj2, Object obj3) {
        return 1;
    }

    public final synchronized LinkedHashMap h() {
        return new LinkedHashMap(this.f133852a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r6) {
        /*
            r5 = this;
        L0:
            monitor-enter(r5)
            int r0 = r5.f133853b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L54
            java.util.LinkedHashMap r0 = r5.f133852a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r5.f133853b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L54
            goto L14
        L12:
            r6 = move-exception
            goto L73
        L14:
            int r0 = r5.f133853b     // Catch: java.lang.Throwable -> L12
            if (r0 > r6) goto L1a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L1a:
            java.util.LinkedHashMap r0 = r5.f133852a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            r1 = 0
            if (r0 != 0) goto L34
            java.util.LinkedHashMap r0 = r5.f133852a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            goto L35
        L34:
            r0 = r1
        L35:
            if (r0 != 0) goto L39
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L39:
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r3 = r5.f133852a     // Catch: java.lang.Throwable -> L12
            r3.remove(r2)     // Catch: java.lang.Throwable -> L12
            int r3 = r5.f133853b     // Catch: java.lang.Throwable -> L12
            int r4 = r5.f(r2, r0)     // Catch: java.lang.Throwable -> L12
            int r3 = r3 - r4
            r5.f133853b = r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            r5.b(r2, r0, r1)
            goto L0
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r6     // Catch: java.lang.Throwable -> L12
        L73:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fd0.d.i(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.d;
            i2 = this.e + i;
        } catch (Throwable th10) {
            throw th10;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f133854c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
