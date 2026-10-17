package ec9;

import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import na5.c;
import od0.i;
import qd9.d;
import vpg.e;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NaviCommand f124475b;

    public /* synthetic */ a(NaviCommand naviCommand, int i) {
        this.f124474a = i;
        this.f124475b = naviCommand;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f124474a;
        NaviCommand naviCommand = this.f124475b;
        switch (i) {
            case 0:
                i optionalCommand = (i) obj2;
                Intrinsics.checkNotNullParameter(optionalCommand, "optionalCommand");
                return new d(optionalCommand.d(), com.revolut.retail.core.navigation.a.c(naviCommand, (NaviCommand) optionalCommand.f224257a));
            case 1:
                NaviCommand homeCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(homeCommand, "homeCommand");
                return Intrinsics.f(naviCommand, DummyCommand.f98635a) ? homeCommand : com.revolut.retail.core.navigation.a.c(homeCommand, naviCommand);
            case 2:
                return l8e.d.a((l8e.d) obj2, null, naviCommand, 3);
            case 3:
                NaviCommand topUpCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(topUpCommand, "topUpCommand");
                return com.revolut.retail.core.navigation.a.c(naviCommand, topUpCommand);
            case 4:
                i activeDisposableCardOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(activeDisposableCardOptional, "activeDisposableCardOptional");
                f0 f0Var = (f0) activeDisposableCardOptional.f224257a;
                return f0Var != null ? new FeatureCommand(new CardsScreenFeatureConfig(null, null, null, null, new CardScreenAction.Select(f0Var.f150110a, 6, false, false), 15)) : naviCommand;
            case 5:
                na5.a resolvedPlan = (na5.a) obj2;
                Intrinsics.checkNotNullParameter(resolvedPlan, "resolvedPlan");
                NaviCommand[] elements = {naviCommand, c.c(resolvedPlan)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new CompositeCommand(kotlin.collections.d.L(elements));
            case 6:
                NaviCommand destinationCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(destinationCommand, "destinationCommand");
                NaviCommand[] elements2 = {naviCommand, destinationCommand};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                return new CompositeCommand(kotlin.collections.d.L(elements2));
            default:
                yoj.a vaultsFeature = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(vaultsFeature, "vaultsFeature");
                return yoj.b.k(vaultsFeature) ? naviCommand : e.b();
        }
    }

    public /* synthetic */ a(NaviCommand naviCommand, Object obj2, int i) {
        this.f124474a = i;
        this.f124475b = naviCommand;
    }
}
