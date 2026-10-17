package pwl;

import android.content.Context;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.ByIdFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.ui.login.pin.LoginScreenContract$Configuration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lwl.n;
import lwl.o;
import sri.m;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements uri.a {
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[PHI: r5
      0x003b: PHI (r5v13 com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId) = 
      (r5v9 com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId)
      (r5v18 com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId)
     binds: [B:31:0x0066, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.retail.core.navigation.NaviCommand d(com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig r9) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pwl.c.d(com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig):com.revolut.retail.core.navigation.NaviCommand");
    }

    @Override // uri.a
    public final void a(m navigator, Context context, ByIdFeatureConfig config) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.f(config.f98680a, "ID_LAUNCHER_FROM_SHORTCUT")) {
            navigator.c(d(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)));
        }
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof MainScreenFeatureConfig) {
            return true;
        }
        return !(config instanceof ByIdFeatureConfig) ? false : Intrinsics.f(((ByIdFeatureConfig) config).f98680a, "ID_LAUNCHER_FROM_SHORTCUT");
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        MainScreenFeatureConfig config = (MainScreenFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof MainScreenFeatureConfig.JustShow) {
            navigator.c(d((MainScreenFeatureConfig.JustShow) config));
            return;
        }
        if (config instanceof MainScreenFeatureConfig.WithInnerConfiguration) {
            navigator.c(d((MainScreenFeatureConfig.WithInnerConfiguration) config));
            return;
        }
        if (config instanceof MainScreenFeatureConfig.StartFromOutside) {
            NaviCommand naviCommandD = d(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(((MainScreenFeatureConfig.StartFromOutside) config).f78071a, null, null, 6)));
            o.Companion.getClass();
            navigator.c(com.revolut.retail.core.navigation.a.c(naviCommandD, new ActivityNavigateCommand(n.a(), new LoginScreenContract$Configuration(sab.b.SIGN_LOGIN, null, null, null, 126), null, null, 0, null, null, null, null, false, 1020)));
            return;
        }
        if (config instanceof MainScreenFeatureConfig.WithAction) {
            navigator.c(d((MainScreenFeatureConfig.WithAction) config));
        } else {
            if (!(config instanceof MainScreenFeatureConfig.AppEntry)) {
                throw new NoWhenBranchMatchedException();
            }
            navigator.c(d((MainScreenFeatureConfig.AppEntry) config));
        }
    }
}
