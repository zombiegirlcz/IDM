package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class p1 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f263065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f263066c;

    private final void a(Object obj2) {
    }

    private final void b(Object obj2) {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f263064a) {
            case 0:
                Disposable disposable = this.f263066c;
                ygm.e eVar = ygm.e.INSTANCE;
                this.f263066c = eVar;
                this.f263065b = eVar;
                disposable.dispose();
                break;
            case 1:
                this.f263066c.dispose();
                break;
            case 2:
                this.f263066c.dispose();
                break;
            case 3:
                this.f263066c.dispose();
                break;
            default:
                this.f263066c.dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f263064a) {
        }
        return this.f263066c.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f263064a) {
            case 0:
                fgm.l lVar = (fgm.l) this.f263065b;
                ygm.e eVar = ygm.e.INSTANCE;
                this.f263066c = eVar;
                this.f263065b = eVar;
                lVar.onComplete();
                break;
            case 1:
                ((fgm.l) this.f263065b).onComplete();
                break;
            case 2:
                ((fgm.l) this.f263065b).onComplete();
                break;
            case 3:
                fgm.l lVar2 = (fgm.l) this.f263065b;
                lVar2.onNext(fgm.f.f135106b);
                lVar2.onComplete();
                break;
            default:
                ((fgm.b) this.f263065b).onComplete();
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f263064a) {
            case 0:
                fgm.l lVar = (fgm.l) this.f263065b;
                ygm.e eVar = ygm.e.INSTANCE;
                this.f263066c = eVar;
                this.f263065b = eVar;
                lVar.onError(th10);
                break;
            case 1:
                ((fgm.l) this.f263065b).onError(th10);
                break;
            case 2:
                ((fgm.l) this.f263065b).onError(th10);
                break;
            case 3:
                Objects.requireNonNull(th10, "error is null");
                fgm.f fVar = new fgm.f(new ygm.j(th10));
                fgm.l lVar2 = (fgm.l) this.f263065b;
                lVar2.onNext(fVar);
                lVar2.onComplete();
                break;
            default:
                ((fgm.b) this.f263065b).onError(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f263064a) {
            case 0:
                ((fgm.l) this.f263065b).onNext(obj2);
                break;
            case 1:
                ((fgm.l) this.f263065b).onNext(obj2);
                break;
            case 3:
                fgm.l lVar = (fgm.l) this.f263065b;
                Objects.requireNonNull(obj2, "value is null");
                lVar.onNext(new fgm.f(obj2));
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f263064a) {
            case 0:
                if (jgm.b.f(this.f263066c, disposable)) {
                    this.f263066c = disposable;
                    ((fgm.l) this.f263065b).onSubscribe(this);
                }
                break;
            case 1:
                if (jgm.b.f(this.f263066c, disposable)) {
                    this.f263066c = disposable;
                    ((fgm.l) this.f263065b).onSubscribe(this);
                }
                break;
            case 2:
                this.f263066c = disposable;
                ((fgm.l) this.f263065b).onSubscribe(this);
                break;
            case 3:
                if (jgm.b.f(this.f263066c, disposable)) {
                    this.f263066c = disposable;
                    ((fgm.l) this.f263065b).onSubscribe(this);
                }
                break;
            default:
                this.f263066c = disposable;
                ((fgm.b) this.f263065b).onSubscribe(this);
                break;
        }
    }

    public /* synthetic */ p1(Object obj2, int i) {
        this.f263064a = i;
        this.f263065b = obj2;
    }
}
