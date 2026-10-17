package j54;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class x0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y0 f171581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f171582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z0 f171583y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, String str, z0 z0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171581w = y0Var;
        this.f171582x = str;
        this.f171583y = z0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x0(this.f171581w, this.f171582x, this.f171583y, continuation, 0);
            default:
                return new x0(this.f171581w, this.f171582x, this.f171583y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                y0 y0Var = this.f171581w;
                w0 w0Var = new w0(y0Var, this.f171582x, this.f171583y, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(y0Var.e, "navigate to cancellation flow", w0Var, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                y0 y0Var2 = this.f171581w;
                w0 w0Var2 = new w0(y0Var2, this.f171582x, this.f171583y, null, 3);
                this.v = 1;
                Object objB2 = pu7.a.B(y0Var2.e, "navigate to plugin", w0Var2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
