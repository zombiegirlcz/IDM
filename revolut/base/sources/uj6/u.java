package uj6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import lk6.x;
import lk6.z;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b f280516w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f280516w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f280516w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f280516w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            default:
                u uVar3 = new u(this.f280516w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((hk6.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u) create((oj6.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((wj6.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 1;
        com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b bVar = this.f280516w;
        switch (i) {
            case 0:
                hk6.j jVar = (hk6.j) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.u, new x(jVar, i2));
                break;
            case 1:
                oj6.f fVar = (oj6.f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.u, new ud3.n(fVar, 25));
                break;
            default:
                wj6.l lVar = (wj6.l) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.u, new z(lVar, 1));
                break;
        }
        return Unit.f186387a;
    }
}
