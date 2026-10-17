package tab;

import a0.d;
import android.content.Context;
import bbb.f;
import com.revolut.feature.retail.legacy.login.api.LegacyLoginFeatureConfig;
import com.revolut.feature.retail.legacy.login.impl.PrefetchLoginDataBeforeAuth;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragmentContract$Configuration;
import com.revolut.retail.core.navigation.DeeplinkNavigateCommand;
import com.revolut.retail.core.navigation.FragmentDestination;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements uri.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f269304a;

    public a(f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f269304a = uriHelper;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof LegacyLoginFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        NaviCommand deeplinkNavigateCommand;
        LegacyLoginFeatureConfig config = (LegacyLoginFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof LegacyLoginFeatureConfig.Login) {
            LegacyLoginFeatureConfig.Login login = (LegacyLoginFeatureConfig.Login) config;
            deeplinkNavigateCommand = new FragmentNavigateCommand(new FragmentDestination(LoginFragment.class), new LoginFragmentContract$Configuration(login.f82660a, login.f82661b, login.f82662c, login.d, login.e, login.f, login.f82663g, login.f82664h, 256), false, 2044);
        } else {
            if (!(config instanceof LegacyLoginFeatureConfig.TwoFaDeeplink)) {
                throw new NoWhenBranchMatchedException();
            }
            f.Companion.getClass();
            LegacyLoginFeatureConfig.TwoFaDeeplink twoFaDeeplink = (LegacyLoginFeatureConfig.TwoFaDeeplink) config;
            deeplinkNavigateCommand = new DeeplinkNavigateCommand(bbb.b.a(), null, d.x("CODE", twoFaDeeplink.getF82665a()), ((f80.b) this.f269304a).f(twoFaDeeplink.getF82666b()), Constants.TAG_BOOT_LOADER_CHECKSUM);
        }
        navigator.c(deeplinkNavigateCommand);
    }

    @Override // nte.a
    public final List e() {
        return u.c(PrefetchLoginDataBeforeAuth.f82671c);
    }
}
