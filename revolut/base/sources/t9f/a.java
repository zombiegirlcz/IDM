package t9f;

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
public final class a implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f269013a;

    public a(w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f269013a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f269019b;
        boolean z3 = domainState.f269020c;
        ej0.b bVar = domainState.f269018a;
        BigDecimal bigDecimal = bVar.f126703a;
        xi0.b bVar2 = bVar.f126704b;
        return new m(u.c(new CenteredAmountDelegate.Model("PURCHASE_PRICE_ID", null, new bw0.h(this.f269013a.d(pyd.c.W(bigDecimal, bVar2), bVar2.f306286a), cp5.d.J(bVar2), null, domainState.f269019b, null, Boolean.TRUE, false, false, null, null, null, null, 32724), null, new bw0.m(new TextLocalisedClause(R$string.trading_stocks_transfer_in_asset_price_info, null, null, 14), bw0.l.INFO, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, g.f269016a), null, null, false, false, null, null, 2026)), z, z3);
    }
}
