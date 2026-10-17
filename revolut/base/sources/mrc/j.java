package mrc;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f208106w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f208107x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f208108y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Continuation continuation, l lVar) {
        super(3, continuation);
        this.u = i;
        this.f208108y = lVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                j jVar = new j(0, continuation, this.f208108y);
                jVar.f208106w = flowCollector;
                jVar.f208107x = obj3;
                return jVar.invokeSuspend(Unit.f186387a);
            default:
                j jVar2 = new j(1, continuation, this.f208108y);
                jVar2.f208106w = flowCollector;
                jVar2.f208107x = obj3;
                return jVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f208106w;
                    l lVar = this.f208108y;
                    aqc.k kVar = lVar.f208110p;
                    String submissionId = lVar.o.f85330a;
                    aqc.h hVar = (aqc.h) kVar;
                    hVar.getClass();
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    Intrinsics.checkNotNullParameter(submissionId, "submissionId");
                    mqc.k kVar2 = (mqc.k) hVar.d;
                    kVar2.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    Intrinsics.checkNotNullParameter(submissionId, "submissionId");
                    vkm.d dVarB = kVar2.e.b(submissionId, loadingStrategy);
                    this.f208106w = null;
                    this.f208107x = null;
                    this.v = 1;
                    if (q.u(flowCollector, dVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f208106w;
                    vkm.d dVarB2 = rd0.e.b(this.f208108y.f208111q.J(AccountId.Personal.f51414a, w4l.h.f294642c));
                    this.f208106w = null;
                    this.f208107x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, dVarB2, this) == aVar2) {
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
