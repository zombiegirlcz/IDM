package tb6;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CharityDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CharityDetailsScreen charityDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = charityDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) rVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f53623w;
        ba6.l lVar = obj3 instanceof ba6.l ? (ba6.l) obj3 : null;
        if (lVar != null) {
            cVar.C2(new o(lVar.f13938a));
        }
        return Unit.f186387a;
    }
}
