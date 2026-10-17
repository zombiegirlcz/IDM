package u7k;

import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public do3.n u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f277960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f277961x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Continuation continuation) {
        super(2, continuation);
        this.f277961x = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.f277961x, continuation);
        iVar.f277960w = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((TransferLinkDetails) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f277960w
            com.revolut.domain.models.moneyrequest.TransferLinkDetails r0 = (com.revolut.domain.models.moneyrequest.TransferLinkDetails) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.v
            u7k.k r3 = r6.f277961x
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L24
            if (r2 == r5) goto L20
            if (r2 != r4) goto L18
            do3.n r1 = r6.u
            yhm.o.b(r7)
            goto L66
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            yhm.o.b(r7)
            goto L39
        L24:
            yhm.o.b(r7)
            ang.f r7 = r3.f277966b
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            r6.f277960w = r0
            r6.v = r5
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r1) goto L39
            goto L63
        L39:
            do3.n r7 = (do3.n) r7
            boolean r2 = r0 instanceof com.revolut.domain.models.moneyrequest.TransferLinkDetails.Active
            r5 = 0
            if (r2 == 0) goto L44
            r2 = r0
            com.revolut.domain.models.moneyrequest.TransferLinkDetails$Active r2 = (com.revolut.domain.models.moneyrequest.TransferLinkDetails.Active) r2
            goto L45
        L44:
            r2 = r5
        L45:
            if (r2 == 0) goto L4a
            v61.p r2 = r2.f60362p
            goto L4b
        L4a:
            r2 = r5
        L4b:
            if (r2 == 0) goto L6a
            cl3.a r3 = r3.f277965a
            java.lang.String r2 = r2.e
            wl3.h r3 = (wl3.h) r3
            rfm.z r2 = r3.b(r2)
            r6.f277960w = r0
            r6.u = r7
            r6.v = r4
            java.lang.Object r2 = nim.a.i(r2, r6)
            if (r2 != r1) goto L64
        L63:
            return r1
        L64:
            r1 = r7
            r7 = r2
        L66:
            r5 = r7
            zm3.a r5 = (zm3.a) r5
            r7 = r1
        L6a:
            boolean r1 = r0 instanceof com.revolut.domain.models.moneyrequest.TransferLinkDetails.Active
            if (r1 == 0) goto L76
            u7k.b r1 = new u7k.b
            com.revolut.domain.models.moneyrequest.TransferLinkDetails$Active r0 = (com.revolut.domain.models.moneyrequest.TransferLinkDetails.Active) r0
            r1.<init>(r0, r7, r5)
            return r1
        L76:
            boolean r7 = r0 instanceof com.revolut.domain.models.moneyrequest.TransferLinkDetails.NonActive
            if (r7 == 0) goto L84
            com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkNotActiveException r7 = new com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkNotActiveException
            com.revolut.domain.models.moneyrequest.TransferLinkDetails$NonActive r0 = (com.revolut.domain.models.moneyrequest.TransferLinkDetails.NonActive) r0
            com.revolut.domain.models.moneyrequest.TransferLinkState r0 = r0.k
            r7.<init>(r0)
            throw r7
        L84:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u7k.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
