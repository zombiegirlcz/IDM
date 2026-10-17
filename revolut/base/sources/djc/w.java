package djc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.t0;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f115318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f115319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b0 f115320y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, b0 b0Var, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f115320y = b0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                w wVar = new w(0, this.f115320y, continuation);
                wVar.f115318w = flowCollector;
                wVar.f115319x = obj3;
                return wVar.invokeSuspend(Unit.f186387a);
            case 1:
                w wVar2 = new w(1, this.f115320y, continuation);
                wVar2.f115318w = flowCollector;
                wVar2.f115319x = obj3;
                return wVar2.invokeSuspend(Unit.f186387a);
            case 2:
                w wVar3 = new w(2, this.f115320y, continuation);
                wVar3.f115318w = flowCollector;
                wVar3.f115319x = obj3;
                return wVar3.invokeSuspend(Unit.f186387a);
            default:
                w wVar4 = new w(3, this.f115320y, continuation);
                wVar4.f115318w = flowCollector;
                wVar4.f115319x = obj3;
                return wVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i7d.h fVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f115318w;
                    List list = (List) this.f115319x;
                    i7d.o oVar = this.f115320y.v;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rent_and_bills_manage_linked_payments_get_help_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.rent_and_bills_manage_linked_payments_get_help_title, null, null, 14);
                    List<RentAndBillsLinkedPayments.FaqItem> list2 = list;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                    for (RentAndBillsLinkedPayments.FaqItem faqItem : list2) {
                        if (faqItem instanceof RentAndBillsLinkedPayments.FaqItem.Topic) {
                            fVar = new i7d.g(((RentAndBillsLinkedPayments.FaqItem.Topic) faqItem).f84798a);
                        } else {
                            if (!(faqItem instanceof RentAndBillsLinkedPayments.FaqItem.Deeplink)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            RentAndBillsLinkedPayments.FaqItem.Deeplink deeplink = (RentAndBillsLinkedPayments.FaqItem.Deeplink) faqItem;
                            fVar = new i7d.f(new TextClause(deeplink.f84796a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), deeplink.f84797b);
                        }
                        arrayList.add(fVar);
                    }
                    Flow flowZ2 = oVar.Z2(new i7d.j("rent-and-bills-manage-linked-payments", textLocalisedClause, new i7d.b(textLocalisedClause2, arrayList)));
                    this.f115318w = null;
                    this.f115319x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowZ2, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f115318w;
                    vkm.d dVarB = ((vgc.e) this.f115320y.f115290p).b((w4l.k) this.f115319x);
                    this.f115318w = null;
                    this.f115319x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar2) {
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
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f115318w;
                    vkm.d dVarB2 = rd0.e.b(xua.a.a(this.f115320y.f115293s, null, 3));
                    this.f115318w = null;
                    this.f115319x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f115318w;
                    w4l.k kVar = (w4l.k) this.f115319x;
                    b0 b0Var = this.f115320y;
                    wkm.l lVarQ = vkm.q.Q(new t0(b0Var.f115296x.B(y.f115322a), 1), new a32.b((Continuation) null, b0Var, kVar, 26));
                    this.f115318w = null;
                    this.f115319x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, lVarQ, this) == aVar4) {
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
