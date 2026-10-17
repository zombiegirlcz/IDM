package fmb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class y0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b f136317w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i, com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f136317w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y0(0, this.f136317w, continuation);
            default:
                return new y0(1, this.f136317w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((y0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar = this.f136317w;
                    rp0.y yVarC = bVar.A.c(((r) ((j2) bVar.L.f22677a).getValue()).c());
                    this.v = 1;
                    if (bVar.O2(yVarC, this) == aVar) {
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
                    com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar2 = this.f136317w;
                    a1 a1Var = new a1(((r) ((j2) bVar2.L.f22677a).getValue()).c().f214169a, bVar2, null);
                    this.v = 1;
                    if (zh9.u0.b0(bVar2.X(), "REVIEW_PRODUCT_DETAILS_LOADING_CTA_TAG", a1Var, this) == aVar2) {
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
