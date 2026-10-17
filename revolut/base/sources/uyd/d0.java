package uyd;

import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.impl.services.StatementsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ e f284175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h0 f284176x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(h0 h0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f284176x = h0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        e eVar = (e) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.f284176x, continuation, 0);
                d0Var.f284175w = eVar;
                return d0Var.invokeSuspend(Unit.f186387a);
            default:
                d0 d0Var2 = new d0(this.f284176x, continuation, 1);
                d0Var2.f284175w = eVar;
                return d0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                e eVar = this.f284175w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                h0 h0Var = this.f284176x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    StatementsService statementsService = h0Var.f284188a;
                    int i2 = eVar.f284177a;
                    StatementsFormat statementsFormat = eVar.f284178b;
                    String value = statementsFormat != null ? statementsFormat.getValue() : null;
                    this.f284175w = null;
                    this.v = 1;
                    obj2 = statementsService.getBankIdDetailedAnnualReport(i2, value, null, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return h0Var.f284189b.a((oyd.q) obj2);
            default:
                e eVar2 = this.f284175w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                h0 h0Var2 = this.f284176x;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    StatementsService statementsService2 = h0Var2.f284188a;
                    int i5 = eVar2.f284177a;
                    StatementsFormat statementsFormat2 = eVar2.f284178b;
                    String value2 = statementsFormat2 != null ? statementsFormat2.getValue() : null;
                    this.f284175w = null;
                    this.v = 1;
                    obj2 = statementsService2.getBankIdSummarisedAnnualReport(i5, value2, null, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return h0Var2.f284189b.a((oyd.q) obj2);
        }
    }
}
