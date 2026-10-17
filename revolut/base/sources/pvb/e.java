package pvb;

import cli.n;
import cli.y;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.status.RevPointsExclusiveStoreProductStatusScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pkf.x;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends h implements c {
    public final RevPointsExclusiveStoreProductStatusScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o7.b f240046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y21.c f240047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f240048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f240049s;

    public e(n stateMapper, RevPointsExclusiveStoreProductStatusScreenContract$InputData inputData, o7.b storeProductStatusInteractor, y21.c optOutRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(storeProductStatusInteractor, "storeProductStatusInteractor");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.o = inputData;
        this.f240046p = storeProductStatusInteractor;
        this.f240047q = optOutRepository;
        this.f240048r = new vii.b();
        this.f240049s = mra.d.b(this, new b(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.Q(this.f240048r, new x(null, this, 14)), null, null, new d(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f240049s;
    }
}
