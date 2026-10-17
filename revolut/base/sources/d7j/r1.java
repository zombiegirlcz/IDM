package d7j;

import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class r1 extends gim.i implements Function1 {
    public com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g u;
    public com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f112048w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g f112049x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ExchangeOrderDraft f112050y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar, ExchangeOrderDraft exchangeOrderDraft, Continuation continuation) {
        super(1, continuation);
        this.f112049x = gVar;
        this.f112050y = exchangeOrderDraft;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r1(this.f112049x, this.f112050y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        com.revolut.kompot.navigable.vc.modal.a aVar;
        com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = this.f112049x;
        cli.y yVar = gVar.T;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f112048w;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.kompot.navigable.vc.modal.a aVar3 = gVar.S;
            g7j.e eVar = gVar.f99864t;
            Set set = ((w) ((j2) yVar.f22677a).getValue()).f112067a;
            if (set == null) {
                return Unit.f186387a;
            }
            Data data = ((w) ((j2) yVar.f22677a).getValue()).f112068b;
            if (data == null || (list = (List) data.getContent()) == null) {
                return Unit.f186387a;
            }
            Set set2 = gVar.N.f99825a.e;
            this.u = gVar;
            this.v = aVar3;
            this.f112048w = 1;
            Object objA = eVar.a(set, list, set2, this.f112050y, this);
            if (objA == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.revolut.kompot.navigable.vc.modal.a aVar4 = this.v;
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar2 = this.u;
            yhm.o.b(obj2);
            aVar = aVar4;
            gVar = gVar2;
        }
        gVar.getClass();
        oki.h.v2(aVar, (FlowStep) obj2, ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
