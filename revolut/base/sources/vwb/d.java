package vwb;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroup;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcardshome.RevPointsGiftcardsHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsGiftcardsHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsGiftcardsHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVar = (i) this.v.U.getValue();
        Intrinsics.h(model);
        n nVar = (n) iVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (!((f) ((j2) nVar.v.f22677a).getValue()).f292690b) {
            nVar.n2(new l(nVar, null), new whi.b(6));
        } else if (model.f53623w instanceof VoucherProductGroup) {
            nVar.f292698s.Z2(new m(nVar, model, null));
        }
        return Unit.f186387a;
    }
}
