package er9;

import com.revolut.feature.payments.groups.impl.data.network.services.PaymentsGroupsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f128590w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x f128591x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(x xVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f128591x = xVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(this.f128591x, continuation, 0);
                sVar.f128590w = str;
                return sVar.invokeSuspend(Unit.f186387a);
            default:
                s sVar2 = new s(this.f128591x, continuation, 1);
                sVar2.f128590w = str;
                return sVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x xVar = this.f128591x;
        switch (i) {
            case 0:
                String str = this.f128590w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                    this.f128590w = null;
                    this.v = 1;
                    PaymentsGroupsService.Companion companion = PaymentsGroupsService.INSTANCE;
                    obj2 = paymentsGroupsService.getGroupInviteLink(str, new wj0.b("payments_group_invite_link_creation"), this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return u0.T((cr9.w) obj2);
            default:
                String str2 = this.f128590w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                PaymentsGroupsService paymentsGroupsService2 = xVar.f128599g;
                this.f128590w = null;
                this.v = 1;
                Object messagesEligibility = paymentsGroupsService2.getMessagesEligibility(str2, this);
                return messagesEligibility == aVar2 ? aVar2 : messagesEligibility;
        }
    }
}
