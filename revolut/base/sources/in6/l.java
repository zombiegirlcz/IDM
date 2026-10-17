package in6;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements dli.b {
    public final mn6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f162677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nn6.a f162678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f162679r;

    public l(mn6.a pennyTopUpControllerExtension, e inputData, nn6.a uiContentProvider, m stateMapper) {
        Intrinsics.checkNotNullParameter(pennyTopUpControllerExtension, "pennyTopUpControllerExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiContentProvider, "uiContentProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = pennyTopUpControllerExtension;
        this.f162677p = inputData;
        this.f162678q = uiContentProvider;
        this.f162679r = mra.d.b(this, new d(inputData.f162668a.f66108b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String str = this.f162677p.f162670c;
        if (str != null) {
            this.o.Z2(str, new k(this, 1), new k(this, 2));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f162679r;
    }
}
