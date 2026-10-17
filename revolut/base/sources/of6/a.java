package of6;

import com.revolut.feature.external_accounts.impl.data.open_banking_brazil.inbound.BrazilInboundOpenBankingService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f224737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f224738x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224737w = bVar;
        this.f224738x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f224737w, this.f224738x, continuation, 0);
            default:
                return new a(this.f224737w, this.f224738x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        b bVar = this.f224737w;
        String str = this.f224738x;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    x4l.c cVar = bVar.f224741c;
                    this.v = 1;
                    if (cVar.d(str, true, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    BrazilInboundOpenBankingService brazilInboundOpenBankingService = bVar.f224739a;
                    this.v = 1;
                    BrazilInboundOpenBankingService.Companion companion = BrazilInboundOpenBankingService.INSTANCE;
                    if (brazilInboundOpenBankingService.revokeConsent(str, "PIX_SMART_TRANSFER", this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar.f224740b.remove("BRAZIL_INBOUND_CONSENT_DETAILS_MEMORY_CACHE_KEY" + str);
                return Unit.f186387a;
        }
    }
}
