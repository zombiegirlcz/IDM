package lld;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.t0;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h60.d f196708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ks0.n f196709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f196710n;
    public final z1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f196711p;

    public b(h60.d animationControllerExtension, ks0.n slotChecklistSourceProvider) {
        Intrinsics.checkNotNullParameter(animationControllerExtension, "animationControllerExtension");
        Intrinsics.checkNotNullParameter(slotChecklistSourceProvider, "slotChecklistSourceProvider");
        this.f196708l = animationControllerExtension;
        this.f196709m = slotChecklistSourceProvider;
        ukm.f fVar = ukm.f.DROP_OLDEST;
        this.f196710n = vkm.q.b(0, 2, fVar);
        this.o = vkm.q.b(0, 2, fVar);
    }

    @Override // yji.n
    public final void H2() {
        if (this.f196711p) {
            return;
        }
        yji.n.l2(this, vkm.q.P(new t38.e(this.f196710n, 24, new t0(this.o, 1), new a(3, 0, null)), 1), null, new le8.d(this, (Continuation) null, 21), 3);
    }
}
