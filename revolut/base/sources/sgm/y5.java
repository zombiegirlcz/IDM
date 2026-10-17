package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes14.dex */
public final class y5 extends ArrayDeque implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f263303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f263304c;
    public volatile boolean d;

    public y5(fgm.l lVar, int i) {
        this.f263302a = lVar;
        this.f263303b = i;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f263304c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }

    @Override // fgm.l
    public final void onComplete() {
        fgm.l lVar = this.f263302a;
        while (!this.d) {
            Object objPoll = poll();
            if (objPoll == null) {
                lVar.onComplete();
                return;
            }
            lVar.onNext(objPoll);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263302a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263303b == size()) {
            poll();
        }
        offer(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263304c, disposable)) {
            this.f263304c = disposable;
            this.f263302a.onSubscribe(this);
        }
    }
}
