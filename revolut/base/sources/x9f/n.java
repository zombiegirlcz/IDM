package x9f;

import cli.o;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        String string;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f303705c;
        BigDecimal bigDecimal = domainState.f303703a;
        if (bigDecimal == null || (string = bigDecimal.toString()) == null) {
            string = "";
        }
        return new l(z, u.c(new CenteredAmountDelegate.Model("NUMBER_0F_TRANSFER_SHARES_ID", null, new bw0.h(string, null, null, domainState.f303704b, null, Boolean.TRUE, false, false, null, null, null, null, 32726), null, new bw0.m(new TextLocalisedClause(R$string.trading_stocks_transfer_in_asset_amount_info, null, null, 14), domainState.f303704b ? bw0.l.INFO : bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, f.f303701a), null, null, false, false, null, null, 2026)));
    }
}
