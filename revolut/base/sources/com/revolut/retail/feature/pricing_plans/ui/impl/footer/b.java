package com.revolut.retail.feature.pricing_plans.ui.impl.footer;

import com.revolut.retail.feature.pricing_plans.ui.impl.footer.PricingPlanFooterInternalContract$TermsClauseClickParcel;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanFooterInternalContract$TermsClauseClickParcel.UrlNavigation f103303w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, PricingPlanFooterInternalContract$TermsClauseClickParcel.UrlNavigation urlNavigation, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f103303w = urlNavigation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f103303w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        x xVar = this.v.f103305l;
        String str = this.f103303w.f103301a;
        lg0.a aVar2 = lg0.a.OPEN_BROWSER;
        Boolean bool = Boolean.FALSE;
        this.u = 1;
        Object objL1 = xVar.L1(str, aVar2, bool, this);
        return objL1 == aVar ? aVar : objL1;
    }
}
