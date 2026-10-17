package g7b;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f141159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f141160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e f141161y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f141161y = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                t tVar = new t(0, this.f141161y, continuation);
                tVar.f141159w = flowCollector;
                tVar.f141160x = obj3;
                return tVar.invokeSuspend(Unit.f186387a);
            case 1:
                t tVar2 = new t(1, this.f141161y, continuation);
                tVar2.f141159w = flowCollector;
                tVar2.f141160x = obj3;
                return tVar2.invokeSuspend(Unit.f186387a);
            default:
                t tVar3 = new t(2, this.f141161y, continuation);
                tVar3.f141159w = flowCollector;
                tVar3.f141160x = obj3;
                return tVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f141159w;
                    Flow flowZ2 = this.f141161y.f82588s.Z2(new i7d.k(new TextLocalisedClause(R$string.cobrand_plan_hub_overview_tab_faqs, null, null, 14), "cobrands-plan-hub", zhm.u.c(new i7d.g((String) this.f141160x))));
                    this.f141159w = null;
                    this.f141160x = null;
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
                    FlowCollector flowCollector2 = this.f141159w;
                    String str = (String) this.f141160x;
                    ue0.c cVar = this.f141161y.u.f21754a.f311063a;
                    if (str == null) {
                        str = "";
                    }
                    Flow flowC0 = cVar.C0("card_benefits_expanded_".concat(str), Boolean.TYPE);
                    this.f141159w = null;
                    this.f141160x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect = flowC0.collect(new xv5.f(flowCollector2, 16), this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar2) {
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
                    FlowCollector flowCollector3 = this.f141159w;
                    Flow flowA = ((c6b.i) this.f141161y.o).a((w4l.k) this.f141160x);
                    this.f141159w = null;
                    this.f141160x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowA, this) == aVar3) {
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
