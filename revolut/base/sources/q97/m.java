package q97;

import com.revolut.feature.apm.core.api.ApmToggles$Swish;
import com.revolut.feature.apm.swish.api.navigation.SwishNavigation$Destination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f243734a;

    public m(t97.c productCellProvider, uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.f243734a = apmFeatureChecker;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return zhm.d0.T(zhm.y0.b(t97.d.APM_SWISH), id10);
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r rVarX = new ufm.i(((ty1.b) this.f243734a).d(uw1.f.SWISH, ApmToggles$Swish.f61804c), new q3d.c(25, new h(this, 2)), 1).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rVarX;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        ufm.b bVarM = efm.d0.m(new o97.l(zh9.u0.f(new SwishNavigation$Destination(0))));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
