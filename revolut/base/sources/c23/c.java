package c23;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlow;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardOrderFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CardOrderFlow cardOrderFlow, Continuation continuation) {
        super(2, continuation);
        this.v = cardOrderFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d dVar = (d) this.v.S.getValue();
        String listId = model.f52613a;
        com.revolut.feature.card_order_new.impl.kompot.c cVar = (com.revolut.feature.card_order_new.impl.kompot.c) dVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        l33.a.Companion.getClass();
        if (Intrinsics.f(listId, "ACTION_BUTTON_GOT_IT")) {
            cVar.l2(new brc.h(cVar, null, 24), new yi5.b(26));
        } else if (Intrinsics.f(listId, "ACTION_BUTTON_SKIP")) {
            if (((db9.d) cVar.D).c()) {
                cVar.C1(u0.b(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277277c, null, null, 6)))));
            } else {
                cVar.a3(true);
            }
        }
        return Unit.f186387a;
    }
}
