package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class w extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ecm.g2 f142913c;
    public final /* synthetic */ ecm.m1 d;
    public final /* synthetic */ y e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, ecm.g2 g2Var, ecm.m1 m1Var) {
        super(yVar.f142968c.e, 0);
        this.e = yVar;
        this.f142913c = g2Var;
        this.d = m1Var;
    }

    @Override // gcm.j0
    public final void b() {
        dfm.b.c();
        try {
            dfm.b.a();
            dfm.a aVar = dfm.b.f114548a;
            aVar.getClass();
            c();
            aVar.getClass();
        } catch (Throwable th10) {
            try {
                dfm.b.f114548a.getClass();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }

    public final void c() {
        ecm.m1 m1Var;
        y yVar = this.e;
        z zVar = yVar.f142968c;
        zVar.f.b();
        ecm.g2 g2Var = yVar.f142967b;
        if (g2Var != null) {
            m1Var = new ecm.m1();
        } else {
            g2Var = this.f142913c;
            m1Var = this.d;
        }
        try {
            yVar.f142966a.a(g2Var, m1Var);
            com.google.firebase.messaging.t tVar = zVar.d;
            if (g2Var.e()) {
                ((r2) tVar.d).e();
            } else {
                ((r2) tVar.e).e();
            }
        } catch (Throwable th10) {
            com.google.firebase.messaging.t tVar2 = zVar.d;
            if (g2Var.e()) {
                ((r2) tVar2.d).e();
            } else {
                ((r2) tVar2.e).e();
            }
            throw th10;
        }
    }
}
