package tfm;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class l6 extends ArrayDeque implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270620c;
    public volatile boolean d;

    public l6(efm.y yVar, int i) {
        this.f270618a = yVar;
        this.f270619b = i;
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f270620c.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d;
    }

    @Override // efm.y
    public final void onComplete() {
        efm.y yVar = this.f270618a;
        while (!this.d) {
            Object objPoll = poll();
            if (objPoll == null) {
                if (this.d) {
                    return;
                }
                yVar.onComplete();
                return;
            }
            yVar.onNext(objPoll);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270618a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270619b == size()) {
            poll();
        }
        offer(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270620c, cVar)) {
            this.f270620c = cVar;
            this.f270618a.onSubscribe(this);
        }
    }
}
