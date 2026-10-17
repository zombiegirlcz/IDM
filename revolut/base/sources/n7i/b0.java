package n7i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static IconNavBarMenuItem a(AccountWrapper accountWrapper) {
        SavingsProductData savingsProductData;
        SavingsProduct savingsProduct;
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        SavingsAccountDetails savingsAccountDetailsA = com.revolut.feature_move_money.api.model.b.a(accountWrapper);
        if (((savingsAccountDetailsA == null || (savingsProductData = savingsAccountDetailsA.f86462c) == null || (savingsProduct = savingsProductData.f86683a) == null) ? null : savingsProduct.f) == null) {
            return null;
        }
        return IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "SHIELD_SAVINGS_MENU_BUTTON_ID", new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
    }
}
