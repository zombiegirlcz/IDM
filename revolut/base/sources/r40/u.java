package r40;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f251369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f251370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qm2.c f251371c;
    public final l0 d;
    public final ifm.b e;
    public s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f251372g;

    public u(m0 onAllLoaded, m0 onLoadError, qm2.c onSuccessLoad, l0 loaderSupplier, ifm.b compositeDisposable) {
        Intrinsics.checkNotNullParameter(onAllLoaded, "onAllLoaded");
        Intrinsics.checkNotNullParameter(onLoadError, "onLoadError");
        Intrinsics.checkNotNullParameter(onSuccessLoad, "onSuccessLoad");
        Intrinsics.checkNotNullParameter(loaderSupplier, "loaderSupplier");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f251369a = onAllLoaded;
        this.f251370b = onLoadError;
        this.f251371c = onSuccessLoad;
        this.d = loaderSupplier;
        this.e = compositeDisposable;
        this.f = s.IDLE;
        this.f251372g = new AtomicReference();
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.f251372g);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) this.f251372g.get());
    }
}
