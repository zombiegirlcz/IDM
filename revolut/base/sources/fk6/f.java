package fk6;

import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = dVar;
        this.v = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ExternalDestination.Browser browser = new ExternalDestination.Browser(this.v, null);
        com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar = this.u;
        dVar.C1(browser);
        h.D2(dVar.f72712t);
        return Unit.f186387a;
    }
}
