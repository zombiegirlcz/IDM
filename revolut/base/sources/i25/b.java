package i25;

import kotlin.jvm.internal.Intrinsics;
import rp0.k1;
import rp0.l0;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements pfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f157840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6e.d f157841b;

    public b(c collateralPocketMapper, x6e.d subaccountEventProvider) {
        Intrinsics.checkNotNullParameter(collateralPocketMapper, "collateralPocketMapper");
        Intrinsics.checkNotNullParameter(subaccountEventProvider, "subaccountEventProvider");
        this.f157840a = collateralPocketMapper;
        this.f157841b = subaccountEventProvider;
    }

    @Override // pfe.d
    public final pfe.c a(j60.a bottomDialogExtension, l0 popupMenuDialogDisplayer, k1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        return new com.revolut.feature.credit.impl.ui.account.collateral.a(bottomDialogExtension, this.f157840a, this.f157841b);
    }
}
