package k65;

import efm.r;
import k1f.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nyd.j;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a f181639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f181640x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a aVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f181639w = aVar;
        this.f181640x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f181639w, this.f181640x, continuation, 0);
            case 1:
                return new f(this.f181639w, this.f181640x, continuation, 1);
            case 2:
                return new f(this.f181639w, this.f181640x, continuation, 2);
            default:
                return new f(this.f181639w, this.f181640x, continuation, 3);
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        String str = this.f181640x;
        com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a aVar = this.f181639w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    r35.b bVar = new r35.b(str);
                    this.v = 1;
                    if (aVar.G1(bVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    f fVar = new f(aVar, str, continuation, 0);
                    this.v = 1;
                    if (aVar.p2(this, fVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                oki.h.D2(aVar.u);
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                r rVarG = m70.a.g(aVar.f70377q.a(str, w4l.h.f294642c), null, new n(12), 1);
                this.v = 1;
                Object objC = nim.a.c(rVarG, this);
                return objC == aVar4 ? aVar4 : objC;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                y45.b bVar2 = aVar.f70376p;
                this.v = 1;
                o55.b bVar3 = bVar2.f310789a;
                bVar3.getClass();
                j jVar = new j(3, bVar3, str, continuation);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, jVar, this);
                return objJ == aVar5 ? aVar5 : objJ;
        }
    }
}
