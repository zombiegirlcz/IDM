package c7e;

import com.revolut.feature.subaccount.api.models.SubaccountType;
import h93.f0;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.k1;
import s6e.z;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f21962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f0 f21963x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, f0 f0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f21962w = nVar;
        this.f21963x = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f21962w, this.f21963x, continuation, 0);
            default:
                return new l(this.f21962w, this.f21963x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l lVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    n nVar = this.f21962w;
                    pfm.a aVarE = ((x) nVar.f21970r).J(this.f21963x.f150110a).e(((z) nVar.f21972t).y(SubaccountType.Personal.f88963a));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ack.n nVar2 = new ack.n(19);
                    n nVar3 = this.f21962w;
                    l lVar2 = new l(nVar3, this.f21963x, null, 0);
                    this.v = 1;
                    lVar = this;
                    obj2 = n14.k.R(nVar3, null, nVar2, lVar2, lVar, 3);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    lVar = this;
                }
                if (((nii.e) obj2) instanceof nii.d) {
                    n nVar4 = lVar.f21962w;
                    k1 k1Var = nVar4.f21971s;
                    nVar4.f21969q.getClass();
                    k1Var.d(b.a());
                }
                return Unit.f186387a;
        }
    }
}
