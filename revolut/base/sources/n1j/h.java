package n1j;

import com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.BalancePickerScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BalancePickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(BalancePickerScreen balancePickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = balancePickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BalancePickerScreen balancePickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                balancePickerScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar = (com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c) balancePickerScreen.k3();
                r rVar = ((m) ((j2) cVar.G.f22677a).getValue()).f211391c;
                if (rVar != null) {
                    cVar.C2(new g1j.b(rVar.f211398a));
                } else {
                    String simpleName = com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c.class.getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, simpleName, "Proceed button clicked with null selectedBalance", null, null, 16);
                }
                break;
        }
        return Unit.f186387a;
    }
}
