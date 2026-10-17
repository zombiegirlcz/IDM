package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class c3 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270384h;
    public final efm.w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kfm.o f270385j;
    public final kfm.o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kfm.c f270386l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(efm.r rVar, efm.w wVar, kfm.o oVar, kfm.o oVar2, kfm.c cVar, int i) {
        super(rVar);
        this.f270384h = i;
        this.i = wVar;
        this.f270385j = oVar;
        this.k = oVar2;
        this.f270386l = cVar;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270384h) {
            case 0:
                y2 y2Var = new y2(yVar, this.f270385j, this.k, this.f270386l, 0);
                yVar.onSubscribe(y2Var);
                b3 b3Var = new b3(y2Var, true);
                ifm.b bVar = y2Var.d;
                bVar.a(b3Var);
                b3 b3Var2 = new b3(y2Var, false);
                bVar.a(b3Var2);
                this.f270328g.subscribe(b3Var);
                this.i.subscribe(b3Var2);
                break;
            default:
                y2 y2Var2 = new y2(yVar, this.f270385j, this.k, this.f270386l, 1);
                yVar.onSubscribe(y2Var2);
                b3 b3Var3 = new b3(y2Var2, true);
                ifm.b bVar2 = y2Var2.d;
                bVar2.a(b3Var3);
                b3 b3Var4 = new b3(y2Var2, false);
                bVar2.a(b3Var4);
                this.f270328g.subscribe(b3Var3);
                this.i.subscribe(b3Var4);
                break;
        }
    }
}
