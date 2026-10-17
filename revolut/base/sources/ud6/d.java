package ud6;

import com.revolut.feature.esim.instructions.ui.screen.instructions.EsimInstructionsScreen;
import ip0.t5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimInstructionsScreen f279155w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EsimInstructionsScreen esimInstructionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f279155w = esimInstructionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f279155w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f279155w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        t5 t5Var = (t5) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(t5Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimInstructionsScreen esimInstructionsScreen = this.f279155w;
        switch (i) {
            case 0:
                t5 t5Var = (t5) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVarD3 = esimInstructionsScreen.d3();
                Intrinsics.h(t5Var);
                ((h) fVarD3).I2(t5Var);
                break;
            default:
                t5 t5Var2 = (t5) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVarD32 = esimInstructionsScreen.d3();
                Intrinsics.h(t5Var2);
                ((h) fVarD32).I2(t5Var2);
                break;
        }
        return Unit.f186387a;
    }
}
