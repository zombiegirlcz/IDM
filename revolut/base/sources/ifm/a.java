package ifm;

import java.util.concurrent.atomic.AtomicReference;
import zfm.h;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends AtomicReference implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161040a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, int i) {
        super(obj2);
        this.f161040a = i;
    }

    @Override // ifm.c
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        switch (this.f161040a) {
            case 0:
                try {
                    ((kfm.a) andSet).run();
                    return;
                } catch (Throwable th10) {
                    throw h.d(th10);
                }
            default:
                ((Runnable) andSet).run();
                return;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == null;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f161040a) {
            case 1:
                return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
            default:
                return super.toString();
        }
    }
}
