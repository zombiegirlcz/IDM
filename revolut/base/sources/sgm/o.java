package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends AtomicReference implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ogm.l f263031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f263032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fgm.l f263033c;
    public boolean d;

    public o(ogm.l lVar, int i, fgm.l lVar2) {
        this.f263031a = lVar;
        this.f263032b = i;
        this.f263033c = lVar2;
    }

    @Override // fgm.l
    public final void onComplete() {
        boolean z = this.d;
        fgm.l lVar = this.f263033c;
        if (z) {
            lVar.onComplete();
        } else if (this.f263031a.a(this.f263032b)) {
            this.d = true;
            lVar.onComplete();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        boolean z = this.d;
        fgm.l lVar = this.f263033c;
        if (z) {
            lVar.onError(th10);
        } else if (!this.f263031a.a(this.f263032b)) {
            jb3.l.v(th10);
        } else {
            this.d = true;
            lVar.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        boolean z = this.d;
        fgm.l lVar = this.f263033c;
        if (z) {
            lVar.onNext(obj2);
        } else if (!this.f263031a.a(this.f263032b)) {
            ((Disposable) get()).dispose();
        } else {
            this.d = true;
            lVar.onNext(obj2);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }
}
