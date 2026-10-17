package dc0;

import com.revolut.feature.backend_flow.domain.models.FormScreen;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import r10.q;
import skm.a2;
import vkm.z1;
import yb0.h;
import yji.n;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f112778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l80.e f112779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yk0.d f112780n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f112781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f112782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f112783r;

    public f(FormScreen screen, q interactor, l80.e dateProvider, yk0.d schedulerProvider) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.f112778l = interactor;
        this.f112779m = dateProvider;
        this.f112780n = schedulerProvider;
        this.o = hx7.a.r(screen).f;
        this.f112781p = vkm.q.b(0, 7, null);
    }

    @Override // yji.n
    public final void E2() {
        this.f112783r = null;
        this.f112782q = null;
    }
}
