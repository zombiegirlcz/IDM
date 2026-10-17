package oj6;

import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ExternalDestination.Browser browser = new ExternalDestination.Browser(this.v, null);
        com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c cVar = this.u;
        cVar.C1(browser);
        h.D2(cVar.f72588t);
        return Unit.f186387a;
    }
}
