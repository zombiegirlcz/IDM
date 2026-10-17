package q78;

import aii.u;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$YouthAccountEmptyState;
import com.revolut.feature.junior.accounts.api.navigation.JuniorAccountDestination$JuniorPocketChildPickerDestination;
import com.revolut.feature.junior.accounts.api.navigation.JuniorAccountDestination$JuniorSavingChildPickerDestination;
import com.revolut.feature.junior.accounts.impl.ui.pocket_picker.flow.JuniorPocketChildPickerFlow;
import com.revolut.feature.junior.accounts.impl.ui.product_picker.AddNewProductPickerScreen;
import com.revolut.feature.junior.accounts.impl.ui.saving_picker.flow.JuniorSavingChildPickerFlow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ohi.a, nte.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof u68.c) {
            return ((u68.c) descriptor).a(new JuniorSavingChildPickerFlow());
        }
        if (!(descriptor instanceof u68.a)) {
            return null;
        }
        u68.a aVar = (u68.a) descriptor;
        return aVar.a(new AddNewProductPickerScreen(new z78.e(aVar.f277500a, aVar.f277501b, aVar.f277502c)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c, JuniorAccountsApi$Toggles$YouthAccountEmptyState.f76698c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorAccountDestination$JuniorPocketChildPickerDestination) {
            return new JuniorPocketChildPickerFlow();
        }
        if (destination instanceof JuniorAccountDestination$JuniorSavingChildPickerDestination) {
            return new JuniorSavingChildPickerFlow();
        }
        return null;
    }
}
