package tp4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a f273279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function0 f273280x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit_card.autopay.api.models_v3.c f273281y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar, Function0 function0, com.revolut.feature.credit_card.autopay.api.models_v3.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f273279w = aVar;
        this.f273280x = function0;
        this.f273281y = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f273279w, this.f273280x, this.f273281y, continuation, 0);
            default:
                return new n(this.f273279w, this.f273280x, this.f273281y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar2 = this.f273279w;
                    k kVar = new k(aVar2, 2);
                    ack.n nVar2 = new ack.n(19);
                    sb4.i iVar = new sb4.i(aVar2, this.f273281y, null, 28);
                    this.v = 1;
                    nVar = this;
                    obj2 = n14.k.Q(aVar2, null, kVar, nVar2, iVar, nVar, 1);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    nVar = this;
                }
                nii.e eVar = (nii.e) obj2;
                if (eVar instanceof nii.d) {
                    nVar.f273280x.invoke();
                } else if (!(eVar instanceof nii.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar4 = this.f273279w;
                    n nVar3 = new n(aVar4, this.f273280x, this.f273281y, null, 0);
                    this.v = 1;
                    if (ue8.c.f0(aVar4, nVar3, this) == aVar3) {
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
