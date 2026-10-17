package t9f;

import cli.y;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreenContract$InputData;
import d9.e1;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends oki.h implements l {
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f269029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f269030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f269031r;

    public o(BuyInPriceScreenContract$InputData inputData, w80.b amountFormatter, a stateMapper, j60.a bottomExpandableDialogControllerExtension) {
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.o = amountFormatter;
        this.f269029p = stateMapper;
        this.f269030q = bottomExpandableDialogControllerExtension;
        ej0.b bVar = inputData.f91567b;
        if (bVar == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            bVar = new ej0.b(ZERO, inputData.f91566a.d);
        }
        ej0.b bVar2 = inputData.f91567b;
        boolean z = false;
        if (bVar2 != null && (bigDecimal = bVar2.f126703a) != null && !e1.I(bigDecimal)) {
            z = true;
        }
        this.f269031r = mra.d.b(this, new i(bVar, z, inputData.f91568c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f269031r;
    }
}
