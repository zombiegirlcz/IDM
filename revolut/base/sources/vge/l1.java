package vge;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.model.AccountBackground;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemActionsMode;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa7.m f288944a;

    public l1(wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f288944a = hiddenAccountsInteractor;
    }

    public static final AccountContent a(l1 l1Var, AccountContent accountContent, Set set) {
        CompositeClause compositeClause;
        if (!set.contains(accountContent.f89475b.getF89504c().f89729a)) {
            return accountContent;
        }
        ProductAccount.ValueItem valueItemT = accountContent.f89475b;
        Float fValueOf = Float.valueOf(16.0f);
        if (valueItemT instanceof ProductAccount.ValueItem.Main) {
            ProductAccount.ValueItem.Main main = (ProductAccount.ValueItem.Main) valueItemT;
            AccountWidgetItemModel accountWidgetItemModel = main.f;
            Clause clause = accountWidgetItemModel.d;
            if (clause != null) {
                List listK = zhm.v.k(clause, new ImageClause(R$drawable.uikit_icn_24_eye_hide, (Integer) null, fValueOf, fValueOf, 18));
                m70.a.t(kotlin.jvm.internal.t0.f186434a);
                compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            } else {
                compositeClause = null;
            }
            CompositeClause compositeClause2 = compositeClause;
            AccountWidgetItemActionsMode actionsMode = accountWidgetItemModel.f89484a;
            NavBarWithContainerBackground navBarWithContainerBackground = accountWidgetItemModel.f89485b;
            AccountWidgetItemModel.EmptyStateStories emptyStateStories = accountWidgetItemModel.f89486c;
            boolean z = accountWidgetItemModel.f;
            ProductAccountSubtitle productAccountSubtitle = accountWidgetItemModel.f89487g;
            Intrinsics.checkNotNullParameter(actionsMode, "actionsMode");
            Intrinsics.checkNotNullParameter(emptyStateStories, "emptyStateStories");
            valueItemT = ProductAccount.ValueItem.Main.T(main, null, null, new AccountWidgetItemModel(actionsMode, navBarWithContainerBackground, emptyStateStories, (Clause) compositeClause2, true, z, productAccountSubtitle), null, 503);
        } else if (!(valueItemT instanceof ProductAccount.ValueItem.Discover)) {
            throw new NoWhenBranchMatchedException();
        }
        ProductAccount.ValueItem account = valueItemT;
        ProductId productId = accountContent.f89474a;
        AccountBackground background = accountContent.f89476c;
        boolean z3 = accountContent.d;
        ld6.b bVar = accountContent.e;
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(background, "background");
        return new AccountContent(productId, account, background, z3, bVar);
    }
}
