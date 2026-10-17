package u21;

import com.revolut.data.network.models.externalcards.ExpiryMonthYearDto;
import com.revolut.data.network.services.ExternalCardsService;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.common.ExpireDateFormatter$CardExpire;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oue.c;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yte.a f276531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CardDetails f276532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Boolean f276533y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, yte.a aVar, CardDetails cardDetails, Boolean bool, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f276531w = aVar;
        this.f276532x = cardDetails;
        this.f276533y = bool;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f276531w, this.f276532x, this.f276533y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            ExternalCardsService externalCardsService = this.v.f276535a;
            String string = this.f276531w.toString();
            CardDetails cardDetails = this.f276532x;
            ExpireDateFormatter$CardExpire expireDateFormatter$CardExpire = cardDetails.f90567b;
            oue.c cVar = new oue.c(new c.a(string, new ExpiryMonthYearDto(expireDateFormatter$CardExpire.f90569a, expireDateFormatter$CardExpire.f90570b), cardDetails.f90566a), cardDetails.f90568c, cardDetails.d, this.f276533y);
            this.u = 1;
            obj2 = externalCardsService.createExternalCard(cVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return ((oue.b) obj2).getExternalCardId();
    }
}
