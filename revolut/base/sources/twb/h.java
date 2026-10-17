package twb;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsGiftcardDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsGiftcardDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((PlainTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlainTextDelegate.Model model = (PlainTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar2 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) mVarE3;
        cli.y yVar = aVar2.J;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            String str = model.f52926a;
            if (Intrinsics.f(str, "SECTION_DETAILS_TEXT_ID")) {
                aVar2.H2(yVar, new rk.b(zBooleanValue, 19));
            } else if (Intrinsics.f(str, "SECTION_HOW_IT_WORKS_TEXT_ID")) {
                aVar2.H2(yVar, new rk.b(zBooleanValue, 20));
            }
        }
        return Unit.f186387a;
    }
}
