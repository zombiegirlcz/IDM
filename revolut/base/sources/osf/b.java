package osf;

import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f229324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TransferReasonsRequest f229325x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, TransferReasonsRequest transferReasonsRequest, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f229324w = gVar;
        this.f229325x = transferReasonsRequest;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f229324w, this.f229325x, continuation, 0);
            default:
                return new b(this.f229324w, this.f229325x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                csf.b bVar = this.f229324w.o;
                this.v = 1;
                Object objB = ((tsf.e) bVar).f274126a.b(this.f229325x, this);
                return objB == aVar ? aVar : objB;
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
                g gVar = this.f229324w;
                b bVar2 = new b(gVar, this.f229325x, null, 0);
                this.v = 1;
                Object objY2 = gVar.Y2(this, bVar2);
                return objY2 == aVar2 ? aVar2 : objY2;
        }
    }
}
