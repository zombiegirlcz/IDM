package a34;

import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nu3.e;
import o04.h;
import o04.p;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f1046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f1047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f1048y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, String str, String str2, e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1046w = cVar;
        this.f1047x = str;
        this.f1048y = str2;
        this.z = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f1046w, this.f1047x, this.f1048y, this.z, continuation, 0);
            case 1:
                return new a(this.f1046w, this.f1047x, this.f1048y, this.z, continuation, 1);
            default:
                return new a(this.f1046w, this.f1047x, this.f1048y, this.z, continuation, 2);
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
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                c cVar = this.f1046w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = cVar.f1052b;
                    e eVar = this.z;
                    o04.e eVar2 = new o04.e(Long.valueOf(eVar.f219199a), eVar.f219200b);
                    this.v = 1;
                    obj2 = creditPluginsService.acceptCreditCardOffer(this.f1047x, this.f1048y, eVar2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return cVar.f1051a.p((tt3.a) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                c cVar2 = this.f1046w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = cVar2.f1052b;
                    e eVar3 = this.z;
                    Long l2 = new Long(eVar3.f219199a);
                    Integer num = eVar3.f219200b;
                    this.v = 1;
                    obj2 = creditPluginsService2.getCreditCardOffer(this.f1047x, this.f1048y, l2, num, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                o04.i iVar = cVar2.f1053c;
                return o04.i.a((h) obj2);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                c cVar3 = this.f1046w;
                if (i3 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService3 = cVar3.f1052b;
                    e eVar4 = this.z;
                    long j2 = eVar4.f219199a;
                    Integer num2 = eVar4.f219200b;
                    IntendedPricingPlan intendedPricingPlan = eVar4.f219201c;
                    o04.o oVar = null;
                    if (intendedPricingPlan != null) {
                        String str = intendedPricingPlan.f66194a;
                        hha.i iVar2 = intendedPricingPlan.f66195b;
                        oVar = new o04.o(str, iVar2 != null ? iVar2.name() : null, intendedPricingPlan.f66196c);
                    }
                    p pVar = new p(j2, num2, oVar);
                    this.v = 1;
                    obj2 = creditPluginsService3.updateCreditCardOffer(this.f1047x, this.f1048y, pVar, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                o04.i iVar3 = cVar3.f1053c;
                return o04.i.a((h) obj2);
        }
    }
}
