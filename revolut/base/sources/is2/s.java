package is2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f168102w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b f168103x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f168103x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f168103x, continuation, 0);
                sVar.f168102w = obj2;
                return sVar;
            default:
                s sVar2 = new s(this.f168103x, continuation, 1);
                sVar2.f168102w = obj2;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        y yVar = (y) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(yVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                y yVar = (y) this.f168102w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    j60.a aVar2 = this.f168103x.f64271t;
                    Intrinsics.h(yVar);
                    efm.b bVarG = aVar2.G(yVar);
                    this.f168102w = null;
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar) {
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
                y yVar2 = (y) this.f168102w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    j60.a aVar4 = this.f168103x.f64271t;
                    Intrinsics.h(yVar2);
                    efm.b bVarG2 = aVar4.G(yVar2);
                    this.f168102w = null;
                    this.v = 1;
                    if (nim.a.a(bVarG2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
