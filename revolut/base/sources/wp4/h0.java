package wp4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class h0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f299055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function0 f299056x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit_card.autopay.api.models_v3.c f299057y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(i0 i0Var, Function0 function0, com.revolut.feature.credit_card.autopay.api.models_v3.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f299055w = i0Var;
        this.f299056x = function0;
        this.f299057y = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h0(this.f299055w, this.f299056x, this.f299057y, continuation, 0);
            default:
                return new h0(this.f299055w, this.f299056x, this.f299057y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h0 h0Var;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                i0 i0Var = this.f299055w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    lic.a aVar2 = new lic.a(i0Var, 25);
                    ack.n nVar = new ack.n(19);
                    w64.d dVar = new w64.d(i0Var, this.f299057y, null, 14);
                    this.v = 1;
                    h0Var = this;
                    obj2 = n14.k.Q(i0Var, null, aVar2, nVar, dVar, h0Var, 1);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        h0Var = this;
                        h0Var.f299056x.invoke();
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    h0Var = this;
                }
                nii.e eVar = (nii.e) obj2;
                if (!(eVar instanceof nii.d)) {
                    if (!(eVar instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.f186387a;
                }
                lal.a aVar3 = i0Var.D;
                String str = i0Var.f299059p.f69097a;
                h0Var.v = 2;
                if (aVar3.B(str, this) == aVar) {
                    return aVar;
                }
                h0Var.f299056x.invoke();
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    i0 i0Var2 = this.f299055w;
                    h0 h0Var2 = new h0(i0Var2, this.f299056x, this.f299057y, null, 0);
                    this.v = 1;
                    if (ue8.c.f0(i0Var2, h0Var2, this) == aVar4) {
                        return aVar4;
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
