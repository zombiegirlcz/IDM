package tfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class e5 extends AtomicInteger implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfm.b f270432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.w f270433c;
    public final kfm.d d;
    public int e;

    public e5(efm.y yVar, kfm.d dVar, lfm.b bVar, efm.w wVar) {
        this.f270431a = yVar;
        this.f270432b = bVar;
        this.f270433c = wVar;
        this.d = dVar;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f270432b.isDisposed()) {
                this.f270433c.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270431a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        efm.y yVar = this.f270431a;
        try {
            kfm.d dVar = this.d;
            int i = this.e + 1;
            this.e = i;
            if (dVar.test(Integer.valueOf(i), th10)) {
                a();
            } else {
                yVar.onError(th10);
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            yVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270431a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.b bVar = this.f270432b;
        bVar.getClass();
        lfm.d.c(bVar, cVar);
    }
}
