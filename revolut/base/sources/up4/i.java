package up4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c f281843w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f281843w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f281843w, continuation, 0);
            default:
                return new i(this.f281843w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c cVar = this.f281843w;
                if (i == 0) {
                    o.b(obj2);
                    lic.a aVar2 = new lic.a(cVar, 22);
                    h hVar = new h(cVar);
                    com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.a aVar3 = new com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.a(cVar, null);
                    this.v = 1;
                    obj2 = n14.k.V(cVar, null, aVar2, hVar, aVar3, this, 1);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                nii.h hVar2 = (nii.h) obj2;
                if (hVar2 instanceof nii.g) {
                    cVar.K2();
                } else if (!(hVar2 instanceof nii.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c cVar2 = this.f281843w;
                    i iVar = new i(cVar2, null, 0);
                    this.v = 1;
                    if (ue8.c.f0(cVar2, iVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
