package xa0;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.q;
import vkm.z1;
import x5a.d;
import x8i.h;
import yji.n;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BackendScreen f303768l;
    public a2 o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function1 f303769m = new h(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function0 f303770n = new d(15);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f303771p = q.b(0, 7, null);

    public final BackendScreen Z2() {
        BackendScreen backendScreen = this.f303768l;
        if (backendScreen != null) {
            return backendScreen;
        }
        Intrinsics.r(ib.b.Screen);
        throw null;
    }

    public abstract void b3();

    public void c3() {
    }

    public abstract Object d3(BackendScreen backendScreen, a aVar);
}
