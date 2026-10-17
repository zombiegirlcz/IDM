package jv;

import com.revolut.camerakit.detectors.api.models.FaceDetectionUnavailable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.t1;
import vkm.y;
import vkm.z1;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f178701w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178701w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f178701w, continuation, 0);
            case 1:
                return new e(this.f178701w, continuation, 1);
            case 2:
                return new e(this.f178701w, continuation, 2);
            default:
                return new e(this.f178701w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((xv.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
                    r rVar = this.f178701w;
                    Continuation continuation = null;
                    y yVar = new y(new y(new e(rVar, continuation, 1), ta6.a.h(vkm.q.q(rVar.f178727q), new y(new q(rVar, null), rVar.f178718b.a()), vkm.q.q(new y(new wda.l(2, 6, null), (z1) rVar.e.f278953b)), new dlf.g(rVar, continuation, 1))), new ghl.l(rVar, continuation, 25));
                    this.v = 1;
                    if (vkm.q.n(yVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = this.f178701w.f178727q;
                    this.v = 1;
                    if (z1Var.emit(uv.c.f283253a, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                r rVar2 = this.f178701w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    t1 t1VarA = rVar2.f178718b.a();
                    this.v = 1;
                    obj2 = vkm.q.z(t1VarA, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                xv.l lVar = (xv.l) obj2;
                if ((lVar instanceof xv.j) && (((xv.j) lVar).getError() instanceof FaceDetectionUnavailable)) {
                    rVar2.i.e.set(true);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    ww.b bVar = this.f178701w.k;
                    this.v = 1;
                    if (bVar.b(this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
