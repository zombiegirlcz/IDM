package ji6;

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
    public final /* synthetic */ String u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = str;
        this.v = aVar;
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
        com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a aVar = this.v;
        yki.a aVar2 = aVar.f72498s;
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = this.u;
        if (str == null) {
            h.D2(aVar2);
        } else {
            h.D2(aVar2);
            aVar.C1(new ExternalDestination.Browser(str, null));
        }
        return Unit.f186387a;
    }
}
