package wie;

import aii.u;
import android.os.Parcelable;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements ibb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vie.a f297887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xie.c f297888b;

    public c(vie.a creditAccountVisibilityFilter, xie.c navigationInterceptor) {
        Intrinsics.checkNotNullParameter(creditAccountVisibilityFilter, "creditAccountVisibilityFilter");
        Intrinsics.checkNotNullParameter(navigationInterceptor, "navigationInterceptor");
        this.f297887a = creditAccountVisibilityFilter;
        this.f297888b = navigationInterceptor;
    }

    @Override // ibb.a
    public final u a(MainContainerScreenDestination.JustShow destination) {
        ProductAccountDescriptor$Value productAccountDescriptor$Value;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Parcelable parcelable = destination.f83416c;
        TabAccountsLaunchConfig tabAccountsLaunchConfig = parcelable instanceof TabAccountsLaunchConfig ? (TabAccountsLaunchConfig) parcelable : null;
        if (tabAccountsLaunchConfig != null && (productAccountDescriptor$Value = tabAccountsLaunchConfig.f89544a) != null) {
            if (this.f297887a.a(productAccountDescriptor$Value.getF89727a(), productAccountDescriptor$Value.getF89728b().f89730b) && !Intrinsics.f(destination.f83414a, "credit")) {
                return this.f297888b.a(productAccountDescriptor$Value);
            }
        }
        return null;
    }
}
