package vt4;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class e {
    public static ProductSelectionDelegate.Model a(d source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == null) {
            throw new NoWhenBranchMatchedException();
        }
        dj0.d dVar = source.f291901a;
        xi0.b bVar = dVar.f115083b;
        return new ProductSelectionDelegate.Model("id_credit_card_payment_from_main", new dc(new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14)), new TextLocalisedClause(R$string.credit_card_common_dot_main, u.c(new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), new TextLocalisedClause(R$string.credit_card_common_balance, u.c(sx4.f.b(3, null, null, dVar)), source.f291902b ? new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254) : null, 8), null, null, null, false, false, false, 624);
    }
}
