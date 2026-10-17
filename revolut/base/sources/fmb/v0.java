package fmb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class v0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f136306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f136307x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b f136308y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i, com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f136308y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                v0 v0Var = new v0(0, this.f136308y, continuation);
                v0Var.f136306w = flowCollector;
                v0Var.f136307x = obj3;
                return v0Var.invokeSuspend(Unit.f186387a);
            default:
                v0 v0Var2 = new v0(1, this.f136308y, continuation);
                v0Var2.f136306w = flowCollector;
                v0Var2.f136307x = obj3;
                return v0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f136306w;
                    com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar = this.f136308y;
                    jhi.k kVarK2 = com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b.K2(bVar, bVar.v.f83287a);
                    this.f136306w = null;
                    this.f136307x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, kVarK2, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f136306w;
                    fha.a aVar3 = (fha.a) this.f136307x;
                    com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar2 = this.f136308y;
                    List list = bVar2.v.f83288b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (Intrinsics.f(((SavingsProductData) obj3).f86683a.i, aVar3.f135191b.f152287a)) {
                            arrayList.add(obj3);
                        }
                    }
                    SavingsProductData savingsProductDataC = opg.a.c(arrayList);
                    if (savingsProductDataC == null) {
                        throw new IllegalStateException(j6.a.q("Product not found for pricingPlanId=", aVar3.f135191b.f152287a).toString());
                    }
                    jhi.k kVarK22 = com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b.K2(bVar2, savingsProductDataC);
                    this.f136306w = null;
                    this.f136307x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, kVarK22, this) == aVar2) {
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
