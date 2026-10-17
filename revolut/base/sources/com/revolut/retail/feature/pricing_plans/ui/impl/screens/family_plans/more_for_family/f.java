package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$KidsAccountAvailability;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function1 {
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        return zi0.c.P(MoreForFamilyScreenContract$KidsAccountAvailability.CreationAvailable.f103433a, false, null, 3);
    }
}
