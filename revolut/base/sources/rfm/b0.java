package rfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 extends AtomicReference implements ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253920b;

    public /* synthetic */ b0(Object obj2, int i) {
        this.f253919a = i;
        this.f253920b = obj2;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f253919a) {
            case 0:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f253919a) {
            case 0:
                return lfm.d.b((ifm.c) get());
            default:
                return get() == lfm.d.DISPOSED;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f253919a) {
            case 0:
                ((efm.l) this.f253920b).onSuccess(0L);
                break;
            default:
                efm.y yVar = (efm.y) this.f253920b;
                if (!isDisposed()) {
                    yVar.onNext(0L);
                    lazySet(lfm.e.INSTANCE);
                    yVar.onComplete();
                }
                break;
        }
    }
}
