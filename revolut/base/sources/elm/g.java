package elm;

import kotlinx.coroutines.CoroutineDispatcher;
import zkm.p;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f127542c;

    static {
        int i = m.f127550c;
        int i2 = m.d;
        long j2 = m.e;
        String str = m.f127548a;
        g gVar = new g();
        gVar.f127544b = new e(j2, str, i, i2);
        f127542c = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        zkm.g.a(i);
        return i >= m.f127550c ? str != null ? new p(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Default";
    }
}
