package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends AtomicReference implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rfm.g f270577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.y f270579c;
    public boolean d;

    public k(rfm.g gVar, int i, efm.y yVar) {
        this.f270577a = gVar;
        this.f270578b = i;
        this.f270579c = yVar;
    }

    @Override // efm.y
    public final void onComplete() {
        boolean z = this.d;
        efm.y yVar = this.f270579c;
        if (z) {
            yVar.onComplete();
        } else if (this.f270577a.a(this.f270578b)) {
            this.d = true;
            yVar.onComplete();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        boolean z = this.d;
        efm.y yVar = this.f270579c;
        if (z) {
            yVar.onError(th10);
        } else if (!this.f270577a.a(this.f270578b)) {
            mo3.a.m(th10);
        } else {
            this.d = true;
            yVar.onError(th10);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        boolean z = this.d;
        efm.y yVar = this.f270579c;
        if (z) {
            yVar.onNext(obj2);
        } else if (!this.f270577a.a(this.f270578b)) {
            ((ifm.c) get()).dispose();
        } else {
            this.d = true;
            yVar.onNext(obj2);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }
}
