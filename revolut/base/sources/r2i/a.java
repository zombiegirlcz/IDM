package r2i;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.youTransactor.uCube.rpc.Constants;
import cp5.d;
import d9.e1;
import f8l.e;
import ip0.a20;
import ip0.c20;
import ip0.y10;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final C1384a Companion = new C1384a();

    /* JADX INFO: renamed from: r2i.a$a, reason: collision with other inner class name */
    public static final class C1384a {
        private C1384a() {
        }
    }

    public final sa a(OrderQuote orderQuote, boolean z) {
        Instant instant;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        if (orderQuote != null) {
            e eVar = orderQuote.k;
            OrderQuote.SettlementDelay settlementDelay = orderQuote.f104759m;
            if (settlementDelay != null && (instant = settlementDelay.f104774a) != null) {
                long epochMilli = instant.toEpochMilli();
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                e eVar2 = e.MARKET;
                if (eVar == eVar2) {
                    int i = R$string.crypto_sell_delays_order_review_title;
                    TimeClause.Format.INSTANCE.getClass();
                    textLocalisedClause = new TextLocalisedClause(i, u.c(new TimeClause(epochMilli, TimeClause.Format.f57959a, null, null, 12)), null, 12);
                } else {
                    textLocalisedClause = new TextLocalisedClause(z ? R$string.crypto_sell_delays_order_review_possible_delay_title : R$string.cryptobuysell_order_details_sell_delays_title, null, null, 14);
                }
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                if (eVar == eVar2) {
                    Intrinsics.checkNotNullParameter(orderQuote, "<this>");
                    xi0.a aVar = b.Companion;
                    String str = e1.k(orderQuote).f104720b;
                    aVar.getClass();
                    textLocalisedClause2 = new TextLocalisedClause((d.D(xi0.a.a(str)) || d.D(xi0.a.a(e1.t(orderQuote).f104720b))) ? R$string.crypto_sell_delays_order_review_description_stablecoins : R$string.crypto_sell_delays_order_review_description_default, null, null, 14);
                } else {
                    int i2 = z ? R$string.crypto_sell_delays_order_review_possible_delay_description : R$string.cryptobuysell_order_details_sell_delays_description;
                    TimeClause.Format.INSTANCE.getClass();
                    textLocalisedClause2 = new TextLocalisedClause(i2, u.c(new TimeClause(epochMilli, TimeClause.Format.f57959a, null, null, 12)), null, 12);
                }
                sa saVar = new sa("SETTLEMENT_DELAY_BANNER_LIST_ID", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, (List) null, false, (c20) new a20(new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246)), (y10) null, (Object) null, Constants.TAG_EMV_L2_CHECKSUM);
                yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
                return saVar;
            }
        }
        return null;
    }
}
