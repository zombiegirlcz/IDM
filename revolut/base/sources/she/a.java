package she;

import aii.u;
import android.os.Parcelable;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ibb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9k.f f263461a;

    public a(b9k.f homeDependencies) {
        Intrinsics.checkNotNullParameter(homeDependencies, "homeDependencies");
        this.f263461a = homeDependencies;
    }

    @Override // ibb.a
    public final u a(MainContainerScreenDestination.JustShow destination) {
        ProductAccountDescriptor$Value productAccountDescriptor$Value;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Parcelable parcelable = destination.f83416c;
        TabAccountsLaunchConfig tabAccountsLaunchConfig = parcelable instanceof TabAccountsLaunchConfig ? (TabAccountsLaunchConfig) parcelable : null;
        if (tabAccountsLaunchConfig == null || (productAccountDescriptor$Value = tabAccountsLaunchConfig.f89544a) == null || !((nge.b) this.f263461a.f13816a).a(productAccountDescriptor$Value.getF89727a(), productAccountDescriptor$Value.getF89728b().f89730b) || Intrinsics.f(destination.f83414a, "accounts")) {
            return null;
        }
        return new MainContainerScreenDestination.JustShow("accounts", destination.f83415b, destination.f83416c, 8);
    }
}
