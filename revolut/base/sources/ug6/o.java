package ug6;

import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f279961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ExternalAccountTopupPayload.LinkedAccountPayload f279962x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v vVar, ExternalAccountTopupPayload.LinkedAccountPayload linkedAccountPayload, Continuation continuation) {
        super(2, continuation);
        this.f279961w = vVar;
        this.f279962x = linkedAccountPayload;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.f279961w, this.f279962x, continuation);
        oVar.v = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            ExternalAccountTopupPayload.LinkedAccountPayload linkedAccountPayload = this.f279962x;
            v vVar = this.f279961w;
            n nVar = new n(linkedAccountPayload, vVar, coroutineScope, null);
            this.v = null;
            this.u = 1;
            if (vVar.Y2(this, nVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
