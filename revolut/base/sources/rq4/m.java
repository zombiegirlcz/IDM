package rq4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreenContract$InputData;
import com.revolut.feature.credit.card.models.CreditCard;
import ft3.a1;
import grl.r2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.s3;
import om4.x2;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c f256472b;

    public /* synthetic */ m(com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar, int i) {
        this.f256471a = i;
        this.f256472b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f256471a) {
            case 0:
                eii.k it8 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof eii.h) {
                    this.f256472b.J2();
                }
                return Unit.f186387a;
            case 1:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.e) {
                    com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar = this.f256472b;
                    cVar.n2(new o(cVar, null, 1), new whi.b(6));
                }
                return Unit.f186387a;
            case 2:
                eii.k outputData2 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof eii.g) {
                    com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar2 = this.f256472b;
                    cVar2.n2(new o(cVar2, null, 1), new whi.b(6));
                }
                return Unit.f186387a;
            case 3:
                tq4.e result = (tq4.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                a1 a1Var = new a1(r2.CREDIT_LIMIT_CAP, null, null, null, result.f273523a, 14);
                com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar3 = this.f256472b;
                cVar3.C1(u0.c(new CreditApplicationFeatureConfig.StartApplication(a1Var, new ft3.m(cVar3.o.f69172a, gt3.b.USER_INITIATED), null, null, null, null, null, null, null, null, 2044)));
                return Unit.f186387a;
            case 4:
                return ((Boolean) obj2).booleanValue() ? nim.a.y(nim.a.v(al4.o.a(this.f256472b.f69190x), new rpi.e(3)), new rpi.e(1)) : zi0.c.i(CreditLimitIncreaseStatus.Unavailable.f68729a);
            default:
                CreditCard creditCard = (CreditCard) obj2;
                com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar4 = this.f256472b;
                v1 v1VarK = ngm.n.K(new rik.e(cVar4, null, 6));
                go.g gVar = new go.g(new Data(creditCard, null, false, 6, null), 2);
                ang.f fVar = cVar4.f69191y;
                w4l.j jVar = w4l.j.f294644c;
                akg.n nVarV = nim.a.v(fVar.j(jVar), n.f);
                Flow flowE = boh.f.e(((s3) cVar4.f69189w).u(), new m(cVar4, 4));
                al4.n nVar = cVar4.f69187s;
                CreditLimitCapChangeScreenContract$InputData creditLimitCapChangeScreenContract$InputData = cVar4.o;
                return nim.a.u(new qkg.a(2, 15, null), u0.m(u0.i(v1VarK, gVar, nVarV), u0.i(flowE, n14.k.p(((x2) nVar).o(creditLimitCapChangeScreenContract$InputData.f69172a, jVar), new rpi.e(2)), cVar4.z.b(creditLimitCapChangeScreenContract$InputData.f69172a, w4l.h.f294642c))));
        }
    }
}
