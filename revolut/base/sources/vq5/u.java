package vq5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import vo8.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a f291340w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f291340w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f291340w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f291340w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            case 2:
                u uVar3 = new u(this.f291340w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
            case 3:
                u uVar4 = new u(this.f291340w, continuation, 3);
                uVar4.v = obj2;
                return uVar4;
            default:
                u uVar5 = new u(this.f291340w, continuation, 4);
                uVar5.v = obj2;
                return uVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((ko5.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar = this.f291340w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new i0(data, 4));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new i0(data2, 5));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new i0(data3, 6));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new i0(data4, 7));
                break;
            default:
                ko5.l lVar = (ko5.l) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new x(lVar, 0));
                zp5.d dVar = aVar.f71328w;
                ko5.i iVar = lVar.f.f186229b;
                ((MutableStateFlow) dVar.f324171a.getValue()).k(new CryptoWithdrawFeesBreakdown(null, null, null, null, iVar.f186230a, iVar.f186231b));
                break;
        }
        return Unit.f186387a;
    }
}
