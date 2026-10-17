package tfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class q1 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270745h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f270746j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(efm.r rVar, Object obj2, Object obj3, int i) {
        super(rVar);
        this.f270745h = i;
        this.i = obj2;
        this.f270746j = obj3;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270745h) {
            case 0:
                this.f270328g.subscribe(new p1(yVar, (kfm.o) this.i, (kfm.d) this.f270746j));
                break;
            case 1:
                this.f270328g.subscribe(new ofm.k(yVar, 0, (kfm.g) this.i, (kfm.a) this.f270746j));
                break;
            case 2:
                try {
                    Object objCall = ((Callable) this.f270746j).call();
                    mfm.f.b(objCall, "The seed supplied is null");
                    this.f270328g.subscribe(new r5(yVar, (kfm.c) this.i, objCall));
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lfm.e.d(th10, yVar);
                    return;
                }
                break;
            default:
                bgm.d dVar = new bgm.d(yVar);
                ofm.p pVar = new ofm.p(dVar, (kfm.c) this.i);
                dVar.onSubscribe(pVar);
                ((efm.w) this.f270746j).subscribe(new w7(pVar));
                this.f270328g.subscribe(pVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(efm.r rVar, Callable callable, kfm.c cVar) {
        super(rVar);
        this.f270745h = 2;
        this.i = cVar;
        this.f270746j = callable;
    }
}
