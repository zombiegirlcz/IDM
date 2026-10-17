package naf;

import cli.y;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.screens.assets_price_update.AssetsPriceUpdateScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends oki.h implements g {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AssetsPriceUpdateScreenContract$InputData f213896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o9f.c f213897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o9f.g f213898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f213899s;

    public k(e mapper, AssetsPriceUpdateScreenContract$InputData inputData, o9f.c transferInteractor, o9f.g transferInvestmentsProgressInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(transferInvestmentsProgressInteractor, "transferInvestmentsProgressInteractor");
        this.o = mapper;
        this.f213896p = inputData;
        this.f213897q = transferInteractor;
        this.f213898r = transferInvestmentsProgressInteractor;
        this.f213899s = mra.d.b(this, new d(inputData.f91610a.k), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, new a6e.b(com.revolut.data.database.models.openbanking.d.y("AssetsPriceUpdateScreenModel", "observeTransferRequest", this.f213898r.a(this.f213896p.f91610a.f91519a, w4l.h.f294642c)), 28), null, new j(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f213899s;
    }
}
