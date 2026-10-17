package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import com.revolut.tracking.v3.RawEvent;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class z extends ecm.i {
    public static final Logger o = Logger.getLogger(z.class.getName());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final double f142980p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.p1 f142981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f142982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f142983c;
    public final com.google.firebase.messaging.t d;
    public final ecm.v e;
    public u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f142984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ecm.d f142985h;
    public a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f142986j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e8.r f142987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f142988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ecm.y f142989n = ecm.y.d;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f142980p = TimeUnit.SECONDS.toNanos(1L) * 1.0d;
    }

    public z(ecm.p1 p1Var, Executor executor, ecm.d dVar, e8.r rVar, ScheduledExecutorService scheduledExecutorService, com.google.firebase.messaging.t tVar) {
        ecm.p pVar = ecm.p.f124852b;
        this.f142981a = p1Var;
        String str = p1Var.f124857b;
        System.identityHashCode(this);
        dfm.b.f114548a.getClass();
        if (executor == MoreExecutors.directExecutor()) {
            this.f142982b = new t5();
            this.f142983c = true;
        } else {
            this.f142982b = new w5(executor);
            this.f142983c = false;
        }
        this.d = tVar;
        this.e = ecm.v.b();
        ecm.o1 o1Var = p1Var.f124856a;
        this.f142984g = o1Var == ecm.o1.UNARY || o1Var == ecm.o1.SERVER_STREAMING;
        this.f142985h = dVar;
        this.f142987l = rVar;
        this.f142988m = scheduledExecutorService;
    }

    @Override // ecm.i
    public final void a(String str, Throwable th10) {
        dfm.b.c();
        try {
            dfm.b.a();
            f(str, th10);
            dfm.b.f114548a.getClass();
        } catch (Throwable th11) {
            try {
                dfm.b.f114548a.getClass();
            } catch (Throwable th12) {
                th11.addSuppressed(th12);
            }
            throw th11;
        }
    }

    @Override // ecm.i
    public final void b() {
        dfm.b.c();
        try {
            dfm.b.a();
            Preconditions.checkState(this.i != null, "Not started");
            Preconditions.checkState(!this.f142986j, "call was cancelled");
            Preconditions.checkState(!this.k, "call already half-closed");
            this.k = true;
            this.i.g();
            dfm.b.f114548a.getClass();
        } catch (Throwable th10) {
            try {
                dfm.b.f114548a.getClass();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }

    @Override // ecm.i
    public final void c() {
        dfm.b.c();
        try {
            dfm.b.a();
            Preconditions.checkState(this.i != null, "Not started");
            Preconditions.checkArgument(true, "Number requested must be non-negative");
            this.i.request();
            dfm.b.f114548a.getClass();
        } catch (Throwable th10) {
            try {
                dfm.b.f114548a.getClass();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }

    @Override // ecm.i
    public final void d(RawEvent rawEvent) {
        dfm.b.c();
        try {
            dfm.b.a();
            g(rawEvent);
            dfm.b.f114548a.getClass();
        } catch (Throwable th10) {
            try {
                dfm.b.f114548a.getClass();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }

    @Override // ecm.i
    public final void e(ecm.h hVar, ecm.m1 m1Var) {
        dfm.b.c();
        try {
            dfm.b.a();
            h(hVar, m1Var);
            dfm.b.f114548a.getClass();
        } catch (Throwable th10) {
            try {
                dfm.b.f114548a.getClass();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }

    public final void f(String str, Throwable th10) {
        if (str == null && th10 == null) {
            th10 = new CancellationException("Cancelled without a message or cause");
            o.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th10);
        }
        if (this.f142986j) {
            return;
        }
        this.f142986j = true;
        try {
            if (this.i != null) {
                ecm.g2 g2Var = ecm.g2.f;
                ecm.g2 g2VarG = str != null ? g2Var.g(str) : g2Var.g("Call cancelled without message");
                if (th10 != null) {
                    g2VarG = g2VarG.f(th10);
                }
                this.i.k(g2VarG);
            }
            u uVar = this.f;
            if (uVar != null) {
                uVar.b();
            }
        } catch (Throwable th11) {
            u uVar2 = this.f;
            if (uVar2 != null) {
                uVar2.b();
            }
            throw th11;
        }
    }

    public final void g(RawEvent rawEvent) {
        Preconditions.checkState(this.i != null, "Not started");
        Preconditions.checkState(!this.f142986j, "call was cancelled");
        Preconditions.checkState(!this.k, "call was half-closed");
        try {
            a0 a0Var = this.i;
            if (a0Var instanceof x2) {
                ((x2) a0Var).t(rawEvent);
            } else {
                a0Var.c(this.f142981a.c(rawEvent));
            }
            if (this.f142984g) {
                return;
            }
            this.i.flush();
        } catch (Error e) {
            this.i.k(ecm.g2.f.g("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.i.k(ecm.g2.f.f(e2).g("Failed to stream message"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(ecm.h r20, ecm.m1 r21) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gcm.z.h(ecm.h, ecm.m1):void");
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("method", this.f142981a).toString();
    }
}
