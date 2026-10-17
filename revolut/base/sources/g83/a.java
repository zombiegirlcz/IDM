package g83;

import aii.p;
import aii.u;
import an4.b;
import com.revolut.feature.card_screen.api.navigation.PhysicalCardReplacementDialogDestination;
import com.revolut.feature.card_screen.impl.kompot.physical_card_replacement_dialog.screen.PhysicalCardReplacementDialogContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.physical_card_replacement_dialog.screen.PhysicalCardReplacementDialogScreen;
import dki.g;
import f73.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f141247a;

    public a(c cardNavigationFactory) {
        Intrinsics.checkNotNullParameter(cardNavigationFactory, "cardNavigationFactory");
        this.f141247a = cardNavigationFactory;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PhysicalCardReplacementDialogDestination) {
            return gc0.c.b(new PhysicalCardReplacementDialogScreen(new PhysicalCardReplacementDialogContract$InputData(((PhysicalCardReplacementDialogDestination) destination).f65364a)), new b(this, 3));
        }
        return null;
    }
}
