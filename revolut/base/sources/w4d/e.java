package w4d;

import com.revolut.core.ui_kit.delegates.g6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f294543w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g6 f294544x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, g6 g6Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f294543w = fVar;
        this.f294544x = g6Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f294543w, this.f294544x, continuation, 0);
            default:
                return new e(this.f294543w, this.f294544x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    j jVar = this.f294543w.o;
                    String str = this.f294544x.f54199a;
                    this.v = 1;
                    Object objB = ((nr4.b) jVar).f218529b.b(str, this);
                    if (objB != aVar) {
                        objB = Unit.f186387a;
                    }
                    if (objB == aVar) {
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
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f fVar = this.f294543w;
                e eVar = new e(fVar, this.f294544x, null, 0);
                this.v = 1;
                Object objB2 = pu7.a.B(fVar.k, "changingDisplayAmountToggleOption", eVar, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
