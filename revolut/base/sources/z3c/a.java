package z3c;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.revolut_shop.api.domain.model.RevolutShopAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static CurrencyImage a(RevolutShopAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return new CurrencyImage(account.f84200c.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) (0 == true ? 1 : 0), 14);
    }
}
