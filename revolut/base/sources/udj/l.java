package udj;

import com.revolut.retail.core.navigation.DeeplinkNavigateCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import wli.q;
import wli.v;
import wli.w;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements wli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f279241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f279242b;

    public l(v trampolineActivityNavigatorHolder, uli.g externalDeeplinkRouterAuthorizedCommandProvider, sri.m applicationNavigator) {
        Intrinsics.checkNotNullParameter(trampolineActivityNavigatorHolder, "trampolineActivityNavigatorHolder");
        Intrinsics.checkNotNullParameter(externalDeeplinkRouterAuthorizedCommandProvider, "externalDeeplinkRouterAuthorizedCommandProvider");
        Intrinsics.checkNotNullParameter(applicationNavigator, "applicationNavigator");
        this.f279241a = trampolineActivityNavigatorHolder;
        this.f279242b = applicationNavigator;
    }

    @Override // wli.n
    public final void a(zli.b deeplink, q source, wli.m mVar) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(source, "source");
        DeeplinkNavigateCommand deeplinkNavigateCommandA = uli.g.a(deeplink.f323278a);
        q qVar = q.EXTERNAL;
        sri.m mVar2 = this.f279242b;
        if (source != qVar) {
            mVar2.c(deeplinkNavigateCommandA);
            return;
        }
        sri.m mVar3 = ((w) this.f279241a).f298519a;
        if (mVar3 != null) {
            mVar3.c(com.revolut.retail.core.navigation.a.c(deeplinkNavigateCommandA, new FinishCommand(null, null, null, 7)));
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "RetailAuthConstraintResolver", "Missing trampoline navigator for " + deeplink.a() + ", source: " + source, null, h0Var);
        mVar2.c(deeplinkNavigateCommandA);
    }
}
