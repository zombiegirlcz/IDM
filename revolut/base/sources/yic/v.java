package yic;

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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.t0;
import wf0.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f314296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f314297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x f314298y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, Continuation continuation, x xVar) {
        super(3, continuation);
        this.u = i;
        this.f314298y = xVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                v vVar = new v(0, continuation, this.f314298y);
                vVar.f314296w = flowCollector;
                vVar.f314297x = obj3;
                return vVar.invokeSuspend(Unit.f186387a);
            case 1:
                v vVar2 = new v(1, continuation, this.f314298y);
                vVar2.f314296w = flowCollector;
                vVar2.f314297x = obj3;
                return vVar2.invokeSuspend(Unit.f186387a);
            default:
                v vVar3 = new v(2, continuation, this.f314298y);
                vVar3.f314296w = flowCollector;
                vVar3.f314297x = obj3;
                return vVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f314296w;
                    List list = (List) this.f314297x;
                    i7d.o oVar = this.f314298y.f314304t;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rent_and_bills_home_get_help_title, null, null, 14);
                    Intrinsics.checkNotNullParameter(list, "<this>");
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
                    Flow flowZ2 = oVar.Z2(new i7d.k(textLocalisedClause, "rent-and-bills-home", arrayList));
                    this.f314296w = null;
                    this.f314297x = null;
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
                    FlowCollector flowCollector2 = this.f314296w;
                    vkm.d dVarB = ((vgc.e) this.f314298y.o).b((w4l.k) this.f314297x);
                    this.f314296w = null;
                    this.f314297x = null;
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
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f314296w;
                    w4l.k kVar = (w4l.k) this.f314297x;
                    x xVar = this.f314298y;
                    wkm.l lVarQ = vkm.q.Q(new t0(xVar.v.B(w.f314299a), 1), new f0((Continuation) null, xVar, kVar, 13));
                    this.f314296w = null;
                    this.f314297x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, lVarQ, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
