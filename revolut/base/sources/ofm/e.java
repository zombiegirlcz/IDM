package ofm;

import efm.y;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends CountDownLatch implements y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f224911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f224912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f224913c;
    public volatile boolean d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i) {
        super(1);
        this.e = i;
    }

    public final Object a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                dispose();
                throw zfm.h.d(e);
            }
        }
        Throwable th10 = this.f224912b;
        if (th10 == null) {
            return this.f224911a;
        }
        throw zfm.h.d(th10);
    }

    @Override // ifm.c
    public final void dispose() {
        this.d = true;
        ifm.c cVar = this.f224913c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d;
    }

    @Override // efm.y
    public final void onComplete() {
        countDown();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.e) {
            case 0:
                if (this.f224911a == null) {
                    this.f224912b = th10;
                }
                countDown();
                break;
            default:
                this.f224911a = null;
                this.f224912b = th10;
                countDown();
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.e) {
            case 0:
                if (this.f224911a == null) {
                    this.f224911a = obj2;
                    this.f224913c.dispose();
                    countDown();
                }
                break;
            default:
                this.f224911a = obj2;
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        this.f224913c = cVar;
        if (this.d) {
            cVar.dispose();
        }
    }
}
