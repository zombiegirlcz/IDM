package g8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f141363w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(e0 e0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f141363w = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0(this.f141363w, continuation, 0);
            case 1:
                return new b0(this.f141363w, continuation, 1);
            default:
                return new b0(this.f141363w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e0 e0Var = this.f141363w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a54.g gVar = new a54.g(e0Var, null, 22);
                this.v = 1;
                Object objB = pu7.a.B(e0Var.k, "MoveMoneyReviewCta", gVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                efm.d0 d0VarF = e0Var.f141368r.f(false);
                d0 d0Var = d0.f;
                ufm.i iVar = new ufm.i(d0VarF, new dug.e(26), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                this.v = 1;
                Object objB2 = nim.a.b(iVar, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                h8i.e eVar = e0Var.u;
                AccountWrapper accountWrapper = ((r) e0Var.t2()).f141386b;
                AccountWrapper accountWrapper2 = ((r) e0Var.t2()).f141387c;
                this.v = 1;
                Object objA = eVar.a(accountWrapper, accountWrapper2, this);
                return objA == aVar3 ? aVar3 : objA;
        }
    }
}
