package llc;

import ael.t0;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import lhi.v;
import ufm.i;
import ybl.l;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xkc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f196700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qka.c f196701b;

    public b(hkh.a wealthUiConfiguration, l tradingConfigInteractor, qka.c productArticleNavigationProvider) {
        Intrinsics.checkNotNullParameter(wealthUiConfiguration, "wealthUiConfiguration");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f196700a = tradingConfigInteractor;
        this.f196701b = productArticleNavigationProvider;
    }

    public final i a(NaviCommand targetCommand) {
        Intrinsics.checkNotNullParameter(targetCommand, "targetCommand");
        return new i(((t0) this.f196700a).g(), new v(24, new l9k.v(this, targetCommand, 25)), 1);
    }
}
