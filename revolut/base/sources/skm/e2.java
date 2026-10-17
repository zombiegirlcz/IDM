package skm;

/* JADX INFO: loaded from: classes13.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f263973a = zkm.b.c();

    public static z0 a() {
        ThreadLocal threadLocal = f263973a;
        z0 z0Var = (z0) threadLocal.get();
        if (z0Var != null) {
            return z0Var;
        }
        i iVar = new i(Thread.currentThread());
        threadLocal.set(iVar);
        return iVar;
    }
}
