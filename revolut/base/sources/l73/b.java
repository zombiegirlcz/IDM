package l73;

import aii.g;
import aii.u;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.CardsCarouselFlow;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.CardsCarouselFlowContract$InputData;
import com.revolut.feature.card_screen.impl.nameless_card.NamelessCardDialogScreen;
import kotlin.jvm.internal.Intrinsics;
import o63.f;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof o63.d) {
            o63.d dVar = (o63.d) descriptor;
            return dVar.a(new CardsCarouselFlow(new CardsCarouselFlowContract$InputData(null, dVar.e(), dVar.d(), dVar.b(), dVar.c())));
        }
        if (!(descriptor instanceof f)) {
            return null;
        }
        f fVar = (f) descriptor;
        return fVar.a(new NamelessCardDialogScreen(fVar.b()));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof CardsCarouselFlowDestination)) {
            return null;
        }
        CardsCarouselFlowDestination cardsCarouselFlowDestination = (CardsCarouselFlowDestination) destination;
        return new CardsCarouselFlow(new CardsCarouselFlowContract$InputData(cardsCarouselFlowDestination.f65354b, cardsCarouselFlowDestination.f65355c, cardsCarouselFlowDestination.d, cardsCarouselFlowDestination.e, cardsCarouselFlowDestination.f));
    }
}
