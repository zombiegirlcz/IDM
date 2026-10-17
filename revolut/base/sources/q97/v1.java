package q97;

import com.revolut.feature.apm.bills.postal_check.api.navigation.PostalCheckNavigation$Destination;
import com.revolut.feature.apm.bills.postal_check.api.navigation.PostalCheckNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v1 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final er1.b f243806a;

    public v1(t97.c productCellProvider, er1.b postalCheckFeatureChecker) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(postalCheckFeatureChecker, "postalCheckFeatureChecker");
        this.f243806a = postalCheckFeatureChecker;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.HU_POSTAL_CHECK;
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r rVarJust = efm.r.just(zhm.v.l(this.f243806a.a() ? t97.c.a(t97.d.HU_POSTAL_CHECK) : null));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        ufm.b bVarM = efm.d0.m(new o97.d(new PostalCheckNavigation$Destination(PostalCheckNavigation$InputData.Scanner.f61510a)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
