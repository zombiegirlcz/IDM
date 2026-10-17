package al2;

import ai0.j;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import r10.v;
import te0.w;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends yk2.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r60.b f6136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v f6137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zj2.a f6138n;

    public d(r60.b promptControllerExtension, v promptModelDataSource, zj2.a atmDestinationsResolver) {
        Intrinsics.checkNotNullParameter(promptControllerExtension, "promptControllerExtension");
        Intrinsics.checkNotNullParameter(promptModelDataSource, "promptModelDataSource");
        Intrinsics.checkNotNullParameter(atmDestinationsResolver, "atmDestinationsResolver");
        this.f6136l = promptControllerExtension;
        this.f6137m = promptModelDataSource;
        this.f6138n = atmDestinationsResolver;
    }

    @Override // yji.n
    public final void H2() {
        r60.d dVar = (r60.d) this.f6136l;
        n.l2(this, rd0.e.b(w.a0(dVar.d.d(), new aik.d(19))), null, new af4.e(this, null, 18), 3);
        r rVarFilter = dVar.d.f().filter(new j(new aik.d(20), 2));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        n.l2(this, rd0.e.b(rVarFilter), null, new c(this, null), 3);
    }

    @Override // yk2.a
    public final boolean Z2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!Intrinsics.f(model.f53228a, "ATM_OUT_OF_NETWORK_TILE_ID")) {
            return false;
        }
        V2(new b(this, null), new yi5.b(29));
        return true;
    }
}
