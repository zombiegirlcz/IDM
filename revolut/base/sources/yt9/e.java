package yt9;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.transfer.core.models.CountryProfile;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f316680w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ io3.d f316681x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CountryProfile f316682y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, io3.d dVar, CountryProfile countryProfile, Continuation continuation) {
        super(3, continuation);
        this.f316680w = gVar;
        this.f316681x = dVar;
        this.f316682y = countryProfile;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        io3.d dVar = this.f316681x;
        CountryProfile countryProfile = this.f316682y;
        e eVar = new e(this.f316680w, dVar, countryProfile, (Continuation) obj4);
        eVar.v = (FlowCollector) obj2;
        return eVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g gVar = this.f316680w;
        cm4.a aVar = gVar.f;
        FlowCollector flowCollector = this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            PaymentPocketInfo paymentPocketInfo = new PaymentPocketInfo(((wq4.a) aVar).b(), gVar.c(new MoneyClause(new dj0.d(0L, z92.f.l(this.f316681x)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), this.f316682y), ((wq4.a) aVar).f299405a.a());
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(paymentPocketInfo, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
