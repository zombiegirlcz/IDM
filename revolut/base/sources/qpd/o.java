package qpd;

import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a f248364w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f248364w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f248364w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f248364w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            default:
                o oVar3 = new o(this.f248364w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((GroupingExtraData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ie3.a aVar;
        List list;
        int i = this.u;
        com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a aVar2 = this.f248364w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar2.H2(aVar2.u, new qna.p(data, 4));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVar = (e) data2.getContent();
                if ((eVar == null || (aVar = eVar.f248350a) == null || (list = aVar.f160626a) == null || !list.isEmpty()) && !aVar2.f87711w) {
                    aVar2.H2(aVar2.u, new qna.p(data2, 5));
                } else if (!aVar2.f87711w) {
                    aVar2.f87711w = true;
                    aVar2.l2(new qc8.b(aVar2, null, 13), new yi5.b(26));
                }
                break;
            default:
                GroupingExtraData groupingExtraData = (GroupingExtraData) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar2.H2(aVar2.u, new qgf.o(groupingExtraData, 23));
                break;
        }
        return Unit.f186387a;
    }
}
