package hcm;

import ecm.g2;
import gcm.p2;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes13.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cpi.g f151307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final icm.i f151308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f151309c;
    public final /* synthetic */ t d;

    public s(t tVar, icm.i iVar) {
        this.d = tVar;
        Level level = Level.FINE;
        this.f151307a = new cpi.g(13);
        this.f151309c = true;
        this.f151308b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g2 g2VarG;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.f151308b.d(this)) {
            try {
                p2 p2Var = this.d.F;
                if (p2Var != null) {
                    p2Var.a();
                }
            } catch (Throwable th10) {
                try {
                    t tVar = this.d;
                    icm.a aVar = icm.a.PROTOCOL_ERROR;
                    g2 g2VarF = g2.f124806l.g("error in frame handler").f(th10);
                    Map map = t.P;
                    tVar.r(0, aVar, g2VarF);
                    try {
                        this.f151308b.close();
                    } catch (IOException e) {
                        e = e;
                        t.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                    } catch (RuntimeException e2) {
                        if (!"bio == null".equals(e2.getMessage())) {
                            throw e2;
                        }
                    }
                } catch (Throwable th11) {
                    try {
                        this.f151308b.close();
                    } catch (IOException e4) {
                        t.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e4);
                    } catch (RuntimeException e5) {
                        if (!"bio == null".equals(e5.getMessage())) {
                            throw e5;
                        }
                    }
                    this.d.f151314h.d();
                    Thread.currentThread().setName(name);
                    throw th11;
                }
            }
        }
        synchronized (this.d.k) {
            g2VarG = this.d.v;
        }
        if (g2VarG == null) {
            g2VarG = g2.f124807m.g("End of stream or IOException");
        }
        this.d.r(0, icm.a.INTERNAL_ERROR, g2VarG);
        try {
            this.f151308b.close();
        } catch (IOException e6) {
            e = e6;
            t.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
        } catch (RuntimeException e22) {
            if (!"bio == null".equals(e22.getMessage())) {
                throw e22;
            }
        }
        this.d.f151314h.d();
        Thread.currentThread().setName(name);
    }
}
