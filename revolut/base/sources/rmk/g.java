package rmk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms.PricingPlanTerms;
import efm.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import wik.q;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f255354w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f255354w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f255354w, continuation, 0);
            default:
                return new g(this.f255354w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                i iVar = this.f255354w;
                if (i == 0) {
                    o.b(obj2);
                    z zVarA = iVar.f255356p.a();
                    this.v = 1;
                    obj2 = nim.a.b(zVarA, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                PricingPlanTerms pricingPlanTerms = (PricingPlanTerms) obj2;
                String str = pricingPlanTerms.f103308a;
                String str2 = pricingPlanTerms.f103309b;
                iVar.y2(str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, str);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                i iVar2 = this.f255354w;
                if (i2 == 0) {
                    o.b(obj2);
                    q qVar = iVar2.f255356p;
                    pre.c cVar = qVar.f297930a;
                    TermsScope.INSTANCE.getClass();
                    d0 d0VarF = cVar.f(TermsScope.W, null);
                    wf6.o oVar = new wf6.o(16, new wik.o(qVar, 1));
                    d0VarF.getClass();
                    ufm.i iVar3 = new ufm.i(d0VarF, oVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                    z zVarF = ue0.e.F(iVar3, new PricingPlanTerms("https://revolut.com/legal/plan-partnerships", null, null));
                    this.v = 1;
                    obj2 = nim.a.b(zVarF, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                PricingPlanTerms pricingPlanTerms2 = (PricingPlanTerms) obj2;
                String str3 = pricingPlanTerms2.f103308a;
                String str4 = pricingPlanTerms2.f103309b;
                iVar2.y2(str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, str3);
                return Unit.f186387a;
        }
    }
}
