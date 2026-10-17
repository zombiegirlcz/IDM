package tb6;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CharityDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CharityDetailsScreen charityDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = charityDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) rVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "DONATIONS_DISCLAIMER_BUTTON_ITEM_ID") || Intrinsics.f(str, "action_button")) {
            j60.a.v(cVar.A, false, null, 3);
        }
        return Unit.f186387a;
    }
}
