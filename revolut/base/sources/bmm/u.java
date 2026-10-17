package bmm;

import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class u implements Closeable {
    public static final m0 A;

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f16961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f16962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16963c;
    public int d;
    public int e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xlm.d f16964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xlm.b f16965h;
    public final xlm.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xlm.b f16966j;
    public final ch.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f16967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f16969n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f16971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m0 f16972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m0 f16973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cmm.a f16974t;
    public long u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v60.g f16975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g0 f16976x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final bjm.d f16977y;
    public final LinkedHashSet z;

    static {
        m0 m0Var = new m0();
        m0Var.c(4, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        m0Var.c(5, 16384);
        A = m0Var;
    }

    public u(n builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f16961a = builder.d;
        this.f16962b = new LinkedHashMap();
        String str = builder.f16952c;
        if (str == null) {
            Intrinsics.r("connectionName");
            throw null;
        }
        this.f16963c = str;
        this.e = 3;
        xlm.d dVar = builder.f16950a;
        this.f16964g = dVar;
        xlm.b bVarD = dVar.d();
        this.f16965h = bVarD;
        this.i = dVar.d();
        this.f16966j = dVar.d();
        this.k = builder.e;
        this.f16971q = builder.f16953g;
        m0 m0Var = new m0();
        m0Var.c(4, 16777216);
        this.f16972r = m0Var;
        this.f16973s = A;
        this.f16974t = new cmm.a(0);
        this.v = r2.a();
        v60.g gVar = builder.f16951b;
        if (gVar == null) {
            Intrinsics.r("socket");
            throw null;
        }
        this.f16975w = gVar;
        this.f16976x = new g0(gVar.f());
        this.f16977y = new bjm.d(this, new z(gVar.h()));
        this.z = new LinkedHashSet();
        int i = builder.f;
        if (i != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            String name = str.concat(" ping");
            Function0 block = new Function0() { // from class: bmm.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    u uVar = this.f16935a;
                    long j2 = nanos;
                    synchronized (uVar) {
                        long j3 = uVar.f16968m;
                        long j5 = uVar.f16967l;
                        if (j3 < j5) {
                            z = true;
                        } else {
                            uVar.f16967l = j5 + 1;
                            z = false;
                        }
                    }
                    if (z) {
                        b bVar = b.PROTOCOL_ERROR;
                        uVar.d(bVar, bVar, null);
                        j2 = -1;
                    } else {
                        try {
                            uVar.f16976x.O8(1, 0, false);
                        } catch (IOException e) {
                            b bVar2 = b.PROTOCOL_ERROR;
                            uVar.d(bVar2, bVar2, e);
                        }
                    }
                    return Long.valueOf(j2);
                }
            };
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(block, "block");
            bVarD.d(new kmm.g(name, block), nanos);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d(b.NO_ERROR, b.CANCEL, null);
    }

    public final void d(b connectionCode, b streamCode, IOException iOException) {
        int i;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        TimeZone timeZone = vlm.j.f290512a;
        try {
            h(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f16962b.isEmpty()) {
                    array = null;
                } else {
                    array = this.f16962b.values().toArray(new e0[0]);
                    this.f16962b.clear();
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        e0[] e0VarArr = (e0[]) array;
        if (e0VarArr != null) {
            for (e0 e0Var : e0VarArr) {
                try {
                    e0Var.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f16976x.close();
        } catch (IOException unused3) {
        }
        try {
            this.f16975w.cancel();
        } catch (IOException unused4) {
        }
        this.f16965h.g();
        this.i.g();
        this.f16966j.g();
    }

    public final e0 f(int i) {
        e0 e0Var;
        synchronized (this) {
            e0Var = (e0) this.f16962b.get(Integer.valueOf(i));
        }
        return e0Var;
    }

    public final e0 g(int i) {
        e0 e0Var;
        synchronized (this) {
            e0Var = (e0) this.f16962b.remove(Integer.valueOf(i));
            notifyAll();
        }
        return e0Var;
    }

    public final void h(b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f16976x) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                int i = this.d;
                Unit unit = Unit.f186387a;
                this.f16976x.g(i, statusCode, vlm.h.f290508a);
            }
        }
    }

    public final void i(long j2) {
        synchronized (this) {
            try {
                cmm.a.b(this.f16974t, j2, 0L, 2);
                long jA = this.f16974t.a();
                if (jA >= this.f16972r.a() / 2) {
                    l(0, jA);
                    cmm.a.b(this.f16974t, 0L, jA, 1);
                }
                this.f16971q.a(this.f16974t);
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f16976x.f16923c);
        r6 = r2;
        r8.u += r6;
        r4 = kotlin.Unit.f186387a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r9, boolean r10, mmm.h r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            bmm.g0 r12 = r8.f16976x
            r12.D9(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r4 = r8.u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            long r6 = r8.v     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f16962b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            r9 = move-exception
            goto L68
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            bmm.g0 r4 = r8.f16976x     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f16923c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.u     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.u = r4     // Catch: java.lang.Throwable -> L2a
            kotlin.Unit r4 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            bmm.g0 r4 = r8.f16976x
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.D9(r5, r9, r11, r2)
            goto Ld
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bmm.u.j(int, boolean, mmm.h, long):void");
    }

    public final void k(int i, b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        xlm.b.c(this.f16965h, this.f16963c + '[' + i + "] writeSynReset", 0L, new l(this, i, errorCode, 0), 6);
    }

    public final void l(final int i, final long j2) {
        xlm.b.c(this.f16965h, this.f16963c + '[' + i + "] windowUpdate", 0L, new Function0() { // from class: bmm.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                u uVar = this.f16938a;
                try {
                    uVar.f16976x.q6(i, j2);
                } catch (IOException e) {
                    b bVar = b.PROTOCOL_ERROR;
                    uVar.d(bVar, bVar, e);
                }
                return Unit.f186387a;
            }
        }, 6);
    }
}
