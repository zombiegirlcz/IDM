package mk5;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a f206202w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f206202w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f206202w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f206202w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            default:
                u uVar3 = new u(this.f206202w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar = this.f206202w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new me7.h(data, 10));
                break;
            case 1:
                String str = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.I2(str);
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new me7.h(data2, 11));
                break;
        }
        return Unit.f186387a;
    }
}
