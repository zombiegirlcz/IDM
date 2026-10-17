package q8d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.all.QuickHelpSeeAllScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.feature.limits.api.navigation.LimitsFeatureConfig;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ QuickHelpSeeAllScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(QuickHelpSeeAllScreen quickHelpSeeAllScreen, Continuation continuation) {
        super(2, continuation);
        this.v = quickHelpSeeAllScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) this.v.Z.getValue();
        String itemId = model.f53228a;
        Object obj3 = model.u;
        lde.j jVar = pVar.f243068r;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (obj3 instanceof cj0.a) {
            String deeplink = ((cj0.a) obj3).f24568b;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            if (Intrinsics.f(deeplink, "revolut://app/help/quick-action/help-with-card")) {
                pVar.n2(new o(pVar, null, 0), new whi.b(6));
            } else {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                if (Intrinsics.f(deeplink, "revolut://app/help/quick-action/view-card-pin")) {
                    pVar.n2(new o(pVar, null, 1), new whi.b(6));
                } else {
                    Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                    String lowerCase = deeplink.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (!Intrinsics.f(lowerCase, "revolut://app/account-limits/atm")) {
                        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                        if (Intrinsics.f(deeplink, "revolut://app/help/quick-action/cancel-transfer")) {
                            pVar.n2(new m(pVar, deeplink, null, 1), new whi.b(6));
                        } else {
                            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                            if (Intrinsics.f(deeplink, "revolut://app/help/quick-action/dispute-transaction")) {
                                pVar.n2(new m(pVar, deeplink, null, 2), new whi.b(6));
                            } else {
                                pVar.y2(deeplink);
                            }
                        }
                    } else if (pVar.C1(new BridgeDestination(gc0.c.f(new LimitsFeatureConfig.LimitPrompt(com.revolut.retail.feature.limits.api.navigation.a.ATM)))) == null) {
                        pVar.y2(deeplink);
                        Unit unit = Unit.f186387a;
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
