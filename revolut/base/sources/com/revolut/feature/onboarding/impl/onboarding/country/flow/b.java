package com.revolut.feature.onboarding.impl.onboarding.country.flow;

import com.revolut.feature.onboarding.api.onboarding.OnboardingApi$Toggles;
import com.revolut.feature.onboarding.impl.onboarding.country.flow.CountryOfResidenceFlowContract$Step;
import gim.i;
import java.util.List;
import jte.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function1 {
    public c u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f78417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f78418x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.f78418x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f78418x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar;
        yki.i iVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f78417w;
        if (i == 0) {
            o.b(obj2);
            c cVar2 = this.f78418x;
            yki.i iVar2 = cVar2.v;
            this.u = cVar2;
            this.v = iVar2;
            this.f78417w = 1;
            Object objF = ((d) cVar2.f78423t).c(OnboardingApi$Toggles.SpecificCountryTerms.f78182c) ? cVar2.f78422s.f(this) : f0.f322471a;
            if (objF == aVar) {
                return aVar;
            }
            cVar = cVar2;
            iVar = iVar2;
            obj2 = objF;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yki.i iVar3 = this.v;
            c cVar3 = this.u;
            o.b(obj2);
            iVar = iVar3;
            cVar = cVar3;
        }
        h.t2(cVar, iVar, new CountryOfResidenceFlowContract$Step.Country((List) obj2), false, null, false, 12);
        return Unit.f186387a;
    }
}
