package i8;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes16.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f159396b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f159397a;

    static {
        char[] cArr = y8.l.f311609a;
        f159396b = new ArrayDeque(0);
    }

    public static s a(Object obj2) {
        s sVar;
        ArrayDeque arrayDeque = f159396b;
        synchronized (arrayDeque) {
            sVar = (s) arrayDeque.poll();
        }
        if (sVar == null) {
            sVar = new s();
        }
        sVar.f159397a = obj2;
        return sVar;
    }

    public final void b() {
        ArrayDeque arrayDeque = f159396b;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof s) && this.f159397a.equals(((s) obj2).f159397a);
    }

    public final int hashCode() {
        return this.f159397a.hashCode();
    }
}
