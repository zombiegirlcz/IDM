package vhi;

import com.revolut.kompot.bridge.impl.launcher.KompotLauncherFragment;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FragmentDestination;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.ModalFragmentNavigateCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.g;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c {
    public static FragmentNavigateCommand a(KompotDestination destination, int i) {
        boolean z = (i & 2) == 0;
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new FragmentNavigateCommand(new FragmentDestination(KompotLauncherFragment.class), new KompotFlowContract$Configuration.Embedded(destination), z, 2040);
    }

    public static final ModalFragmentNavigateCommand b(ParcelableDestination destination, d style) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(style, "style");
        FragmentDestination fragmentDestination = new FragmentDestination(KompotLauncherFragment.class);
        KompotFlowContract$Configuration.Embedded embedded = new KompotFlowContract$Configuration.Embedded(destination);
        int i = b.f289482a[style.ordinal()];
        if (i == 1 || i == 2) {
            return new ModalFragmentNavigateCommand(fragmentDestination, g.FULLSCREEN, embedded);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static FeatureCommand c(ParcelableDestination destination, yhi.b style, Integer num, boolean z, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(style, "style");
        return new FeatureCommand(new KompotOverlayFeatureConfig(destination, style, num, z));
    }
}
