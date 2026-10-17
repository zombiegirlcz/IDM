package h45;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.a f149321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f149321w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f149321w, continuation, 0);
            default:
                return new k(this.f149321w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.a aVar2 = this.f149321w;
                b45.h hVar = aVar2.o;
                x35.h hVar2 = ((f) ((j2) aVar2.f70296p.f22677a).getValue()).f149316a;
                this.v = 1;
                Serializable serializableB = hVar.b(hVar2, this);
                return serializableB == aVar ? aVar : serializableB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.a aVar4 = this.f149321w;
                if (i2 == 0) {
                    o.b(obj2);
                    k kVar = new k(aVar4, continuation, 0);
                    this.v = 1;
                    obj2 = aVar4.p2(this, kVar);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                x35.b bVar = (x35.b) obj2;
                if (bVar == null) {
                    return null;
                }
                aVar4.C2(new h(bVar));
                return Unit.f186387a;
        }
    }
}
