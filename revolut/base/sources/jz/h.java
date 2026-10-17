package jz;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ double v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yji.n f179540w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(yji.n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f179540w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h((l) this.f179540w, continuation, 0);
                hVar.v = ((Number) obj2).doubleValue();
                return hVar;
            default:
                h hVar2 = new h((yy.c) this.f179540w, continuation, 1);
                hVar2.v = ((Number) obj2).doubleValue();
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Number number = (Number) obj2;
        switch (this.u) {
            case 0:
                return ((h) create(Double.valueOf(number.doubleValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create(Double.valueOf(number.doubleValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        yji.n nVar = this.f179540w;
        double d = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((sx.b) ((l) nVar).f179551s).j(d);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((sx.b) ((yy.c) nVar).f317737n).j(d);
                break;
        }
        return Unit.f186387a;
    }
}
