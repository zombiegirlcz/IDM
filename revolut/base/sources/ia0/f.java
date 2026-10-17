package ia0;

import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import i4g.g;
import i69.p;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.i;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends h implements b {

    @NotNull
    private static final d Companion = new d();
    public final BackendFlowInput o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ra0.h f159922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ga0.a f159923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f159924r;

    public f(BackendFlowInput inputData, ra0.h repository, ga0.a errorHandlerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        this.o = inputData;
        this.f159922p = repository;
        this.f159923q = errorHandlerExtension;
        this.f159924r = d8l.d.a(this, new p(this, 5));
    }

    @Override // yki.j
    public final void M0() {
        l2(new e(this, null), new g(1, this, f.class, "handleBackendFlowLoadingError", "handleBackendFlowLoadingError(Ljava/lang/Throwable;)Z", 0, 7));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f159924r;
    }
}
