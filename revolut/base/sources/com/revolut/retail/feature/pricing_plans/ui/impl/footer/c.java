package com.revolut.retail.feature.pricing_plans.ui.impl.footer;

import com.revolut.retail.feature.pricing_plans.ui.impl.footer.PricingPlanFooterInternalContract$TermsClauseClickParcel;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanFooterInternalContract$TermsClauseClickParcel.UrlNavigation f103304w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, PricingPlanFooterInternalContract$TermsClauseClickParcel.UrlNavigation urlNavigation, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f103304w = urlNavigation;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f103304w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        PricingPlanFooterInternalContract$TermsClauseClickParcel.UrlNavigation urlNavigation = this.f103304w;
        d dVar = this.v;
        b bVar = new b(dVar, urlNavigation, null);
        this.u = 1;
        Object objY2 = dVar.Y2(this, bVar);
        return objY2 == aVar ? aVar : objY2;
    }
}
