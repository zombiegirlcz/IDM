package bge;

import aii.g;
import aii.u;
import com.revolut.feature.settings.preview.transactionsCount.TransactionsCountPreviewController;
import com.revolut.feature.tab.accounts.api.AccountsFeatureConfig$Destination;
import com.revolut.feature.tab.accounts.api.TabAccountsApi$Toggles;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.api.navigation.TransactionsCountPreviewDestination;
import com.revolut.feature.tab.accounts.impl.ui.remove_account.remove_account_controller.RemoveAccountController;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qhe.b f15183a;

    public a(qhe.b transactionsCountPreviewInteractor) {
        Intrinsics.checkNotNullParameter(transactionsCountPreviewInteractor, "transactionsCountPreviewInteractor");
        this.f15183a = transactionsCountPreviewInteractor;
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof tfe.a)) {
            return null;
        }
        tfe.a aVar = (tfe.a) descriptor;
        return aVar.a(new RemoveAccountController(aVar.b()));
    }

    @Override // nte.a
    public final List e() {
        return d0.E0(TabAccountsApi$Toggles.a(), r49.a.a());
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AccountsFeatureConfig$Destination.SwitcherDestination) {
            return new AccountSpacesScreen(TabAccountsMode.Home.f89466a);
        }
        if (Intrinsics.f(destination, TransactionsCountPreviewDestination.f89566b)) {
            return new TransactionsCountPreviewController(this.f15183a);
        }
        return null;
    }
}
