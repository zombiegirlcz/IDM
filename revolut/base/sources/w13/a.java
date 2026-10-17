package w13;

import aii.u;
import com.revolut.feature.card_order_new.api.CardOrderExperimentDestination;
import com.revolut.feature.card_order_new.api.CardOrderFeatureApi$Toggles;
import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import com.revolut.feature.card_order_new.api.navigation.CardSubtypePickerDestination;
import com.revolut.feature.card_order_new.api.navigation.OrderNewCardDestination;
import com.revolut.feature.card_order_new.impl.brazil.CardSubtypePickerController;
import com.revolut.feature.card_order_new.impl.brazil.CardSubtypePickerControllerContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlow;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlow;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$InputData;
import com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.CardOrderExperimentFlowContract$InputData;
import com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.CardOrderExperimentFlowController;
import dki.g;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f293778a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f293778a = featureToggleInteractor;
    }

    @Override // nte.a
    public final List e() {
        return CardOrderFeatureApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CardOrderFlowDestination.CardDelivery) {
            CardOrderFlowDestination.CardDelivery cardDelivery = (CardOrderFlowDestination.CardDelivery) destination;
            return new CardOrderFlow(new CardOrderFlowContract$InputData.CardDelivery(cardDelivery.getF64974a(), cardDelivery.getF64975b(), cardDelivery.getF64976c(), cardDelivery.getD(), cardDelivery.getE(), cardDelivery.getF(), cardDelivery.getF64977g(), cardDelivery.getF64978h(), cardDelivery.getI(), cardDelivery.getF64979j(), cardDelivery.getK(), cardDelivery.getF64980l(), cardDelivery.getF64981m(), cardDelivery.getF64982n(), cardDelivery.getO(), cardDelivery.getF64983p(), cardDelivery.getF64984q()));
        }
        if (destination instanceof CardOrderFlowDestination.ChangeDeliveryAddress) {
            CardOrderFlowDestination.ChangeDeliveryAddress changeDeliveryAddress = (CardOrderFlowDestination.ChangeDeliveryAddress) destination;
            return new CardOrderFlow(new CardOrderFlowContract$InputData.ChangeDeliveryAddress(changeDeliveryAddress.getF64994a(), changeDeliveryAddress.getF64995b(), changeDeliveryAddress.getF64996c()));
        }
        if (destination instanceof CardOrderFlowDestination.CardPersonalisation) {
            CardOrderFlowDestination.CardPersonalisation cardPersonalisation = (CardOrderFlowDestination.CardPersonalisation) destination;
            return new CardOrderFlow(new CardOrderFlowContract$InputData.CardPersonalisation(cardPersonalisation.getF64985a(), cardPersonalisation.getF64986b(), cardPersonalisation.getF64987c(), cardPersonalisation.getD(), cardPersonalisation.getE(), cardPersonalisation.getF(), cardPersonalisation.getF64988g(), cardPersonalisation.getF64989h(), cardPersonalisation.getI(), cardPersonalisation.getF64990j(), cardPersonalisation.getK(), cardPersonalisation.getF64991l(), cardPersonalisation.getF64992m(), cardPersonalisation.getF64993n()));
        }
        if (destination instanceof CardOrderExperimentDestination) {
            return new CardOrderExperimentFlowController(new CardOrderExperimentFlowContract$InputData(((CardOrderExperimentDestination) destination).getF64943a()));
        }
        if (!(destination instanceof OrderNewCardDestination)) {
            if (!(destination instanceof CardSubtypePickerDestination)) {
                return null;
            }
            CardSubtypePickerDestination cardSubtypePickerDestination = (CardSubtypePickerDestination) destination;
            return new CardSubtypePickerController(new CardSubtypePickerControllerContract$InputData(cardSubtypePickerDestination.getF64997a(), cardSubtypePickerDestination.getF64998b(), cardSubtypePickerDestination.getF64999c(), cardSubtypePickerDestination.getD(), cardSubtypePickerDestination.getE(), cardSubtypePickerDestination.getF(), cardSubtypePickerDestination.getF65000g()));
        }
        if (!((d) this.f293778a).c(CardOrderFeatureApi$Toggles.OrderNewCardKompotMigration.f64948c)) {
            return null;
        }
        OrderNewCardFlowContract$InputData.INSTANCE.getClass();
        return new OrderNewCardFlow(OrderNewCardFlowContract$InputData.Companion.a((OrderNewCardDestination) destination));
    }
}
