package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer;

import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.RefinancingOfferFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreen;
import gim.i;
import j54.v0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mh4.o;
import oki.h;
import yki.l;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f68289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CreditToRefinanceSelectionScreen f68290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f68291y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, b bVar, CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen, l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f68289w = bVar;
        this.f68290x = creditToRefinanceSelectionScreen;
        this.f68291y = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f68289w, this.f68290x, this.f68291y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            o oVar = this.v;
            boolean z = ((mh4.l) oVar).f205398b;
            b bVar = this.f68289w;
            CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = this.f68290x;
            if (z) {
                v0 v0Var = new v0(bVar, oVar, creditToRefinanceSelectionScreen, (Continuation) null, 8);
                this.u = 1;
                if (bVar.p2(this, v0Var) == aVar) {
                    return aVar;
                }
            } else {
                h.t2(bVar, this.f68291y, new RefinancingOfferFlowContract$Step.LoanDurationSetup(!Intrinsics.f(creditToRefinanceSelectionScreen.L.f68298c != null ? d0.O0(u0.v(r0.f209134a)) : null, d0.O0(u0.v(r14.f205397a.f209134a)))), false, null, false, 12);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
