package cr5;

import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lo5.a0;
import lo5.v;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public z1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f5j.a f108195w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f108196x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f108197y;
    public final /* synthetic */ f5j.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, f5j.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f108197y = eVar;
        this.z = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f108197y, this.z, continuation, 0);
            default:
                return new c(this.f108197y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        z1 z1Var;
        f5j.a aVar;
        z1 z1Var2;
        f5j.a aVar2;
        switch (this.u) {
            case 0:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.f108196x;
                if (i == 0) {
                    o.b(obj2);
                    e eVar = this.f108197y;
                    z1 z1Var3 = eVar.o;
                    zq5.c cVar = eVar.f108202n;
                    this.v = z1Var3;
                    f5j.a aVar4 = this.z;
                    this.f108195w = aVar4;
                    this.f108196x = 1;
                    obj2 = cVar.c(aVar4, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                    z1Var = z1Var3;
                    aVar = aVar4;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    aVar = this.f108195w;
                    z1Var = this.v;
                    o.b(obj2);
                }
                v vVar = new v(aVar, (TransferMoneyPocket) obj2);
                this.v = null;
                this.f108195w = null;
                this.f108196x = 2;
                if (z1Var.emit(vVar, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f108196x;
                if (i2 == 0) {
                    o.b(obj2);
                    e eVar2 = this.f108197y;
                    z1 z1Var4 = eVar2.o;
                    zq5.c cVar2 = eVar2.f108202n;
                    this.v = z1Var4;
                    f5j.a aVar6 = this.z;
                    this.f108195w = aVar6;
                    this.f108196x = 1;
                    obj2 = cVar2.c(aVar6, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                    z1Var2 = z1Var4;
                    aVar2 = aVar6;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    aVar2 = this.f108195w;
                    z1Var2 = this.v;
                    o.b(obj2);
                }
                a0 a0Var = new a0(aVar2, (TransferMoneyPocket) obj2);
                this.v = null;
                this.f108195w = null;
                this.f108196x = 2;
                if (z1Var2.emit(a0Var, this) == aVar5) {
                    return aVar5;
                }
                return Unit.f186387a;
        }
    }
}
