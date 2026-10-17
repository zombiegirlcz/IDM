package bg2;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f15074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f15075x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(x xVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f15074w = xVar;
        this.f15075x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f15074w, this.f15075x, continuation, 0);
            default:
                return new r(this.f15074w, this.f15075x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
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
                wf2.e eVar = this.f15074w.f15086r;
                this.v = 1;
                Serializable serializableE = eVar.e(this.f15075x, this);
                return serializableE == aVar ? aVar : serializableE;
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
                x xVar = this.f15074w;
                r rVar = new r(xVar, this.f15075x, null, 0);
                this.v = 1;
                Object objT = do3.q.t(xVar, rVar, this);
                return objT == aVar2 ? aVar2 : objT;
        }
    }
}
