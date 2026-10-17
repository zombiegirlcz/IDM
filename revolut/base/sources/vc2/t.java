package vc2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f287636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o02.e f287637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o02.e f287638y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, o02.e eVar, o02.e eVar2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f287636w = uVar;
        this.f287637x = eVar;
        this.f287638y = eVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f287636w, this.f287637x, this.f287638y, continuation, 0);
            default:
                return new t(this.f287636w, this.f287637x, this.f287638y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                o02.e eVar = this.f287637x;
                u uVar = this.f287636w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    s sVar = new s(uVar, eVar, null, 0);
                    this.v = 1;
                    if (do3.q.t(uVar, sVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                uVar.H2(uVar.u, new v73.c(this.f287638y, eVar, 7));
                return Unit.f186387a;
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
                u uVar2 = this.f287636w;
                t tVar = new t(uVar2, this.f287637x, this.f287638y, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(uVar2.k, "onSwitchClicked", tVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
