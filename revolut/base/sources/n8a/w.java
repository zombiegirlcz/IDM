package n8a;

import com.revolut.feature.pix.impl.data.network.PixAuthorisationsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f213353w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f213353w = xVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new w(this.f213353w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new w(this.f213353w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    PixAuthorisationsService pixAuthorisationsService = this.f213353w.f213354a;
                    this.v = 1;
                    obj2 = pixAuthorisationsService.getInactiveAuthorisations("PIX_MANDATE", this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return edl.a.x((l8a.s) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    PixAuthorisationsService pixAuthorisationsService2 = this.f213353w.f213354a;
                    this.v = 1;
                    obj2 = pixAuthorisationsService2.getPendingAuthorisations(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return edl.a.x((l8a.s) obj2);
        }
    }
}
