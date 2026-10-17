package u1m;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.z1;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ awl.b f276469w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, awl.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f276469w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f276469w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            z1 z1Var = this.v.f276493h;
            f fVar = new f(this.f276469w);
            this.u = 1;
            z1Var.getClass();
            if (z1.m(z1Var, fVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        throw new KotlinNothingValueException();
    }
}
