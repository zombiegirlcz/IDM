package tp6;

import com.revolut.feature.feedback.api.domain.Feedback;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tlf.n;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f273296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ yo6.e f273297x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, yo6.e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f273296w = gVar;
        this.f273297x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f273296w, this.f273297x, continuation, 0);
            default:
                return new f(this.f273296w, this.f273297x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                yo6.e eVar = this.f273297x;
                g gVar = this.f273296w;
                if (i == 0) {
                    o.b(obj2);
                    dp6.a aVar2 = gVar.f273298p;
                    yo6.d dVar = yo6.d.WORKFLOW_STEP;
                    String str = gVar.o.f73160a;
                    int iB = eVar.b();
                    this.v = 1;
                    obj2 = dp6.a.b(aVar2, dVar, str, iB, null, null, this, 96);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                gVar.H2(gVar.f273299q, new n(23));
                gVar.C2(new c(((Feedback) obj2).f73125a, eVar));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    g gVar2 = this.f273296w;
                    f fVar = new f(gVar2, this.f273297x, null, 0);
                    this.v = 1;
                    if (gVar2.p2(this, fVar) == aVar3) {
                        return aVar3;
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
