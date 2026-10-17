package ytb;

import com.revolut.feature.rev10_main_screen.api.AppStarterDestination;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import ibb.c;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f316691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f316692b;

    public b(e navigationDeeplink) {
        Intrinsics.checkNotNullParameter(navigationDeeplink, "navigationDeeplink");
        this.f316691a = navigationDeeplink;
        this.f316692b = j.b(new yq0.e(this, 10));
    }

    public static MainContainerScreenDestination.JustShow b(b bVar, String tabId, TabAccountsLaunchConfig tabAccountsLaunchConfig) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        return new MainContainerScreenDestination.JustShow(new MainScreenTab(tabId), tabAccountsLaunchConfig, (AccountCreationTransitionAnimation) null, 8);
    }

    public static AppStarterDestination f(b bVar, ParcelableDestination destination) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new AppStarterDestination(b(bVar, c.e.f83420a, null), destination);
    }

    public final ZoomTransitionAnimation.Default a() {
        String strA = g.a("listId", this.f316691a.f195041c);
        if (strA != null) {
            return com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(strA), null);
        }
        return null;
    }

    public final String c(int i) {
        List list = (List) this.f316692b.getValue();
        if (list.size() > i) {
            return (String) list.get(i);
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public final String d(String param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return (String) this.f316691a.f195040b.get(param);
    }

    public final String e(String param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return g.a(param, this.f316691a.f195041c);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f316691a, ((b) obj2).f316691a);
    }

    public final int hashCode() {
        return this.f316691a.hashCode();
    }
}
