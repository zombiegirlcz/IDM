package rbh;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.trading.core.domain.PocketInfo;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final Image a(PocketInfo pocketInfo) {
        Intrinsics.checkNotNullParameter(pocketInfo, "<this>");
        if ((pocketInfo instanceof PocketInfo.Pro) || (pocketInfo instanceof PocketInfo.Joint) || (pocketInfo instanceof PocketInfo.CryptoPocket) || (pocketInfo instanceof PocketInfo.CommodityPocket) || (pocketInfo instanceof PocketInfo.CurrencyPocket)) {
            return new CurrencyImage(pocketInfo.getF104478b().f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (pocketInfo instanceof PocketInfo.InvestPocket) {
            return ((PocketInfo.InvestPocket) pocketInfo).f104467g;
        }
        if (pocketInfo instanceof PocketInfo.Saving) {
            return ((PocketInfo.Saving) pocketInfo).f;
        }
        if (pocketInfo instanceof PocketInfo.CreditCard) {
            return ((PocketInfo.CreditCard) pocketInfo).e;
        }
        if (pocketInfo instanceof PocketInfo.Vault) {
            return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Clause b(PocketInfo pocketInfo) {
        Intrinsics.checkNotNullParameter(pocketInfo, "<this>");
        if (pocketInfo instanceof PocketInfo.CurrencyPocket) {
            return new TextLocalisedClause(R$string.wealth_robo_home_transactions_transfer_title_main_account, null, null, 14);
        }
        if (pocketInfo instanceof PocketInfo.Saving) {
            return new TextClause(((PocketInfo.Saving) pocketInfo).e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (pocketInfo instanceof PocketInfo.Vault) {
            return new TextClause(((PocketInfo.Vault) pocketInfo).e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (pocketInfo instanceof PocketInfo.Joint) {
            return new TextLocalisedClause(R$string.wealth_invest_add_money_pocket_picker_joint, null, null, 14);
        }
        if (pocketInfo instanceof PocketInfo.InvestPocket) {
            return ((PocketInfo.InvestPocket) pocketInfo).f;
        }
        if (pocketInfo instanceof PocketInfo.Pro) {
            return ((PocketInfo.Pro) pocketInfo).e;
        }
        if (pocketInfo instanceof PocketInfo.CreditCard) {
            return ((PocketInfo.CreditCard) pocketInfo).f;
        }
        if ((pocketInfo instanceof PocketInfo.CryptoPocket) || (pocketInfo instanceof PocketInfo.CommodityPocket)) {
            return new CurrencyClause(pocketInfo.getF104478b().f115083b, null, null, 6);
        }
        throw new NoWhenBranchMatchedException();
    }
}
