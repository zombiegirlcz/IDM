package t9e;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BlockFuturePaymentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BlockFuturePaymentsScreen blockFuturePaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = blockFuturePaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        qua.p pVar;
        qua.p pVar2;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVar = (j) this.v.Y.getValue();
        Intrinsics.h(model);
        w wVar = (w) jVar;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        int i = 0;
        Continuation continuation = null;
        j60.a.v(wVar.f269006s, false, null, 3);
        String str = model.f52613a;
        if (Intrinsics.f(str, "CONFIRM_BLOCK_SUBSCRIPTION_LIST_ID")) {
            f fVar = (f) ((g) wVar.t2()).f268986a.getContent();
            if (fVar != null && (pVar2 = fVar.f268983a) != null) {
                wVar.l2(new sx2.r(wVar, pVar2, continuation, 21), new l(wVar, 1));
            }
        } else if (Intrinsics.f(str, "CONFIRM_BLOCK_MERCHANT_LIST_ID")) {
            Object obj3 = model.i;
            a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
            if (a3Var == null) {
                throw new IllegalStateException(a10.b.s("Parcel of model with listId ", str, " should be a transaction"));
            }
            f fVar2 = (f) ((g) wVar.t2()).f268986a.getContent();
            if (fVar2 != null && (pVar = fVar2.f268983a) != null) {
                wVar.l2(new sma.f(wVar, a3Var, pVar, (Continuation) null, 14), new l(wVar, i));
            }
        }
        return Unit.f186387a;
    }
}
