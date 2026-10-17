package thi;

import com.revolut.kompot.bridge.impl.launcher.KompotLauncherFragment;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.retail.core.navigation.FragmentDestination;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import kotlin.jvm.internal.Intrinsics;
import pri.f;
import sri.m;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends pri.a {
    public final KompotFlowContract$Configuration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f271392j;

    public c(f authorizedPresenterDelegate, KompotFlowContract$Configuration config, m navigator) {
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.i = config;
        this.f271392j = navigator;
        P(config.getF98265b() ? u.c(authorizedPresenterDelegate) : f0.f322471a);
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        a view = (a) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f271392j.c(new FragmentNavigateCommand(new FragmentDestination(KompotLauncherFragment.class), this.i, false, 2044));
    }
}
