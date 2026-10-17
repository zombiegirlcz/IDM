package wr1;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ TapiTransferAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TapiTransferAmountScreen tapiTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = tapiTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVar = (u) this.u.R2();
        g gVar = (g) ((j2) uVar.f299511t.f22677a).getValue();
        dj0.d dVar = gVar.f299486a;
        ur1.a aVar2 = gVar.f;
        uVar.C2(new i(dVar, aVar2.f282230a, aVar2.f282231b.f163145a, gVar.f299489g));
        return Unit.f186387a;
    }
}
