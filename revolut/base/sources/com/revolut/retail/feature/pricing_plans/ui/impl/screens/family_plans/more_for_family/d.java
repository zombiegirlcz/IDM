package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$KidsAccountAvailability;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function1 {
    public final /* synthetic */ List u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, Continuation continuation) {
        super(1, continuation);
        this.u = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        List list = this.u;
        return zi0.c.P(new MoreForFamilyScreenContract$KidsAccountAvailability.ActiveAccounts(list.size(), (String) d0.b0(list)), false, null, 3);
    }
}
