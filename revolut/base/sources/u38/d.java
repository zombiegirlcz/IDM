package u38;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemActionsMode;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static ArrayList a(List pockets) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        List<io3.d> list = pockets;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (io3.d dVar : list) {
            xi0.a aVar = xi0.b.Companion;
            String str = dVar.f163147c;
            aVar.getClass();
            xi0.b bVarA = xi0.a.a(str);
            io3.k kVar = dVar.f;
            int i = c.f276816a[kVar.ordinal()];
            ProductAccountSubtitle.Text text = null;
            TextLocalisedClause textLocalisedClause = i != 1 ? i != 2 ? null : new TextLocalisedClause(R$string.home_currency_account_delisted, null, null, 14) : new TextLocalisedClause(com.revolut.feature.pocket_details.api.R$string.pocket_inactive, null, null, 14);
            dj0.d dVar2 = new dj0.d(dVar.i, bVarA);
            ProductAccountId productAccountId = new ProductAccountId(dVar.f163145a, null);
            ProductAccountValue.Balance balance = new ProductAccountValue.Balance(dVar2, textLocalisedClause, 4);
            boolean z = kVar == io3.k.INACTIVE || kVar == io3.k.DELISTED;
            ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(dVar2), true);
            CurrencyImage currencyImage = new CurrencyImage(dVar.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            CurrencyClause currencyClause = new CurrencyClause(bVarA, null, null, 6);
            io3.k kVar2 = io3.k.DELISTED;
            AccountListItemModel accountListItemModel = new AccountListItemModel((Image) currencyImage, (Clause) currencyClause, (Clause) (kVar == kVar2 ? textLocalisedClause : null), (List) f0.f322471a, (CircleBadgeModel) null, kVar != kVar2, kVar != kVar2, false, 48);
            AccountWidgetItemActionsMode.SingleAction singleAction = new AccountWidgetItemActionsMode.SingleAction(new ProductAccountWidgetAction(492, null, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_home_bereavement_account_action_learn_more, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_LEARN_MORE", null, null, false, false));
            CompositeClause compositeClause = new CompositeClause(v.k(new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_home_bereavement_account_product_name, null, null, 14), new TextClause(dVar.f163147c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_16_lock_closed, (Integer) null, (Float) null, (Float) null, 30)), new DotDividerClause((Integer) null), null, null, 12);
            if (textLocalisedClause != null) {
                text = new ProductAccountSubtitle.Text(textLocalisedClause, null);
            }
            arrayList.add(new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel(singleAction, compositeClause, text), productAccountMetadata, (AccountListItemModel) null, z, false, 256));
        }
        return arrayList;
    }
}
