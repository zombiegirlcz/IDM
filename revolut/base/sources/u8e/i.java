package u8e;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mjf.b0;
import tof.i1;
import u4i.u;
import yhm.o;
import yua.q;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f278190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ bcb.a f278191x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, bcb.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f278190w = jVar;
        this.f278191x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f278190w, this.f278191x, continuation, 0);
            default:
                return new i(this.f278190w, this.f278191x, continuation, 1);
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
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        bcb.a aVar = this.f278191x;
        j jVar = this.f278190w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    xua.a aVar2 = jVar.f278194n;
                    d0 d0VarFirstOrError = m70.a.g(((q) aVar2).r(aVar.d.a()), null, new u(10), 1).firstOrError();
                    u3a.q qVar = new u3a.q(new u69.g(jVar, aVar, 12), 18);
                    d0VarFirstOrError.getClass();
                    pfm.a aVarE = new pfm.a(d0VarFirstOrError, qVar, 4).e(jVar.f278193m.k0(AccountId.Personal.f51414a)).e(((b0) jVar.o).g(i1.f272794a));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    r rVarDistinctUntilChanged = xua.a.a(aVar2, null, 3).distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                    efm.b bVarIgnoreElements = mo3.a.n(rVarDistinctUntilChanged).ignoreElements();
                    Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                    pfm.a aVarE2 = aVarE.e(ue0.e.v(bVarIgnoreElements));
                    Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                    Object objA = nim.a.a(aVarE2, this);
                    if (objA != obj3) {
                        objA = Unit.f186387a;
                    }
                    if (objA == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    i iVar = new i(jVar, aVar, continuation, i2);
                    this.v = 1;
                    if (do3.q.u(jVar, iVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
