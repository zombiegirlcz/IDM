package kng;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.AddressSuggestionFlow;
import com.revolut.feature.user_declarations.shared.flows.date_of_birth.screen.DateOfBirthScreen;
import com.revolut.feature.user_declarations.shared.flows.income.IncomeFlow;
import com.revolut.feature.user_declarations.shared.flows.name.screen.NameScreen;
import com.revolut.feature.user_declarations.shared.flows.pep.PepFlow;
import com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.PlaceOfBirthScreen;
import com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.PlaceOfBirthScreenContract$InputData;
import com.revolut.feature.user_declarations.shared.flows.tracking.flow.TrackingConsentFlow;
import com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowInputData;
import com.revolut.shared.feature.user_declarations.api.navigation.IncomeFlowControllerDescriptor;
import com.revolut.shared.feature.user_declarations.api.navigation.PlaceOfBirthControllerDescriptor;
import kotlin.jvm.internal.Intrinsics;
import qbl.d;
import qbl.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof f) {
            f fVar = (f) descriptor;
            return fVar.a(new NameScreen(fVar.f244377a));
        }
        if (descriptor instanceof qbl.e) {
            qbl.e eVar = (qbl.e) descriptor;
            return eVar.a(new DateOfBirthScreen(eVar.f244376a));
        }
        if (descriptor instanceof nbl.a) {
            nbl.a aVar = (nbl.a) descriptor;
            return aVar.a(new TrackingConsentFlow(aVar.f214091a));
        }
        if (descriptor instanceof qbl.g) {
            qbl.g gVar = (qbl.g) descriptor;
            return gVar.a(new PepFlow(gVar.f244378a));
        }
        if (descriptor instanceof IncomeFlowControllerDescriptor) {
            IncomeFlowControllerDescriptor incomeFlowControllerDescriptor = (IncomeFlowControllerDescriptor) descriptor;
            return incomeFlowControllerDescriptor.a(new IncomeFlow(incomeFlowControllerDescriptor.f105053a));
        }
        if (descriptor instanceof d) {
            d dVar = (d) descriptor;
            return dVar.a(new AddressSuggestionFlow(dVar.f244375a));
        }
        if (!(descriptor instanceof PlaceOfBirthControllerDescriptor)) {
            return null;
        }
        PlaceOfBirthControllerDescriptor placeOfBirthControllerDescriptor = (PlaceOfBirthControllerDescriptor) descriptor;
        PlaceOfBirthFlowInputData placeOfBirthFlowInputData = placeOfBirthControllerDescriptor.f105070a;
        return placeOfBirthControllerDescriptor.a(new PlaceOfBirthScreen(new PlaceOfBirthScreenContract$InputData(placeOfBirthFlowInputData.f105023a, placeOfBirthFlowInputData.f105024b, placeOfBirthFlowInputData.f105025c, placeOfBirthFlowInputData.d, placeOfBirthFlowInputData.e, placeOfBirthFlowInputData.f, placeOfBirthFlowInputData.f105026g)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
