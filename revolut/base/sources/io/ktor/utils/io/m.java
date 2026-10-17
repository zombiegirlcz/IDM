package io.ktor.utils.io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class m implements t, e0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "suspensionSlot");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f163063g = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_closedCause");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163064a;
    private volatile int flushBufferSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jlm.a f163065b = new jlm.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f163066c = new Object();

    @NotNull
    volatile /* synthetic */ Object suspensionSlot = c.f163040a;
    public final jlm.a d = new jlm.a();
    public final jlm.a e = new jlm.a();

    @NotNull
    volatile /* synthetic */ Object _closedCause = null;

    public m(boolean z) {
        this.f163064a = z;
    }

    @Override // io.ktor.utils.io.t
    public final void a(Throwable th10) {
        if (this._closedCause != null) {
            return;
        }
        m0 m0Var = new m0(th10);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f163063g;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, m0Var) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        g(m0Var.a(l0.f));
    }

    @Override // io.ktor.utils.io.t
    public final Throwable b() {
        m0 m0Var = (m0) this._closedCause;
        if (m0Var != null) {
            return m0Var.a(l0.f);
        }
        return null;
    }

    @Override // io.ktor.utils.io.t
    public final jlm.a c() throws Throwable {
        m0 m0Var = (m0) this._closedCause;
        if (m0Var != null) {
            k wrap = k.f;
            Intrinsics.checkNotNullParameter(wrap, "wrap");
            Throwable thA = m0Var.a(wrap);
            if (thA != null) {
                throw thA;
            }
        }
        if (this.d.J()) {
            l();
        }
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // io.ktor.utils.io.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r18, gim.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.m.d(int, gim.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.t
    public final boolean e() {
        if (b() == null) {
            return this._closedCause != null && this.flushBufferSize == 0 && this.d.J();
        }
        return true;
    }

    public final void f() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j();
        do {
            atomicReferenceFieldUpdater = f163063g;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n0.f163069a)) {
                g(null);
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
    }

    public final void g(Throwable th10) {
        a aVar;
        if (th10 != null) {
            aVar = new a(th10);
        } else {
            g.Companion.getClass();
            aVar = b.f163035b;
        }
        g gVar = (g) f.getAndSet(this, aVar);
        if (gVar instanceof e) {
            ((e) gVar).a(th10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gim.c r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.m.h(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.j
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.j r0 = (io.ktor.utils.io.j) r0
            int r1 = r0.f163058w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f163058w = r1
            goto L18
        L13:
            io.ktor.utils.io.j r0 = new io.ktor.utils.io.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f163058w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            r0.f163058w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r4.h(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L49
        L44:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.o.a(r5)
        L49:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.utils.io.m.f163063g
            r0 = 0
            io.ktor.utils.io.m0 r1 = io.ktor.utils.io.n0.f163069a
            boolean r1 = r5.compareAndSet(r4, r0, r1)
            if (r1 == 0) goto L5a
            r4.g(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L5a:
            java.lang.Object r5 = r5.get(r4)
            if (r5 == 0) goto L49
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.m.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void j() {
        if (this.e.J()) {
            return;
        }
        synchronized (this.f163066c) {
            jlm.a aVar = this.e;
            int i = (int) aVar.f175871c;
            this.f163065b.h(aVar);
            this.flushBufferSize += i;
            Unit unit = Unit.f186387a;
        }
        g gVar = (g) this.suspensionSlot;
        if (gVar instanceof d) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            c cVar = c.f163040a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, gVar, cVar)) {
                if (atomicReferenceFieldUpdater.get(this) != gVar) {
                    return;
                }
            }
            ((e) gVar).resume();
        }
    }

    public final jlm.a k() {
        if (this._closedCause == null) {
            return this.e;
        }
        m0 m0Var = (m0) this._closedCause;
        if (m0Var != null) {
            l wrap = l.f;
            Intrinsics.checkNotNullParameter(wrap, "wrap");
            Throwable thA = m0Var.a(wrap);
            if (thA != null) {
                throw thA;
            }
        }
        throw new ClosedWriteChannelException(null, null);
    }

    public final void l() {
        synchronized (this.f163066c) {
            this.f163065b.i(this.d);
            this.flushBufferSize = 0;
            Unit unit = Unit.f186387a;
        }
        g gVar = (g) this.suspensionSlot;
        if (gVar instanceof f) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            c cVar = c.f163040a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, gVar, cVar)) {
                if (atomicReferenceFieldUpdater.get(this) != gVar) {
                    return;
                }
            }
            ((e) gVar).resume();
        }
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}
