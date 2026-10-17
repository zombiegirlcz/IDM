package ce;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ze.c, ze.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23311a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f23312b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f23313c;

    public o(Executor executor) {
        this.f23313c = executor;
    }

    public final synchronized void a(Executor executor, ze.a aVar) {
        try {
            executor.getClass();
            if (!this.f23311a.containsKey(pd.b.class)) {
                this.f23311a.put(pd.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f23311a.get(pd.b.class)).put(aVar, executor);
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
