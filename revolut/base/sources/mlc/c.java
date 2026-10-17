package mlc;

import com.revolut.feature.robo.impl.data.network.RoboAccountService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k18.c f206670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f206671x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(k18.c cVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f206670w = cVar;
        this.f206671x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f206670w, this.f206671x, continuation, 0);
            default:
                return new c(this.f206670w, this.f206671x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                String str = this.f206671x;
                k18.c cVar = this.f206670w;
                if (i == 0) {
                    o.b(obj2);
                    RoboAccountService roboAccountService = (RoboAccountService) cVar.d;
                    this.v = 1;
                    if (roboAccountService.deleteGoal(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                x4l.c cVar2 = (x4l.c) cVar.f180140b;
                this.v = 2;
                if (cVar2.d(str, false, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    x4l.c cVar3 = (x4l.c) this.f206670w.f180140b;
                    this.v = 1;
                    if (cVar3.d(this.f206671x, false, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
