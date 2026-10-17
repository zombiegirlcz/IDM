package gcm;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class y implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.h f142966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ecm.g2 f142967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f142968c;

    public y(z zVar, ecm.h hVar) {
        this.f142968c = zVar;
        this.f142966a = (ecm.h) Preconditions.checkNotNull(hVar, "observer");
    }

    @Override // gcm.c0
    public final void a(a31.a aVar) {
        z zVar = this.f142968c;
        dfm.b.c();
        try {
            dfm.b.a();
            dfm.b.b();
            zVar.f142982b.execute(new v(this, aVar));
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

    @Override // gcm.c0
    public final void b(ecm.m1 m1Var) {
        z zVar = this.f142968c;
        dfm.b.c();
        try {
            dfm.b.a();
            dfm.b.b();
            zVar.f142982b.execute(new v(this, m1Var));
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

    @Override // gcm.c0
    public final void c(ecm.g2 g2Var, b0 b0Var, ecm.m1 m1Var) {
        dfm.b.c();
        try {
            dfm.b.a();
            e(g2Var, m1Var);
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

    @Override // gcm.c0
    public final void d() {
        z zVar = this.f142968c;
        ecm.o1 o1Var = zVar.f142981a.f124856a;
        o1Var.getClass();
        if (o1Var == ecm.o1.UNARY || o1Var == ecm.o1.SERVER_STREAMING) {
            return;
        }
        dfm.b.c();
        try {
            dfm.b.a();
            dfm.b.b();
            zVar.f142982b.execute(new x(this));
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

    public final void e(ecm.g2 g2Var, ecm.m1 m1Var) {
        z zVar = this.f142968c;
        ecm.w wVar = zVar.f142985h.f124790a;
        zVar.e.getClass();
        if (wVar == null) {
            wVar = null;
        }
        if (g2Var.f124809a == ecm.e2.CANCELLED && wVar != null) {
            if (wVar.f124888c) {
                g2Var = this.f142968c.f.a();
                m1Var = new ecm.m1();
            } else {
                long j2 = wVar.f124887b;
                wVar.f124886a.getClass();
                if (j2 - System.nanoTime() <= 0) {
                    wVar.f124888c = true;
                    g2Var = this.f142968c.f.a();
                    m1Var = new ecm.m1();
                }
            }
        }
        dfm.b.b();
        this.f142968c.f142982b.execute(new w(this, g2Var, m1Var));
    }
}
