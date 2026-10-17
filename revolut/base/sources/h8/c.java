package h8;

import ch.p;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f149921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149922b;
    public final boolean d;
    public final AtomicInteger e = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f149923c = d.f149924a;

    public c(b bVar, String str, boolean z) {
        this.f149921a = bVar;
        this.f149922b = str;
        this.d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        p pVar = new p(19, this, false, runnable);
        this.f149921a.getClass();
        a aVar = new a(pVar);
        aVar.setName("glide-" + this.f149922b + "-thread-" + this.e.getAndIncrement());
        return aVar;
    }
}
