package gcm;

/* JADX INFO: loaded from: classes22.dex */
public final class x extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f142934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar) {
        super(yVar.f142968c.e, 0);
        this.f142934c = yVar;
    }

    @Override // gcm.j0
    public final void b() {
        y yVar = this.f142934c;
        dfm.b.c();
        try {
            dfm.b.a();
            dfm.b.f114548a.getClass();
            if (yVar.f142967b == null) {
                try {
                    yVar.f142966a.d();
                } catch (Throwable th10) {
                    ecm.g2 g2VarG = ecm.g2.f.f(th10).g("Failed to call onReady.");
                    yVar.f142967b = g2VarG;
                    yVar.f142968c.i.k(g2VarG);
                }
            }
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
}
