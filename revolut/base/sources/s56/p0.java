package s56;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.remittances.impl.ui.send.amount.b f259981w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i, com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f259981w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p0 p0Var = new p0(0, this.f259981w, continuation);
                p0Var.v = obj2;
                return p0Var;
            case 1:
                p0 p0Var2 = new p0(1, this.f259981w, continuation);
                p0Var2.v = obj2;
                return p0Var2;
            case 2:
                p0 p0Var3 = new p0(2, this.f259981w, continuation);
                p0Var3.v = obj2;
                return p0Var3;
            default:
                p0 p0Var4 = new p0(3, this.f259981w, continuation);
                p0Var4.v = obj2;
                return p0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p0) create((PaymentPocketInfo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((p0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p0) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 26;
        com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar = this.f259981w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.z, new s31.a((l0) data.getContent(), data, 8));
                break;
            case 1:
                PaymentPocketInfo paymentPocketInfo = (PaymentPocketInfo) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.z, new bg2.w(paymentPocketInfo, 2));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.z, new rtl.s(data2, 26));
                break;
            default:
                s sVar = (s) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.z, new ryd.i(sVar, i2));
                break;
        }
        return Unit.f186387a;
    }
}
