package br4;

import bq5.o0;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardCreditLimitCap;
import com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreenContract$ModalStep;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.card.models.creditcard.CreditCardCancellation;
import com.revolut.kompot.common.ModalDestination;
import ft3.a1;
import ft3.t0;
import grl.r2;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.details.a f17883b;

    public /* synthetic */ b0(com.revolut.feature.credit.card.impl.ui.details.a aVar, int i) {
        this.f17882a = i;
        this.f17883b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        kl4.b bVar;
        switch (this.f17882a) {
            case 0:
                qq4.d result = (qq4.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof qq4.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f17883b.K2();
                return Unit.f186387a;
            case 1:
                return ((Boolean) obj2).booleanValue() ? nim.a.y(nim.a.v(al4.o.a(this.f17883b.C), new o0(13)), new o0(14)) : zi0.c.i(CreditLimitIncreaseStatus.Unavailable.f68729a);
            case 2:
                vf0.a0 a0Var = (vf0.a0) obj2;
                Intrinsics.checkNotNullParameter(a0Var, "<destruct>");
                CreditCard creditCard = (CreditCard) a0Var.f288394a;
                ux4.b bVar2 = (ux4.b) a0Var.f288395b;
                yt8.c cVar = (yt8.c) a0Var.f288396c;
                List list = (List) a0Var.d;
                wi0.b bVar3 = (wi0.b) a0Var.e;
                ll4.r rVar = (ll4.r) a0Var.f;
                d0 d0Var = (d0) a0Var.f288397g;
                od0.i iVar = (od0.i) a0Var.f288398h;
                um4.a aVar = (um4.a) a0Var.i;
                boolean zBooleanValue = ((Boolean) a0Var.f288399j).booleanValue();
                od0.i iVar2 = (od0.i) a0Var.k;
                xp3.b bVar4 = (xp3.b) d0Var.f17888c.f224257a;
                ja5.a aVar2 = (ja5.a) iVar.f224257a;
                CreditCardCancellation creditCardCancellation = creditCard.f69808y;
                j jVar = null;
                if (creditCard.f69796h == yw4.q.ACTIVE) {
                    yw4.d dVar = creditCardCancellation != null ? creditCardCancellation.f69813a : null;
                    int i = dVar == null ? -1 : e0.f17891b[dVar.ordinal()];
                    if (i != -1) {
                        if (i == 1 || i == 2) {
                            jVar = new j(dVar);
                        } else if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return new k(creditCard, cVar, list, bVar2, bVar3, rVar, bVar4, aVar2, aVar, jVar, (kl4.b) d0Var.f17887b.f224257a, ((jte.d) this.f17883b.z).c(CreditCardApi$Toggles$CreditCardCreditLimitCap.f68681c), zBooleanValue, d0Var.f17886a, iVar2);
            case 3:
                yw4.p it8 = (yw4.p) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                String str = it8.k;
                if (str != null) {
                    return new k0(ra5.b.a(this.f17883b.f69251y, str), 0);
                }
                od0.i.Companion.getClass();
                return new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
            case 4:
                tq4.e result2 = (tq4.e) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                a1 a1Var = new a1(r2.ACCOUNT_DETAILS, null, null, null, result2.f273523a, 14);
                com.revolut.feature.credit.card.impl.ui.details.a aVar3 = this.f17883b;
                aVar3.C1(u0.c(new CreditApplicationFeatureConfig.StartApplication(a1Var, new ft3.m(aVar3.o.f69221a, gt3.b.USER_INITIATED), null, null, null, null, null, null, null, null, 2044)));
                return Unit.f186387a;
            default:
                pq4.g result3 = (pq4.g) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                boolean zF = Intrinsics.f(result3, pq4.f.f238687a);
                com.revolut.feature.credit.card.impl.ui.details.a aVar4 = this.f17883b;
                if (zF) {
                    aVar4.C1(u0.c(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.ACCOUNT_DETAILS, null, null, t0.f137874a, null, 22), new ft3.n(aVar4.o.f69221a, 2), null, null, null, null, null, null, null, null, 2044)));
                } else if (Intrinsics.f(result3, pq4.e.f238686a) && (bVar = ((k) aVar4.I2()).k) != null) {
                    oki.h.v2(aVar4.M, new CreditCardDetailsScreenContract$ModalStep.CreditLimitDecrease(bVar.f185284b, bVar.f185285c, bVar.d), ModalDestination.Style.POPUP.f98311a);
                }
                return Unit.f186387a;
        }
    }
}
