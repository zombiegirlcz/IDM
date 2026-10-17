package cxe;

import com.revolut.data.model.Data;
import cul.w0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c f109976w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f109976w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f109976w, continuation, 0);
            case 1:
                return new x(this.f109976w, continuation, 1);
            default:
                return new x(this.f109976w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((x) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c.I2(this.f109976w, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar = this.f109976w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Data data = new Data(null, null, true, 3, null);
                    cVar.H2(cVar.f90751y, new w0(data, 28));
                    cVar.B.setValue(data);
                    uwe.j jVar = cVar.f90749w;
                    this.v = 1;
                    if (jVar.Z2(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                z1 z1Var = cVar.A;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (z1Var.emit(unit, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar2 = this.f109976w;
                cli.y yVar = cVar2.f90751y;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        yhm.o.b(obj2);
                        cVar2.H2(yVar, new cw7.j(9));
                        uwe.j jVar2 = cVar2.f90749w;
                        this.v = 1;
                        if (jVar2.Z2(this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    cVar2.H2(yVar, new cw7.j(10));
                    return Unit.f186387a;
                } catch (Throwable th10) {
                    cVar2.H2(yVar, new cw7.j(10));
                    throw th10;
                }
        }
    }
}
