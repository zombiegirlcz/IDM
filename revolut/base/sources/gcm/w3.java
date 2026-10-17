package gcm;

import com.google.common.base.Preconditions;
import io.grpc.StatusRuntimeException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class w3 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f142916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f142917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e6 f142918c;
    public final k6 d;
    public ecm.o e;
    public byte[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f142919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v3 f142920h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f142921j;
    public h0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h0 f142922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f142923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f142924n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f142925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f142926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f142927r;

    public w3(b bVar, int i, e6 e6Var, k6 k6Var) {
        ecm.o oVar = ecm.o.f124848b;
        this.f142920h = v3.HEADER;
        this.i = 5;
        this.f142922l = new h0();
        this.f142924n = false;
        this.o = -1;
        this.f142926q = false;
        this.f142927r = false;
        this.f142916a = (b) Preconditions.checkNotNull(bVar, "sink");
        this.e = (ecm.o) Preconditions.checkNotNull(oVar, "decompressor");
        this.f142917b = i;
        this.f142918c = (e6) Preconditions.checkNotNull(e6Var, "statsTraceCtx");
        this.d = (k6) Preconditions.checkNotNull(k6Var, "transportTracer");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (isClosed()) {
            return;
        }
        h0 h0Var = this.k;
        boolean z = h0Var != null && h0Var.f142670c > 0;
        try {
            h0 h0Var2 = this.f142922l;
            if (h0Var2 != null) {
                h0Var2.close();
            }
            h0 h0Var3 = this.k;
            if (h0Var3 != null) {
                h0Var3.close();
            }
            this.f142922l = null;
            this.k = null;
            this.f142916a.c(z);
        } catch (Throwable th10) {
            this.f142922l = null;
            this.k = null;
            throw th10;
        }
    }

    public final void d() {
        if (this.f142924n) {
            return;
        }
        boolean z = true;
        this.f142924n = true;
        while (!this.f142927r && this.f142923m > 0 && h()) {
            try {
                int i = t3.f142882a[this.f142920h.ordinal()];
                if (i == 1) {
                    g();
                } else {
                    if (i != 2) {
                        throw new AssertionError("Invalid state: " + this.f142920h);
                    }
                    f();
                    this.f142923m--;
                }
            } catch (Throwable th10) {
                this.f142924n = false;
                throw th10;
            }
        }
        if (this.f142927r) {
            close();
            this.f142924n = false;
            return;
        }
        if (this.f142926q) {
            if (this.f142922l.f142670c != 0) {
                z = false;
            }
            if (z) {
                close();
            }
        }
        this.f142924n = false;
    }

    public final void f() {
        Object u3Var;
        int i = this.o;
        long j2 = this.f142925p;
        e6 e6Var = this.f142918c;
        for (ecm.e0 e0Var : e6Var.f142632a) {
            e0Var.f(i, j2);
        }
        this.f142925p = 0;
        if (this.f142921j) {
            ecm.o oVar = this.e;
            if (oVar == ecm.o.f124848b) {
                throw new StatusRuntimeException(ecm.g2.f124806l.g("Can't decode compressed gRPC message as compression not configured"));
            }
            try {
                h0 h0Var = this.k;
                u4 u4Var = v4.f142912a;
                t4 t4Var = new t4();
                t4Var.f142883a = (d) Preconditions.checkNotNull(h0Var, "buffer");
                InputStream gZIPInputStream = t4Var;
                switch (oVar.f124849a) {
                    case 0:
                        break;
                    default:
                        gZIPInputStream = new GZIPInputStream(t4Var);
                        break;
                }
                u3Var = new u3(gZIPInputStream, this.f142917b, e6Var);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            long j3 = this.k.f142670c;
            for (ecm.e0 e0Var2 : e6Var.f142632a) {
                e0Var2.g(j3);
            }
            h0 h0Var2 = this.k;
            u4 u4Var2 = v4.f142912a;
            t4 t4Var2 = new t4();
            t4Var2.f142883a = (d) Preconditions.checkNotNull(h0Var2, "buffer");
            u3Var = t4Var2;
        }
        this.k.getClass();
        this.k = null;
        b bVar = this.f142916a;
        a31.a aVar = new a31.a(12);
        aVar.f955b = u3Var;
        bVar.k.a(aVar);
        this.f142920h = v3.HEADER;
        this.i = 5;
    }

    public final void g() {
        int iL = this.k.l();
        if ((iL & 254) != 0) {
            throw new StatusRuntimeException(ecm.g2.f124806l.g("gRPC frame header malformed: reserved bits not zero"));
        }
        this.f142921j = (iL & 1) != 0;
        h0 h0Var = this.k;
        h0Var.d(4);
        int iL2 = h0Var.l() | (h0Var.l() << 24) | (h0Var.l() << 16) | (h0Var.l() << 8);
        this.i = iL2;
        if (iL2 < 0 || iL2 > this.f142917b) {
            ecm.g2 g2Var = ecm.g2.f124805j;
            Locale locale = Locale.US;
            throw new StatusRuntimeException(g2Var.g("gRPC message exceeds maximum size " + this.f142917b + ": " + iL2));
        }
        int i = this.o + 1;
        this.o = i;
        for (ecm.e0 e0Var : this.f142918c.f142632a) {
            e0Var.e(i);
        }
        k6 k6Var = this.d;
        k6Var.f142738b.e();
        k6Var.f142737a.a();
        this.f142920h = v3.BODY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        r0.a(r2);
        r7.f142925p += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r7.f142920h == gcm.v3.BODY) goto L17;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() throws java.lang.Throwable {
        /*
            r7 = this;
            gcm.e6 r0 = r7.f142918c
            r1 = 0
            gcm.h0 r2 = r7.k     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L11
            gcm.h0 r2 = new gcm.h0     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            r7.k = r2     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L5e
        L11:
            r2 = r1
        L12:
            int r3 = r7.i     // Catch: java.lang.Throwable -> L49
            gcm.h0 r4 = r7.k     // Catch: java.lang.Throwable -> L49
            int r4 = r4.f142670c     // Catch: java.lang.Throwable -> L49
            int r3 = r3 - r4
            if (r3 <= 0) goto L4e
            gcm.h0 r4 = r7.f142922l     // Catch: java.lang.Throwable -> L49
            int r4 = r4.f142670c     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L38
            if (r2 <= 0) goto L37
            gcm.b r3 = r7.f142916a
            r3.a(r2)
            gcm.v3 r3 = r7.f142920h
            gcm.v3 r4 = gcm.v3.BODY
            if (r3 != r4) goto L37
        L2e:
            long r3 = (long) r2
            r0.a(r3)
            int r0 = r7.f142925p
            int r0 = r0 + r2
            r7.f142925p = r0
        L37:
            return r1
        L38:
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L49
            int r2 = r2 + r3
            gcm.h0 r4 = r7.k     // Catch: java.lang.Throwable -> L49
            gcm.h0 r5 = r7.f142922l     // Catch: java.lang.Throwable -> L49
            gcm.d r3 = r5.h(r3)     // Catch: java.lang.Throwable -> L49
            r4.o(r3)     // Catch: java.lang.Throwable -> L49
            goto L12
        L49:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L5e
        L4e:
            r1 = 1
            if (r2 <= 0) goto L5d
            gcm.b r3 = r7.f142916a
            r3.a(r2)
            gcm.v3 r3 = r7.f142920h
            gcm.v3 r4 = gcm.v3.BODY
            if (r3 != r4) goto L5d
            goto L2e
        L5d:
            return r1
        L5e:
            if (r1 <= 0) goto L74
            gcm.b r3 = r7.f142916a
            r3.a(r1)
            gcm.v3 r3 = r7.f142920h
            gcm.v3 r4 = gcm.v3.BODY
            if (r3 != r4) goto L74
            long r3 = (long) r1
            r0.a(r3)
            int r0 = r7.f142925p
            int r0 = r0 + r1
            r7.f142925p = r0
        L74:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gcm.w3.h():boolean");
    }

    public final boolean isClosed() {
        return this.f142922l == null;
    }
}
