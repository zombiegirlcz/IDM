package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270926h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(efm.w wVar, int i) {
        super(wVar);
        this.f270926h = i;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270926h) {
            case 0:
                this.f270328g.subscribe(new w0(yVar, 0));
                break;
            case 1:
                n1 n1Var = new n1();
                n1Var.f270668b = yVar;
                this.f270328g.subscribe(n1Var);
                break;
            case 2:
                this.f270328g.subscribe(new n1(yVar, 1));
                break;
            case 3:
                this.f270328g.subscribe(new n1(yVar, 2));
                break;
            case 4:
                lfm.b bVar = new lfm.b(1);
                yVar.onSubscribe(bVar);
                q4 q4Var = new q4(yVar, bVar, this.f270328g);
                if (q4Var.getAndIncrement() == 0) {
                    int iAddAndGet = 1;
                    do {
                        q4Var.f270751c.subscribe(q4Var);
                        iAddAndGet = q4Var.addAndGet(-iAddAndGet);
                    } while (iAddAndGet != 0);
                }
                break;
            case 5:
                this.f270328g.subscribe(new bgm.d(yVar));
                break;
            default:
                this.f270328g.subscribe(new o2(yVar, 2));
                break;
        }
    }
}
