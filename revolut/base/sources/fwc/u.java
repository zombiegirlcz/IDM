package fwc;

import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import cuc.z;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.transactions_limits.a f138617w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f138617w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f138617w, continuation, 0);
            default:
                return new u(this.f138617w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        OutboundTransactionLimit outboundTransactionLimit;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar2 = this.f138617w;
                    i iVar = (i) ((j) ((j2) aVar2.v.f22677a).getValue()).f138606a.getContent();
                    if (iVar == null || (list = iVar.f138604a) == null || (outboundTransactionLimit = (OutboundTransactionLimit) d0.d0(list)) == null) {
                        return Unit.f186387a;
                    }
                    String str = outboundTransactionLimit.e;
                    Boolean bool = outboundTransactionLimit.f85486r;
                    wtc.k kVar = aVar2.o;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    this.v = 1;
                    if (((wtc.n) kVar).b(this, str, zBooleanValue) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar4 = this.f138617w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    u uVar = new u(aVar4, null, 0);
                    this.v = 1;
                    if (ue8.c.f0(aVar4, uVar, this) == aVar3) {
                        return aVar3;
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
                wtc.k kVar2 = aVar4.o;
                this.v = 2;
                x4l.c cVar = ((z) ((wtc.n) kVar2).f299887a).e;
                Object obj3 = Unit.f186387a;
                Object objD = cVar.d(obj3, true, this);
                if (objD != aVar3) {
                    objD = obj3;
                }
                if (objD == aVar3) {
                    obj3 = objD;
                }
                if (obj3 == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }
}
