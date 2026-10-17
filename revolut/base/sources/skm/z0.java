package skm;

import kotlin.collections.ArrayDeque;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes13.dex */
public abstract class z0 extends CoroutineDispatcher {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f264022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f264023c;
    public ArrayDeque d;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        zkm.g.a(i);
        return str != null ? new zkm.p(this, str) : this;
    }

    public final void m(boolean z) {
        long j2 = this.f264022b - (z ? 4294967296L : 1L);
        this.f264022b = j2;
        if (j2 <= 0 && this.f264023c) {
            shutdown();
        }
    }

    public final void q(m0 m0Var) {
        ArrayDeque arrayDeque = this.d;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.d = arrayDeque;
        }
        arrayDeque.addLast(m0Var);
    }

    public abstract Thread r();

    public abstract void shutdown();

    public final void v(boolean z) {
        this.f264022b = (z ? 4294967296L : 1L) + this.f264022b;
        if (z) {
            return;
        }
        this.f264023c = true;
    }

    public abstract long w();

    public final boolean x() {
        ArrayDeque arrayDeque = this.d;
        if (arrayDeque == null) {
            return false;
        }
        m0 m0Var = (m0) (arrayDeque.isEmpty() ? null : arrayDeque.removeFirst());
        if (m0Var == null) {
            return false;
        }
        m0Var.run();
        return true;
    }

    public void y(long j2, x0 x0Var) {
        kotlinx.coroutines.a.i.E(j2, x0Var);
    }
}
