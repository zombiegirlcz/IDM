package zr2;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantTransparentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zr2.d;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BlockMerchantTransparentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(BlockMerchantTransparentScreen blockMerchantTransparentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = blockMerchantTransparentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVar = (e) this.v.O.getValue();
        Intrinsics.h(model);
        n nVar = (n) eVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "CONFIRM_BLOCK_MERCHANT_LIST_ID")) {
            Object obj3 = model.i;
            a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
            if (a3Var == null) {
                throw new IllegalStateException(p.a.p("Parcel of model with listId ", str, " should be a transaction"));
            }
            nVar.n2(new h(nVar, a3Var, null), new whi.b(6));
        } else if (Intrinsics.f(str, "CANCEL_BLOCK_MERCHANT_LIST_ID")) {
            j60.a.v(nVar.u, false, null, 3);
            nVar.v2(d.a.f324532a);
        }
        return Unit.f186387a;
    }
}
