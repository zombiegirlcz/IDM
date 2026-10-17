package vvh;

import android.content.Context;
import android.content.Intent;
import com.revolut.feature.currency.accounts.api.CurrencyAccountPendingAction;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f292542a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f292542a = context;
    }

    public final Intent a(String str, String str2) {
        ProductAccountDescriptor$Value.Main main;
        if (str == null) {
            main = null;
        } else if (str.equals("PocketsSummary")) {
            ProductId productId = ProductId.CURRENCY;
            uy5.e.Companion.getClass();
            main = new ProductAccountDescriptor$Value.Main(new ProductAccountId(uy5.d.f284077b, null), productId);
        } else {
            main = new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, null), ProductId.CURRENCY);
        }
        Intent intentAddFlags = gc0.c.j(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), new TabAccountsLaunchConfig(main, str2 != null ? new TabAccountsInitialPayload.Action(new CurrencyAccountPendingAction(str2)) : null), null, 4)), this.f292542a).addFlags(268468224);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        return intentAddFlags;
    }
}
