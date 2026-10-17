package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class d6 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270413h;
    public final efm.w i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(efm.r rVar, efm.w wVar, int i) {
        super(rVar);
        this.f270413h = i;
        this.i = wVar;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270413h) {
            case 0:
                bgm.d dVar = new bgm.d(yVar);
                lfm.a aVar = new lfm.a(2);
                dVar.onSubscribe(aVar);
                c6 c6Var = new c6(dVar, aVar);
                this.i.subscribe(new b6(aVar, c6Var, dVar));
                this.f270328g.subscribe(c6Var);
                break;
            default:
                o6 o6Var = new o6(yVar);
                yVar.onSubscribe(o6Var);
                this.i.subscribe(o6Var.f270705c);
                this.f270328g.subscribe(o6Var);
                break;
        }
    }
}
