package cm7;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.flow.delivery.DeliveryFlowContract$InputData;
import elm.f;
import f9i.e;
import gim.i;
import java.util.List;
import kl7.i2;
import kl7.k2;
import km2.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ll7.e0;
import ll7.v;
import skm.p0;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.insurance_car.impl.ui.flow.delivery.a f25157w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.insurance_car.impl.ui.flow.delivery.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25157w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f25157w, continuation, 0);
            default:
                return new d(this.f25157w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        k2 k2Var;
        Object objJ;
        switch (this.u) {
            case 0:
                com.revolut.feature.insurance_car.impl.ui.flow.delivery.a aVar = this.f25157w;
                DeliveryFlowContract$InputData deliveryFlowContract$InputData = aVar.f75351t;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Continuation continuation = null;
                if (i == 0) {
                    o.b(obj2);
                    aVar.X1(vl7.a.c(null, null));
                    int i2 = c.f25156a[deliveryFlowContract$InputData.f75347b.ordinal()];
                    if (i2 == 1) {
                        k2Var = k2.TEMPORARY_CERT_ORDER;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        k2Var = k2.ANNUAL_CERT_ORDER;
                    }
                    k2 k2Var2 = k2Var;
                    v vVar = aVar.v;
                    String str = deliveryFlowContract$InputData.f75346a;
                    this.v = 1;
                    e0 e0Var = (e0) vVar;
                    e0Var.getClass();
                    n nVar = new n(19, e0Var, k2Var2, str, continuation);
                    p0 p0Var = p0.f264001a;
                    objJ = skm.e0.J(f.f127540b, nVar, this);
                    if (objJ == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objJ = obj2;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_disc_placement_success_title, null, null, 14);
                String str2 = ((i2) objJ).f185342a;
                return l.a1(aVar, aVar.X1(vl7.a.e(textLocalisedClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, 12)), null, null, new c65.i(aVar, continuation, 23), 3);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.feature.insurance_car.impl.ui.flow.delivery.a aVar4 = this.f25157w;
                    String str3 = aVar4.f75353x;
                    DeliveryFlowContract$InputData deliveryFlowContract$InputData2 = aVar4.f75351t;
                    f9i.c cVar = new f9i.c(new e(str3 + "insurance/policies/" + deliveryFlowContract$InputData2.f75346a + "/documents/" + deliveryFlowContract$InputData2.f75347b, true));
                    this.v = 1;
                    if (aVar4.G1(cVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
