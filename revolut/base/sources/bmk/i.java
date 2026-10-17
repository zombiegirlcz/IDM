package bmk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import nii.j0;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function0 f16868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f16869x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f16870y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, Function0 function0, j0 j0Var, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
        this.f16868w = function0;
        this.f16869x = j0Var;
        this.f16870y = function1;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, this.f16868w, this.f16869x, this.f16870y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Function1 function1 = this.f16870y;
            q qVar = this.v;
            h hVar = new h(qVar, this.f16868w, this.f16869x, function1, null);
            this.u = 1;
            if (qVar.Y2(this, hVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
