package clm;

import efm.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes14.dex */
public final class r extends ukm.q implements y, efm.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25086m = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_subscription$volatile");
    private volatile /* synthetic */ Object _subscription$volatile;

    @Override // ukm.q
    public final void F() {
        ifm.c cVar = (ifm.c) f25086m.getAndSet(this, null);
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // efm.y
    public final void onComplete() {
        close(null);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        f25086m.set(this, cVar);
    }

    @Override // efm.l, efm.f0
    public final void onSuccess(Object obj2) {
        mo3647trySendJP2dKIU(obj2);
        close(null);
    }
}
