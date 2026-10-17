package ave;

import com.revolut.data.network.models.externalcards.ExpiryMonthYearDto;
import com.revolut.data.network.models.topup.ContextDto;
import com.revolut.data.network.models.topup.mapper.TopUpContextMapperKt;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.common.ExpireDateFormatter$CardExpire;
import com.revolut.feature.topup_screen.impl.data.network.service.CardTopUpRevampedService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pue.b;
import pue.c;
import r10.q;
import t61.k;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f10015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CardDetails f10016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f10017y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q qVar, k kVar, CardDetails cardDetails, String str, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
        this.f10015w = kVar;
        this.f10016x = cardDetails;
        this.f10017y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f10015w, this.f10016x, this.f10017y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c.a aVar;
        String str;
        Object objCreateTopUp;
        k kVar = this.f10015w;
        TopUpContext topUpContext = kVar.e;
        q qVar = this.v;
        ywh.b bVar = (ywh.b) qVar.d;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            CardTopUpRevampedService cardTopUpRevampedService = (CardTopUpRevampedService) qVar.f250849b;
            String str2 = kVar.f268169a;
            long j2 = kVar.f268170b;
            String str3 = kVar.f268171c;
            String strName = kVar.d.name();
            c.b bVar2 = new c.b(bVar.f317439a.getResources().getDisplayMetrics().widthPixels, bVar.f317439a.getResources().getDisplayMetrics().heightPixels);
            ContextDto dto = TopUpContextMapperKt.toDto(topUpContext);
            String walletId = TopUpContextMapperKt.toWalletId(topUpContext);
            CardDetails cardDetails = this.f10016x;
            if (cardDetails != null) {
                ExpireDateFormatter$CardExpire expireDateFormatter$CardExpire = cardDetails.f90567b;
                aVar = new c.a(new ExpiryMonthYearDto(expireDateFormatter$CardExpire.f90569a, expireDateFormatter$CardExpire.f90570b), cardDetails.f90566a);
            } else {
                aVar = null;
            }
            if (cardDetails == null || (str = cardDetails.f90568c) == null) {
                str = this.f10017y;
            }
            pue.c cVar = new pue.c(str2, j2, str3, strName, bVar2, dto, walletId, aVar, str, cardDetails != null ? cardDetails.d : null);
            this.u = 1;
            objCreateTopUp = cardTopUpRevampedService.createTopUp(cVar, new wj0.b("TOPUP_IDEMPOTENCY_TAG"), this);
            if (objCreateTopUp == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objCreateTopUp = obj2;
        }
        pue.b bVar3 = (pue.b) objCreateTopUp;
        String transactionId = bVar3.getTransactionId();
        b.a redirects = bVar3.getRedirects();
        return new zve.b(transactionId, redirects != null ? new zve.a(redirects.getSuccess(), redirects.getError(), redirects.getDecline(), redirects.getHold()) : null);
    }
}
