package v2e;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreBrandDetailRedeemScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeBrandDetailRedeemScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(model);
        i0 i0Var = (i0) vVarE3;
        cli.y yVar = i0Var.B;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51832a;
        if (Intrinsics.f(str, "STORE_BRAND_DETAIL_YOUR_GIFT_CARDS_EXPANSION_CONTROL_ID")) {
            i0Var.H2(yVar, new v20.s(21));
        } else if (Intrinsics.f(str, "STORE_BRAND_DETAIL_REDEEM_REV_PAY_INSTRUCTIONS_CARD_ID")) {
            i0Var.H2(yVar, new v20.s(22));
        }
        return Unit.f186387a;
    }
}
