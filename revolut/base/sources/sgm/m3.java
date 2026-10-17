package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public final class m3 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f262996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f262997c;
    public Object d;

    public /* synthetic */ m3(Object obj2, int i) {
        this.f262995a = i;
        this.f262997c = obj2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f262995a) {
            case 0:
                this.f262996b.dispose();
                this.f262996b = jgm.b.DISPOSED;
                break;
            case 1:
                this.f262996b.dispose();
                break;
            case 2:
                this.d = null;
                this.f262996b.dispose();
                break;
            case 3:
                this.f262996b.dispose();
                break;
            default:
                this.f262996b.dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f262995a) {
            case 0:
                if (this.f262996b == jgm.b.DISPOSED) {
                }
                break;
        }
        return this.f262996b.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262995a) {
            case 0:
                fgm.e eVar = (fgm.e) this.f262997c;
                this.f262996b = jgm.b.DISPOSED;
                Object obj2 = this.d;
                if (obj2 == null) {
                    eVar.onComplete();
                } else {
                    this.d = null;
                    eVar.onSuccess(obj2);
                }
                break;
            case 1:
                ((fgm.l) this.f262997c).onComplete();
                break;
            case 2:
                fgm.l lVar = (fgm.l) this.f262997c;
                Object obj3 = this.d;
                if (obj3 != null) {
                    this.d = null;
                    lVar.onNext(obj3);
                }
                lVar.onComplete();
                break;
            case 3:
                Collection collection = (Collection) this.d;
                this.d = null;
                fgm.l lVar2 = (fgm.l) this.f262997c;
                lVar2.onNext(collection);
                lVar2.onComplete();
                break;
            default:
                Collection collection2 = (Collection) this.d;
                this.d = null;
                ((fgm.p) this.f262997c).onSuccess(collection2);
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262995a) {
            case 0:
                this.f262996b = jgm.b.DISPOSED;
                this.d = null;
                ((fgm.e) this.f262997c).onError(th10);
                break;
            case 1:
                fgm.l lVar = (fgm.l) this.f262997c;
                try {
                    if (!((igm.p) this.d).test(th10)) {
                        lVar.onError(th10);
                    } else {
                        lVar.onComplete();
                    }
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    lVar.onError(new CompositeException(th10, th11));
                    return;
                }
                break;
            case 2:
                this.d = null;
                ((fgm.l) this.f262997c).onError(th10);
                break;
            case 3:
                this.d = null;
                ((fgm.l) this.f262997c).onError(th10);
                break;
            default:
                this.d = null;
                ((fgm.p) this.f262997c).onError(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262995a) {
            case 0:
                this.d = obj2;
                break;
            case 1:
                ((fgm.l) this.f262997c).onNext(obj2);
                break;
            case 2:
                this.d = obj2;
                break;
            case 3:
                ((Collection) this.d).add(obj2);
                break;
            default:
                ((Collection) this.d).add(obj2);
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262995a) {
            case 0:
                if (jgm.b.f(this.f262996b, disposable)) {
                    this.f262996b = disposable;
                    ((fgm.e) this.f262997c).onSubscribe(this);
                }
                break;
            case 1:
                if (jgm.b.f(this.f262996b, disposable)) {
                    this.f262996b = disposable;
                    ((fgm.l) this.f262997c).onSubscribe(this);
                }
                break;
            case 2:
                if (jgm.b.f(this.f262996b, disposable)) {
                    this.f262996b = disposable;
                    ((fgm.l) this.f262997c).onSubscribe(this);
                }
                break;
            case 3:
                if (jgm.b.f(this.f262996b, disposable)) {
                    this.f262996b = disposable;
                    ((fgm.l) this.f262997c).onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f(this.f262996b, disposable)) {
                    this.f262996b = disposable;
                    ((fgm.p) this.f262997c).onSubscribe(this);
                }
                break;
        }
    }

    public /* synthetic */ m3(Object obj2, Object obj3, int i) {
        this.f262995a = i;
        this.f262997c = obj2;
        this.d = obj3;
    }
}
