package b0i;

import avk.i;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature_crypto_order_flow.api.navigation.FirmPriceDevianceBottomSheetControllerProvider$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends h implements dli.b {
    public final FirmPriceDevianceBottomSheetControllerProvider$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o7.b f11677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f11678q;

    public e(FirmPriceDevianceBottomSheetControllerProvider$InputData inputData, o7.b orderQuoteInteractor, c stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f11677p = orderQuoteInteractor;
        this.f11678q = mra.d.b(this, new a(inputData.f96719a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, o7.b.u(this.f11677p, this.o.f96720b), null, new i(this, null, 12), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f11678q;
    }
}
