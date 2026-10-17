package bgm;

import efm.y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f15215a = new AtomicReference();

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.f15215a);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f15215a.get() == lfm.d.DISPOSED;
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        AtomicReference atomicReference;
        Class<?> cls = getClass();
        mfm.f.b(cVar, "next is null");
        do {
            atomicReference = this.f15215a;
            if (atomicReference.compareAndSet(null, cVar)) {
                return;
            }
        } while (atomicReference.get() == null);
        cVar.dispose();
        if (atomicReference.get() != lfm.d.DISPOSED) {
            boh.f.o(cls);
        }
    }
}
