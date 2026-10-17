package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class n1 implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f263018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ggm.b f263019c;
    public boolean d;
    public final ObservableSource e;

    public n1(fgm.l lVar, ObservableSource observableSource) {
        this.f263017a = 1;
        this.f263018b = lVar;
        this.e = observableSource;
        this.d = true;
        this.f263019c = new ggm.b();
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f263017a) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    ((Observable) ((mgm.b) this.e).f205309b).subscribe(new m1(this, 0));
                    break;
                }
                break;
            default:
                if (!this.d) {
                    this.f263018b.onComplete();
                } else {
                    this.d = false;
                    this.e.subscribe(this);
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f263017a) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    this.f263018b.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            default:
                this.f263018b.onError(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f263017a) {
            case 0:
                onComplete();
                break;
            default:
                if (this.d) {
                    this.d = false;
                }
                this.f263018b.onNext(obj2);
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f263017a) {
            case 0:
                ggm.b bVar = this.f263019c;
                bVar.getClass();
                jgm.b.d(bVar, disposable);
                break;
            default:
                ggm.b bVar2 = this.f263019c;
                bVar2.getClass();
                jgm.b.d(bVar2, disposable);
                break;
        }
    }

    public n1(mgm.b bVar, ggm.b bVar2, fgm.l lVar) {
        this.f263017a = 0;
        this.e = bVar;
        this.f263019c = bVar2;
        this.f263018b = lVar;
    }
}
