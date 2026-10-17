package g4c;

import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.feature.revolut_shop.ui.screen.order_history.OrderHistoryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderHistoryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(OrderHistoryScreen orderHistoryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderHistoryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((VaultsProgressDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VaultsProgressDelegate.Model model = (VaultsProgressDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.o, g.f140474a)) {
            final u uVar = (u) this.v.d();
            final int i = 0;
            final int i2 = 1;
            uVar.f140492q.Z2(new Function0() { // from class: g4c.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            uVar.I2();
                            break;
                        default:
                            uVar.I2();
                            break;
                    }
                    return Unit.f186387a;
                }
            }, new Function0() { // from class: g4c.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            uVar.I2();
                            break;
                        default:
                            uVar.I2();
                            break;
                    }
                    return Unit.f186387a;
                }
            });
        }
        return Unit.f186387a;
    }
}
