package hl6;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.network.models.security.SecuritySettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f152998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f152999x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b f153000y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f153000y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(0, this.f153000y, continuation);
                oVar.f152998w = flowCollector;
                oVar.f152999x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                o oVar2 = new o(1, this.f153000y, continuation);
                oVar2.f152998w = flowCollector;
                oVar2.f152999x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowF;
        Flow flowF2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f152998w;
                    if (((AccountId.Joint) this.f152999x) == null) {
                        flowF = new go.g(i.UNAVAILABLE, 2);
                    } else {
                        y21.c cVar = this.f153000y.f72765r;
                        cVar.getClass();
                        flowF = mo3.a.f(zi0.c.w(rd0.e.b(cVar.b(SecuritySettings.JOINT_OBA_DATA_SHARING_CONSENT, w4l.i.f294643c))), q.f153002a, p.f153001a, r.f153003a);
                    }
                    this.f152998w = null;
                    this.f152999x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowF, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f152998w;
                    if (((AccountId.Joint) this.f152999x) == null) {
                        flowF2 = new go.g(h.UNAVAILABLE, 2);
                    } else {
                        y21.c cVar2 = this.f153000y.f72765r;
                        cVar2.getClass();
                        flowF2 = mo3.a.f(zi0.c.w(rd0.e.b(cVar2.b(SecuritySettings.JOINT_OBA_DATA_SHARING_NOTIFICATIONS, w4l.i.f294643c))), t.f153005a, s.f153004a, u.f153006a);
                    }
                    this.f152998w = null;
                    this.f152999x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowF2, this) == aVar2) {
                        return aVar2;
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
