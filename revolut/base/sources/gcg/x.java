package gcg;

import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lcg.a f142472w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e0 e0Var, lcg.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = e0Var;
        this.f142472w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.v, this.f142472w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        lcg.a aVar2 = this.f142472w;
        e0 e0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jxf.a aVar3 = aVar2.f193885b;
            this.u = 1;
            if (e0.I2(e0Var, aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        e0Var.C2(new q(new HotelsPropertyInputData.BookableProperty(aVar2.f193884a, null, null, null, null, 30)));
        return Unit.f186387a;
    }
}
