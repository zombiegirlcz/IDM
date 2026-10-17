package hml;

import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.consent.qr.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f153994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ConsentChallenge.Qr.Delegated.Details.Action f153995x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.sso.impl.ui.consent.qr.b bVar, String str, ConsentChallenge.Qr.Delegated.Details.Action action, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f153994w = str;
        this.f153995x = action;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, this.f153994w, this.f153995x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            ConsentChallenge.Qr.Delegated.Details.Action action = this.f153995x;
            com.revolut.sso.impl.ui.consent.qr.b bVar = this.v;
            h hVar = new h(bVar, action, null);
            this.u = 1;
            String str = this.f153994w;
            if ((str == null ? bVar.p2(this, hVar) : u0.c0(bVar, str, hVar, this)) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
