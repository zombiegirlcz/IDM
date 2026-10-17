package com.revolut.feature.onboarding.impl.playbilling;

import a35.j;
import com.android.billingclient.api.BillingConfig;
import com.revolut.feature.onboarding.impl.playbilling.OnboardingPlayBillingFailure;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objC;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            e eVar = this.v.f78522a;
            j jVar = new j(2, 20, null);
            this.u = 1;
            objC = eVar.c(jVar, this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objC = ((m) obj2).f314193a;
        }
        Throwable thA = m.a(objC);
        if (thA != null) {
            return new m(o.a(thA));
        }
        BillingConfig billingConfig = (BillingConfig) objC;
        String countryCode = billingConfig.getCountryCode();
        Intrinsics.checkNotNullExpressionValue(countryCode, "getCountryCode(...)");
        return new m(d0.W(countryCode) ? o.a(new OnboardingPlayBillingFailure.EmptyBillingCountryCode("Empty Play billing country code")) : billingConfig.getCountryCode());
    }
}
