package hcm;

import com.google.common.base.Preconditions;
import gcm.w5;
import java.io.IOException;
import java.net.Socket;
import mmm.q0;
import mmm.v0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f151257c;
    public final e d;
    public q0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Socket f151260j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f151261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f151262m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f151255a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mmm.h f151256b = new mmm.h();
    public boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f151258g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f151259h = false;
    public final int e = 10000;

    public d(w5 w5Var, t tVar) {
        this.f151257c = (w5) Preconditions.checkNotNull(w5Var, "executor");
        this.d = (e) Preconditions.checkNotNull(tVar, "exceptionHandler");
    }

    @Override // mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f151259h) {
            return;
        }
        this.f151259h = true;
        this.f151257c.execute(new com.bumptech.glide.k(this, 10));
    }

    public final void d(mmm.d dVar, Socket socket) {
        Preconditions.checkState(this.i == null, "AsyncSink's becomeConnected should only be called once.");
        this.i = (q0) Preconditions.checkNotNull(dVar, "sink");
        this.f151260j = (Socket) Preconditions.checkNotNull(socket, "socket");
    }

    @Override // mmm.q0, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f151259h) {
            throw new IOException("closed");
        }
        dfm.b.c();
        try {
            synchronized (this.f151255a) {
                if (!this.f151258g) {
                    this.f151258g = true;
                    this.f151257c.execute(new b(this));
                }
            }
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

    @Override // mmm.q0
    public final v0 timeout() {
        return v0.d;
    }

    @Override // mmm.q0
    public final void write(mmm.h hVar, long j2) throws IOException {
        Preconditions.checkNotNull(hVar, "source");
        if (this.f151259h) {
            throw new IOException("closed");
        }
        dfm.b.c();
        try {
            synchronized (this.f151255a) {
                try {
                    this.f151256b.write(hVar, j2);
                    int i = this.f151262m + this.f151261l;
                    this.f151262m = i;
                    boolean z = false;
                    this.f151261l = 0;
                    if (!this.k && i > this.e) {
                        this.k = true;
                        z = true;
                    } else if (!this.f && !this.f151258g && this.f151256b.h() > 0) {
                        this.f = true;
                    }
                    if (z) {
                        try {
                            this.f151260j.close();
                        } catch (IOException e) {
                            ((t) this.d).n(e);
                        }
                    } else {
                        this.f151257c.execute(new a(this));
                    }
                } finally {
                }
            }
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
}
