package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class h1 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262875c;
    public final TimeUnit d;
    public final Scheduler e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Observable observable, long j2, TimeUnit timeUnit, Scheduler scheduler, Object obj2, int i) {
        super(observable);
        this.f262874b = i;
        this.f262875c = j2;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = obj2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f262874b) {
            case 0:
                this.f262688a.subscribe(new g1(new ahm.c(lVar), this.f262875c, this.d, this.e.b(), (igm.g) this.f));
                break;
            case 1:
                this.f262688a.subscribe(new c6(new ahm.c(lVar), this.f262875c, this.d, this.e.b(), (igm.g) this.f));
                break;
            default:
                ObservableSource observableSource = (ObservableSource) this.f;
                ObservableSource observableSource2 = this.f262688a;
                Scheduler scheduler = this.e;
                if (observableSource != null) {
                    i6 i6Var = new i6(lVar, this.f262875c, this.d, scheduler.b(), (ObservableSource) this.f);
                    lVar.onSubscribe(i6Var);
                    Disposable disposableA = i6Var.d.a(new qfm.t2(0L, i6Var), i6Var.f262911b, i6Var.f262912c);
                    ggm.b bVar = i6Var.e;
                    bVar.getClass();
                    jgm.b.c(bVar, disposableA);
                    observableSource2.subscribe(i6Var);
                } else {
                    j6 j6Var = new j6(lVar, this.f262875c, this.d, scheduler.b());
                    lVar.onSubscribe(j6Var);
                    Disposable disposableA2 = j6Var.d.a(new qfm.t2(0L, j6Var), j6Var.f262939b, j6Var.f262940c);
                    ggm.b bVar2 = j6Var.e;
                    bVar2.getClass();
                    jgm.b.c(bVar2, disposableA2);
                    observableSource2.subscribe(j6Var);
                }
                break;
        }
    }
}
