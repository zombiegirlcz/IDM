package i73;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.card_screen.api.navigation.CardActivationMethodsFlowDestination;
import com.revolut.feature.card_screen.impl.kompot.card_activation_methods.screen.CardActivationMethodsScreen;
import com.revolut.feature.card_screen.impl.kompot.card_activation_methods.screen.CardActivationMethodsScreenContract$InputData;
import f73.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f159183a;

    public a(c cardNavigationFactory) {
        Intrinsics.checkNotNullParameter(cardNavigationFactory, "cardNavigationFactory");
        this.f159183a = cardNavigationFactory;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CardActivationMethodsFlowDestination) {
            return gc0.c.b(new CardActivationMethodsScreen(new CardActivationMethodsScreenContract$InputData(((CardActivationMethodsFlowDestination) destination).f65341b)), new an4.b(this, 4));
        }
        return null;
    }
}
