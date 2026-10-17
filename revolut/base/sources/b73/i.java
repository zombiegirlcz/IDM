package b73;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.api.navigation.CardSelectionNavigationData$InputData;
import d73.u;
import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import om4.m4;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends oki.h implements d {
    public final CardSelectionNavigationData$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mt8.d f12877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r0 f12878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f12879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l93.f f12880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zf8.k f12881t;
    public final jla.h u;
    public final m4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f12882w;

    public i(n stateMapper, CardSelectionNavigationData$InputData inputData, mt8.d kycInteractor, r0 jointAccountsInteractor, u cardsScreenInteractor, l93.f revolutCardsInteractor, zf8.k juniorAccountInfoProvider, jla.h productCatalogueInteractor, m4 familyCreditCardWalletInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(cardsScreenInteractor, "cardsScreenInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(familyCreditCardWalletInteractor, "familyCreditCardWalletInteractor");
        this.o = inputData;
        this.f12877p = kycInteractor;
        this.f12878q = jointAccountsInteractor;
        this.f12879r = cardsScreenInteractor;
        this.f12880s = revolutCardsInteractor;
        this.f12881t = juniorAccountInfoProvider;
        this.u = productCatalogueInteractor;
        this.v = familyCreditCardWalletInteractor;
        this.f12882w = mra.d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f65352c), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new az.i(this, null, 12), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f12882w;
    }
}
