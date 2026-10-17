package cq6;

import a07.p;
import bw4.s;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends bq6.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bq6.b f108014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final iq6.a f108015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f108016n;
    public final yud.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f108017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xi0.b f108018q;

    public l(bq6.b view, iq6.a autoStakingResultPopupProvider, c flexibleStakingBannerCustomisationRepository, yud.g stakingInteractor, n flexibleStakingBannerMapper, xi0.b currency) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(autoStakingResultPopupProvider, "autoStakingResultPopupProvider");
        Intrinsics.checkNotNullParameter(flexibleStakingBannerCustomisationRepository, "flexibleStakingBannerCustomisationRepository");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(flexibleStakingBannerMapper, "flexibleStakingBannerMapper");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f108014l = view;
        this.f108015m = autoStakingResultPopupProvider;
        this.f108016n = flexibleStakingBannerCustomisationRepository;
        this.o = stakingInteractor;
        this.f108017p = flexibleStakingBannerMapper;
        this.f108018q = currency;
    }

    @Override // yji.n
    public final void H2() {
        CryptoAssetDetailsScreen cryptoAssetDetailsScreen = (CryptoAssetDetailsScreen) this.f108014l;
        yji.n.l2(this, new an9.g(q.J(rd0.e.b(cryptoAssetDetailsScreen.m0.d), rd0.e.b(cryptoAssetDetailsScreen.m0.e)), 3), null, new j(this, null), 3);
        yji.n.l2(this, new cbf.c(rd0.e.b(cryptoAssetDetailsScreen.m0.f51654g), 13), null, new k(this, null, 0), 3);
    }

    @Override // bq6.a
    public final wkm.l Z2() {
        return q.Q(new p(this.o.d(this.f108018q, w4l.h.f294642c), 13), new s(null, this, 21));
    }
}
