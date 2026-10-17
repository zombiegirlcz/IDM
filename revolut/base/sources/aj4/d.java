package aj4;

import com.revolut.feature.credit.application.plugins.impl.ui.transparent.TransparentKompotDestinationContract$Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TransparentKompotDestinationContract$Configuration f5398j;
    public final ln.a k;

    public d(TransparentKompotDestinationContract$Configuration config, ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f5398j = config;
        this.k = navigationCommandsDispatcher;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        b view = (b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        this.k.b(vhi.c.b(this.f5398j.f68493a, vhi.d.SOLID_FULL_SCREEN));
    }
}
