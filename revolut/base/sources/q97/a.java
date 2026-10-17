package q97;

import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.feature.businessinstaller.api.navigation.BusinessInstallerDestination;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.pockets.api.navigation.PocketsListFeatureConfig;
import com.revolut.feature.retail.privacy.api.navigation.RetailPrivacyDestination;
import com.revolut.feature.separate_favourites.api.combined_watchlist.CombinedWatchlistFeatureConfig;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.support.api.navigation.InboundTransferTrackerDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.sso.api.passcode.change.RevolutSsoChangePasscodeFlowDestination;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f243642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t97.c productCellProvider, int i) {
        super(productCellProvider);
        this.f243642b = i;
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                super(productCellProvider);
                this.f243643c = t97.d.CARDS;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                super(productCellProvider);
                this.f243643c = t97.d.TRANSFER_LOCATOR;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                super(productCellProvider);
                this.f243643c = t97.d.WATCHLIST;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                super(productCellProvider);
                this.f243643c = t97.d.CHANGE_PASSCODE;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                super(productCellProvider);
                this.f243643c = t97.d.PERSONAL_DETAILS;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                super(productCellProvider);
                this.f243643c = t97.d.SECURITY_AND_PRIVACY;
                break;
            default:
                Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
                this.f243643c = t97.d.ACCOUNT_DETAILS;
                break;
        }
    }

    @Override // r97.b
    public Flow d() {
        switch (this.f243642b) {
            case 1:
                return new go.g(Boolean.TRUE, 2);
            default:
                return super.d();
        }
    }

    @Override // r97.b
    public final p97.b f() {
        switch (this.f243642b) {
        }
        return this.f243643c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        switch (this.f243642b) {
            case 0:
                return new o97.l(new FeatureCommand(new PocketsListFeatureConfig(fda.a.FIAT_CURRENCIES_POCKETS)));
            case 1:
                return new o97.d(BusinessInstallerDestination.f64368a);
            case 2:
                return new o97.l(new FeatureCommand(new CardOrderNewFeatureConfig(null, null, null, null, null, false, null, null, null, null, null, null, 16383)));
            case 3:
                return new o97.d(InboundTransferTrackerDestination.f89356a);
            case 4:
                y1d.b.Companion.getClass();
                Set set = y1d.a.f310363l;
                return new o97.l(new FeatureCommand(new CombinedWatchlistFeatureConfig(new CombinedWatchlistContext("COMBINED_WATCHLIST_ORDERING_HOME", set, set))));
            case 5:
                return new o97.d(new RevolutSsoChangePasscodeFlowDestination(0));
            case 6:
                return new o97.d(UserDetailsDestination.f26226a);
            default:
                return new o97.d(new RetailPrivacyDestination(null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t97.c productCellProvider, jla.h productCatalogueInteractor) {
        super(productCellProvider);
        this.f243642b = 1;
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f243643c = t97.d.BUSINESS;
    }
}
