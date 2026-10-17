package bke;

import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yh5.d;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f16371w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, Continuation continuation) {
        super(2, continuation);
        this.f16371w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.f16371w, continuation);
        vVar.v = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((dt5.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dt5.a aVar = (dt5.a) this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            boolean z = aVar instanceof dt5.d;
            x xVar = this.f16371w;
            if (z) {
                xVar.A2(((dt5.d) aVar).f117387a);
            } else {
                Continuation continuation = null;
                if (aVar instanceof dt5.c) {
                    vh5.a aVar3 = xVar.J;
                    ah1.m mVar = new ah1.m(xVar, aVar, continuation, 4);
                    this.v = null;
                    this.u = 1;
                    if (aVar3.Z2((3 & 1) != 0, d.a.f313774a, mVar, this) == aVar2) {
                        return aVar2;
                    }
                } else if (aVar instanceof dt5.e) {
                    xVar.L2(((dt5.e) aVar).f117388a);
                } else {
                    if (!(aVar instanceof dt5.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yji.n.P2(xVar, xVar.o2(((dt5.b) aVar).f117385a), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
