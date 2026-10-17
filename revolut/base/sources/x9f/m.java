package x9f;

import cli.y;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.NumberOfSharesScreenContract$InputData;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends oki.h implements k {
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f303709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f303710q;

    public m(NumberOfSharesScreenContract$InputData inputData, n stateMapper, j60.a bottomExpandableDialogControllerExtension) {
        BigDecimal bigDecimalValueOf;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.o = stateMapper;
        this.f303709p = bottomExpandableDialogControllerExtension;
        Integer num = inputData.f91573b;
        if (num != null) {
            bigDecimalValueOf = BigDecimal.valueOf(num.intValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        } else {
            bigDecimalValueOf = null;
        }
        boolean z = false;
        if (num != null && num.intValue() > 0) {
            z = true;
        }
        this.f303710q = mra.d.b(this, new h(bigDecimalValueOf, true, z), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f303710q;
    }
}
