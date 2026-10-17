package sgm;

import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes14.dex */
public final class a1 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262693b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(ObservableSource observableSource, int i) {
        super(observableSource);
        this.f262693b = i;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f262693b) {
            case 0:
                this.f262688a.subscribe(new z0((Object) lVar, 0));
                return;
            case 1:
                p1 p1Var = new p1();
                p1Var.f263065b = lVar;
                this.f262688a.subscribe(p1Var);
                return;
            case 2:
                this.f262688a.subscribe(new p1(lVar, 1));
                return;
            case 3:
                this.f262688a.subscribe(new p1(lVar, 2));
                return;
            case 4:
                try {
                    throw null;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    jb3.l.v(th10);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                    nullPointerException.initCause(th10);
                    throw nullPointerException;
                }
            case 5:
                this.f262688a.subscribe(new p1(lVar, 3));
                return;
            case 6:
                ggm.b bVar = new ggm.b();
                lVar.onSubscribe(bVar);
                h4 h4Var = new h4(lVar, bVar, this.f262688a);
                if (h4Var.getAndIncrement() == 0) {
                    int iAddAndGet = 1;
                    do {
                        h4Var.f262882c.subscribe(h4Var);
                        iAddAndGet = h4Var.addAndGet(-iAddAndGet);
                    } while (iAddAndGet != 0);
                    return;
                }
                return;
            case 7:
                this.f262688a.subscribe(new ahm.c(lVar));
                return;
            default:
                this.f262688a.subscribe(new m3(lVar, 2));
                return;
        }
    }
}
