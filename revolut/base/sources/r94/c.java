package r94;

import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import efm.d0;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import p24.p;
import r83.g;
import te0.w;
import ufm.n;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a f252519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CreditApplicationPluginFlowContract$Configuration f252520x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar, CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f252519w = aVar;
        this.f252520x = creditApplicationPluginFlowContract$Configuration;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f252519w, this.f252520x, continuation, 0);
            default:
                return new c(this.f252519w, this.f252520x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar2 = this.f252519w;
                if (i == 0) {
                    o.b(obj2);
                    hw3.c cVar = aVar2.f67535q;
                    h1 productPayload = w0.F(this.f252520x);
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(productPayload, "productPayload");
                    p pVar = cVar.f156055a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(productPayload, "productPayload");
                    d0<tt3.a> d0VarConfirmDirectDebit = pVar.f232057c.confirmDirectDebit(productPayload.f137835a);
                    p24.b bVar = new p24.b(5, new p24.e(pVar, 2));
                    d0VarConfirmDirectDebit.getClass();
                    ufm.i iVar = new ufm.i(d0VarConfirmDirectDebit, bVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    n nVarI0 = w.i0(iVar);
                    this.v = 1;
                    obj2 = nim.a.b(nVarI0, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar2.f67536r.getClass();
                return l.a1(aVar2, aVar2.X1(xy4.b.b()), null, null, new g(aVar2, (it3.d) obj2, null, 3), 3);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar4 = this.f252519w;
                c cVar2 = new c(aVar4, this.f252520x, null, 0);
                this.v = 1;
                Object objP2 = aVar4.p2(this, cVar2);
                return objP2 == aVar3 ? aVar3 : objP2;
        }
    }
}
