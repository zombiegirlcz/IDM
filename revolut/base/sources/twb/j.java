package twb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsGiftcardDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsGiftcardDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f53228a;
        com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar2 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SECTION_USED_SWITCH_ID")) {
            kwb.b bVar = (kwb.b) ((l) ((j2) aVar2.J.f22677a).getValue()).f274986a.getContent();
            Continuation continuation = null;
            UserVoucherDetails userVoucherDetails = bVar != null ? bVar.f190328c : null;
            if (bVar != null && userVoucherDetails != null) {
                aVar2.l2(new b0(aVar2, userVoucherDetails, bVar, continuation, 0), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
