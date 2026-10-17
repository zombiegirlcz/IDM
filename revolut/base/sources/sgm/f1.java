package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class f1 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f262824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(ObservableSource observableSource, igm.o oVar, int i) {
        super(observableSource);
        this.f262823b = i;
        this.f262824c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f262823b) {
            case 0:
                this.f262688a.subscribe(new e1(new ahm.c(lVar), this.f262824c));
                break;
            case 1:
                this.f262688a.subscribe(new o1(lVar, this.f262824c));
                break;
            case 2:
                this.f262688a.subscribe(new l2(lVar, this.f262824c, 0));
                break;
            case 3:
                this.f262688a.subscribe(new mgm.l(lVar, this.f262824c, 1));
                break;
            case 4:
                v3 v3Var = new v3(lVar, this.f262824c);
                lVar.onSubscribe(v3Var.f263222c);
                this.f262688a.subscribe(v3Var);
                break;
            case 5:
                this.f262688a.subscribe(new l2(lVar, this.f262824c, 1));
                break;
            case 6:
                PublishSubject publishSubject = new PublishSubject();
                try {
                    Object objApply = this.f262824c.apply(publishSubject);
                    Objects.requireNonNull(objApply, "The selector returned a null ObservableSource");
                    ObservableSource observableSource = (ObservableSource) objApply;
                    rgm.a aVar = new rgm.a(lVar);
                    observableSource.subscribe(aVar);
                    this.f262688a.subscribe(new dlm.c(publishSubject, aVar, 1));
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    jgm.c.c(th10, lVar);
                    return;
                }
                break;
            case 7:
                fhm.c cVar = new fhm.c(new PublishSubject());
                try {
                    Object objApply2 = this.f262824c.apply(cVar);
                    Objects.requireNonNull(objApply2, "The handler returned a null ObservableSource");
                    ObservableSource observableSource2 = (ObservableSource) objApply2;
                    j4 j4Var = new j4(lVar, cVar, this.f262688a, 0);
                    lVar.onSubscribe(j4Var);
                    observableSource2.subscribe((i4) j4Var.i);
                    j4Var.a();
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    jgm.c.c(th11, lVar);
                    return;
                }
                break;
            default:
                fhm.c cVar2 = new fhm.c(new PublishSubject());
                try {
                    Object objApply3 = this.f262824c.apply(cVar2);
                    Objects.requireNonNull(objApply3, "The handler returned a null ObservableSource");
                    ObservableSource observableSource3 = (ObservableSource) objApply3;
                    j4 j4Var2 = new j4(lVar, cVar2, this.f262688a, 1);
                    lVar.onSubscribe(j4Var2);
                    observableSource3.subscribe((i4) j4Var2.i);
                    j4Var2.a();
                } catch (Throwable th12) {
                    ce9.m.F(th12);
                    jgm.c.c(th12, lVar);
                }
                break;
        }
    }
}
