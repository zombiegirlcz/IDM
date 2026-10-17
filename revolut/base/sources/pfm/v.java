package pfm;

import efm.f0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends AtomicReference implements ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f235770b;

    public /* synthetic */ v(Object obj2, int i) {
        this.f235769a = i;
        this.f235770b = obj2;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f235769a) {
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
        switch (this.f235769a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f235769a) {
            case 0:
                ((efm.d) this.f235770b).onComplete();
                break;
            default:
                ((f0) this.f235770b).onSuccess(0L);
                break;
        }
    }
}
