package tvh;

import aii.u;
import com.revolut.feature_account_widget.impl.configuration.AccountWidgetConfigScreen;
import com.revolut.feature_account_widget.impl.configuration.AccountWidgetConfigurationDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AccountWidgetConfigurationDestination) {
            return new AccountWidgetConfigScreen(((AccountWidgetConfigurationDestination) destination).f96618b);
        }
        return null;
    }
}
