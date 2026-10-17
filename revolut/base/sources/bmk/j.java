package bmk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.j0;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function0 f16871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f16872x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f16873y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, Function0 function0, j0 j0Var, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
        this.f16871w = function0;
        this.f16872x = j0Var;
        this.f16873y = function1;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f16871w, this.f16872x, this.f16873y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        Function1 function1 = this.f16873y;
        q qVar = this.v;
        i iVar = new i(qVar, this.f16871w, this.f16872x, function1, null);
        this.u = 1;
        Object objB = pu7.a.B(qVar.e, "accept_cancellation_preventing_offer", iVar, this);
        return objB == aVar ? aVar : objB;
    }
}
