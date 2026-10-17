package kj8;

import aii.u;
import com.revolut.feature.junior_profile.api.navigation.JuniorAccountSimplePickerDestination;
import com.revolut.feature.junior_profile.api.navigation.JuniorProfileDetailsDestination;
import com.revolut.feature.junior_profile.impl.ui.flow.details.JuniorProfileDetailsFlow;
import com.revolut.feature.junior_profile.impl.ui.junior_account_simple_picker.JuniorAccountSimplePickerController;
import dki.g;
import kotlin.jvm.internal.Intrinsics;
import sj8.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorProfileDetailsDestination) {
            return new JuniorProfileDetailsFlow(new c(((JuniorProfileDetailsDestination) destination).f77131a));
        }
        if (destination instanceof JuniorAccountSimplePickerDestination) {
            return new JuniorAccountSimplePickerController(((JuniorAccountSimplePickerDestination) destination).f77130a);
        }
        return null;
    }
}
