package bmm;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mmm.q0;
import mmm.r0;
import mmm.s0;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import ulm.u0;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 implements r0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f16905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cmm.a f16906c;
    public long d;
    public long e;
    public final ArrayDeque f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f16908h;
    public final b0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f16909j;
    public final d0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f16910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IOException f16911m;

    public e0(int i, u connection, boolean z, boolean z3, u0 u0Var) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f16904a = i;
        this.f16905b = connection;
        this.f16906c = new cmm.a(i);
        this.e = connection.f16973s.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f = arrayDeque;
        this.f16908h = new c0(this, connection.f16972r.a(), z3);
        this.i = new b0(this, z);
        this.f16909j = new d0(this);
        this.k = new d0(this);
        if (u0Var == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(u0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r3 = this;
            java.util.TimeZone r0 = vlm.j.f290512a
            monitor-enter(r3)
            bmm.c0 r0 = r3.f16908h     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f16896b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            bmm.b0 r0 = r3.i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f16891a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f16893c     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L37
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r3.i()     // Catch: java.lang.Throwable -> L18
            kotlin.Unit r2 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)
            if (r0 == 0) goto L2d
            bmm.b r0 = bmm.b.CANCEL
            r1 = 0
            r3.c(r0, r1)
            return
        L2d:
            if (r1 != 0) goto L36
            bmm.u r0 = r3.f16905b
            int r1 = r3.f16904a
            r0.g(r1)
        L36:
            return
        L37:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bmm.e0.a():void");
    }

    public final void b() throws IOException {
        b0 b0Var = this.i;
        if (b0Var.f16893c) {
            throw new IOException("stream closed");
        }
        if (b0Var.f16891a) {
            throw new IOException("stream finished");
        }
        if (f() != null) {
            IOException iOException = this.f16911m;
            if (iOException != null) {
                throw iOException;
            }
            b bVarF = f();
            Intrinsics.h(bVarF);
            throw new StreamResetException(bVarF);
        }
    }

    public final void c(b statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            u uVar = this.f16905b;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            uVar.f16976x.i(this.f16904a, statusCode);
        }
    }

    @Override // mmm.r0
    public final void cancel() {
        e(b.CANCEL);
    }

    public final boolean d(b bVar, IOException iOException) {
        TimeZone timeZone = vlm.j.f290512a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.f16910l = bVar;
            this.f16911m = iOException;
            notifyAll();
            if (this.f16908h.f16896b && this.i.f16891a) {
                return false;
            }
            Unit unit = Unit.f186387a;
            this.f16905b.g(this.f16904a);
            return true;
        }
    }

    public final void e(b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f16905b.k(this.f16904a, errorCode);
        }
    }

    public final b f() {
        b bVar;
        synchronized (this) {
            bVar = this.f16910l;
        }
        return bVar;
    }

    @Override // mmm.r0
    public final q0 g() {
        return this.i;
    }

    @Override // mmm.r0
    public final s0 getSource() {
        return this.f16908h;
    }

    public final boolean h() {
        boolean z = (this.f16904a & 1) == 1;
        this.f16905b.getClass();
        return true == z;
    }

    public final boolean i() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                c0 c0Var = this.f16908h;
                if (c0Var.f16896b || c0Var.e) {
                    b0 b0Var = this.i;
                    if (b0Var.f16891a || b0Var.f16893c) {
                        if (this.f16907g) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void j(u0 headers, boolean z) {
        boolean zI;
        Intrinsics.checkNotNullParameter(headers, "headers");
        TimeZone timeZone = vlm.j.f290512a;
        synchronized (this) {
            try {
                if (this.f16907g && headers.a(":status") == null && headers.a(":method") == null) {
                    this.f16908h.getClass();
                } else {
                    this.f16907g = true;
                    this.f.add(headers);
                }
                if (z) {
                    this.f16908h.f16896b = true;
                }
                zI = i();
                notifyAll();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (zI) {
            return;
        }
        this.f16905b.g(this.f16904a);
    }

    public final void k(b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            try {
                if (f() == null) {
                    this.f16910l = errorCode;
                    notifyAll();
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
