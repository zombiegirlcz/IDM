package ug6;

import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ExternalAccountTopupPayload.DirectLinkPayload f279957w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, ExternalAccountTopupPayload.DirectLinkPayload directLinkPayload, Continuation continuation) {
        super(1, continuation);
        this.v = vVar;
        this.f279957w = directLinkPayload;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, this.f279957w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        ExternalAccountTopupPayload.DirectLinkPayload directLinkPayload = this.f279957w;
        v vVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            e eVar = vVar.f279970n;
            this.u = 1;
            obj2 = eVar.a(directLinkPayload, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ExternalAccountTopupPayload externalAccountTopupPayload = (ExternalAccountTopupPayload) obj2;
        if (externalAccountTopupPayload instanceof ExternalAccountTopupPayload.LinkedAccountPayload) {
            vVar.getClass();
            vVar.T2(new o(vVar, (ExternalAccountTopupPayload.LinkedAccountPayload) externalAccountTopupPayload, null), new g(vVar, 0));
        } else if (externalAccountTopupPayload instanceof ExternalAccountTopupPayload.OneOffPayload) {
            vVar.getClass();
            vVar.T2(new r((ExternalAccountTopupPayload.OneOffPayload) externalAccountTopupPayload, null, vVar), new g(vVar, 2));
        } else {
            if (!(externalAccountTopupPayload instanceof ExternalAccountTopupPayload.DirectLinkPayload) && !(externalAccountTopupPayload instanceof ExternalAccountTopupPayload.IndiaNetBankingPayload) && !(externalAccountTopupPayload instanceof ExternalAccountTopupPayload.IndiaUpiPayload) && !(externalAccountTopupPayload instanceof ExternalAccountTopupPayload.PayToStoredMethodPayload) && !(externalAccountTopupPayload instanceof ExternalAccountTopupPayload.MandateCreationPayload) && !(externalAccountTopupPayload instanceof ExternalAccountTopupPayload.PsePayload) && !(externalAccountTopupPayload instanceof ExternalAccountTopupPayload.OpenAccountTypeChooserPayload) && !(externalAccountTopupPayload instanceof ExternalAccountTopupPayload.BrazilPixMandatePayload) && externalAccountTopupPayload != null) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Payload wasn't processed: fragment=", directLinkPayload.f73099a, ", query=", directLinkPayload.f73100b));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
