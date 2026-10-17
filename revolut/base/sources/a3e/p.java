package a3e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f1115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f1116x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(t tVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1115w = tVar;
        this.f1116x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f1115w, this.f1116x, continuation, 0);
            default:
                return new p(this.f1115w, this.f1116x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
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
                x xVar = this.f1115w.f1122r;
                lg0.a aVar2 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f1116x, aVar2, null, this, 4);
                return objX1 == aVar ? aVar : objX1;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    t tVar = this.f1115w;
                    c3e.c cVar = tVar.f1121q;
                    ihm.f events = tVar.f1125w;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(events, "events");
                    String carouselId = this.f1116x;
                    Intrinsics.checkNotNullParameter(carouselId, "carouselId");
                    cVar.f20941c = carouselId;
                    efm.b bVarB = ((lk0.d) cVar.d.getValue()).b(events);
                    this.v = 1;
                    if (nim.a.a(bVarB, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
