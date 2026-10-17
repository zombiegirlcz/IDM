package de6;

import aii.e;
import aii.g;
import com.revolut.feature.extension_auth.api.ExtensionAuthApi$Toggles$ExtensionAuthFlowKompotMigration;
import com.revolut.feature.extension_auth.api.navigation.ExtensionAuthDestination;
import com.revolut.feature.extension_auth.impl.ui_kompot.ExtensionAuthViewController;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f113300a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof ExtensionAuthDestination) {
            return ((ExtensionAuthDestination) descriptor).a(new ExtensionAuthViewController());
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return u.c(ExtensionAuthApi$Toggles$ExtensionAuthFlowKompotMigration.f72162c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof ExtensionAuthDestination)) {
            return null;
        }
        ExtensionAuthViewController extensionAuthViewController = new ExtensionAuthViewController();
        b block = new b(flowModel, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        extensionAuthViewController.H = block;
        return extensionAuthViewController;
    }
}
