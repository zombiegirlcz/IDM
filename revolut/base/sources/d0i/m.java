package d0i;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_crypto_order_flow.api.CryptoOrderFlowCoreApi$Toggles$CryptoVolatilityBanner;
import com.revolut.feature_crypto_order_flow.api.R$string;
import ip0.a20;
import ip0.c20;
import ip0.y10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f110370a;

    public m(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f110370a = featureToggleInteractor;
    }

    public final sa a(wd6.e exchangeMode, wd6.h orderType, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        if (z) {
            if (((jte.d) this.f110370a).c(CryptoOrderFlowCoreApi$Toggles$CryptoVolatilityBanner.f96678c) && ((i = l.f110369a[orderType.ordinal()]) == 1 || (i == 2 && exchangeMode == wd6.e.BUY))) {
                sa saVar = new sa("VOLATILITY_BANNER_LIST_ID", (Clause) new TextLocalisedClause(R$string.cryptobuysell_volatility_banner_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.cryptobuysell_volatility_banner_message, null, null, 14), (List) null, false, (c20) new a20(new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246)), (y10) null, (Object) null, 200);
                yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
                return saVar;
            }
        }
        return null;
    }
}
