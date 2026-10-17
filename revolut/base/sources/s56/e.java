package s56;

import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DeFiSendAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(DeFiSendAmountScreen deFiSendAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = deFiSendAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DeFiSendAmountScreen deFiSendAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar = (com.revolut.feature.defi.remittances.impl.ui.send.amount.b) deFiSendAmountScreen.d();
                cli.y yVar = bVar.z;
                s sVar = ((o) ((j2) yVar.f22677a).getValue()).d;
                if (sVar == null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "DeFiSendAmountScreenModel", j6.a.q("Review transfer clicked with invalid amount: ", ((o) ((j2) yVar.f22677a).getValue()).f259972b), null, h0Var);
                } else {
                    bVar.C2(new p(bVar.I2(sVar)));
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.defi.remittances.impl.ui.send.amount.b) deFiSendAmountScreen.d()).B2();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar2 = (com.revolut.feature.defi.remittances.impl.ui.send.amount.b) deFiSendAmountScreen.d();
                if (!bVar2.o.f71823c) {
                    bVar2.C2(new q(((o) ((j2) bVar2.z.f22677a).getValue()).f259971a.f71059a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
