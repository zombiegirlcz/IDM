package zkm;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import skm.f0;
import skm.i0;
import skm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends CoroutineDispatcher implements i0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f323106h = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f323107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f323108c;
    public final int d;
    public final String e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f323109g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public h(CoroutineDispatcher coroutineDispatcher, int i, String str) {
        i0 i0Var = coroutineDispatcher instanceof i0 ? (i0) coroutineDispatcher : null;
        this.f323107b = i0Var == null ? f0.f263977a : i0Var;
        this.f323108c = coroutineDispatcher;
        this.d = i;
        this.e = str;
        this.f = new k();
        this.f323109g = new Object();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableM;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f323106h;
        if (atomicIntegerFieldUpdater.get(this) >= this.d || !q() || (runnableM = m()) == null) {
            return;
        }
        try {
            g.d(this.f323108c, this, new r8.d(this, runnableM, 24));
        } catch (Throwable th10) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th10;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableM;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f323106h;
        if (atomicIntegerFieldUpdater.get(this) >= this.d || !q() || (runnableM = m()) == null) {
            return;
        }
        try {
            this.f323108c.dispatchYield(this, new r8.d(this, runnableM, 24));
        } catch (Throwable th10) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th10;
        }
    }

    @Override // skm.i0
    public final void g(long j2, skm.l lVar) {
        this.f323107b.g(j2, lVar);
    }

    @Override // skm.i0
    public final r0 j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f323107b.j(j2, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        g.a(i);
        return i >= this.d ? str != null ? new p(this, str) : this : super.limitedParallelism(i, str);
    }

    public final Runnable m() {
        while (true) {
            Runnable runnable = (Runnable) this.f.c();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f323109g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f323106h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.b() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean q() {
        synchronized (this.f323109g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f323106h;
            if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f323108c);
        sb6.append(".limitedParallelism(");
        return j6.a.t(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
