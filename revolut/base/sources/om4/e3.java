package om4;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.credit.card.models.CreditCard;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.n f226564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4 f226565b;

    public e3(al4.n creditCardInteractor, n4 securedCreditCardInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(securedCreditCardInteractor, "securedCreditCardInteractor");
        this.f226564a = creditCardInteractor;
        this.f226565b = securedCreditCardInteractor;
    }

    public static um4.a a(CreditCardSecurityDeposit creditCardSecurityDeposit, CreditCard creditCard) {
        dj0.d dVar = creditCard.f;
        return new um4.a(dVar, null, c(creditCard, dVar.f115082a), creditCardSecurityDeposit != null ? Integer.valueOf(creditCardSecurityDeposit.f) : null, creditCard.f69800n == yw4.h.SECURED, creditCardSecurityDeposit != null ? new dj0.d(creditCardSecurityDeposit.e, creditCardSecurityDeposit.f68756c) : null, creditCard.f69794c, creditCard.d, creditCard.i, false);
    }

    public static int c(CreditCard creditCard, long j2) {
        if (j2 != 0) {
            if (creditCard.f69794c.f115082a == 0) {
                return 0;
            }
            int iMax = Math.max(1, new BigDecimal(String.valueOf((creditCard.f69794c.f115082a / j2) * ((double) 100))).setScale(0, RoundingMode.HALF_EVEN).intValue());
            if (iMax <= 100) {
                return iMax;
            }
        }
        return 100;
    }

    public final Flow b(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(((x2) this.f226564a).h(facilityId, loadingStrategy), new l0(this, 2, facilityId, loadingStrategy));
    }
}
