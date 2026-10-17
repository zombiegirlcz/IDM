package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$KidsSavingsAvailability;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function1 {
    public final /* synthetic */ List u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, Continuation continuation) {
        super(1, continuation);
        this.u = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        List list = this.u;
        Pair pair = (Pair) d0.b0(list);
        return zi0.c.P(new MoreForFamilyScreenContract$KidsSavingsAvailability.HasActiveAccounts(list.size(), (String) pair.f186385a, ((SavingsAccountDetails) pair.f186386b).f86460a.f234881a), false, null, 3);
    }
}
