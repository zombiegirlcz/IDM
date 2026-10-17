package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: classes14.dex */
public final class a3 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f262698c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(Observable observable, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(observable);
        this.f262697b = i;
        this.f262698c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f262697b) {
            case 0:
                w2 w2Var = new w2(lVar, (igm.o) this.d, (igm.o) this.e, (igm.c) this.f, 0);
                lVar.onSubscribe(w2Var);
                z2 z2Var = new z2(w2Var, true);
                CompositeDisposable compositeDisposable = w2Var.d;
                compositeDisposable.a(z2Var);
                z2 z2Var2 = new z2(w2Var, false);
                compositeDisposable.a(z2Var2);
                this.f262688a.subscribe(z2Var);
                ((ObservableSource) this.f262698c).subscribe(z2Var2);
                break;
            case 1:
                w2 w2Var2 = new w2(lVar, (igm.o) this.d, (igm.o) this.e, (igm.c) this.f, 1);
                lVar.onSubscribe(w2Var2);
                z2 z2Var3 = new z2(w2Var2, true);
                CompositeDisposable compositeDisposable2 = w2Var2.d;
                compositeDisposable2.a(z2Var3);
                z2 z2Var4 = new z2(w2Var2, false);
                compositeDisposable2.a(z2Var4);
                this.f262688a.subscribe(z2Var3);
                ((ObservableSource) this.f262698c).subscribe(z2Var4);
                break;
            default:
                this.f262688a.subscribe(new v1(lVar, (igm.g) this.f262698c, (igm.g) this.d, (igm.a) this.e, (igm.a) this.f));
                break;
        }
    }
}
