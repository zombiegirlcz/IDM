package a3k;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import d2k.g;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.a u;
    public final /* synthetic */ f5j.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.a aVar, f5j.a aVar2, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
        this.v = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.a aVar2 = this.u;
        return aVar2.C1(u0.c(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, null, g.a(aVar2.o, this.v, null, null, null, null, null, null, null, 1022), 2))));
    }
}
