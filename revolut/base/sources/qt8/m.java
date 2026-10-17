package qt8;

import kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f249031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f249032c;
    public final /* synthetic */ j21.c d;
    public final /* synthetic */ n0 e;

    public /* synthetic */ m(n0 n0Var, j21.c cVar, n0 n0Var2, int i) {
        this.f249031b = i;
        this.f249032c = n0Var;
        this.d = cVar;
        this.e = n0Var2;
    }

    @Override // qt8.a
    public final void b(long j2) {
        switch (this.f249031b) {
            case 0:
                n0 n0Var = this.f249032c;
                long j3 = n0Var.f186428a + j2;
                n0Var.f186428a = j3;
                this.d.a(j3, this.e.f186428a);
                break;
            default:
                n0 n0Var2 = this.f249032c;
                long j5 = n0Var2.f186428a + j2;
                n0Var2.f186428a = j5;
                this.d.a(j5, this.e.f186428a);
                break;
        }
    }
}
