package gcm;

import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class v extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f142904c = 1;
    public final /* synthetic */ y d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, ecm.m1 m1Var) {
        super(yVar.f142968c.e, 0);
        this.d = yVar;
        this.e = m1Var;
    }

    @Override // gcm.j0
    public final void b() {
        switch (this.f142904c) {
            case 0:
                y yVar = this.d;
                dfm.b.c();
                try {
                    dfm.b.a();
                    dfm.b.f114548a.getClass();
                    if (yVar.f142967b == null) {
                        try {
                            yVar.f142966a.b((ecm.m1) this.e);
                        } catch (Throwable th10) {
                            ecm.g2 g2VarG = ecm.g2.f.f(th10).g("Failed to read headers");
                            yVar.f142967b = g2VarG;
                            yVar.f142968c.i.k(g2VarG);
                        }
                        break;
                    }
                    dfm.b.f114548a.getClass();
                    return;
                } finally {
                    try {
                        dfm.b.f114548a.getClass();
                        break;
                    } catch (Throwable th11) {
                        th.addSuppressed(th11);
                    }
                }
            default:
                dfm.b.c();
                try {
                    dfm.b.a();
                    dfm.a aVar = dfm.b.f114548a;
                    aVar.getClass();
                    c();
                    aVar.getClass();
                    return;
                } catch (Throwable th12) {
                    try {
                        break;
                    } catch (Throwable th112) {
                    }
                    throw th12;
                }
        }
    }

    public void c() {
        a31.a aVar = (a31.a) this.e;
        y yVar = this.d;
        z zVar = yVar.f142968c;
        if (yVar.f142967b != null) {
            Logger logger = p1.f142808a;
            while (true) {
                InputStream inputStreamI = aVar.i();
                if (inputStreamI == null) {
                    return;
                } else {
                    p1.b(inputStreamI);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream inputStreamI2 = aVar.i();
                    if (inputStreamI2 == null) {
                        return;
                    }
                    try {
                        yVar.f142966a.c(zVar.f142981a.b(inputStreamI2));
                        inputStreamI2.close();
                    } catch (Throwable th10) {
                        p1.b(inputStreamI2);
                        throw th10;
                    }
                } catch (Throwable th11) {
                    Logger logger2 = p1.f142808a;
                    while (true) {
                        InputStream inputStreamI3 = aVar.i();
                        if (inputStreamI3 == null) {
                            ecm.g2 g2VarG = ecm.g2.f.f(th11).g("Failed to read message.");
                            yVar.f142967b = g2VarG;
                            zVar.i.k(g2VarG);
                            return;
                        }
                        p1.b(inputStreamI3);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, a31.a aVar) {
        super(yVar.f142968c.e, 0);
        this.d = yVar;
        this.e = aVar;
    }
}
