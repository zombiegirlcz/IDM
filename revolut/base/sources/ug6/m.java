package ug6;

import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ExternalAccountTopupPayload.DirectLinkPayload f279958w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v vVar, ExternalAccountTopupPayload.DirectLinkPayload directLinkPayload, Continuation continuation) {
        super(2, continuation);
        this.v = vVar;
        this.f279958w = directLinkPayload;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.v, this.f279958w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            ExternalAccountTopupPayload.DirectLinkPayload directLinkPayload = this.f279958w;
            v vVar = this.v;
            l lVar = new l(vVar, directLinkPayload, null);
            this.u = 1;
            if (vVar.Y2(this, lVar) == aVar) {
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
