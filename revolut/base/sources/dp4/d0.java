package dp4;

import com.revolut.feature.credit.card.api.models.credit_limit_cap.CreditLimitCapImpact;
import com.revolut.feature.credit.card.api.models.credit_limit_cap.ImpactedCardholder;
import com.revolut.feature.credit.card.impl.network.CreditCardService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f116629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f116630x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f116631y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, String str, long j2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116629w = e0Var;
        this.f116630x = str;
        this.f116631y = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0(this.f116629w, this.f116630x, this.f116631y, continuation, 0);
            default:
                return new d0(this.f116629w, this.f116630x, this.f116631y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService = this.f116629w.f116637a;
                    this.v = 1;
                    obj2 = creditCardService.getCreditLimitCapImpact(this.f116630x, this.f116631y, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                kn4.b bVar = (kn4.b) obj2;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                List<kn4.c> impactedCardholders = bVar.getImpactedCardholders();
                ArrayList arrayList = new ArrayList(zhm.w.t(impactedCardholders, 10));
                for (kn4.c cVar : impactedCardholders) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    xi0.a aVar2 = xi0.b.Companion;
                    String currency = cVar.getCurrency();
                    aVar2.getClass();
                    xi0.b bVarA = xi0.a.a(currency);
                    arrayList.add(new ImpactedCardholder(cVar.getCardholderId(), cVar.getFirstName(), cVar.getLastName(), new dj0.d(cVar.getCurrentMonthlyLimit(), bVarA), new dj0.d(cVar.getCappedMonthlyLimit(), bVarA)));
                }
                return new CreditLimitCapImpact(arrayList);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService2 = this.f116629w.f116637a;
                    kn4.d dVar = new kn4.d(this.f116631y);
                    this.v = 1;
                    obj2 = creditCardService2.setCreditLimitCap(this.f116630x, dVar, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return c8g.c.t((kn4.a) obj2);
        }
    }
}
