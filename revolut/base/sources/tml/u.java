package tml;

import com.revolut.sso.api.models.EmailEvidence;
import gkl.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.email.change_flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f272270w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.sso.impl.ui.email.change_flow.a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f272270w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u(this.v, this.f272270w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.sso.impl.ui.email.change_flow.a aVar2 = this.v;
            wll.e eVar = aVar2.f106520p;
            String str = aVar2.o.f105829b;
            EmailEvidence emailEvidence = new EmailEvidence(this.f272270w);
            this.u = 1;
            obj2 = eVar.k(aVar2, str, emailEvidence, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return (c0) obj2;
    }
}
