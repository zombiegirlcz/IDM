package hml;

import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.consent.qr.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f153996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ConsentChallenge.Qr.Delegated.Details.Action f153997x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.sso.impl.ui.consent.qr.b bVar, String str, ConsentChallenge.Qr.Delegated.Details.Action action, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f153996w = str;
        this.f153997x = action;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f153996w, this.f153997x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        ConsentChallenge.Qr.Delegated.Details.Action action = this.f153997x;
        com.revolut.sso.impl.ui.consent.qr.b bVar = this.v;
        i iVar = new i(bVar, this.f153996w, action, null);
        this.u = 1;
        Object objB = pu7.a.B(bVar.k, "handleDeeplink", iVar, this);
        return objB == aVar ? aVar : objB;
    }
}
