package ofm;

import efm.f0;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends CountDownLatch implements f0, efm.d, efm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f224914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f224915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f224916c;
    public volatile boolean d;

    public final Object a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.d = true;
                ifm.c cVar = this.f224916c;
                if (cVar != null) {
                    cVar.dispose();
                }
                throw zfm.h.d(e);
            }
        }
        Throwable th10 = this.f224915b;
        if (th10 == null) {
            return this.f224914a;
        }
        throw zfm.h.d(th10);
    }

    @Override // efm.d
    public final void onComplete() {
        countDown();
    }

    @Override // efm.f0
    public final void onError(Throwable th10) {
        this.f224915b = th10;
        countDown();
    }

    @Override // efm.f0
    public final void onSubscribe(ifm.c cVar) {
        this.f224916c = cVar;
        if (this.d) {
            cVar.dispose();
        }
    }

    @Override // efm.f0
    public final void onSuccess(Object obj2) {
        this.f224914a = obj2;
        countDown();
    }
}
