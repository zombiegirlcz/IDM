package q9f;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.trading.transfer.investments.api.navigation.NewTransferDestination;
import com.revolut.feature.trading.transfer.investments.api.navigation.TransferInvestmentsProgressDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import q56.o;
import q97.h2;
import sri.m;
import ue0.e;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements v8f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f243890a;

    public d(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f243890a = navigator;
    }

    public static FeatureCommand b(FeatureCommand featureCommand) {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, featureCommand, 2)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "transfer");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return cVar.e(3).length() == 0 ? new h(new NewTransferDestination(0), new q06.b(ibb.c.f160141b, null)) : new h(new TransferInvestmentsProgressDestination(cVar.e(3)), new q06.b(ibb.c.f160141b, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        i iVar = new i(new ufm.c(new c86.d(this, deeplink, z), 2), new h2(15, new o(this, 27)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.b bVarM = d0.m(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return e.C(iVar, bVarM);
    }
}
