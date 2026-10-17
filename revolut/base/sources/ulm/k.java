package ulm;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;

/* JADX INFO: loaded from: classes14.dex */
public final class k implements Iterator, pim.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wlm.n f281098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f281099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f281100c;

    public k(Cache cache) {
        wlm.n nVar;
        wlm.o cache2 = cache.getCache();
        synchronized (cache2) {
            cache2.i();
            nVar = new wlm.n(cache2);
        }
        this.f281098a = nVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f281099b != null) {
            return true;
        }
        this.f281100c = false;
        while (true) {
            wlm.n nVar = this.f281098a;
            if (!nVar.hasNext()) {
                return false;
            }
            try {
                Closeable closeable = (Closeable) nVar.next();
                try {
                    continue;
                    this.f281099b = le.u1.c((mmm.s0) ((wlm.k) closeable).f298550c.get(0)).e(Long.MAX_VALUE);
                    closeable.close();
                    return true;
                } finally {
                    try {
                        continue;
                    } catch (Throwable th10) {
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f281099b;
        Intrinsics.h(str);
        this.f281099b = null;
        this.f281100c = true;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f281100c) {
            throw new IllegalStateException("remove() before next()");
        }
        this.f281098a.remove();
    }
}
