package dh9;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends i implements Function1 {
    public com.revolut.feature.pay_bills_taxes.impl.ui_payment.a u;
    public FinishCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f114773w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pay_bills_taxes.impl.ui_payment.a f114774x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k71.c f114775y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.pay_bills_taxes.impl.ui_payment.a aVar, k71.c cVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f114774x = aVar;
        this.f114775y = cVar;
        this.z = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f114774x, this.f114775y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.pay_bills_taxes.impl.ui_payment.a aVar;
        FinishCommand finishCommand;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f114773w;
        if (i == 0) {
            o.b(obj2);
            FinishCommand finishCommand2 = new FinishCommand(null, null, null, 7);
            aVar = this.f114774x;
            this.u = aVar;
            this.v = finishCommand2;
            this.f114773w = 1;
            Object objI2 = com.revolut.feature.pay_bills_taxes.impl.ui_payment.a.I2(aVar, this.f114775y, this.z, this);
            if (objI2 == aVar2) {
                return aVar2;
            }
            finishCommand = finishCommand2;
            obj2 = objI2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            finishCommand = this.v;
            aVar = this.u;
            o.b(obj2);
        }
        return aVar.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(finishCommand, (NaviCommand) obj2)));
    }
}
