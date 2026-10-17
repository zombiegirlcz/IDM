package ul3;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.contacts.api.navigation.AddContactFeatureConfig;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.contacts.api.navigation.ContactFlowFeatureConfig;
import com.revolut.feature.contacts.impl.ui.contact.flow.ContactFlow;
import com.revolut.feature.contacts.impl.ui.contact.flow.ContactFlowContract$InputData;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.block_user.BlockUserBottomSheetController;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact.AddContactScreen;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact_legacy.AddContactLegacyScreen;
import com.revolut.feature.payments.api.PaymentsToggles$AddContactFacelift;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f280864a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f280864a = featureToggleInteractor;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof el3.a) {
            el3.a aVar = (el3.a) descriptor;
            AddContactInputData addContactInputDataB = aVar.b();
            return aVar.a(((jte.d) this.f280864a).c(PaymentsToggles$AddContactFacelift.f79140c) ? new AddContactScreen(addContactInputDataB) : new AddContactLegacyScreen(addContactInputDataB));
        }
        if (!(descriptor instanceof el3.d)) {
            return null;
        }
        el3.d dVar = (el3.d) descriptor;
        return dVar.a(new BlockUserBottomSheetController(dVar.b()));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ContactFlowFeatureConfig.BridgeDestination) {
            return new ContactFlow(new ContactFlowContract$InputData(((ContactFlowFeatureConfig.BridgeDestination) destination).f65985a));
        }
        if (!(destination instanceof AddContactFeatureConfig.BridgeDestination)) {
            return null;
        }
        AddContactInputData addContactInputData = ((AddContactFeatureConfig.BridgeDestination) destination).f65971a;
        return gc0.c.b(((jte.d) this.f280864a).c(PaymentsToggles$AddContactFacelift.f79140c) ? new AddContactScreen(addContactInputData) : new AddContactLegacyScreen(addContactInputData), new ogk.b(26));
    }
}
