package grj;

import efm.c0;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import ylm.a0;
import ylm.s;
import ylm.v;
import ylm.y;
import ylm.z;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements ylm.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f146048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f146049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f146050c;
    public final Object d;
    public final Object e;
    public final Serializable f;

    public o(v routePlanner, xlm.d taskRunner) {
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f146050c = routePlanner;
        this.d = taskRunner;
        this.f146048a = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f146049b = Long.MIN_VALUE;
        this.e = new CopyOnWriteArrayList();
        vc.j jVar = taskRunner.f307059a;
        LinkedBlockingDeque queue = new LinkedBlockingDeque();
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.f = queue;
    }

    @Override // ylm.k
    public s a() throws IOException {
        y yVarD;
        long j2;
        y yVar;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.e).isEmpty() && !((v) this.f146050c).b(null)) {
                    c();
                    Intrinsics.h(iOException);
                    throw iOException;
                }
                if (((v) this.f146050c).f314813l.f314790r) {
                    throw new IOException("Canceled");
                }
                vc.j jVar = ((xlm.d) this.d).f307059a;
                long jNanoTime = System.nanoTime();
                long j3 = this.f146049b - jNanoTime;
                if (((CopyOnWriteArrayList) this.e).isEmpty() || j3 <= 0) {
                    yVarD = d();
                    j2 = this.f146048a;
                    this.f146049b = jNanoTime + j2;
                } else {
                    j2 = j3;
                    yVarD = null;
                }
                if (yVarD == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.e;
                    if (copyOnWriteArrayList.isEmpty() || (yVar = (y) ((LinkedBlockingDeque) this.f).poll(j2, timeUnit)) == null) {
                        yVarD = null;
                    } else {
                        copyOnWriteArrayList.remove(yVar.f314820a);
                        yVarD = yVar;
                    }
                    if (yVarD == null) {
                    }
                }
                boolean z = false;
                if (yVarD.f314821b == null && yVarD.f314822c == null) {
                    c();
                    if (!yVarD.f314820a.isReady()) {
                        yVarD = yVarD.f314820a.d();
                    }
                    if (yVarD.f314821b == null && yVarD.f314822c == null) {
                        z = true;
                    }
                    if (z) {
                        return yVarD.f314820a.a();
                    }
                }
                Throwable th10 = yVarD.f314822c;
                if (th10 != null) {
                    if (!(th10 instanceof IOException)) {
                        throw th10;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th10;
                    } else {
                        yhm.f.a(iOException, th10);
                    }
                }
                z zVar = yVarD.f314821b;
                if (zVar != null) {
                    ((v) this.f146050c).f314817q.addFirst(zVar);
                }
            } finally {
                c();
            }
        }
    }

    @Override // ylm.k
    public a0 b() {
        return (v) this.f146050c;
    }

    public void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.e;
        Iterator it8 = copyOnWriteArrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        while (it8.hasNext()) {
            z zVar = (z) it8.next();
            zVar.cancel();
            z zVarG = zVar.g();
            if (zVarG != null) {
                ((v) this.f146050c).f314817q.addLast(zVarG);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public y d() {
        z lVar;
        v vVar = (v) this.f146050c;
        if (vVar.b(null)) {
            try {
                lVar = vVar.c();
            } catch (Throwable th10) {
                lVar = new ylm.l(th10);
            }
            if (lVar.isReady()) {
                return new y(lVar, null, null, 6);
            }
            if (lVar instanceof ylm.l) {
                return ((ylm.l) lVar).f314773a;
            }
            ((CopyOnWriteArrayList) this.e).add(lVar);
            ((xlm.d) this.d).d().d(new ylm.m(vlm.j.f290513b + " connect " + vVar.f314812j.f281058h.i(), lVar, this), 0L);
        }
        return null;
    }

    public o(long j2, gmk.j load) {
        c0 c0Var = hhm.f.f152431c;
        m nanoTimeProvider = m.f;
        Intrinsics.checkNotNullParameter(nanoTimeProvider, "nanoTimeProvider");
        Intrinsics.checkNotNullParameter(load, "load");
        this.f146048a = j2;
        this.f146050c = c0Var;
        this.d = nanoTimeProvider;
        this.e = load;
        this.f = new HashMap();
    }
}
