package pfm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AtomicBoolean implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.d f235716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f235717b;

    public b(c cVar, efm.d dVar) {
        this.f235717b = cVar;
        this.f235716a = dVar;
    }

    @Override // ifm.c
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f235717b.F(this);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get();
    }
}
