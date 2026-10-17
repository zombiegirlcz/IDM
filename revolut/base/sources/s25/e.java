package s25;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t25.a;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class e {
    public e(a headerMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
    }

    public final ProductAccount.ValueItem.Main a(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        a.C1497a state = a.C1497a.f267424a;
        Intrinsics.checkNotNullParameter(state, "headerState");
        Intrinsics.checkNotNullParameter(state, "state");
        TextLocalisedClause title = new TextLocalisedClause(R$string.credit_hub_title, null, null, 14);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_hub_subtitle_empty, null, null, 14);
        Intrinsics.checkNotNullParameter(title, "title");
        return new ProductAccount.ValueItem.Main(accountId, (ProductAccountValue) new ProductAccountValue.Text(4, title, textLocalisedClause), new AccountListItemModel((Image) new ResourceImage(R$drawable.uikit_icn_24_logo_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) title, (Clause) null, (List) null, (CircleBadgeModel) null, false, false, false, 188), new AccountWidgetItemModel((List) f0.f322471a, (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) null, false, (ProductAccountSubtitle) new ProductAccountSubtitle.Text(textLocalisedClause, null), 50), new ProductAccountMetadata(null, true), (AccountListItemModel) null, false, false, 96);
    }
}
