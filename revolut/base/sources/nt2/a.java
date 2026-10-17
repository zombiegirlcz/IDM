package nt2;

import aii.u;
import com.revolut.feature.businessinstaller.api.navigation.BusinessInstallerDestination;
import com.revolut.feature.businessinstaller.impl.ui.in_app_install.BusinessInstallerController;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (Intrinsics.f(destination, BusinessInstallerDestination.f64368a)) {
            return new BusinessInstallerController();
        }
        return null;
    }
}
