package a89;

import aw0.o9;
import ce9.m;
import ch.qos.logback.core.CoreConstants;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.on_hold.accounts.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.tracking.v3.HomeContext;
import com.youTransactor.uCube.rpc.Constants;
import io3.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountListAction f2138a = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.home_on_hold_account_action_hide, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_DEACTIVATE_ACCOUNT_ID", null, null, false, false);

    public static final class a {
        private a() {
        }
    }

    public static Clause b(Clause clause, String str, boolean z) {
        int i;
        if (d0.K(str, CoreConstants.COLON_CHAR)) {
            String str2 = (String) d0.m0(str, new char[]{CoreConstants.COLON_CHAR}, 6).get(0);
            i = Intrinsics.f(str2, z79.b.MAIN.a()) ? R$string.home_on_hold_account_restricted_account_title_main : Intrinsics.f(str2, z79.b.PRO.a()) ? R$string.home_on_hold_account_restricted_account_title_pro : Intrinsics.f(str2, z79.b.JOINT.a()) ? R$string.home_on_hold_account_restricted_account_title_joint : Intrinsics.f(str2, z79.b.JUNIOR.a()) ? R$string.home_on_hold_account_restricted_account_title_junior : R$string.home_on_hold_account_restricted_account_title_other;
        } else {
            if (z) {
                return clause;
            }
            i = R$string.home_on_hold_account_restricted_account_title_other;
        }
        return new TextLocalisedClause(R$string.home_on_hold_account_restricted_account_title_brackets, v.k(clause, new TextLocalisedClause(i, null, null, 14)), null, 12);
    }

    public final ArrayList a(io3.d dVar) {
        boolean z = dVar.f == k.ACTIVE;
        boolean z3 = dVar.i == 0;
        ProductAccountListAction productAccountListAction = (z && z3) ? this.f2138a : null;
        String str = dVar.f163145a;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_accounts_action_blocking_learn_more, null, null, 14);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        HomeContext.a aVarNewBuilder = HomeContext.newBuilder();
        aVarNewBuilder.c();
        ((HomeContext) aVarNewBuilder.f49761b).setPocketId(str);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        ProductAccountListAction productAccountListAction2 = new ProductAccountListAction(Constants.TAG_FULL_SVPP_IDENTIFICATION, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), textLocalisedClause, resourceImage, null, "ACTION_LEARN_MORE", null, null, false, false);
        if (z3) {
            productAccountListAction2 = null;
        }
        ProductAccountListAction[] elements = {productAccountListAction, productAccountListAction2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList(w.t(listL, 10));
        Iterator it8 = listL.iterator();
        while (it8.hasNext()) {
            arrayList.add(ProductAccountListAction.a((ProductAccountListAction) it8.next(), null, false, dVar, 383));
        }
        return arrayList;
    }

    public final ProductAccount.ValueItem.Main c(io3.d pocket, xi0.b baseCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        xi0.a aVar = xi0.b.Companion;
        String str = pocket.f163147c;
        String str2 = pocket.d;
        long j2 = pocket.i;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        boolean z3 = pocket.f == k.INACTIVE;
        TextLocalisedClause textLocalisedClause = (j2 <= 0 && z3) ? new TextLocalisedClause(R$string.home_on_hold_account_inactive, null, null, 14) : null;
        ProductAccountId productAccountId = new ProductAccountId(pocket.f163145a, null);
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(new dj0.d(j2, bVarA), z3 ? new TextLocalisedClause(R$string.home_on_hold_account_inactive, null, null, 14) : null, 4);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(new dj0.d(j2, bVarA)), true);
        boolean zEquals = bVarA.equals(baseCurrency);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, new AccountListItemModel((Image) companion.i(R$drawable.uikit_icn_24_lock_closed, R$attr.uikit_colorWhite, R$attr.uikit_colorTerracotta), b(new CurrencyClause(bVarA, null, null, 6), str2, z), (Clause) null, (List) a(pocket), (CircleBadgeModel) null, false, false, true, Constants.TAG_F4), new AccountWidgetItemModel((List) m.O(a(pocket)), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) new CompositeClause(v.k(b(new TextLocalisedClause(R$string.home_on_hold_account_product_name, null, null, 14), str2, z), new TextClause(pocket.f163147c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12), false, (ProductAccountSubtitle) (textLocalisedClause != null ? new ProductAccountSubtitle.Text(textLocalisedClause, null) : null), 50), productAccountMetadata, new AccountListItemModel((Image) companion.i(R$drawable.uikit_icn_24_lock_closed, R$attr.uikit_colorWhite, R$attr.uikit_colorTerracotta), (Clause) new CompositeClause(v.k(new TextLocalisedClause(R$string.home_on_hold_account_product_name, null, null, 14), new CurrencyClause(bVarA, CurrencyClause.Format.Ticker.f57756a, null, 4)), new DotDividerClause((Integer) null), null, null, 12), (Clause) null, (List) a(pocket), (CircleBadgeModel) null, false, false, true, Constants.TAG_F4), z3, true, zEquals);
    }
}
